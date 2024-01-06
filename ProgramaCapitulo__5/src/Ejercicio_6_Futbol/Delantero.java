package Ejercicio_6_Futbol;

public class Delantero extends Jugador {
    int golesAnotados; /* Atributo que identifica la cantidad de goles anotados por un delantero */

    /**
     * Constructor de la clase Delantero
     * 
     * @param nombre        Parámetro que define el nombre de un delantero
     * @param apellidos     Parámetro que define los apellidos de un delantero
     * @param edad          Parámetro que define la edad de un delantero
     * @param esTitular     Parámetro que define si un delantero es titular o no
     * @param golesAnotados Parámetro que define el número de goles anotados por
     *                      un delantero
     */
    public Delantero(String nombre, String apellidos, int edad, boolean esTitular, int golesAnotados) {
        super(nombre, apellidos, edad, esTitular); /* Invoca al constructor de la clase padre */
        this.golesAnotados = golesAnotados;
    }

    /**
     * Método que convierte a String los datos de un delantero
     * 
     * @return Un String que concatena los datos de un delantero
     */
    public String toString() {
        return "Nombre = " + nombre + ", Apellidos = " + apellidos + ", Edad = " + edad + ", Goles anotados = "
                + golesAnotados;
    }
}
