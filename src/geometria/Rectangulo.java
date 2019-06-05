package geometria;

public class Rectangulo {
	
	public static final Punto PUNTO= new Punto(0, 0);
	public static final Punto PUNTO2= new Punto(5, 0);
	public static final Punto PUNTO3= new Punto(5, 5);
	public static final Punto PUNTO4= new Punto(0, 5);
	
	
	private Punto punto;
	private Punto punto2;
	private Punto punto3;
	private Punto punto4;

	private Rectangulo copia;
	
	//Constructores
	public Rectangulo(Punto punto, Punto punto2, Punto punto3, Punto punto4) {
		super();
		this.punto = punto;
		this.punto2 = punto2;
		this.punto3 = punto3;
		this.punto4 = punto4;
	}


	public Rectangulo() {
	
	this(PUNTO,PUNTO2,PUNTO3,PUNTO4);
	}
	
public Rectangulo(Rectangulo rectangulo) {
		
	this(rectangulo.punto,rectangulo.punto2,rectangulo.punto3,rectangulo.punto4);
		
	}



public double perimetro() {
	
	double altura = Punto.Distancia(punto, punto2);
	double anchura = Punto.Distancia(punto2, punto3);
	double perimetro = anchura * 2 + altura * 2;
	return perimetro;
	
}

public void transladar(Vector vector) {
	
	this.punto.transladar(vector);
	this.punto2.transladar(vector);
	this.punto3.transladar(vector);
	this.punto4.transladar(vector);

	System.out.println("Nuevo valor de punto1 " + this.punto.getX() + " Nuevo valor de Y " + this.punto.getY());
	System.out.println("Nuevo valor de punto1 " + this.punto2.getX() + " Nuevo valor de Y " + this.punto2.getY());
	System.out.println("Nuevo valor de punto1 " + this.punto3.getX() + " Nuevo valor de Y " + this.punto3.getY());
	System.out.println("Nuevo valor de punto1 " + this.punto4.getX() + " Nuevo valor de Y " + this.punto4.getY());




}


public Punto getPunto() {
	return punto;
}


public void setPunto(Punto punto) {
	this.punto = punto;
}


public Punto getPunto2() {
	return punto2;
}


public void setPunto2(Punto punto2) {
	this.punto2 = punto2;
}


public Punto getPunto3() {
	return punto3;
}


public void setPunto3(Punto punto3) {
	this.punto3 = punto3;
}


public Punto getPunto4() {
	return punto4;
}


public void setPunto4(Punto punto4) {
	this.punto4 = punto4;
}



@Override
public String toString() {
	return "Rectangulo [punto=" + punto + ", punto2=" + punto2 + ", punto3=" + punto3 + ", punto4=" + punto4 + "]";
}



	
	
	

}
