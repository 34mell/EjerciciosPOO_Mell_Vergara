package Ejercicio_3_Biblio;

/**
* Esta clase denominada Libro modela los libros que tiene la biblioteca. 
* Cada libro contiene un título, autor, año de publicación, editorial y 
* referencia bibliográfica. 
* @version 1.2/2020
*/

public class Libro {
	String título; // Atributo que identifica el título de un libro
	String autor; // Atributo que identifica el autor de un libro
	int añoPublicación; /* Atributo que identifica el año de publicación 
	de un libro */
	String editorial; // Atributo que identifica la editorial que publicó el libro
	String referenciaBibliográfica; /* Atributo que identifica la referencia 
	bibligráfica del libro */
	/**
	* Constructor de la clase libro
	* @param título Parámetro que define el título de un libro
	* @param autor Parámetro que define el autor de un libro
	*/
	Libro(String título, String autor, int añoPublicación, String editorial, 
			String referenciaBibliográfica) {
			this.título = título;
			this.autor = autor;
			this.añoPublicación = añoPublicación;
			this.editorial = editorial;
			this.referenciaBibliográfica = referenciaBibliográfica;
			}
			/**
			* Método que muestra en pantalla los datos de un libro
			*/
			void imprimir() {
			System.out.println("Título del libro = " + título);
			System.out.println("Autor = " + autor);
			System.out.println("Año de publicación = " + añoPublicación);
			System.out.println("Editorial = " + editorial);
			System.out.println("Referencia bibliográfica = " + 
			referenciaBibliográfica);
			System.out.println();
			}

}
