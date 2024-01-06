package Ejercicio_6_Futbol;

public class Mediocampo extends Jugador{
	
	/* Atributo que identifica la cantidad de asistencias que ha realizado 
	un mediocampo */
	int númeroAsistencias;
	/**
	* Constructor de la clase Mediocampo
	* @param nombre Parámetro que define el nombre de un mediocampo
	* @param apellidos Parámetro que define los apellidos de un 
	* mediocampo
	* @param edad Parámetro que define la edad de un mediocampo
	* @param esTitular Parámetro que define si un mediocampo es 
	* titular o no
	* @param númeroAsistencias Parámetro que define la cantidad de 
	* asistencias de un mediocampo
	*/
	public Mediocampo(String nombre, String apellidos, int edad, 
	boolean esTitular, int númeroAsistencias) {
	super(nombre, apellidos, edad, esTitular); /* Invoca al constructor 
	de la clase padre */
	this.númeroAsistencias = númeroAsistencias;
	}
	/**
	* Método que convierte a String los datos de un mediocampo
	* @return Un String que concatena los datos de un mediocampo
	*/
	public String toString() {
	return "Nombre = " + nombre + ", Apellidos = " + apellidos
			+ ", Edad = " + edad + ", Asistencias = " + númeroAsistencias;
	}

}
