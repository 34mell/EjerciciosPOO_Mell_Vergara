package Ejercicio_6_Futbol;

public class Portero extends Jugador {
	
	int golesRecibidos; /* Atributo que define la cantidad de goles 
	recibidos por un portero de fútbol */
	/**
	* Constructor de la clase Portero
	* @param nombre Parámetro que define el nombre de un portero
	* @param apellidos Parámetro que define los apellidos de un portero
	* @param edad Parámetro que define la edad de un portero
	* @param esTitular Parámetro que define si un portero es titular o no
	* @param golesRecibidos Parámetro que define la cantidad de goles 
	* recibidos por un portero
	*/
	public Portero(String nombre, String apellidos, int edad, boolean 
	esTitular, int golesRecibidos) {
	super(nombre, apellidos, edad, esTitular); /* Invoca al constructor 
	de la clase padre */
	this.golesRecibidos = golesRecibidos;
	}
	/**
	* Método que convierte a String los datos de un portero
	* @return Un String que concatena los datos de un portero
	*/
	public String toString() {
	return "Nombre = " + nombre + ", Apellidos = " + apellidos + 
			", Edad = " + edad + ", Goles recibidos = " + golesRecibidos;
	}

}
