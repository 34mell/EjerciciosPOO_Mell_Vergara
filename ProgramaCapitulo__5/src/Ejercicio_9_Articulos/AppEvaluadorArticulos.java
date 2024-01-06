package Ejercicio_9_Articulos;

import java.util.Scanner;
import java.util.ArrayList;

public class AppEvaluadorArticulos {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			// Crear un artículo
			ArticuloCientifico articulo = new ArticuloCientifico();

			// Agregar secciones, subsecciones y párrafos (puedes personalizar según tus necesidades)

			// Ejemplo de agregar comentarios
			Seccion seccion1 = new Seccion();
			Subseccion subseccion1 = new Subseccion();
			Parrafo parrafo1 = new Parrafo();

			Comentario comentario1 = new Comentario("Este párrafo está bien desarrollado.");
			Comentario comentario2 = new Comentario("Agregar más ejemplos aquí.");

			parrafo1.comentarios.add(comentario1);
			parrafo1.comentarios.add(comentario2);

			subseccion1.parrafos.add(parrafo1);
			seccion1.subsecciones.add(subseccion1);
			articulo.secciones.add(seccion1);

			// Puedes continuar agregando más secciones, subsecciones y párrafos según tu estructura

			// Al finalizar la evaluación, asignar el concepto
			System.out.print("Emitir concepto (aceptado sin modificaciones, aceptado con modificaciones, rechazado): ");
			articulo.concepto = scanner.nextLine();

			// Imprimir el artículo y comentarios (puedes personalizar según tus necesidades)
			System.out.println("Artículo Científico:");
			System.out.println("Concepto: " + articulo.concepto);
			imprimirComentarios(articulo.secciones);
		}
    }

    private static void imprimirComentarios(ArrayList<Seccion> secciones) {
        for (Seccion seccion : secciones) {
            for (Subseccion subseccion : seccion.subsecciones) {
                for (Parrafo parrafo : subseccion.parrafos) {
                    for (Comentario comentario : parrafo.comentarios) {
                        System.out.println("Comentario: " + comentario.texto);
                    }
                }
            }
        }
    }
}