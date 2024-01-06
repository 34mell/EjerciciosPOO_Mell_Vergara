package Ejercicio_12_Medicina;

/**
* Esta clase prueba diferentes acciones realizadas por la clase Pediatra y 
* Ortopedista
* @version 1.2/2020
*/

import java.util.Vector;

public class Prueba {

    /**
     * Método main que crea un vector de médicos y luego agrega un médico, un
     * ortopedista y un pediatra al vector de médicos. Luego, se recorre el vector
     * de médicos para determinar qué tipo de médico es cada elemento y obteniendo
     * su posición en el vector
     */

    public static void main(String[] args) {
        Vector<Medico> listaMédicos = new Vector<>();
        Medico médico1 = new Medico();
        listaMédicos.add(médico1);
        Ortopedista ortopedista1 = new Ortopedista();
        listaMédicos.add(ortopedista1);
        Pediatra pediatra1 = new Pediatra();
        listaMédicos.add(pediatra1);

        for (int i = 0; i < listaMédicos.size(); i++) {
            // Se debe realizar un proceso de casting con la clase padre
            Medico a = listaMédicos.elementAt(i);

            if (a instanceof Ortopedista) {
                /* Determina si el elemento es un ortopedista */
                System.out.println("El objeto en el índice " + i + " es de la clase Ortopedista");
            } else if (a instanceof Pediatra) {
                /* Determina si el elemento es un pediatra */
                System.out.println("El objeto en el índice " + i + " es de la clase Pediatra");
            } else if (a instanceof Medico) {
                /* Determina si el elemento es un médico */
                System.out.println("El objeto en el índice " + i + " es de la clase Médico");
            }
        }
    }
}


