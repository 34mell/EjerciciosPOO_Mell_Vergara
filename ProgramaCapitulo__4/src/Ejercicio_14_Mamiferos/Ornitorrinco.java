package Ejercicio_14_Mamiferos;

/**
* Esta clase denominada Ornitorrinco modela un tipo de Mamífero y a 
* su vez implementa la interfaz Ovíparo
* @version 1.2/2020
*/
public class Ornitorrinco extends Mamífero implements Ovíparo {
/**
* Método que implementa el método abstracto amamantarCrías 
* heredado de la clase Mamífero que define un texto específico sobre 
* el ornitorrinco que amamanta crías
*/
public void amamantarCrías() {
System.out.println("El ornitorrinco amamanta a sus crías.");
}
/**
* Método que implementa el método ponerHuevos de la interfaz 
* Ovíparo que define un texto específico sobre el ornitorrinco que 
* puede poner huevos
*/
public void ponerHuevos() {
System.out.println("El ornitorrinco pone huevos.");
}
}
