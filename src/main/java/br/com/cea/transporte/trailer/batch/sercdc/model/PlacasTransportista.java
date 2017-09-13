package br.com.cea.transporte.trailer.batch.sercdc.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "C_REL_PLACAS_TRANSP")
public class PlacasTransportista {

	@Id
	@GeneratedValue
	@Column(name = "id_rel_pl_tr", nullable = false)
	private Integer id;

	@JoinColumn(name = "id_transportista", referencedColumnName = "id_transportista")
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	private Transportista transportista;

	@JoinColumn(name = "id_placa", referencedColumnName = "id_placa")
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	private Placas placa;

	@Column(name = "fecha_reg")
	private Date dataFechamento;

}
