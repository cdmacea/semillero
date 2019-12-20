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
@Table(name="PERSONAS")
public class Personas implements Serializable {
	
	 /* clase persona
	 * 
	 * @author david macea
	 * 
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

	
	@Id
	@SequenceGenerator(allocationSize = 1, name = "PERSONAS_ID_GENERATOR", sequenceName = "SEQ_PERSONA")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PERSONAS_ID_GENERATOR")
	@Column(name = "pers_id")
	private long id;
	
	@Column(name = "pers_nombre")
	private String nombre;
	
	@Column(name = "tipo_de_documento")
	private String tipo_de_documento;
	
	@Column(name = "pers_documento")
	private long documento;
	
	@Column(name = "pers_fecha_nacimiento")
	private String fecha_de_nacimiento;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinColumn(name = "pers_id_comic")
	private Comic id_comic;

	public long getId() {
		return id;
	}

	public String getFecha_de_nacimiento() {
		return fecha_de_nacimiento;
	}

	public void setFecha_de_nacimiento(String fecha_de_nacimiento) {
		this.fecha_de_nacimiento = fecha_de_nacimiento;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo_de_documento() {
		return tipo_de_documento;
	}

	public void setTipo_de_documento(String tipo_de_documento) {
		this.tipo_de_documento = tipo_de_documento;
	}

	public long getDocumento() {
		return documento;
	}

	public void setDocumento(long documento) {
		this.documento = documento;
	}

	public Comic getId_comic() {
		return id_comic;
	}

	public void setId_comic(Comic id_comic) {
		this.id_comic = id_comic;
	}
	
	

}
