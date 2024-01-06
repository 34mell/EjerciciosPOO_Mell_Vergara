package Ejercicio_2_Libros;

//Clase para Novelas
public class Novela extends Libro {
private String tipo;

// Constructor
public Novela(String titulo, String autor, double precio, String tipo) {
   super(titulo, autor, precio);
   this.tipo = tipo;
}

// Método para imprimir información de la novela
@Override
public void imprimirInformacion() {
   super.imprimirInformacion();
   System.out.println("Tipo de novela: " + tipo);
}
}