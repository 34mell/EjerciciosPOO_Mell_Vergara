package Ejercicio_5_Informatica;

/**
 * Esta clase denominada DispositivoInformático modela un equipo 
 * informático y cuenta con un único atributo: marca, el cual 
 * inicialmente tiene el valor “Acer”.
 * @version 1.2/2020
 */
class DispositivoInformático {
    String marca = "Acer"; /* Atributo que identifica la marca del dispositivo informático */

    /**
     * Constructor de la clase DispositivoInformático que imprime en 
     * pantalla la marca del dispositivo informático
     */
    DispositivoInformático() {
        System.out.println("Marca = " + marca);
    }
}
