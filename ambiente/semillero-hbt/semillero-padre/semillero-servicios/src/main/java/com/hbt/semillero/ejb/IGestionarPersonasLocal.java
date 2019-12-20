package com.hbt.semillero.ejb;

import java.util.List;

import javax.ejb.Local;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.dto.PersonajeDTO;
import com.hbt.semillero.dto.PersonasDTO;

/**
 * Expone los métodos del EJB GestionarPersonas Las interfaces determinan una
 * especie de contrato donde se define las firmas de los metodos, define que se
 * necesita implementar pero no el como eso lo realiza la clase que la
 * implementa Palabras claves interface e implements
 * 
 * @author David Macea
 *
 */
@Local
public interface IGestionarPersonasLocal {

	/**
	 * 
	 * Metodo encargado de crear una Personas y persistirlo
	 * 
	 * @author David Macea
	 * 
	 * @param Personas Nuevo informacion nueva a crear
	 */
	public void crearPersonas(PersonasDTO personasDTO);

	/**
	 * 
	 * Metodo encargado de consultar un Personas modificarlo y guardarlo
	 * 
	 * @author David Macea
	 * 
	 * @param Personas Modificar informacion nueva a modificar
	 */
	public void modificarPersonas();

	/**
	 * 
	 * Metodo encargado de eliminar un Personas modificarlo y guardarlo
	 * 
	 * @author David Macea
	 * 
	 * @param Personas Eliminar informacion a eliminar
	 */
	public void eliminarPersonas();



	/**
	 * @author David Macea
	 * Metodo encargado de retornar una lista de Personas
	 * 
	 * @return
	 */
	public List<PersonasDTO> consultarPersonas();

	List<PersonasDTO> consultarPersonas(long pers_id_comic);
	
	
}
