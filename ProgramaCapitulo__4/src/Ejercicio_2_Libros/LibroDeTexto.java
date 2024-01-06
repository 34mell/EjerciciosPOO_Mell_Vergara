package Ejercicio_2_Libros;

public class LibroDeTexto extends Libro {
    private int curso;

    // Constructor
    public LibroDeTexto(String titulo, String autor, double precio, int curso) {
        super(titulo, autor, precio);
        this.curso = curso;
    }

    // Método para imprimir información del libro de texto
    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Curso: " + curso);
    }
    
    
}

