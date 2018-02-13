//Miguel Silva Ramos A01328387 y Fernando Rodriguez Robles A01328720
//05/02/2018
//Clase que crea el objeto escuela
public class Escuela {
	private String nombreEscuela;
	private Alumno alumno [];
	private Profesor profesor [];

	Escuela (String nombreEscuela){ //Constructor de la escuela
		this.nombreEscuela = nombreEscuela;
	}

	void agregarAlumnos (Alumno alumno []){ //Metodo que agrega alumnos a escuela
		this.alumno = alumno;		
	}

	void agregarProfesor (Profesor profesor []) { //Metodo que agrega profesores a escuela
		this.profesor = profesor;		
	}

	public String toString () { //Metodo que devuelve la informacion de la escuela 
		return "La escuela es " + nombreEscuela + "\nAlumnos:\n" + alumno[0] + alumno[1] + alumno[2] + "Profesores:\n" + profesor[0] + "\n" + profesor[1];
	}
}	