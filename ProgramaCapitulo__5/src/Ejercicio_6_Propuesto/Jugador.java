package Ejercicio_6_Propuesto;

public abstract class Jugador extends Persona {
    boolean esTitular;

    public Jugador(String nombre, String apellidos, int edad, boolean esTitular) {
        super(nombre, apellidos, edad);
        this.esTitular = esTitular;
    }
}