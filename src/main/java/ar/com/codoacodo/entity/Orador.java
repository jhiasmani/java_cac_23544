package ar.com.codoacodo.entity;//el nombre del paquete donde esta ubicado

import java.time.LocalDate;

//el constructor tiene el mismo nombre de la clase

/*encapsulamiento
	+public
	-private
	#protected
*/
public class Orador {
	
	//atributos
	private Long id;
	private String nombre;
	private String apellido;
	private String mail;
	private String tema;
	private LocalDate fechaAlta;
	
	//constructor
	// 2 constructores
	
	//insert into orador (campos,..) values(...)
		public Orador(String nombre, String apellido, String mail, String tema, LocalDate fechaAlta) {
			init(nombre, apellido, mail, tema, fechaAlta);
		}
		
		//alt+shift+m...crea metodo con los campos elegidos

	private void init(String nombre, String apellido, String mail, String tema, LocalDate fechaAlta) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.tema = tema;
		this.fechaAlta = fechaAlta;
	}
		
		//
		
		//alt+shit+s

		public Orador(Long id, String nombre, String apellido, String mail, String tema, LocalDate fechaAlta) {
			this.id = id;
			init(nombre, apellido, mail, tema, fechaAlta);
		}

		//cambiar un metod llamadotoString() de la clase object
				//y ver mejor los datos en la consola
		
		@Override
		public String toString() {
			return "Orador [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", mail=" + mail + ", tema="
					+ tema + ", fechaAlta=" + fechaAlta + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
					+ ", toString()=" + super.toString() + "]";
		}

		
		
		//getters / setters
		
		//alt+shift+s
		
		public Long getId() {
			return id;
		}

		/*public void setId(Long id) {
			this.id = id;
		}*/  //no hace falta el set de ID porque se genera solo en la base

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public String getMail() {
			return mail;
		}

		public void setMail(String mail) {
			this.mail = mail;
		}

		public String getTema() {
			return tema;
		}

		public void setTema(String tema) {
			this.tema = tema;
		}

		public LocalDate getFechaAlta() {
			return fechaAlta;
		}

		public void setFechaAlta(LocalDate fechaAlta) {
			this.fechaAlta = fechaAlta;
		}
		
		
	

}
