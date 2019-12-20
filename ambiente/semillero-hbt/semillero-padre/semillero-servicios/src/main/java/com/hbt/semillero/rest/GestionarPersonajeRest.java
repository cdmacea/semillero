package com.hbt.semillero.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.hbt.semillero.dto.PersonajeDTO;
import com.hbt.semillero.ejb.GestionarPersonajeBean;
import com.hbt.semillero.ejb.IGestionarPersonajeLocal;


@Path("/GestionarPersonaje")
public class GestionarPersonajeRest {

	/**
	 * 
	 * Metodo encargado de crear un Personaje y persistirlo
	 * 
	 * @author ccastano
	 * 
	 * @param Personaje Nuevo informacion nueva a crear
	 */
	
	@EJB
	private IGestionarPersonajeLocal gestionarpersonajebean;
	
	
	@POST
	@Path("/crear")
	public void crearPersonaje(PersonajeDTO personajeDTO) {
		gestionarpersonajebean.crearPersonaje(personajeDTO);
		
	}

	
	/**
	 * 
	 * Metodo encargado de retornar una lista de Personajes
	 * 
	 * @return
	 */
	
	@GET
	@Path("/consultarPersonajes")
	public List<PersonajeDTO> consultarPersonajes(){
		return gestionarpersonajebean.consultarPersonajes();
		
	}
	@GET
	@Path("/consultarPersonajesPorid ")
	public List<PersonajeDTO> consultarPersonajes(@QueryParam("idcomic") long idcomic){
		return gestionarpersonajebean.consultarPersonajes(idcomic);
		
	}
	
}
