package br.com.cea.transporte.trailer.batch.rwms.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cea.transporte.trailer.batch.rwms.model.Trailer;
import br.com.cea.transporte.trailer.batch.rwms.repository.TrailerRepository;
import br.com.cea.transporte.trailer.batch.sercdc.model.PlacasTransportista;
import lombok.extern.log4j.Log4j2;

@Log4j2
// @ComponentScan("br.com.cea.transporte.batch.sercdc.repository")
@Service
public class TrailerService {

	@Autowired
	private TrailerRepository repository;

	@Transactional
	public void atualizar(List<PlacasTransportista> placasTransportista) {
		List<Trailer> list = this.repository.findAll();
		list.forEach(listas -> {
			log.info("Lista: " + list);

		});
	}
	// CallableStatement statement = null;
	// try {
	// statement = this.repository.executarProcedure(placasTransportista);
	// } catch (SQLException e) {
	// log.info("Falha ao executar a procedure, favor verificar o log" +
	// e.getMessage());
	// }
	// try {
	// log.info("Dados da execução da rotina: " + "O_status_code: " +
	// statement.getString(1) + "||"
	// + "O_error_message" + statement.getString(2)+"||" + "O_exists" +
	// statement.getString(3));
	// } catch (SQLException e) {
	// log.info("Falha ao ler dados de saída da procedure" + e.getMessage());
	// }
	// }

}
