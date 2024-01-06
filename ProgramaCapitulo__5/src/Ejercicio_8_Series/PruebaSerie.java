package Ejercicio_8_Series;
import java.util.Scanner;


public class PruebaSerie {
    public static void main(String[] args) {
        ProgramaSeries programa = new ProgramaSeries();
        try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
			    System.out.println("Menú:");
			    System.out.println("1. Agregar serie");
			    System.out.println("2. Eliminar serie");
			    System.out.println("3. Consultar por título");
			    System.out.println("4. Consultar por género");
			    System.out.println("5. Consultar por país");
			    System.out.println("6. Salir");

			    System.out.print("Ingrese su opción: ");
			    int opcion = scanner.nextInt();
			    scanner.nextLine(); // Consumir el salto de línea

			    switch (opcion) {
			        case 1:
			            System.out.print("Ingrese el título de la serie: ");
			            String titulo = scanner.nextLine();
			            System.out.print("Ingrese el género de la serie: ");
			            String genero = scanner.nextLine();
			            System.out.print("Ingrese el país de origen de la serie: ");
			            String pais = scanner.nextLine();
			            System.out.print("Ingrese el año de realización de la serie: ");
			            int año = scanner.nextInt();
			            Serie nuevaSerie = new Serie(titulo, genero, pais, año);
			            programa.agregarSerie(nuevaSerie);
			            break;
			        case 2:
			            System.out.print("Ingrese el título de la serie a eliminar: ");
			            String tituloEliminar = scanner.nextLine();
			            programa.eliminarSerie(tituloEliminar);
			            break;
			        case 3:
			            System.out.print("Ingrese el título de la serie a consultar: ");
			            String tituloConsultar = scanner.nextLine();
			            programa.consultarPorTitulo(tituloConsultar);
			            break;
			        case 4:
			            System.out.print("Ingrese el género de las series a consultar: ");
			            String generoConsultar = scanner.nextLine();
			            programa.consultarPorGenero(generoConsultar);
			            break;
			        case 5:
			            System.out.print("Ingrese el país de las series a consultar: ");
			            String paisConsultar = scanner.nextLine();
			            programa.consultarPorPais(paisConsultar);
			            break;
			        case 6:
			            System.out.println("Saliendo del programa. ¡Hasta luego!");
			            System.exit(0);
			            break;
			        default:
			            System.out.println("Opción no válida. Intente nuevamente.");
			    }
			}
		}
    }
}