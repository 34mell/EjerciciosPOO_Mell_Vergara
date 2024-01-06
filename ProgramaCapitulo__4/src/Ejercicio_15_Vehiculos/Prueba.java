package Ejercicio_15_Vehiculos;

/**
* Esta clase prueba diferentes acciones realizadas por las clases Terrestre 
* y Acuático que son subclases de vehículos.
* @version 1.2/2020
*/

 public class Prueba {
/**
* Método main que crea un vehículo terrestre y un vehículo 
* acuático. Además, prueba diferentes métodos de estas clases al 
* acelerar el vehículo terrestre; al calcular las revoluciones de motor 
* de un vehículo acuático; y al recomendar la velocidad de acuerdo 
* a la velocidad del viento.
*/
public static void main(String args[]) {
	Terrestre camioneta = new Terrestre(100, 250);
	System.out.println("Camioneta");
	camioneta.imprimir();
	camioneta.acelerar(50);
	System.out.println("Nueva Velocidad actual= " + camioneta.
			velocidadActual);
	
	System.out.println("--------------------------");
	
	Acuático motoAcuática = new Acuático(50, 110);
	System.out.println("Moto acuática");
	motoAcuática.imprimir();
	System.out.println("Revoluciones del motor = " +
	motoAcuática.calcularRevolucionesMotor(1200, 2));
	motoAcuática.recomendarVelocidad(20);
	
	System.out.println("--------------------------");
	
	VehiculoAereo vehiculoAereo = new VehiculoAereo();
    vehiculoAereo.aterrizar();
    vehiculoAereo.despegar();
    vehiculoAereo.volar();
    vehiculoAereo.apagar();
    vehiculoAereo.encender();
    vehiculoAereo.soltarTren();
    vehiculoAereo.subirTren();
	
}
}