package Ejercicio_3_Biblio;

import java.util.Vector;

/**
* Esta clase denominada Biblioteca modela este tipo de establecimiento, 
* el cual tiene un nombre y una colección de libros.
* @version 1.2/2020
*/

public class Biblioteca {
	
	// Atributo que identifica el nombre de la biblioteca
	String nombre;
	/* Atributo que identifica la colección de libros de la biblioteca como 
	un vector de libros */
	Vector<Libro> colecciónLibros;
	/**
	* Constructor de la clase Biblioteca
	* @param nombre Parámetro que define el nombre de la biblioteca
	*/
	Biblioteca(String nombre) {
	this.nombre = nombre;
	colecciónLibros = new Vector<Libro>(); // Crea el vector de libros
	}
	
	/**
	* Método que permite añadir un libro a la biblioteca
	* @param libro Parámetro que define un libro que se agregará a la 
	* biblioteca
	*/

	void añadirLibro(Libro libro) {
		colecciónLibros.add(libro); /* Se agrega el libro al vector de libros 
		de la biblioteca */
		}
		/**
		* Método que muestra en pantalla los datos de los libros de la biblioteca
		*/
		void listarLibros() {
		// Se recorre el vector de libros 
		for (int i= 0; i < colecciónLibros.size(); i++) {
		/* Se extrae un elemento del vector en la posición i. Se debe 
		realizar un casting para extraer un objeto Libro */
		Libro libro = (Libro) colecciónLibros.elementAt(i);
		libro.imprimir();
		}
		}

}
