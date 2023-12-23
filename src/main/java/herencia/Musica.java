package herencia;

import java.util.Arrays;

public class Musica extends Articulo {

	 
	private String[] temas;
	public Musica(String titulo, Float precio, String img) {
		super(titulo, precio, img);
		
	}
	
	//setter y getter
	public String[] getTemas() {
		return temas;
	}
	public void setTemas(String[] temas) {
		this.temas = temas;
	}

	@Override
	public String toString() {
		return super.toString() + ",Musica [temas=" + Arrays.toString(temas) + "]";
	}
	
	
	

}
