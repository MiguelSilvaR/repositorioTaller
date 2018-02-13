//Miguel Silva Ramos A01328387 y Fernando Rodriguez Robles A01328720
//05/02/2018
//Clase que da la fecha segun los datos que reciba
public class Fecha {
	private String mesLetra [] = {"" ,"Enero", "Febrero" , "Marzo" , "Abril" , "Mayo" , "Junio" , "Julio" , "Agosto" , "Septiembre" , "Octubre" , "Noviembre" , "Diciembre"};
	private int dia , mes , ano;

	Fecha (int dia , int mes , int ano) { //Constructor que determina los atributos de la fecha
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public String toString () { //Metodo que devuelve la fecha de la forma ##/Mes/####. Para los digitos, se agrega un 0 a la izquierda
		if (dia < 10) {
			return "0" + dia + " de " +  mesLetra[mes] + " de " + ano;
		}else {
			return dia + " de " +  mesLetra[mes] + " de " + ano;
		}
	}
}