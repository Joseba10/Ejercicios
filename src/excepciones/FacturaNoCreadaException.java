package excepciones;

public class FacturaNoCreadaException extends Exception {

	private static final long serialVersionUID = 1L;

	public FacturaNoCreadaException(String mensaje) {
		super(mensaje);
	}
	

}
