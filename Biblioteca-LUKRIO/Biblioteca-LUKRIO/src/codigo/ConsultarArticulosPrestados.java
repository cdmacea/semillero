package codigo;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class ConsultarArticulosPrestados{
	public static JFrame ventanaArticulosPrestados;
	public static Scroll scroll = new Scroll("prestados");
	ConsultarArticulosPrestados(){
		ventanaArticulosPrestados=new JFrame();
		ventanaArticulosPrestados.setTitle("Consultar �rticulos Prestados");  //Titulo de ventana
		ventanaArticulosPrestados.setBounds(240,80,900,580);       //Tama�o de ventana
		ventanaArticulosPrestados.setResizable(false);  //Minimizar ventana
		ventanaArticulosPrestados.add(scroll);
		ventanaArticulosPrestados.setVisible(false);   //Oculta la ventana
	}
}
