package ar.com.codoacodo.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java

public class MysqlOradorRepository implements OradorRepository {

	public void save(Orador orador) {
		
		//1 obtener conexion
		Connection con = AdministradorDeConexioones.getConnection();
		//2 preparo sql....los signos de interrogacion se usan para evitar
		//injection sql!
		String sql = "insert into orador (nombre, apellido,tema, email,fechaAlta)
				   values (?,?,?,?,?)";"
				   //cantidad de signos de interrogacion es igual"
				   	//a la cantidad de campos 
				   try {
					   PreparedStatement statement = 
							   con.prepareStatement
							   (sql,PreparadStatement.RETURN_GENERATED_KEYS);
					   
					   statement.setString(1, orador.getNombre());
					   statement.setString(2, orador.getApellido());
					   statement.setString(3, orador.getTema());
					   statement.setString(4, orador.getMail());
					   statement.setDate
					   (5,new java.sql.Date(System.currentTimeMillis()) orador.getNombre()));
					   //tph
					   
					   
				   }
				   catch (Exception e) {
					   throw new IllegalArgumentException("No se pudo crear el orador", e);
				   }
	}
	
}
