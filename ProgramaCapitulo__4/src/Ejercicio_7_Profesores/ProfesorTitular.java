package Ejercicio_7_Profesores;

/**
* Esta clase denominada ProfesorTitular es una subclase de Profesor
* @version 1.2/2020
*/
public class ProfesorTitular extends Profesor {
    /**
    * Método que sobreescribe el método imprimir heredado de la clase 
    * padre Profesor
    */
    protected void imprimir() {
        System.out.println("Es un profesor titular.");
    }
}
