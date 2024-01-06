package Ejercicio_6_Clases;

import java.util.Scanner;

public class AppClase {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Ingrese el nombre de la persona:");
			String nombre = scanner.nextLine();
			System.out.println("Ingrese la dirección de la persona:");
			String dirección = scanner.nextLine();
			Persona persona = new Persona(nombre, dirección);

			System.out.println("Ingrese la carrera del estudiante:");
			String carreraEstudiante = scanner.nextLine();
			System.out.println("Ingrese el semestre del estudiante:");
			int semestreEstudiante = scanner.nextInt();
			Estudiante estudiante = new Estudiante(persona, carreraEstudiante, semestreEstudiante);

			System.out.println("Ingrese el departamento del profesor:");
			scanner.nextLine(); // Limpiar el buffer del scanner
			String departamentoProfesor = scanner.nextLine();
			System.out.println("Ingrese la categoría del profesor:");
			String categoríaProfesor = scanner.nextLine();
			Profesor profesor = new Profesor(persona, departamentoProfesor, categoríaProfesor);

			System.out.println("\nDatos de la persona:");
			System.out.println("Nombre: " + persona.getNombre());
			System.out.println("Dirección: " + persona.getDirección());

			System.out.println("\nDatos del estudiante:");
			System.out.println("Nombre: " + estudiante.getNombre());
			System.out.println("Carrera: " + estudiante.getCarrera());
			System.out.println("Semestre: " + estudiante.getSemestre());

			System.out.println("\nDatos del profesor:");
			System.out.println("Departamento: " + profesor.getDepartamento());
			System.out.println("Categoría: " + profesor.getCategoría());
		}
    }
}

