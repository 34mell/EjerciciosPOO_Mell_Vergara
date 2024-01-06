package Ejercicio_1_Propuesto;

abstract class Vehiculo {
	String placa;
	Persona conductor;

	Vehiculo(String placa) {
		this.placa = placa;
	}

	abstract int calcularPeaje();
}