package Excepciones;

public class Test1 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		int a = 3;
		int b = 4;
		int c = a + b;
		System.out.println("suma: " + c);

	}

}
