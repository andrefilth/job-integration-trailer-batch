package br.com.cea.transporte.trailer.batch.rwms.repository.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import br.com.cea.transporte.trailer.batch.rwms.repository.QuerysRepository;
import br.com.cea.transporte.trailer.batch.rwms.repository.TrailerRepositoryCustom;
import br.com.cea.transporte.trailer.batch.sercdc.model.PlacasTransportista;
import lombok.extern.log4j.Log4j2;
import oracle.jdbc.OracleTypes;

@Log4j2
public class TrailerRepositoryImpl implements TrailerRepositoryCustom {

	private JdbcTemplate template;

	@Override
	public CallableStatement executarProcedure(List<PlacasTransportista> placasTransportista) throws SQLException {

		Connection connection = this.template.getDataSource().getConnection();
		CallableStatement call = connection.prepareCall(QuerysRepository.PROCEDURE_TRAILER);
		for (PlacasTransportista list : placasTransportista) {
			call.registerOutParameter(1, OracleTypes.VARCHAR);
			call.registerOutParameter(2, OracleTypes.VARCHAR);
			call.registerOutParameter(3, OracleTypes.VARCHAR);
			call.setString(4, "TrailerCre - Fijo");
			call.setString(5, "SQ - Fijo");
			call.setString(6, String.valueOf(list.getPlaca().getId()));
			call.setString(7, String.valueOf(list.getTransportista().getId()));
			call.setInt(8, 0);
			call.setString(9, "");
			call.setString(10, "");
			call.setString(11, "");
			call.setString(12, "");
			call.setString(13, "");
			call.setString(14, "");
			call.setString(15, "");
			call.setString(16, "");
			call.setString(17, "");
			call.setString(18, "");
			call.addBatch();
		}
		call.executeBatch();
		call.close();
		log.info("Procedure executada com sucesso:");
		return call;

	}

}
