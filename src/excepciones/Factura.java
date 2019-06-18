package excepciones;

import java.io.Serializable;

public class Factura implements Serializable {
	
	private static final long serialVersionUID = 1L;
	//
	private int idFactura;
	private String detalle;
	private transient String detalle2; //Cuando mandas la clase a otra maquina virtual de java no lleva consigo esta variable

	public Factura() {
		super();
	}

	public Factura(int idFactura, String detalle) {
		super();
		this.idFactura = idFactura;
		this.detalle = detalle;
	}

	public int getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

}
