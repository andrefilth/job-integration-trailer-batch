package br.com.cea.transporte.trailer.batch.rwms.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ADMRWMS.TRAILER")
@Entity
public class Trailer {

	@EmbeddedId
	private TrailerPK pk;
	
	@Column(name = "CARRIER_CODE", nullable = false)
	private String carrierCode;
	@Column(name = "LOCATION_ID")
	private String locationd;

	@Column(name = "TRAILER_CUBE")
	private Integer trailerCube;

	@Column(name = "LAST_USE_DATE")
	private Date lastUseDate;

	@Column(name = "TRAILER_STATUS")
	private String trailerStatus;

	@Column(name = "PERMANENT_FLAG")
	private String permanentFlag;

	@Column(name = "CUR_LOAD_SEQ")
	private Integer curLoadSeq;

	@Column(name = "ROUTE")
	private String route;

	@Column(name = "EXPECTED_CUBE")
	private Integer expected_cube;

	@Column(name = "CID_LOADED_WEIGHT")
	private Integer CID_LOADED_WEIGHT;

	@Column(name = "EXPECTED_WEIGHT")
	private Integer expectedWeight;

	@Column(name = "NBR_CIDE_LOADED")
	private Integer nbrCideLoaded;

	@Column(name = "LINE_HAUL_CARRIER")
	private String lineHaulCarrier;

	@Column(name = "TRAILER_TYPE")
	private String trailerType;

	@Column(name = "EXPECTED_NB_CID")
	private Integer expectedCid;

	@Column(name = "CID_LOADED_CUBE")
	private Integer cidLoadedCube;

	@Column(name = "TRAILER_UDA1")
	private String trailerUda1;

	@Column(name = "TRAILER_UDA2")
	private String trailerUda2;

	@Column(name = "TRAILER_UDA3")
	private String trailerUda3;

	@Column(name = "TRAILER_UDA4")
	private String trailerUda4;

	@Column(name = "TRAILER_UDA6")
	private String trailerUda6;

	@Column(name = "TRAILER_UDA5")
	private String trailerUda5;

	@Column(name = "TRAILER_UDA7")
	private String trailerUda7;

	@Column(name = "TRAILER_UDA8")
	private String trailerUda8;

	@Column(name = "TRAILER_UDA9")
	private String trailerUda9;

	@Column(name = "TRAILER_UDA10")
	private String trailerUda10;

	@Column(name = "DISP_TRAILER_CUBE")
	private Integer dispTrailerCube;

	@Column(name = "DISP_DIM_UOM")
	private String dispDimUom;
}
