package com.hbt.semillero.ejb;

import java.util.List;

import javax.ejb.Local;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.dto.PersonajeDTO;

/**
 * Expone los métodos del EJB GestionarComic Las interfaces determinan una
 * especie de contrato donde se define las firmas de los metodos, define que se
 * necesita implementar pero no el como eso lo realiza la clase que la
 * implementa Palabras claves interface e implements
 * 
 * @author ccastano
 *
 */
@Local
public interface IGestionarPersonajeLocal {

	/**
	 * 
	 * Metodo encargado de crear un Personaje y persistirlo
	 * 
	 * @author ccastano
	 * 
	 * @param Personaje Nuevo informacion nueva a crear
	 */
	public void crearPersonaje(PersonajeDTO personajeDTO);

	/**
	 * 
	 * Metodo encargado de consultar un Personaje modificarlo y guardarlo
	 * 
	 * @author ccastano
	 * 
	 * @param Personaje Modificar informacion nueva a modificar
	 */
	public void modificarPersonaje();

	/**
	 * 
	 * Metodo encargado de eliminar un Personaje modificarlo y guardarlo
	 * 
	 * @author ccastano
	 * 
	 * @param Personaje Eliminar informacion a eliminar
	 */
	public void eliminarPersonaje();

	/**
	 * 
	 * Metodo encargado de retornar la informacion de un Personaje
	 * 
	 * @param id Personaje identificador del Personaje a ser consultado
	 * @return Personaje Resultado de la consulta
	 * @throws Exception si no se recibe id Personaje
	 */
	public void  consultarPersonaje() ;

	/**
	 * 
	 * Metodo encargado de retornar una lista de Personajes
	 * 
	 * @return
	 */
	public List<PersonajeDTO> consultarPersonajes();
	
	public List<PersonajeDTO> consultarPersonajes(long id);
}
