package geometria;

import java.util.ArrayList;

public class Punto {
	
	private static final int X_DEFECTO=0;
	private static final int Y_DEFECTO=0;
	private double x;
	private double y;
	

	//Constructores
	
	

	public Punto(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
		
	public Punto() {
		this(X_DEFECTO,Y_DEFECTO); //this.x = 0; this.y = 0; o this(0,0)
		//Es una llamada a un constructor el this()
	}
	
	public  Punto(Punto punto) {
		this(punto.x,punto.y);
		
	}


	public static double Distancia(Punto punto, Punto punto2) {
		//TODO Calcular distancia
		double cat1= punto.getX()-punto2.getX();
		double cat2= punto.getY()-punto2.getY();
	
	
		double potencia= Math.pow(cat1,2);
		double potencia2= Math.pow(cat2,2);
		
		double distancia= Math.sqrt(potencia)+(potencia2);
		
		return distancia;
	}
	//Distancia entre dos puntos

public double distancia( Punto punto) {
	
	return Distancia(this,punto); 
		
	}



public Punto puntoMasCercano( Punto[] arrayPuntos) { 
	
	double distacia_minima= Double.MAX_VALUE;
	Punto resultado = null;
	
for(int i=0;i<arrayPuntos.length;i++) {
	
		double distancia= distancia(arrayPuntos[i]);
	 
	
	if(distancia<distacia_minima) {
		
		distacia_minima=distancia;
		
		resultado=arrayPuntos[i];
	}
	
}
return resultado;
	
}

public void transladar(Vector vector) {
	
	this.x =this.x + vector.getA();
	 this.y = this.y + vector.getB();

	System.out.println("Nuevo valor de X " + this.x + " Nuevo valor de Y " + this.y);
}

public void imprimir() { //THIS coge los parametros que tenga this(ejemplo) en el constructor
	
	System.out.println(this);
	
	}
	
	//Metodos Setter y Getter
	

	public double getX() {
		return x;
	}


	public void setX(double x) {
		this.x = x;
	}


	public double getY() {
		return y;
	}


	public void setY(double y) {
		this.y = y;
	}

	
@Override
	public String toString() {
		return "Punto x=" + x + ", y=" + y ;
	}
	
}
