package articulo;

import javax.swing.ImageIcon;

public class Libro extends Articulo{
	String editorial,edicion;
	int numeroLibro;
	//Constructor con los parametros para asignar los valores iniciales.
	public Libro(String lTitulo,String lAutor,String lEditorial, String lEdicion, ImageIcon lPortada,int lCalificacion,
			int numero,String lugar,boolean prestado,int ano,int mes,int dia, String lalerta,int carnet,String tipoPersona){
		setPrestado(prestado);
		setTitulo(lTitulo);
		setAutorProductor(lAutor);
		setCalificacion(lCalificacion);
		setEditorial(lEditorial);
		setEdicion(lEdicion);
		setPortada(lPortada);
		setNumero(numero);
		setDireccion(lugar);
		creaBotones();
		setTipoPersona(tipoPersona);
		super.fecha.setAno(ano);
		super.fecha.setMes(mes);
		super.fecha.setDia(dia);
		setNumero(carnet);
		setAlerta(lalerta);
		setTipo("libro");
	}
	//Setters and getters de la clase libro para obtener y asignar los valores correspondientes a la clase.
	public void setEditorial(String editorial){
		this.editorial=editorial;
	}
	public void setEdicion(String edicion){
		this.edicion=edicion;
	}
	public String getEditorial(){
		return editorial;
	}
	public String getEdicion(){
		return edicion;
	}
	public String toString(){
		String msg;
		msg="Titulo: "+getTitulo()+"\n"+"\n";
		msg+="Autor: "+getAutorProductor()+"\n"+"\n";
		msg+="Editorial: "+getEditorial()+"\n"+"\n";
		msg+="Edici�n: "+getEdicion()+"\n"+"\n";
		msg+="Calificaci�n: "+getCalificacion();
		return msg;
	}
}
