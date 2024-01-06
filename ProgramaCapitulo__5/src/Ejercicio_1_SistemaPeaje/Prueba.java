package Ejercicio_1_SistemaPeaje;

/**
* Esta clase prueba diferentes acciones realizadas por una estación de 
* peaje donde llegan diferentes tipos de vehículos y se calcula el total 
* de dinero recaudado.
* @version 1.2/2020
*/
public class Prueba {
/**
* Método main que crea una estación de peaje, luego se van 
* agregando diferentes tipos de vehículos al vector de vehículos de 
* la estación de peaje. Para finalizar, se calcula el total de dinero 
* recaudado por la estación de peaje.
*/
public static void main(String args[]) {
Peaje peaje = new Peaje ("La Lizama", "Santander");
Camión camión1 = new Camión("PKI-889", 2);
peaje.añadirVehículo(camión1);
peaje.calcularPeaje(camión1);
Camión camión2 = new Camión("KLM-123", 3);
peaje.añadirVehículo(camión2);
peaje.calcularPeaje(camión2);
Camión camión3 = new Camión("PQI-234", 4);
peaje.añadirVehículo(camión3);
peaje.calcularPeaje(camión3);
Moto moto1 = new Moto("ABC-123");
peaje.añadirVehículo(moto1);
peaje.calcularPeaje(moto1);
Moto moto2 = new Moto("XYZ-000");
peaje.añadirVehículo(moto2);
peaje.calcularPeaje(moto2);
Carro carro1 = new Carro("WVC-389");
peaje.añadirVehículo(carro1);
peaje.calcularPeaje(carro1);
Carro carro2 = new Carro("QWE-543");
peaje.añadirVehículo(carro2);
peaje.calcularPeaje(carro2);
peaje.imprimir();
}
}
