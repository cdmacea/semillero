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
import com.hbt.semillero.dto.CompraComicDTO;
import com.hbt.semillero.dto.PersonajeDTO;
import com.hbt.semillero.dto.PersonasDTO;
import com.hbt.semillero.entidad.Comic;
import com.hbt.semillero.entidad.CompraComic;
import com.hbt.semillero.entidad.Personaje;
import com.hbt.semillero.entidad.Personas;

/**
 * <b>Descripción:<b> Clase que determina el bean para realizar las gestion de
 * las CompraComic.java
 * 
 * @author david macea
 * @version
 */
@Stateless
public class GestionarCompraComicBean implements IGestionarCompraComicLocal {
	
	@PersistenceContext
	private EntityManager entityManager;

	
	private static final Logger logger=Logger.getLogger(GestionarCompraComicBean.class);

	@Override
	public void crearCompraComic(CompraComicDTO compraComicDTO) {
		
		logger.debug("inicia metodo");
		// TODO Auto-generated method stub
		Personas personas=convertirDTOEntidad(personasDTO);
		entityManager.persist(personas);
	
		logger.debug("finaliza metodo");
		
	}

	@Override
	public void modificarCompraComic() {
		logger.debug("inicia metodo");
		// TODO Auto-generated method stub
		logger.debug("finaliza metodo");
		
	}

	@Override
	public void eliminarCompraComic() {
		logger.debug("inicia metodo");
		// TODO Auto-generated method stub
		logger.debug("finaliza metodo");
		
	}

	

	@SuppressWarnings("unchecked")
	@Override
	public List<CompraComicDTO> consultarCompraComic() {
		logger.debug("inicia metodo");
		// TODO Auto-generated method stub
		
		String Query="SELECT personas"
				+ "FROM Personas personas";
		
		List<CompraComic>listacompraComic=entityManager.createQuery(Query).getResultList();
		
		List<CompraComicDTO> listacompraComicDTO=new ArrayList<>();
		
		for (CompraComic compraComic : listacompraComic) {
			listaCompraComicDTO.add(convertirDTOEntidadCompraComic(CompraComic));
		}
		
	
		logger.debug("finaliza metodo");
		return listacompraComicDTO;
		
	}
	
	
	
	

	
	
	private CompraComic convertirDTOEntidad(CompraComicDTO compraComicDTO){
		CompraComic compraComic =new CompraComic();
		compraComic.setId(compraComicDTO.getId());
		compraComic.setPersona(compraComicDTO.getPersona());
		
		compraComic.setComp_estado(compraComicDTO.getEstado());
		compraComic.setId_comic(new Comic());
		compraComic.getId_comic().setId(personasDTO.getId_comic());
		
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
