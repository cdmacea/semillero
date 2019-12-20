package com.hbt.semillero.dto;

import java.io.Serializable;

public class PersonasDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private long id;
	
	
	private String nombre;
	
	
	private String tipo_de_documento;
	
	
	private long documento;
	
	private String fecha_de_nacimiento;
	
	private long id_comic;

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

	public String getFecha_de_nacimiento() {
		return fecha_de_nacimiento;
	}

	public void setFecha_de_nacimiento(String fecha_de_nacimiento) {
		this.fecha_de_nacimiento = fecha_de_nacimiento;
	}

	public long getId_comic() {
		return id_comic;
	}

	public void setId_comic(long id_comic) {
		this.id_comic = id_comic;
	}
	
	
	public static PersonasDTO valueOf(String arg) {
		return JsonUtils.valueOf(arg, PersonasDTO.class);
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
	

