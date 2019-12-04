
import {Component} from '@angular/core';
/**
 * @cometario creado un selector y usado los archivo que se va a llama sea html o ccs 
 * @autor david macea
 */
@Component({
	selector: 'showdata',
	templateUrls: './show-data-componentes.html'

})

/**
 *  @autor David Mace
 *  @comentario clase show component  
 */
export class  showComponent{
	/**
	 * atributo  de la clase y su inicializacion con su valores iniciales 
	 */
public	name ='David Macea';
public	city='Monteria';
}