/**
 * GestionarComicBean.java
 */
package com.hbt.semillero.ejb;

import java.util.ArrayList;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.dto.PersonajeDTO;
import com.hbt.semillero.entidad.Comic;
import com.hbt.semillero.entidad.Personaje;

/**
 * <b>Descripción:<b> Clase que determina el bean para realizar las gestion de
 * los comics
 * 
 * @author ccastano
 * @version
 */
@Stateless
public class GestionarPersonajeBean implements IGestionarPersonajeLocal {
	
	@PersistenceContext
	private EntityManager entityManager;

	
	private static final Logger logger=Logger.getLogger(GestionarPersonajeBean.class);

	@Override
	public void crearPersonaje(PersonajeDTO personajeDTO) {
		
		logger.debug("inicia metodo");
		// TODO Auto-generated method stub
		Personaje personaje=convertirDTOEntidad(personajeDTO);
		entityManager.persist(personaje);
	
		logger.debug("finaliza metodo");
		
	}

	@Override
	public void modificarPersonaje() {
		logger.debug("inicia metodo");
		// TODO Auto-generated method stub
		logger.debug("finaliza metodo");
		
	}

	@Override
	public void eliminarPersonaje() {
		logger.debug("inicia metodo");
		// TODO Auto-generated method stub
		logger.debug("finaliza metodo");
		
	}

	@Override
	public void consultarPersonaje() {
		logger.debug("inicia metodo");
		// TODO Auto-generated method stub
		
	
		
		logger.debug("finaliza metodo");
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PersonajeDTO> consultarPersonajes() {
		logger.debug("inicia metodo");
		// TODO Auto-generated method stub
		
		String Query="SELECT personaje"
				+ "FROM Personaje personaje";
		
		List<Personaje>listapersonaje=entityManager.createQuery(Query).getResultList();
		
		List<PersonajeDTO> listapersonajeDTO=new ArrayList<>();
		
		for (Personaje personaje : listapersonaje) {
			listapersonajeDTO.add(convertirDTOEntidadPersonaje(personaje));
		}
		
	
		logger.debug("finaliza metodo");
		return listapersonajeDTO;
		
	}
	
	
	
	
	@Override
	public List<PersonajeDTO> consultarPersonajes(long idcomic) {
		// TODO Auto-generated method stub
		logger.debug("inicia metodo");
		// TODO Auto-generated method stub
		
		String Query="SELECT personaje"
				+ "FROM Personaje personaje"
				+ "WHERE personaje.comic.id= :idcomic";
		
		List<Personaje>listapersonaje=entityManager.createQuery(Query).setParameter("idcomic",idcomic). getResultList();
		
		List<PersonajeDTO> listapersonajeDTO=new ArrayList<>();
		
		for (Personaje personaje : listapersonaje) {
			listapersonajeDTO.add(convertirDTOEntidadPersonaje(personaje));
		}
		
	
		logger.debug("finaliza metodo");
		return listapersonajeDTO;
	
	
	}
	
	
	private Personaje convertirDTOEntidad(PersonajeDTO personajeDTO){
		Personaje personaje =new Personaje();
		personaje.setId(personajeDTO.getId());
		personaje.setNombre(personajeDTO.getNombre());
		personaje.setComic(new Comic());
		personaje.getComic().setId(personajeDTO.getIdcomic());
		personaje.setEstado(personajeDTO.getEstado());
		personaje.setSuperpoder(personajeDTO.getSuperpoder());
		return personaje;
		
		
		
	}
	
	
	
	private PersonajeDTO convertirDTOEntidadPersonaje(Personaje personaje){
		PersonajeDTO personajeDTO =new PersonajeDTO();
		personajeDTO.setId(personajeDTO.getId());
		personajeDTO.setNombre(personajeDTO.getNombre());
		personajeDTO.setIdcomic(personaje.getComic().getId());;
	
		personajeDTO.setEstado(personajeDTO.getEstado());
		personajeDTO.setSuperpoder(personajeDTO.getSuperpoder());
		return personajeDTO;
		
		
		
	}


	
}
