package excepciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test1 {

	public static void main(String[] args) throws SQLException {
		Connection conexion = null;
	
		try {
			loadDriver();
			conexion = abrirConexion();
			crearFactura();
			guardarFactura();
			modificarDatosCliente();
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conexion.close();
			} catch (NullPointerException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		int a = 3;
		int b = 4;
		int c = a + b;
		System.out.println("suma: " + c);

	}

	public static void loadDriver() throws ClassNotFoundException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			throw (e);
		}
	}

	public static Connection abrirConexion() throws SQLException {
		return DriverManager.getConnection("", "", "");
	}

	public static void crearFactura() throws FacturaNoCreadaException {
		System.out.println("crear factura");
		throw (new FacturaNoCreadaException("factura no creada"));
	}

	public static void guardarFactura() throws FacturaNoGuardadaException {
		System.out.println("guardar factura");
		throw (new FacturaNoGuardadaException("factura no guardada"));
	}

	public static void modificarDatosCliente() throws ClienteNoModificadoException {
		System.out.println("modificar cliente ");
		throw (new ClienteNoModificadoException("cliente no modificado"));
	}
}
