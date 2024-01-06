package Ejercicio_1_Propuesto;

class Carro extends Vehiculo {
	static int valorPeaje = 10000;

	Carro(String placa) {
		super(placa);
	}

	int calcularPeaje() {
		return valorPeaje;
	}
}
