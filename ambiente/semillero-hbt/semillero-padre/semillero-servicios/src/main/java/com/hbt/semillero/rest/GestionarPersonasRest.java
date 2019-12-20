package com.hbt.semillero.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.hbt.semillero.dto.PersonajeDTO;
import com.hbt.semillero.dto.PersonasDTO;
import com.hbt.semillero.ejb.GestionarPersonajeBean;
import com.hbt.semillero.ejb.IGestionarPersonajeLocal;
import com.hbt.semillero.ejb.IGestionarPersonasLocal;


@Path("/GestionarPersonas")
public class GestionarPersonasRest {

	/**
	 * 
	 * Metodo encargado de crear un Personas y persistirlo
	 * 
	 * @author david macea
	 * 
	 * @param Personas Nuevo informacion nueva a crear
	 */
	
	@EJB
	private IGestionarPersonasLocal gestionarpersonasbean;
	
	
	@POST
	@Path("/crear")
	public void crearPersonas(PersonasDTO personasDTO) {
		gestionarpersonasbean.crearPersonas(personasDTO);
		
	}

	
	/**
	 * 
	 * Metodo encargado de retornar una lista de Personajes
	 * 
	 * @return
	 */
	
	@GET
	@Path("/consultarPersonas")
	public List<PersonasDTO> consultarPersonas(){
		return gestionarpersonasbean.consultarPersonas();
		
	}
	@GET
	@Path("/consultarPersonasPorid ")
	public List<PersonasDTO> consultarPersonas(@QueryParam("pers_id_comic") long pers_id_comic){
		return gestionarpersonasbean.consultarPersonas(pers_id_comic);
		
	}
	
}
