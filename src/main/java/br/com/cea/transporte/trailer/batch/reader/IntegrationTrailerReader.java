package br.com.cea.transporte.trailer.batch.reader;

import java.util.List;

import org.springframework.batch.item.ItemReader;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.cea.transporte.trailer.batch.rwms.service.TrailerService;
import br.com.cea.transporte.trailer.batch.sercdc.model.PlacasTransportista;
import br.com.cea.transporte.trailer.batch.sercdc.service.PlacasService;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class IntegrationTrailerReader implements ItemReader<Object> {

	@Autowired
	private PlacasService service;

	 @Autowired
	 private TrailerService services;
//	@Autowired
//	private DistribuicaoContinuaService services;

	@Override
	public Object read() throws Exception {

		List<PlacasTransportista> consultar = this.service.consultar();
		
		 this.services.atualizar(consultar);
		// ADMRWMS.
//		List<DistribuicaoContinua> list = this.services.consultar();
//		log.info("Passou aqui" + list);
		return null;
	}

}
