package Ejercicio_3_Propuesto;

public class Prueba {
    public static void main(String args[]) {
        Biblioteca biblioteca1 = new Biblioteca("Biblioteca Nacional");

        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez",
                1967, "Sudamericana", "858.67/M566");
        biblioteca1.añadirPublicación(libro1);

        Revista revista1 = new Revista("National Geographic", 2022, "National Geographic Society", "Mensual", "Estados Unidos");
        biblioteca1.añadirPublicación(revista1);

        biblioteca1.listarPublicaciones();
    }
}
