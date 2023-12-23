package herencia;

public class Libro extends Articulo{
	
	private String isbn;
   
	public Libro(
			String titulo,
			Float precio, 
			String img
			) {
		
		// libro no puede nacer, si primero no nace el articulo
		
		super(titulo, precio, img);//nace articulo
		
		//ahora podemos usar this.
		//this.isbn=isbn;
		
	}

	//ponemos setter y getter para no modificar el constructor padre
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return super.toString() + "Libro [isbn=" + isbn + "]";
	}
	
	
		

}
