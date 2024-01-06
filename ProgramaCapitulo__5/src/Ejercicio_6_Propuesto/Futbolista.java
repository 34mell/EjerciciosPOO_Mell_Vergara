package Ejercicio_6_Propuesto;

abstract class Futbolista extends Jugador {
    int golesAnotados;

    public Futbolista(String nombre, String apellidos, int edad, boolean esTitular, int golesAnotados) {
        super(nombre, apellidos, edad, esTitular);
        this.golesAnotados = golesAnotados;
    }
}