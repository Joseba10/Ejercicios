package geometria;

public class Vector {
	
	private double vector;
	private double a;
	private double b;
	
	private double OX;
	private double OY;
	private Vector copia;

	
	//Constructores
	
	public Vector(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public void Vector(double oX, double oY) {
		
		this.OX = oX;
		this.OY = oY;
	}

	public Vector() {
		super();
		this.vector=(Double) null;
	}

	public Vector(Vector vector) {
		
		
			this.copia = vector;
		}
	
	

	public double getVector() {
		return vector;
	}

	public void setVector(double vector) {
		this.vector = vector;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getOX() {
		return OX;
	}

	public void setOX(double oX) {
		OX = oX;
	}

	public double getOY() {
		return OY;
	}

	public void setOY(double oY) {
		OY = oY;
	}

	public Vector getCopia() {
		return copia;
	}

	public void setCopia(Vector copia) {
		this.copia = copia;
	}

	@Override
	public String toString() {
		return "Vector" + vector;
	}


	
}
