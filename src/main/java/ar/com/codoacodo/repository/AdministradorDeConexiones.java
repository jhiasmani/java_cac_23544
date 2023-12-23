package ar.com.codoacodo.repository;

import java.sql.Connection;
import java.sql.DriverManager;

public class AdministradorDeConexiones {

    //creamos un metodo estatic :
	// este metodo se puede usar sin crear una instancia de la clase
	
	//eso significa que puedo hacer :el nombre de la clase.metodo()
    //sin necesidad de crear un objeto.	
	//por ejemplo: AdministradordeConexiones.metodo();
	
	public static Connection getConnection() {
		String username ="root";
		String password = "#Mysql2w2";
		String port = "3306";
		String host ="localhost";
		String dbName="integrador_cac";
		
		
		String driverName = "com.mysql.cj.jdbc.Driver";

		String dbUrl = "jdbc:mysql://"+host+":"+port+"/"+dbName + "?serverTimeZone=UTC&useSSL=false";
		
		//usamos catch
		
		try {
			Class.forName(driverName);
			return DriverManager.getConnection(dbUrl,username,password);
			 
		}catch(Exception e) {
			
			throw new IllegalArgumentException("No se pudo conectar a la base de datos" + dbUrl);
		}
		
		
		
		
	}
	

}
