package ar.com.codoacodo.entity;

import java.time.LocalDate;

public class MainOrador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Orador nuevoOrador = new Orador("jhiasmani", "chavez", 
				                         "miemail@gmail.com", 
				                         "Arduino", LocalDate.now());
		
		System.out.println(nuevoOrador);
	
		

	}

	

	


	

}
