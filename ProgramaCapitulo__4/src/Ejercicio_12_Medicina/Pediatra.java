package Ejercicio_12_Medicina;

/**
* Esta clase denominada Pediatra es una subclase de Médico que 
* cuenta con un atributo tipo que determina si el pediatra es pediatra 
* neurólogo o psicólogo
* @version 1.2/2020
*/

public class Pediatra extends Medico{

	// Valor enumerado de define tipologías de un pediatra
	enum tipología {NEUROLOGO, PSICOLOGO};
	tipología tipo; // Atributo que define el tipo de pediatra
	/**
	* Método que devuelve el tipo de pediatra
	* @return El tipo de pediatra
	*/
	void setTipología(tipología tipo) {
	this.tipo = tipo;
	}
	/**
	* Método que establece el tipo de pediatra
	* @param nombre Parámetro que define el tipo de pediatra
	*/
	tipología getTipología() {
	return tipo;
	}
}

