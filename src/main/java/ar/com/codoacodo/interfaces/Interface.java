package ar.com.codoacodo.interfaces;

public interface Interface {
	final String hola="";
	
	//metodos solo tienen definicion no tiene cuerpo
	public void metodo1();
	
	public default void metodo2() {
	
		System.out.println("Metodo2");
	}

}
