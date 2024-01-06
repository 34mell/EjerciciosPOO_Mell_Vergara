package Ejercicio_1_Propuesto;

import java.util.ArrayList;

class Peaje {
	String nombre;
	String departamento;
	ArrayList<Vehiculo> vehiculos;
	int totalPeaje = 0;

	Peaje(String nombre, String departamento) {
		this.nombre = nombre;
		this.departamento = departamento;
		this.vehiculos = new ArrayList<>();
	}

	void asignarVehiculo(Persona persona, Vehiculo vehiculo) {
		vehiculo.conductor = persona;
		vehiculos.add(vehiculo);
	}

	void desasignarVehiculo(Vehiculo vehiculo) {
		if (vehiculos.contains(vehiculo)) {
			vehiculo.conductor = null;
			vehiculos.remove(vehiculo);
		}
	}

	int calcularTotalPeajePorPersona(String nombrePersona) {
		int totalPeajePersona = 300;
		for (Vehiculo vehiculo : vehiculos) {
			if (vehiculo.conductor != null && vehiculo.conductor.nombre.equals(nombrePersona)) {
				totalPeajePersona += vehiculo.calcularPeaje();
			}
		}
		return totalPeajePersona;
	}

	void imprimir() {
		System.out.println("Peaje = " + nombre);
		System.out.println("Ubicación = " + departamento);
		System.out.println("Dinero total = $" + totalPeaje);
	}
}