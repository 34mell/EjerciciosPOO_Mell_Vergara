package Ejercicio_7_Profesores_Prueba_3;

/**
* Esta clase denominada ProfesorTitular es una subclase de Profesor
* @version 1.2/2020
*/
public class ProfesorTitular extends Profesor {
/* Atributo que identifica la cantidad de años que el profesor ha sido 
titular */
int años = 0;
/**
* Método que sobreescribe el método imprimir heredado de la clase 
* padre Profesor
*/
protected void imprimir() {
System.out.println("Es un profesor titular.");
  }

/**
* Método que imprime en pantalla la cantidad de años que tiene un 
* profesor siendo titular
*/
protected void imprimirAños() {
System.out.println("Años ="+ años);
}

}

