package com.hbt.semillero.interfaces;

import javax.ejb.Local;
/* interfaces para crear los metodos necesario para hacer los metodos para compra de comic
* 
* @author ccastano
* 
* @param Personaje Modificar informacion nueva a modificar
*/

@Local
public interface OperacionesCompraLocal {
public void realizaCompra();
public void comic_Comprados();
public void fechaVenta();
public void comicActivo();
}
