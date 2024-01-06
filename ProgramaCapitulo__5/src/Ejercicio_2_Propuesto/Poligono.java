package Ejercicio_2_Propuesto;

public class Poligono {
    String nombre;
    Punto[] puntos;

    Poligono(String nombre, Punto[] puntos) {
        if (puntos.length < 3) {
            throw new IllegalArgumentException("Un polígono debe tener al menos 3 puntos.");
        }

        this.nombre = nombre;
        this.puntos = puntos;
    }
}