package codigo;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class Autenticar extends Authenticator {
	String usuario;
	String contrase�a;

	public Autenticar(String us, String cn) {
		super();
		usuario=us;
		contrase�a=cn;
	}
	 
	public PasswordAuthentication getPasswordAuthentication(){
		
		if ((usuario != null) && (usuario.length() > 0) && (contrase�a != null) && (contrase�a.length () > 0)) { 
			return new PasswordAuthentication(usuario, contrase�a); } 
		return null; }
	}


