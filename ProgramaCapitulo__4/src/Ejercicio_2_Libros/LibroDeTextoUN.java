package Ejercicio_2_Libros;


//Clase para Libros de Texto de la Universidad Nacional de Colombia
public class LibroDeTextoUN extends LibroDeTexto {
private String facultad;

// Constructor
public LibroDeTextoUN(String titulo, String autor, double precio, int curso, String facultad) {
   super(titulo, autor, precio, curso);
   this.facultad = facultad;
}

// Método para imprimir información del libro de texto de la UN
@Override
public void imprimirInformacion() {
   super.imprimirInformacion();
   System.out.println("Facultad: " + facultad);
}
}
