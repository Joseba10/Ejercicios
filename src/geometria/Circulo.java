package geometria;

public class Circulo {

private Punto centro;
private double radio;
private double perimetro;
private double area;
private double tamano;

private Circulo copia;

//Constructores




public Circulo(Punto centro, double radio) {
	
	this.centro = centro;
	this.radio = radio;
}



public Circulo() {
	super();
	this.radio=10;
}



public Circulo(Circulo circulo) {
	
	this.copia= circulo;
	
}

//Metodos

public void perimetro(double radio) {
	
	this.perimetro= 2*Math.PI*radio;
	
}

public void area(double radio) {
	
	this.area= Math.PI * Math.pow(radio,2);
	
}

public void transladar(double vector) {
	//TODO
	
	
}

public void escalar(double numero) {

this.tamano= numero*this.radio;
	
	
	
}



@Override
public String toString() {
	return "El circulo tiene un centro de " + centro + "y un radio de " + radio;
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



public Circulo getCopia() {
	return copia;
}



public void setCopia(Circulo copia) {
	this.copia = copia;
}





	
	
}
