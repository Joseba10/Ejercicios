package geometria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		Punto p1 = new Punto(8, 5);
		Punto p2 = new Punto(2, 8);
		Punto p3 = new Punto(p1);

		Punto p4 = new Punto(4, 5);
		Punto p5 = new Punto(-2, 7);
		Punto p6 = new Punto(-12, 12);
		Punto p7 = new Punto(2, 1);

		Punto[] arrayPuntos = new Punto[] { p1, p2, p3, p4, p5, p6, p7 };

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
		System.out
				.println(" La distancia entre el punto " + p1 + " y el punto " + p2 + " es " + Punto.Distancia(p1, p2));

	}

}
