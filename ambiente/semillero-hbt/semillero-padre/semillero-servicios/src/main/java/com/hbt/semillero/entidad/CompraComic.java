package com.hbt.semillero.entidad;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="COMPRA")
public class CompraComic implements Serializable {
	
	 /* clase persona
	 * 
	 * @author david macea
	 * 
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

	
	@Id
	@SequenceGenerator(allocationSize = 1, name = "COMPRA_ID_GENERATOR", sequenceName = "SEQ_COMPRA")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PERSONAS_ID_GENERATOR")
	@Column(name = "comp_id")
	private long id;
	
	@Column(name = "comp_personas")
	private String persona;
	
	@Column(name = "comp_fechaventa")
	private Date comp_fechaventa;
	
	
	@Column(name = "comp_estado")
	private EstadoEnum comp_estado;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getPersona() {
		return persona;
	}


	public void setPersona(String persona) {
		this.persona = persona;
	}


	




	public EstadoEnum getComp_estado() {
		return comp_estado;
	}


	public void setComp_estado(EstadoEnum comp_estado) {
		this.comp_estado = comp_estado;
	}


	public Date getComp_fechaventa() {
		return comp_fechaventa;
	}




	
	



	
	


	
	

}
