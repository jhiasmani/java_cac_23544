package ar.com.codoacodo.repository;
import java.sql.Connection;
import java.sql.DriverManager;

public class AdministradorDeConexiones {
	
	public Connection getConnection() {
		String username="root";
		String password="secret";
		String port ="33060";
		String host ="localhost";
		String dbName="DB-23544";
		String diverName="com.mysql.cj.jdbc.Driver";
		
		String dbUrl="jdbc:mysql://"+host+":"+port+"/"+dbName + "?serverTimeZone=UTC&eseSSL=false";
		
		try
		{
			
			Class.forName(diverName);
			DriverManager.getConnection(driverName,username,password);
		}
		
	}
	

}
