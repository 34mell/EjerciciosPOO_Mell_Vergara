package Ejercicio_3_Propuesto;

public class Libro extends Publicación {
    String referenciaBibliográfica;

    // Constructor de la clase Libro
    Libro(String título, String autor, int añoPublicación, String editorial, String referenciaBibliográfica) {
        super(título, añoPublicación, editorial);
        this.referenciaBibliográfica = referenciaBibliográfica;
    }

    // Método que muestra en pantalla los datos de un libro
    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Referencia bibliográfica = " + referenciaBibliográfica);
        System.out.println();
    }
}

