package geometria;

public class Rectangulo {
	
	
	private double punto;
	private double punto2;
	private double punto3;
	private double punto4;

	private Rectangulo copia;
	
	//Constructores
	public Rectangulo(double punto, double punto2, double punto3, double punto4) {
		super();
		this.punto = punto;
		this.punto2 = punto2;
		this.punto3 = punto3;
		this.punto4 = punto4;
	}


	public Rectangulo() {
		
		this.punto=0.0;
		this.punto2=5.0;
		this.punto3=5.5;
		this.punto4=0.5;
	}
	
public Rectangulo(Rectangulo rectangulo) {
		
	this.copia= rectangulo;
		
	}


public double getPunto() {
	return punto;
}


public void setPunto(double punto) {
	this.punto = punto;
}


public double getPunto2() {
	return punto2;
}


public void setPunto2(double punto2) {
	this.punto2 = punto2;
}


public double getPunto3() {
	return punto3;
}


public void setPunto3(double punto3) {
	this.punto3 = punto3;
}


public double getPunto4() {
	return punto4;
}


public void setPunto4(double punto4) {
	this.punto4 = punto4;
}


public Rectangulo getCopia() {
	return copia;
}


public void setCopia(Rectangulo copia) {
	this.copia = copia;
}
	
	
	
	

}
