//Miguel Silva Ramos A01328387 y Fernando Rodriguez Robles A01328720
//05/02/2018
//Programa que crea objeto escuela con sus alumnos y profesores
public class Main {

	public static void main(String[] args) { //Metodo que da la informacion a los constructores para crear objetos y posteriormente imprimirlos
		Alumno alumno [] = {new Alumno ("Juan" , "Sanchez Lopez" , new Fecha (12 , 1 , 2000) , "A1099923" , "LAD"), new Alumno ("Eduardo" , "Ramirez Berra" , new Fecha (30 , 4 , 2001) , "A1098765" , "ITC"), new Alumno ("Laura" , "Pena Salinas" , new Fecha (24 , 9 , 2000) , "A1097465" , "LIN")};
		Profesor profesor [] = {new Profesor ("Bruno" , "Diaz Perez" , new Fecha (24, 2 , 1988) , "L0123456" , "T.I") , new Profesor ("Leonel" , "Meza Ronaldo" , new Fecha (5, 12 , 1977) , "L0876543" , "Mate") };
		Escuela escuela = new Escuela ("Hogwarts");
		escuela.agregarAlumnos(alumno);
		escuela.agregarProfesor(profesor);
		System.out.println(escuela);
	}
	
}