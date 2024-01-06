package Ejercicio_7_Profesores;

public class EjercicioPropuesto {
	
	/**
	 * 
	 * ¿Cuál es el resultado de la ejecución del siguiente programa basado 
	 * en el ejercicio anterior?
	 * public class Prueba { 
	 * public static void main(String[] args) { 
	 * Profesor profesor1 = new ProfesorTitular();
	 * Profesor profesor2 = (Profesor) profesor1;
	 * profesor2.imprimir();
	 * } 
	 * }
	 * 
	 * El resultado de la ejecución del programa basado en el ejercicio anterior 
	 * imprimirá:
	 * 
	 * Es un profesor titular.
	 * 
	 * Esto se debe a que se crea un objeto ProfesorTitular y se asigna a una variable 
	 * de tipo Profesor. Luego, se realiza un cast explícito ((Profesor)) para asignar 
	 * este objeto a otra variable de tipo Profesor. Aunque la referencia de tipo Profesor 
	 * apunta a un objeto de tipo ProfesorTitular, cuando se llama al método imprimir(), 
	 * se utiliza el método sobrescrito en la subclase ProfesorTitular, ya que Java utiliza 
	 * el tipo real del objeto en tiempo de ejecución para determinar qué método debe 
	 * invocarse.
	 */

}
