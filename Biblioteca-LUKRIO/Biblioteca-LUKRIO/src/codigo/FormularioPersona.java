package codigo;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

import persona.Colega;
import persona.Estudiante;
import persona.Familiar;

public class FormularioPersona implements MouseListener{
	//Ventana del formulario para registrar personas.
	JFrame formulario=new JFrame();
	
	private JLabel labelNombre,labelApellido1,labelApellido2,labelTelefono,labelCorreo,labelEspecial;
	private String tipoSeleccion;
	private JButton registrarPersona;
	
	//Entradas de texto para el formulario
	JTextField entradaNombre=new JTextField("Introduce el nombre");
    JTextField entradaApellido1=new JTextField("Introduce el primer apellido");
    JTextField entradaApellido2=new JTextField("Introduce el segundo apellido");
    JTextField entradaCorreo=new JTextField("Introduce el correo");
    JTextField entradaTelefono=new JTextField("Introduce el tel�fono");
    JTextField entradaEspecial=new JTextField("Introduce la instituci�n");
    
	//Botones del seleccionador del formulario
	JRadioButton seleccionarEstudiante = new JRadioButton("Estudiante");
    JRadioButton seleccionarColega = new JRadioButton("Colega");
    JRadioButton seleccionarFamiliar = new JRadioButton("Familiar");
    
    //Constructor
	FormularioPersona(){
		formulario.setLayout(null);
		formulario.setTitle("Formulario");  //Titulo de ventana
		formulario.setSize(400,390);       //Tama�o de ventana
		formulario.setLocation(450,145);  //localizacion de ventana
		formulario.setResizable(false);  //Minimizar ventana
		creaInterfazFormulario();
		//ImageIcon imagen = new ImageIcon(formulario.getClass().getResource("/imagenes/fondoFormulario.jpg")); //Localidad dentro del programa
		//ImagenFondo fondo = new ImagenFondo(imagen.getImage());
		//formulario.getContentPane().add(fondo);
		ImagenFondo fondo = new ImagenFondo(BibliotecaLUKRIO.cambiarTama�oImagen("imagenes/vRegistrarPersonas.jpg",400,390).getImage());
		formulario.getContentPane().add(fondo);
		formulario.setVisible(false);   //Oculta la ventana
	}
	//Crea toda la interfaz del formulario
	public void creaInterfazFormulario(){
		tipoSeleccion="estudiante";
		registrarPersona=new JButton("Registrar persona");
		registrarPersona.setBounds(80,300,200,30);
        formulario.add(registrarPersona);
        registrarPersona.addMouseListener(this);
        
        entradaNombre.setBounds(130,10,200,20);
        formulario.add(entradaNombre);
        labelNombre=new JLabel("Nombre:");
        labelNombre.setBounds(10,10,200,20);
        formulario.add(labelNombre);
        
        entradaApellido1.setBounds(130,50,200,20);
        formulario.add(entradaApellido1);
        labelApellido1=new JLabel("Primer apellido:");
        labelApellido1.setBounds(10,50,200,20);
        formulario.add(labelApellido1);
        
        entradaApellido2.setBounds(130,90,200,20);
        formulario.add(entradaApellido2);
        labelApellido2=new JLabel("Segundo apellido:");
        labelApellido2.setBounds(10,90,200,20);
        formulario.add(labelApellido2);
        
        entradaTelefono.setBounds(130,130,200,20);
        formulario.add(entradaTelefono);
        labelTelefono=new JLabel("Tel�fono:");
        labelTelefono.setBounds(10,130,200,20);
        formulario.add(labelTelefono);
        
        entradaCorreo.setBounds(130,170,200,20);
        formulario.add(entradaCorreo);
        labelCorreo=new JLabel("Correo:");
        labelCorreo.setBounds(10,170,200,20);
        formulario.add(labelCorreo);
        
        entradaNombre.setOpaque(false);
        entradaApellido1.setOpaque(false);
        entradaApellido2.setOpaque(false);
        entradaTelefono.setOpaque(false);
        entradaCorreo.setOpaque(false);
        
        ButtonGroup selector = new ButtonGroup();  //Grupo para el RadioButton
        
        seleccionarEstudiante.setActionCommand("Estudiante");
        seleccionarEstudiante.setSelected(true);
        seleccionarEstudiante.addMouseListener(this); 
        seleccionarEstudiante.setBounds(10,210,100,20);
        formulario.add(seleccionarEstudiante);
        
        seleccionarColega.setActionCommand("Colega");
        seleccionarColega.addMouseListener(this);
        seleccionarColega.setBounds(130,210,100,20);
        formulario.add(seleccionarColega);
        
        seleccionarFamiliar.setActionCommand("Familiar");
        seleccionarFamiliar.addMouseListener(this);
        seleccionarFamiliar.setBounds(250,210,100,20);
        formulario.add(seleccionarFamiliar);
        
        seleccionarEstudiante.setOpaque(false);
        seleccionarColega.setOpaque(false);
        seleccionarFamiliar.setOpaque(false);
        
        selector.add(seleccionarEstudiante);
        selector.add(seleccionarColega);
        selector.add(seleccionarFamiliar);
        
        entradaEspecial.setBounds(130,250,200,20);
        formulario.add(entradaEspecial);
        labelEspecial=new JLabel("Instituci�n: ");
        labelEspecial.setBounds(10,250,200,20);
        formulario.add(labelEspecial);
        entradaEspecial.setOpaque(false);
	}
	//Volver a poner textos originales al formulario
	public void refrescarFormulario(){
		seleccionarEstudiante.setSelected(true);
		entradaNombre.setText("Introduce el nombre");
	    entradaApellido1.setText("Introduce el primer apellido");
	    entradaApellido2.setText("Introduce el segundo apellido");
	    entradaCorreo.setText("Introduce el correo");
	    entradaTelefono.setText("Introduce el tel�fono");
	    refrescarSeleccion("estudiante");
	}
	//Seleccion del tipo de persona
	public void refrescarSeleccion(String seleccion){
		tipoSeleccion=seleccion;
		if (seleccion=="estudiante"){
			entradaEspecial.setText("Introduce la instituci�n");
			labelEspecial.setText("Instituci�n: ");
		}else if(seleccion=="colega"){
			entradaEspecial.setText("Introduce el puesto");
			labelEspecial.setText("Puesto: ");
		}else{
			entradaEspecial.setText("Introduce el parentesco");
			labelEspecial.setText("Parentesco: ");
		}
	}
	//Comprueba si la entrada del tel�fono es un n�mero o no.
	public static boolean compruebaTelefono(String telefono){
		try{
			 Integer.parseInt(telefono);
			 return true;
		}catch(Exception excepcion){
			return false;
		 }
	}
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==registrarPersona){
			//Comprobamos que los campos de texto hayan sido modificados y no esten vacios.
			if(entradaNombre.getText().equals("Introduce el nombre")==false && entradaNombre.getText().equals("")==false &&
				entradaApellido1.getText().equals("Introduce el primer apellido")==false && entradaApellido1.getText().equals("")==false &&
				entradaApellido2.getText().equals("Introduce el segundo apellido")==false && entradaApellido2.getText().equals("")==false &&
				entradaCorreo.getText().equals("Introduce el correo")==false && entradaApellido2.getText().equals("")==false &&
				entradaTelefono.getText().equals("Introduce el tel�fono")==false && entradaApellido2.getText().equals("")==false &&
				entradaNombre.getText().length()<11 && entradaApellido1.getText().length()<11 && entradaApellido2.getText().length()<11 &&
				entradaTelefono.getText().length()==8 && entradaEspecial.getText().equals("")==false && entradaEspecial.getText().equals("Introduce la instituci�n")==false &&
				entradaEspecial.getText().equals("Introduce el parentesco")==false && entradaEspecial.getText().equals("Introduce el puesto")==false){
				//Comprobamos que el tel�fono sea un n�mero
				if(compruebaTelefono(entradaTelefono.getText())){
					if(entradaCorreo.getText().toString().indexOf("@")!=-1){
						boolean encontreCarnet;
						int carnet=0;
						while(true){
							encontreCarnet=true;
							for(int k=0;k<BibliotecaLUKRIO.personas.size();k++){
								System.out.println(BibliotecaLUKRIO.carnet+" Quiero registrar");
								System.out.println(BibliotecaLUKRIO.personas.get(k).getCarnet()+" Registrado ya");
								if(BibliotecaLUKRIO.carnet==BibliotecaLUKRIO.personas.get(k).getCarnet()){
									System.out.println(false);
									BibliotecaLUKRIO.carnet++;
									encontreCarnet=false;
									break;
								}
							}if(encontreCarnet==true){
								carnet=BibliotecaLUKRIO.carnet;
								System.out.println(carnet);
								break;
							}
						}
						if(tipoSeleccion=="estudiante"){
						BibliotecaLUKRIO.personas.add(new Estudiante(entradaNombre.getText(),entradaApellido1.getText(),entradaApellido2.getText(),
								entradaTelefono.getText(),entradaCorreo.getText(),entradaEspecial.getText(),carnet));
						}else if(tipoSeleccion=="colega"){
							BibliotecaLUKRIO.personas.add(new Colega(entradaNombre.getText(),entradaApellido1.getText(),entradaApellido2.getText(),
									entradaTelefono.getText(),entradaCorreo.getText(),entradaEspecial.getText(),carnet));
						}else{
							BibliotecaLUKRIO.personas.add(new Familiar(entradaNombre.getText(),entradaApellido1.getText(),entradaApellido2.getText(),
									entradaTelefono.getText(),entradaCorreo.getText(),entradaEspecial.getText(),carnet));
						}
						formulario.setVisible(false);
						refrescarFormulario();
						JOptionPane.showMessageDialog(null,"La persona se ha registrada con �xito. Su n�mero de carnet es: "+carnet);
					}else{
						JOptionPane.showMessageDialog(null,"Por favor inserte un correo v�lido");
					}
				}else{
					JOptionPane.showMessageDialog(null,"Por favor digite un n�mero de tel�fono v�lido");
				}
			}else{
				JOptionPane.showMessageDialog(null,"Por favor llene todos los datos, recuerde que deben tener menos de 10 caracteres y el correo menos de 15 y el tel�fono 8 d�gitos");
			}
		}
		else if(seleccionarEstudiante.isSelected()){
			refrescarSeleccion("estudiante");
		}
		else if(seleccionarColega.isSelected()){
			refrescarSeleccion("colega");
		}
		else{
			refrescarSeleccion("familiar");
		}
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
