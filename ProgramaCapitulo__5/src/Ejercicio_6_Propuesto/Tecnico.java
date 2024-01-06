package Ejercicio_6_Propuesto;

public class Tecnico extends Persona {
    int añosExperiencia;
    boolean esNacional;

    public Tecnico(String nombre, String apellidos, int edad, int añosExperiencia, boolean esNacional) {
        super(nombre, apellidos, edad);
        this.añosExperiencia = añosExperiencia;
        this.esNacional = esNacional;
    }

    public String toString() {
        return "Nombre = " + nombre + ", Apellidos = " + apellidos + ", Edad = " + edad + " Años de experiencia = " + añosExperiencia;
    }
}