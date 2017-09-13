package br.com.cea.transporte.trailer.batch.rwms.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class TrailerPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	@Column(name = "FACILITY_ID", nullable = false)
	private String facilityId;

	@Column(name = "TRAILER_ID", nullable = false)
	private String trailerId;


}
