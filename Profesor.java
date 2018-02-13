//Miguel Silva Ramos A01328387 y Fernando Rodriguez Robles A01328720
//05/02/2018
//Clase hija de Persona que crea profesores
public class Profesor extends Persona {
	private  String nomina , departamento;

	Profesor (String nombrePersona , String apellido , Fecha fecha , String nomina , String departamento) { //Constructor de profesor, se utilizan los parametros de la clase padre
		super(nombrePersona , apellido , fecha);
		this.nomina = nomina;
		this.departamento = departamento;
	}

	public String toString () { //Metodo que devuelve la informacion del profesor
		return super.toString() + " que nacio el " + fecha + " con nomina " + nomina + " del depto de " + departamento;
	}
}