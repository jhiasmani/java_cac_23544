package ar.com.codoacodo.repository;

import java.time.LocalDate;
import java.util.List;

import ar.com.codoacodo.entity.Orador;

public class MainOradorRepository {

	

	public static void main(String[] args) {
		
		//Interface i = new ClaseQueImplementa();
		 OradorRepository repository = new MySqlOradorRepository();
		Orador orador = repository.getByID(2L);
		System.out.println(orador);
		

	}

}
