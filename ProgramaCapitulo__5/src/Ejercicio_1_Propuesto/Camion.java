package Ejercicio_1_Propuesto;

class Camion extends Vehiculo {
	static int valorPeajeEje = 5000;
	int numeroEjes;

	Camion(String placa, int numeroEjes) {
		super(placa);
		this.numeroEjes = numeroEjes;
	}

	int calcularPeaje() {
		return numeroEjes * valorPeajeEje;
	}
}