package herencia;

public class Articulo {
	protected String titulo;
	protected Float precio;
	protected String autor;
	protected String img;
	
	//alt+shift+s generar constructor o getters y setters
	
	public Articulo(String titulo, 
			        Float precio, 
			        String img) {
		//super(); no tenemos en cuenta el super
					this.titulo = titulo;
					this.precio = precio;
					this.img = img;
	}

	
	//Setters y Getters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	//metodo ToString
	
	@Override
	public String toString() {
		return "Articulo [titulo=" + titulo + ", precio=" + precio + ", autor=" + autor + ", img=" + img + "]";
	}
	
	
	
	
	
	

}
