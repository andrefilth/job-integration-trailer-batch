package br.com.cea.transporte.trailer.batch.rwms.repository;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.cea.transporte.trailer.batch.sercdc.model.PlacasTransportista;

@Repository
public interface TrailerRepositoryCustom {

	CallableStatement executarProcedure(List<PlacasTransportista> placasTransportista) throws SQLException;
}
