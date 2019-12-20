package com.hbt.semillero.dto;

import java.io.Serializable;
import java.util.Date;

public class CompraComicDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private long id;
	
	
	private String persona;
	
	
	private Date fecha;
	
	
	private long estado;
	
	

	
	
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

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public long getEstado() {
		return estado;
	}

	public void setEstado(long estado) {
		this.estado = estado;
	}

	public static CompraComicDTO valueOf(String arg) {
		return JsonUtils.valueOf(arg, CompraComicDTO.class);
	}

	/**
	 * Método encargado de convertir los datos recibidos en PersonasDTO al JSON
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
	

