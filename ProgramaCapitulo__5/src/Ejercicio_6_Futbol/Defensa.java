package Ejercicio_6_Futbol;

public class Defensa extends Jugador {

    /**
     * Constructor de la clase Defensa
     * 
     * @param nombre    Parámetro que define el nombre de un defensa
     * @param apellidos Parámetro que define los apellidos de un defensa
     * @param edad      Parámetro que define la edad de un defensa
     * @param esTitular Parámetro que define si un defensa es titular o no
     */
    public Defensa(String nombre, String apellidos, int edad, boolean esTitular) {
        super(nombre, apellidos, edad, esTitular); /* Invoca al constructor de la clase padre */
    }

    /**
     * Método que convierte a String los datos de un defensa
     * 
     * @return Un String que concatena los datos de un defensa
     */
    public String toString() {
        return "Nombre = " + nombre + ", Apellidos = " + apellidos + ", Edad = " + edad;
    }
}
