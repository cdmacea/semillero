package com.hbt.semillero.entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import org.hibernate.engine.FetchTiming;

public class Personaje implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(allocationSize = 1, name = "PERSONAJE_ID_GENERATOR", sequenceName = "SEQ_PERSONAJE")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PERSONAJE_ID_GENERATOR")
	@Column(name = "pers_id")
	private long id;
	
	@Column(name = "pers_nombre")
	private String nombre;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "pers_id_comic")
	private Comic comic;
	
	
	@Column(name = "pers_estado")
	@Enumerated(value = EnumType.STRING)
	private EstadoEnum estado;
	
	@Column(name = "pers_superpoder")
	private  String superpoder;

	public long getId() {
		return id;
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

	public Comic getComic() {
		return comic;
	}

	public void setComic(Comic comic) {
		this.comic = comic;
	}

	public EstadoEnum getEstado() {
		return estado;
	}

	public void setEstado(EstadoEnum estado) {
		this.estado = estado;
	}

	public String getSuperpoder() {
		return superpoder;
	}

	public void setSuperpoder(String superpoder) {
		this.superpoder = superpoder;
	}
	
	
	
}
