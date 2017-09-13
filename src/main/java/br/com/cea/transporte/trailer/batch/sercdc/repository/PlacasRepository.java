package br.com.cea.transporte.trailer.batch.sercdc.repository;


import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.cea.transporte.trailer.batch.sercdc.model.Placas;

@Repository
public interface PlacasRepository extends CrudRepository<Placas, Serializable> {

}
