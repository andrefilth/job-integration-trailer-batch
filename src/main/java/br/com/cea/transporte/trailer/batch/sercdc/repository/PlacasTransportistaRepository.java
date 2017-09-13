package br.com.cea.transporte.trailer.batch.sercdc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cea.transporte.trailer.batch.sercdc.model.PlacasTransportista;

@Repository
public interface PlacasTransportistaRepository extends JpaRepository<PlacasTransportista, Long> {
	
	

}
