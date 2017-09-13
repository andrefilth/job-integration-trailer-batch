package br.com.cea.transporte.trailer.batch.sercdc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cea.transporte.trailer.batch.sercdc.model.Transportista;

@Repository
public interface TransportistaRepository extends JpaRepository<Transportista, Long> {

}
