package br.com.cea.transporte.trailer.batch;

import java.util.ArrayList;
import java.util.List;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.support.CompositeItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.cea.transporte.trailer.batch.processor.IntegrationTrailerProcessor;
import br.com.cea.transporte.trailer.batch.reader.IntegrationTrailerReader;


@Configuration
@EnableBatchProcessing
@EnableAutoConfiguration
public class BatchConfiguration {

	@Autowired
	private JobBuilderFactory jobBuilderFactory;

	@Autowired
	private StepBuilderFactory stepBuilderFactory;


	@Bean
	public Step loadIntegrationStep( @Qualifier("integrationTrailerItemReader") ItemReader<Object> reader
									,@Qualifier("integrationTrailerProcessor") ItemProcessor<Object, Object> processor
//									,@Qualifier("citasWriter") ItemWriter<Object> writer
									) 
	{

		CompositeItemProcessor<Object, Object> compositeProcessor = new CompositeItemProcessor<>();
		List<ItemProcessor<Object, Object>> itemProcessors = new ArrayList<>();
		itemProcessors.add(processor);
		compositeProcessor.setDelegates(itemProcessors);
		
		return stepBuilderFactory.get("loadIntegrationStep")
				.<Object, Object>chunk(10)
				.reader(reader)
				.processor(compositeProcessor)
//				.writer(writer)
				.build();
	}


	@Bean
	public Job job(@Qualifier("loadIntegrationStep") Step loadIntegrationStep) throws Exception {
		return jobBuilderFactory.get("job")
								.incrementer(new RunIdIncrementer())
								.start(loadIntegrationStep)
								.build();
	}
	
	@Bean
	public ItemReader<Object> integrationTrailerItemReader() {
		return new IntegrationTrailerReader();
	}

	@Bean
	public ItemProcessor<Object, Object> integrationTrailerProcessor() {
		return new IntegrationTrailerProcessor();
	}

//	@Bean
//	public ItemWriter<Object> citasWriter() {
//		return new integrationTrailerWriter();
//	}

}
