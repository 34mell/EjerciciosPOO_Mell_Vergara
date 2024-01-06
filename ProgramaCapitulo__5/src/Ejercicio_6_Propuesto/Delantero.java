package Ejercicio_6_Propuesto;

public class Delantero extends Futbolista {
    public Delantero(String nombre, String apellidos, int edad, boolean esTitular, int golesAnotados) {
        super(nombre, apellidos, edad, esTitular, golesAnotados);
    }

    public String toString() {
        return "Nombre = " + nombre + ", Apellidos = " + apellidos + ", Edad = " + edad + ", Goles anotados = " + golesAnotados;
    }
}