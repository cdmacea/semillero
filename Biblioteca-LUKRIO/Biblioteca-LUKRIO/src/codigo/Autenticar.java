package codigo;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class Autenticar extends Authenticator {
	String usuario;
	String contraseņa;

	public Autenticar(String us, String cn) {
		super();
		usuario=us;
		contraseņa=cn;
	}
	 
	public PasswordAuthentication getPasswordAuthentication(){
		
		if ((usuario != null) && (usuario.length() > 0) && (contraseņa != null) && (contraseņa.length () > 0)) { 
			return new PasswordAuthentication(usuario, contraseņa); } 
		return null; }
	}


