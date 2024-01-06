package Ejercicio_12_Medicina;

/**
* Esta clase denominada Ortopedista es una subclase de Médico que 
* cuenta con un atributo tipo que determina si el ortopedista es 
* maxilofacial o pediátrico
* @version 1.2/2020
*/

public class Ortopedista extends Medico{

	// Valor enumerado para definir diferentes tipo de ortopedista
	enum tipología {MAXILOFACIAL, PEDIÁTRICA};
	tipología tipo; // Atributo que define el tipo de ortopedista
	/**
	* Método que estable el tipo de ortopedista
	* @param nombre Parámetro que define el tipo de ortopedista
	*/
	void setTipología(tipología tipo) {
	this.tipo = tipo;
	}
	/**
	* Método que devuelve el tipo de ortopedista
	* @return El tipo de ortopedista
	*/
	tipología getTipología() {
	return tipo;
	}
}

