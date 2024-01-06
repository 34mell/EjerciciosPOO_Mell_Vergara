package Ejercicio_5_Informatica;

/**
* Esta clase denominada Tableta modela un tipo específico de equipo 
* informático
* @version 1.2/2020
*/
class Tableta extends DispositivoInformático {
    /**
     * Constructor de la clase Tableta que imprime en pantalla la marca 
     * de la tableta
     */
    Tableta(String marca) {
        super(); // Llamada al constructor de la clase base
        System.out.println("Marca = " + marca); /* ¿Qué imprimirá al ser 
        ejecutado el constructor? */
    }
}
