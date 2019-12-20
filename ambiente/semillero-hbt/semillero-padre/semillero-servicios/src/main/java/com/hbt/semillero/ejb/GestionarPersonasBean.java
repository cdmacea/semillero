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
import com.hbt.semillero.dto.PersonasDTO;
import com.hbt.semillero.entidad.Comic;
import com.hbt.semillero.entidad.Personaje;
import com.hbt.semillero.entidad.Personas;

/**
 * <b>Descripción:<b> Clase que determina el bean para realizar las gestion de
 * las personas
 * 
 * @author david macea
 * @version
 */
@Stateless
public class GestionarPersonasBean implements IGestionarPersonasLocal {
	
	@PersistenceContext
	private EntityManager entityManager;

	
	private static final Logger logger=Logger.getLogger(GestionarPersonasBean.class);

	@Override
	public void crearPersonas(PersonasDTO personasDTO) {
		
		logger.debug("inicia metodo");
		// TODO Auto-generated method stub
		Personas personas=convertirDTOEntidad(personasDTO);
		entityManager.persist(personas);
	
		logger.debug("finaliza metodo");
		
	}

	@Override
	public void modificarPersonas() {
		logger.debug("inicia metodo");
		// TODO Auto-generated method stub
		logger.debug("finaliza metodo");
		
	}

	@Override
	public void eliminarPersonas() {
		logger.debug("inicia metodo");
		// TODO Auto-generated method stub
		logger.debug("finaliza metodo");
		
	}

	

	@SuppressWarnings("unchecked")
	@Override
	public List<PersonasDTO> consultarPersonas() {
		logger.debug("inicia metodo");
		// TODO Auto-generated method stub
		
		String Query="SELECT personas"
				+ "FROM Personas personas";
		
		List<Personas>listapersonas=entityManager.createQuery(Query).getResultList();
		
		List<PersonasDTO> listapersonasDTO=new ArrayList<>();
		
		for (Personas personas : listapersonas) {
			listapersonasDTO.add(convertirDTOEntidadPersonas(personas));
		}
		
	
		logger.debug("finaliza metodo");
		return listapersonasDTO;
		
	}
	
	
	
	
	@Override
	public List<PersonasDTO> consultarPersonas(long pers_id_comic) {
		// TODO Auto-generated method stub
		logger.debug("inicia metodo");
		// TODO Auto-generated method stub
	
		String Query="SELECT personas"
				+ "FROM Personas personas"
				+ "WHERE personas.comic.id= :pers_id_comic";
		
		List<Personas>listapersonas=entityManager.createQuery(Query).setParameter("pers_id_comic",pers_id_comic). getResultList();
		
		List<PersonasDTO> listapersonasDTO=new ArrayList<>();
		
		for (Personas personas : listapersonas) {
			listapersonasDTO.add(convertirDTOEntidadPersonas(personas));
		}
		
	
		logger.debug("finaliza metodo");
		return listapersonasDTO;
	
	
	}
	
	
	private Personas convertirDTOEntidad(PersonasDTO personasDTO){
		Personas personas =new Personas();
		personas.setId(personasDTO.getId());
		personas.setNombre(personasDTO.getNombre());
		personas.setTipo_de_documento(personasDTO.getTipo_de_documento());
		personas.setDocumento(personasDTO.getDocumento());
		personas.setId_comic(new Comic());
		personas.getId_comic().setId(personasDTO.getId_comic());
		
		personas.setFecha_de_nacimiento(personasDTO.getFecha_de_nacimiento());
		return personas;
		
		
		
	}
	
	
	
	private PersonasDTO convertirDTOEntidadPersonas(Personas personas){
		PersonasDTO personasDTO =new PersonasDTO();
		personasDTO.setId(personasDTO.getId());
		personasDTO.setNombre(personasDTO.getNombre());
		personasDTO.setId_comic(personas.getId_comic().getId());;
	
		personasDTO.setFecha_de_nacimiento(personasDTO.getFecha_de_nacimiento());
		personasDTO.setTipo_de_documento(personasDTO.getTipo_de_documento());
		personasDTO.setDocumento(personasDTO.getDocumento());
		return personasDTO;
		
		
		
	}




	
}
