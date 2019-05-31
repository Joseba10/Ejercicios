package geometria;

public class Vector {

	private static int A_DEFECTO= 0;
	private static int B_DEFECTO= 0;

	private double a;
	private double b;

	private double OX;
	private double OY;
	private Vector vector;

	// Constructores

	public Vector(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	public Vector(Punto a, Punto b) {

	this.a = b.getX()-a.getX();
	this.b= b.getY()- a.getY();
	}

	public Vector() {
		super();
		this.a = A_DEFECTO;
		this.b = B_DEFECTO;
	}

	public Vector(Vector vector) {

		this(vector.a, vector.b);

	}
	
	
	public void imprimir() {
		
		System.out.println(this);
	}

//Metodos Getter y Setter
	public Vector getVector() {
		return vector;
	}

	public void setVector(Vector vector) {
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


	@Override
	public String toString() {
		return "Vector" + vector;
	}

}
