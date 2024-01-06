package Ejercicio_12_Medicina;

public class Medico {
	
	/**
	* Esta clase denominada Médico modela un médico con un solo 
	* atributo: su nombre
	* @version 1.2/2020
	*/

	String nombre; // Atributo que define el nombre de un médico
	/**
	* Método que devuelve el nombre de un médico
	* @return El nombre del médico
	*/
	String getNombre() {
	return nombre;
	}
	/**
	* Método que estable el nombre de un médico
	* @param nombre Parámetro que define el nombre de un médico
	*/
	void setNombre(String nombre) {
	this.nombre = nombre;
	}

}
