package com.hbt.semillero.ejb;

import java.util.List;

import javax.ejb.Local;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.dto.PersonajeDTO;
import com.hbt.semillero.dto.PersonasDTO;

/**
 * Expone los métodos del EJB Gestionar Compra comic Las interfaces determinan una
 * especie de contrato donde se define las firmas de los metodos, define que se
 * necesita implementar pero no el como eso lo realiza la clase que la
 * implementa Palabras claves interface e implements
 * 
 * @author David Macea
 *
 */
@Local
public interface IGestionarCompraComicLocal {

	/**
	 * 
	 * Metodo encargado de crear una Personas y persistirlo
	 * 
	 * @author David Macea
	 * 
	 * @param Personas Nuevo informacion nueva a crear
	 */
	public void crearCompraComic(CompraComicDTO compraComicDTO);

	/**
	 * 
	 * Metodo encargado de consultar un CompraComic modificarlo y guardarlo
	 * 
	 * @author David Macea
	 * 
	 * @param CompraComic Modificar informacion nueva a modificar
	 */
	public void modificarCompraComic();

	/**
	 * 
	 * Metodo encargado de eliminar un CompraComic modificarlo y guardarlo
	 * 
	 * @author David Macea
	 * 
	 * @param Personas Eliminar informacion a eliminar
	 */
	public void eliminarCompraComic();



	/**
	 * @author David Macea
	 * Metodo encargado de retornar una lista de CompraComic
	 * 
	 * @return
	 */
	public List<CompraComicDTO> consultarCompraComic();

	List<CompraComicDTO> consultarCompraComic(long pers_id_comic);
	
	
}
