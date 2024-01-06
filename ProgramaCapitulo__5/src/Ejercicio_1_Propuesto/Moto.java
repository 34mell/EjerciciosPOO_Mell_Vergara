package Ejercicio_1_Propuesto;

class Moto extends Vehiculo {
	static int valorPeaje = 5000;

	Moto(String placa) {
		super(placa);
	}

	int calcularPeaje() {
		return valorPeaje;
	}
}
