package Ejercicio_6_Futbol;

abstract public class Persona {
	
	String nombre; // Atributo que define el nombre de una persona
	String apellidos; // Atributo que define los apellidos de una persona
	int edad; // Atributo que define la edad de una persona
	/**
	* Constructor de la clase Persona
	* @param nombre Parámetro que define el nombre de una persona
	* @param apellidos Parámetro que define los apellidos de una persona
	* @param edad Parámetro que define la edad de una persona
	*/
	
	public Persona(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		}
}
