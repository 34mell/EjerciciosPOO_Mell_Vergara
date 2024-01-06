package Ejercicio_1_Propuesto;

import java.util.Date;

public class Prueba {
	public static void main(String[] args) {
		// Crear una persona
		Persona persona1 = new Persona("Damon", "Salvatore", "123456789", new Date());

		// Crear una estación de peaje
		Peaje peaje = new Peaje("La Lizama", "Santander");

		// Crear vehículos
		Camion camion1 = new Camion("PKI-889", 2);
		Carro carro1 = new Carro("WVC-389");
		Moto moto1 = new Moto("ABC-123");

		// Asignar vehículos a la persona en la estación de peaje
		peaje.asignarVehiculo(persona1, camion1);
		peaje.asignarVehiculo(persona1, carro1);
		peaje.asignarVehiculo(persona1, moto1);

		// Calcular el total de dinero pagado en peajes por la persona
		int totalPeajePersona = peaje.calcularTotalPeajePorPersona("Damon");

		// Imprimir resultados
		System.out.println("Total de dinero pagado por " + persona1.nombre + ": $" + totalPeajePersona);
		peaje.imprimir();
	}
}