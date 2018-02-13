//Miguel Silva Ramos A01328387 y Fernando Rodriguez Robles A01328720
//05/02/2018
//Clase que es padre de alumno y profesor
public class Persona {
	protected String nombrePersona, apellido;
	protected Fecha fecha;

	Persona (String nombrePersona , String apellido , Fecha fecha) { //Constructor de persona, hay composicion con la clase Fecha
		this.nombrePersona = nombrePersona;
		this.apellido = apellido;
		this.fecha = fecha;
	}

	public String toString () { //Metodo que devuelve la informacion de una persona
		return nombrePersona + " " + apellido; 
	}
}