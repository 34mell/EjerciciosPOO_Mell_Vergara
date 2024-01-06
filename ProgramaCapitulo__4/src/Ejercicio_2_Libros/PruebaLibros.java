package Ejercicio_2_Libros;

public class PruebaLibros {
    public static void main(String[] args) {
        Libro libro = new Libro("Java Programming", "John Doe", 29.99);
        libro.imprimirInformacion();

        LibroDeTexto libroDeTexto = new LibroDeTexto("Mathematics Basics", "Jane Smith", 39.99, 1);
        libroDeTexto.imprimirInformacion();

        LibroDeTextoUN libroDeTextoUN = new LibroDeTextoUN("History of Science", "Professor X", 49.99, 2, "Science Faculty");
        libroDeTextoUN.imprimirInformacion();

        Novela novela = new Novela("The Adventure Begins", "Alice Johnson", 19.99, "Adventure");
        novela.imprimirInformacion();
    }
}
