package excepciones;

import geometria.Punto;

public class Test2 {

	public static void main(String[] args) {
		Exception excepcion = new Exception("mi excepcion");
		Class<?> claseExcepcion = excepcion.getClass();
		System.out.println(claseExcepcion);
		Punto punto = new Punto(2, -5);
		Class<?> clasePunto = punto.getClass();
		System.out.println(clasePunto);
	}

}
