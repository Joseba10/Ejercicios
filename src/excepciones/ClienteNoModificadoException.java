package excepciones;

public class ClienteNoModificadoException extends Exception {

	private static final long serialVersionUID = 1L;

	public ClienteNoModificadoException(String mensaje) {
		super(mensaje);
	}
	

}
