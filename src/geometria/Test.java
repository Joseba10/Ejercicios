package geometria;

public class Test {

	public static void main(String[] args) {

		Punto p1 = new Punto(8, 5);
		Punto p2 = new Punto(2, 8);
		Punto p3 = new Punto(p1);

		Punto p4 = new Punto(4, 5);
		Punto p5 = new Punto(-2, 7);
		Punto p6 = new Punto(-12, 12);
		Punto p7 = new Punto(2, 1);

		Punto[] arrayPuntos = new Punto[] { p4, p5, p6, p7 };

		System.out.println("Primera Ronda");

		p1.imprimir();
		p2.imprimir();
		p3.imprimir();
		System.out.println("\n");

		// Cambiar X de p1 segunda ronda
		System.out.println("Segunda Ronda");

		p1.setX(10);
		p1.imprimir();
		p2.imprimir();
		p3.imprimir();

		// Calcular Distacia
		System.out.println(" La distancia entre el punto " + p1 + " y el punto " + p2 + " es " + Punto.Distancia(p1, p2));

		//Punto mas cercano
		p1.puntoMasCercano(arrayPuntos);
		
		//Transladar
		Vector vector= new Vector(13,2);
		
		p1.transladar(vector);
		
		//Circulo
		
		Circulo c1= new Circulo(p1,4);
		
		System.out.println(c1);
		
			p1.setX(8);
			System.out.println("X cambiada del punto");
	
	System.out.println(c1);
		
		Circulo c2= new Circulo(c1);
		System.out.println(c2);
		
		p1.setX(6);
		p1.setY(4);
		
		
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("X y Y cambiadas");
		p1.setX(9);
		
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println("X cambiada del punto");
		
		
		System.out.println("Sacando Area y Perimetro");
		c1.perimetro(4);
		c1.area(6);
		
		c1.imprimir();
		
	
		Vector vector2= new Vector(9,2);
		
		c2.transladar(vector2);
		
		c2.escalar(4);
		
		Rectangulo r1= new Rectangulo();
		
		System.out.println(r1);
		
		r1.perimetro(4);
		
		Vector vector3= new Vector(3,-2);
		
		//TODO
		r1.transladar(vector3);
		
	}

}
