//Miguel Silva Ramos A01328387 y Fernando Rodriguez Robles A01328720
//05/02/2018
//Clase hija de Persona que crea alumnos
public class Alumno extends Persona {
	private  String matricula , carrera;

	Alumno (String nombrePersona , String apellido , Fecha fecha , String matricula , String carrera) { //Constructor de alumno, se utilizan los parametros de la clase padre
		super(nombrePersona , apellido , fecha);
		this.matricula = matricula;
		this.carrera = carrera;
	}

	public String toString () { //Metodo que devuelve la informacion del alumno
		return super.toString() + " " + carrera + "\n" + matricula + " que nacio el " + fecha + "\n";
	}
}