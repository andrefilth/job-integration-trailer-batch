package br.com.cea.transporte.trailer.batch.sercdc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cea.transporte.trailer.batch.sercdc.model.PlacasTransportista;
import br.com.cea.transporte.trailer.batch.sercdc.repository.PlacasTransportistaRepository;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class PlacasService {

//	@Autowired
//	private TransportistaRepository repository;

	@Autowired
	private PlacasTransportistaRepository repositoryPlacas;
//
//	@Transactional
//	public void consultar(Long id) {
//		List<Transportista> findAll = repository.findAll();
//		// log.info(findAll);
//		findAll.forEach(find -> {
//			log.info(find);
//		});
//	}

	@Transactional
	public List<PlacasTransportista> consultar() {
		List<PlacasTransportista> findAll = this.repositoryPlacas.findAll();
		log.info("Lista de placas: " + findAll);
		return null;

	}

}
