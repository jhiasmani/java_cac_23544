package herencia;

public class MainHerencia {

	public static void main(String[] args) {
		//crear un objeto articulo
		Articulo a1 = new Articulo("titulo1",150.5f,"http//www.mongo.com/lolo.jpg");
		
		a1.setAutor("autor a1");
		
		System.out.println(a1);
		
		//Hijo h = new Hijo()
		Musica m1 = new Musica("m1",250.7f,"http//www.bla1/muscia.jpg");
		m1.setAutor("autor m1");//esto es de articulo
		String[] temas = new String[] {"t1","t2","t3"}; 
		m1.setTemas(temas);
		//m1 tiene todo lo suyo + lo del padre
		System.out.println(m1);
		
		Articulo p1 = new Pelicula("peli1",858f,"bla.jpg");
		System.out.println(p1);
		//hacemos un down casting
		Pelicula peli = (Pelicula)p1;
		peli.setFormato("Blue ray 3D");
		peli.setProductora("Warner");
		p1.setAutor("autor pelicula1");
		System.out.println(p1);
		
		//vector para guardar las instancias
		Articulo[] resultados = new Articulo[3];
		resultados[0]=a1;
		resultados[1]=m1;
		resultados[2]=p1;
		
		for(Articulo aux : resultados) {
		System.out.println(aux);
		}
	}

}
