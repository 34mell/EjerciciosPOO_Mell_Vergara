package Ejercicio_3_Propuesto;

public class Revista extends Publicación {
    String periodicidad;
    String país;

    // Constructor de la clase Revista
    Revista(String título, int añoPublicación, String editorial, String periodicidad, String país) {
        super(título, añoPublicación, editorial);
        this.periodicidad = periodicidad;
        this.país = país;
    }

    // Método que muestra en pantalla los datos de una revista
    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Periodicidad = " + periodicidad);
        System.out.println("País = " + país);
        System.out.println();
    }
}
