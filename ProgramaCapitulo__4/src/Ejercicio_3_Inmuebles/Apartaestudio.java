package Ejercicio_3_Inmuebles;

/**
* Esta clase denominada Apartaestudio modela un tipo específico de 
* apartamento que tiene una sola habitación.
* @version 1.2/2020
*/
public class Apartaestudio extends Apartamento {

    // Atributo que identifica el valor por área de un apartaestudio
    protected static double valorArea = 1500000;

    /**
     * Constructor de la clase Apartaestudio
     * @param identificadorInmobiliario Parámetro que define el 
     * identificador inmobiliario de un apartaestudio
     * @param área Parámetro que define el área de un apartaestudio
     * @param dirección Parámetro que define la dirección donde se 
     * encuentra localizado un apartaestudio
     * @param j 
     * @param i 
     */
    public Apartaestudio(int identificadorInmobiliario, int área, String dirección, int i, int j) {
        // Invoca al constructor de la clase padre
        // Los apartaestudios tienen una sola habitación y un solo baño
        super(identificadorInmobiliario, área, dirección, 1, 1);
    }

    /**
     * Método que muestra en pantalla los datos de un apartaestudio
     */
   public void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Tipo: Apartaestudio");
        System.out.println();
    }
}
