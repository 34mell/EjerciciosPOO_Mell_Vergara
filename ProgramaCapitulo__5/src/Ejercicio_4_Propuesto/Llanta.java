package Ejercicio_4_Propuesto;

public class Llanta {
	
	String marca; // Atributo que identifica la marca de una llanta
	int diametroRin; // Atributo que identifica el diámetro del rin de una llanta
	int altura; // Atributo que identifica la altura de una llanta
	int anchura; // Atributo que identifica la anchura de una llanta
	/**
	* Constructor de la clase Llanta
	* @param marca Parámetro que define la marca de la llanta de un 
	* automóvil
	* @param diametroRin Parámetro que define el diámetro del rin de 
	* la llanta de un automóvil
	* @param altura Parámetro que define la altura de la llanta de un 
	* automóvil
	* @param anchura Parámetro que define la anchura de la llanta de 
	* un automóvil
	*/
	Llanta(String marca, int diametroRin, int altura, int anchura) {
		this.marca = marca;
		this.diametroRin = diametroRin;
		this.altura = altura;
		this.anchura = anchura;
		}
		/**
		* Método que muestra en pantalla los datos de una llanta de un 
		* autómovil
		*/
		void imprimir() {
		System.out.println("Marca = " + marca);
		System.out.println("Diámetro del rin = " + diametroRin);
		System.out.println("Altura = " + altura);
		System.out.println("Anchura = " + anchura);
		}


}
