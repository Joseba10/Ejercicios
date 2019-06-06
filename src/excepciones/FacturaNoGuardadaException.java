package excepciones;

public class FacturaNoGuardadaException extends Exception {

	private static final long serialVersionUID = 1L;

	public FacturaNoGuardadaException(String mensaje) {
		super(mensaje);
	}
	

}
