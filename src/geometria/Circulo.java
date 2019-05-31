package geometria;

public class Circulo {

	private static final int RADIO_DEFECTO= 10;
	private static final Punto CENTRO_DEFECTO= new Punto(0,0);
private Punto centro;
private double radio;
private double perimetro;
private double area;
private double tamano;

//Constructores



public Circulo() {
	
	this(CENTRO_DEFECTO,RADIO_DEFECTO);
}

public Circulo(Punto centro, double radio) {
	
	this.centro = centro;
	this.radio = radio;
}





public Circulo(Circulo circulo) {
	
	this(circulo.centro,circulo.radio);
	
}

//Metodos

public void perimetro(double radio) {
	
	this.perimetro= 2*Math.PI*radio;
	
	
}

public void area(double radio) {
	
	this.area= Math.PI * Math.pow(radio,2);
	
}

public void transladar(Vector vector2) {
	
	
	this.centro.setX(this.centro.getX() + vector2.getA());
	this.centro.setY(this.centro.getX() + vector2.getB());
	
	 System.out.println("El nuevo valor del circulo es" +this.centro);
	
}

public void escalar(double numero) {

this.tamano= numero*this.radio;

System.out.println("Circulo escalado a " +this.tamano);
	
		
}


public void imprimir() { //THIS coge los parametros que tenga this(ejemplo) en el constructor
	
	System.out.println("El circulo tiene un perimetro de "+ this.perimetro + " y un area de  "+ this.area);
	
	}

//Metodos Getter y Setter
public Punto getCentro() {
	return centro;
}

public void setCentro(Punto centro) {
	this.centro = centro;
}
public double getRadio() {
	return radio;
}
public void setRadio(double radio) {
	this.radio = radio;
}
public double getPerimetro() {
	return perimetro;
}


public void setPerimetro(double perimetro) {
	this.perimetro = perimetro;
}



public double getArea() {
	return area;
}



public void setArea(double area) {
	this.area = area;
}



public double getTamano() {
	return tamano;
}



public void setTamano(double tamano) {
	this.tamano = tamano;
}


@Override
public String toString() {
	return "El circulo tiene un centro de " + centro + " y un radio de " + radio;
}






	
	
}
