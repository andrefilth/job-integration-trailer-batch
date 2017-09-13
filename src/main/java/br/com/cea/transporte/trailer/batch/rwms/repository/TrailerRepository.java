package br.com.cea.transporte.trailer.batch.rwms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cea.transporte.trailer.batch.rwms.model.Trailer;

@Repository
public interface TrailerRepository extends JpaRepository<Trailer, Long>, TrailerRepositoryCustom {

}
