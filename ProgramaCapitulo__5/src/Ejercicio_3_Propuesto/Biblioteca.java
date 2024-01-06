package Ejercicio_3_Propuesto;

import java.util.Vector;

public class Biblioteca {
    String nombre;
    Vector<Publicación> colecciónPublicaciones;

    Biblioteca(String nombre) {
        this.nombre = nombre;
        colecciónPublicaciones = new Vector<>();
    }

    void añadirPublicación(Publicación publicación) {
        colecciónPublicaciones.add(publicación);
    }

    void listarPublicaciones() {
        for (Publicación publicación : colecciónPublicaciones) {
            publicación.imprimir();
        }
    }
}
