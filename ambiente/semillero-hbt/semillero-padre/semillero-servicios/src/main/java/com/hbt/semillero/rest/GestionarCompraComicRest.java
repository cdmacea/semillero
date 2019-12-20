package com.hbt.semillero.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.hbt.semillero.dto.CompraComicDTO;
import com.hbt.semillero.dto.PersonajeDTO;
import com.hbt.semillero.dto.PersonasDTO;
import com.hbt.semillero.ejb.GestionarPersonajeBean;
import com.hbt.semillero.ejb.IGestionarCompraComicLocal;
import com.hbt.semillero.ejb.IGestionarPersonajeLocal;
import com.hbt.semillero.ejb.IGestionarPersonasLocal;


@Path("/GestionarCompraComic")
public class GestionarCompraComicRest {

	/**
	 * 
	 * Metodo encargado de crear un compra y persistirlo
	 * 
	 * @author david macea
	 * 
	 * @param compra Nuevo informacion nueva a crear
	 */
	
	@EJB
	private IGestionarCompraComicLocal gestionarCompraComicbean;
	
	
	@POST
	@Path("/crear")
	public void crearCompraComic(CompraComicDTO compraComicDTO) {
		gestionarCompraComicbean.crearCompraComic(compraComicDTO);
		
	}

	
	/**
	 * 
	 * Metodo encargado de retornar una lista de compra
	 * 
	 * @return
	 */
	
	@GET
	@Path("/consultarCompraComic")
	public List<CompraComicDTO> consultarCompraComic(){
		return gestionarCompraComicbean.consultarCompraComic();
		
	}

	
}
