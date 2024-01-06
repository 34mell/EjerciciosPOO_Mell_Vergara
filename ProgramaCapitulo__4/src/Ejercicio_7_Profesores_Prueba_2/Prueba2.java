package Ejercicio_7_Profesores_Prueba_2;

/**
* Esta clase prueba las clases Profesor y ProfesorTitular utilizando la 
* conversión descendente
* @version 1.2/2020
*/
public class Prueba2 { 
/**
* 
*
public static void main(String[] args) {
ProfesorTitular objeto = new Profesor();
objeto.imprimir();
}
}


/**
 * 

 *  ¿Cuál es el resultado de la ejecución del siguiente programa basado 
en el ejercicio anterior?:
package Profesores;
public class Prueba { 
public static void main(String[] args) {
Profesor profesor1 = new ProfesorTitular();
ProfesorTitular profesor2 = (Profesor) profesor1;
profesor2.imprimir();
}

*Respuesta
*El código proporcionado generará un error en tiempo de compilación en la línea
*Esto se debe a que está intentando realizar un cast de un objeto de tipo ProfesorTitular 
*a Profesor, pero la relación de herencia está en la dirección opuesta. 
*En otras palabras, está tratando de asignar un objeto de una subclase a 
*una variable de la superclase sin el cast explícito.
 * 
*/
}
