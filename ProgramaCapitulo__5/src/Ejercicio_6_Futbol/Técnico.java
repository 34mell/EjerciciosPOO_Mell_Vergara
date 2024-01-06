package Ejercicio_6_Futbol;

public class Técnico extends Persona {

    int añosExperiencia; /* Atributo que define los años de experiencia que tiene un técnico */
    boolean esNacional; /* Atributo que define si un técnico es nacional o extranjero */

    /**
     * Constructor de la clase Técnico
     * 
     * @param nombre         Parámetro que define el nombre de un técnico
     * @param apellidos      Parámetro que define los apellidos de un técnico
     * @param edad           Parámetro que define la edad de un técnico
     * @param añosExperiencia Parámetro que define los años de experiencia dirigiendo equipos de un técnico
     * @param esNacional     Parámetro que define si un técnico es nacional o extranjero
     */
    public Técnico(String nombre, String apellidos, int edad, int añosExperiencia, boolean esNacional) {
        super(nombre, apellidos, edad);
        this.añosExperiencia = añosExperiencia;
        this.esNacional = esNacional;
    }

    /**
     * Método que convierte a String los datos de un técnico
     * 
     * @return Un String que concatena los datos de un técnico
     */
    public String toString() {
        return "Nombre = " + nombre + ", Apellidos = " + apellidos + ", Edad = " + edad + ", Años de experiencia = "
                + añosExperiencia;
    }
}
