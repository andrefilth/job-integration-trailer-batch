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
@Table(name="C_GEN_TRANSPORTISTA")
public class Transportista {
	
	@Id
	@GeneratedValue
	@Column(name = "id_transportista", nullable=false)
	private Long id;

	@Column(name = "desc_transportista", nullable=false)
	private String descricao;

	@Column(name = "via", nullable=false)
	private Integer via;
	

//	@OneToMany(mappedBy="transportista")
//	private Collection<PlacasTransportista> placasTransportistas;
	
}
