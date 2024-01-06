package Ejercicio_3_Propuesto;

public class Publicación {
    String título;
    int añoPublicación;
    String editorial;

    // Constructor de la clase Publicación
    Publicación(String título, int añoPublicación, String editorial) {
        this.título = título;
        this.añoPublicación = añoPublicación;
        this.editorial = editorial;
    }

    // Método que muestra en pantalla los datos de una publicación
    void imprimir() {
        System.out.println("Título de la publicación = " + título);
        System.out.println("Año de publicación = " + añoPublicación);
        System.out.println("Editorial = " + editorial);
    }
}
