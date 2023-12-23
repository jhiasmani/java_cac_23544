package ar.com.codoacodo.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


import ar.com.codoacodo.entity.Orador;
import ar.com.codoacodo.utils.DateUtils.DateUtils;

public class MySqlOradorRepository implements OradorRepository {


//Metodo para Insertar nuevo Orador 
	
	public void save(Orador orador) {
		
		// get del orador para obtener datos

				// 1 - obtener conexion
				Connection con = AdministradorDeConexiones.getConnection();
				
				// 2 - preparo sql: el signo de interrogacion es para evitar sql injeciton!
				String sql = "insert into orador (nombre, apellido, tema, email, fecha_alta) values (?,?,?,?,?)";
		
				
				// el preparedstatement es select * from orador
				try {
					
					PreparedStatement statement = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
					statement.setString(1,orador.getNombre());
					statement.setString(2, orador.getApellido());
					statement.setString(3, orador.getTema());
					statement.setString(4, orador.getMail());
					statement.setDate(5, new java.sql.Date(DateUtils.asDate(orador.getFechaAlta()).getTime()));

					statement.executeUpdate();//se usa para insert/update/delete
					ResultSet res = statement.getGeneratedKeys();
					if (res.next()) {
						Long id = res.getLong(1);// aca esta el id
						orador.setId(id);
					}
					
				}catch(Exception e) {
					throw new IllegalArgumentException("No se pudo crear el orador:", e);
				}
				
			
				
	}

//Metodo Mostrar Orador por Id
	
	public Orador getByID(Long id) {
		
		String sql = "select id, nombre, apellido, tema, email, fecha_alta from orador where id = ?";

		Orador orador = null;
		try(Connection con = AdministradorDeConexiones.getConnection()) {
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setLong(1, id);

			ResultSet res = statement.executeQuery();// ejecuta un SELECT

			if (res.next()) {
				Long dbId = res.getLong(1);  
				String nombre = res.getString(2);  
				String apellido = res.getString(3);  
				String tema = res.getString(4);  
				String email = res.getString(5);  
				Date fechaAlta = res.getDate(6);  
				
			orador = new Orador(dbId, nombre, apellido, email, tema,DateUtils.asLocalDate(fechaAlta));
			}
			
		} catch (Exception e) {
			throw new IllegalArgumentException("No se pudo crear el orador:", e);
		}
		
		return orador;
	}


//Metodo Actualizar(Update)
	
	public void update(Orador orador) {
		
		String sql = "update orador "
				+ "set nombre=?, apellido=?, email=?, tema=? "
				+ "where id = ?";
		
		//try with resources
		try(Connection con = AdministradorDeConexiones.getConnection()) {
			
			PreparedStatement statement = con.prepareStatement(sql);
			
			statement.setString(1, orador.getNombre());
			statement.setString(2, orador.getApellido());
			statement.setString(3, orador.getMail());
			statement.setString(4, orador.getTema());
			statement.setLong(5, orador.getId());
			
			statement.executeUpdate();
		}catch (Exception e) {
			throw new IllegalArgumentException("No se pudo actualizar el orador:", e);
		}
	}
		
	
//Metodo Delete
  	
	public void delete(Long id) {
		
String sql = "delete from orador where id = ?";
		
		//try with resources
		try(Connection con = AdministradorDeConexiones.getConnection()) {
			
			PreparedStatement statement = con.prepareStatement(sql);
			
			statement.setLong(1, id);
			
			statement.executeUpdate();
		}catch (Exception e) {
			throw new IllegalArgumentException("No se pudo eliminar el orador:", e);
		}
		
	}

	
//Metodo Listado de Oradores
	
	public List<Orador> findAll() {
		
		String sql = "select id, nombre, apellido, tema, email, fecha_alta from orador";

		List<Orador> oradores = new ArrayList<>();//se ve bien en spring!
		
		//try with resources
		try(Connection con = AdministradorDeConexiones.getConnection()) {
			PreparedStatement statement = con.prepareStatement(sql);

			ResultSet res = statement.executeQuery();// SELECT

			while (res.next()) {
				Long dbId = res.getLong(1);  
				String nombre = res.getString(2);  
				String apellido = res.getString(3);  
				String tema = res.getString(4);  
				String email = res.getString(5);  
				LocalDate fechaAlta = DateUtils.asLocalDate(res.getDate(6));  
				
				oradores.add(new Orador(dbId, nombre, apellido, email, tema,fechaAlta));
			}
			
		} catch (Exception e) {
			throw new IllegalArgumentException("No se pudo crear el orador:", e);
		}
		return oradores;
		
	}

	 
}
