package Ejercicio_14_Mamiferos;

/**
* Esta clase prueba diferentes acciones realizadas por los mamíferos y 
* sus clases específicas Ballena y Ornitorrinco 
* @version 1.2/2020
*/
public class Prueba {
/**
* Método main que crea una ballena y un ornitorrinco e invoca los 
* métodos heredados e implementados
*/
public static void main(String args[]) {
Ballena mobyDick = new Ballena(); // Crea una ballena
mobyDick.amamantarCrías(); /* Invoca el método heredado de la 
clase Mamífero */
Ornitorrinco ornitorrinco1 = new Ornitorrinco(); /* Crea un 
ornitorrinco */
ornitorrinco1.amamantarCrías(); /* Invoca el método heredado 
de la clase Mamífero */
ornitorrinco1.ponerHuevos(); /* Invoca el método implementado 
de la interfaz Ornitorrinco */
}
}
