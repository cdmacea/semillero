package com.hbt.semillero.dto;

import java.io.Serializable;

import com.hbt.semillero.entidad.EstadoEnum;

public class PersonajeDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long id;

	private String nombre;

	private long idcomic;

	private EstadoEnum estado;

	private String superpoder;

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

	public long getIdcomic() {
		return idcomic;
	}

	public void setIdcomic(long idcomic) {
		this.idcomic = idcomic;
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

	
	public static PersonajeDTO valueOf(String arg) {
		return JsonUtils.valueOf(arg, PersonajeDTO.class);
	}

	/**
	 * Método encargado de convertir los datos recibidos en ComicDTO al JSON
	 * esperado
	 * 
	 * @param dto DTO
	 * 
	 * @return Json
	 */
	@Override
	public String toString() {
		return JsonUtils.toStringJson(this);
	}
	
}
