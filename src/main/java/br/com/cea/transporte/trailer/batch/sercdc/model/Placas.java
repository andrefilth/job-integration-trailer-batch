package br.com.cea.transporte.trailer.batch.sercdc.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="C_GEN_PLACAS")
public class Placas {

	
	@Id
	@GeneratedValue
	@Column(name = "id_placa", nullable=false)
	private Long id;

	@Column(name = "placa", nullable=false)
	private String placa;
	
//	@OneToMany(mappedBy="placa")
//	private Collection<PlacasTransportista> placasTransportistas;
//	
}
