package Ejercicio_15_Vehiculos;

/**
* Esta interfaz denominada Vela modela una superficie utilizada para 
* propulsar una embarcación mediante la acción del viento sobre ella. 
* La interfaz será implementada por la clase Acuático
* @version 1.2/2020
*/
public interface Vela {
/**
* Método abstracto que recomienda una determinada velocidad del 
* vehículo de acuerdo a la velocidad del viento
* @param velocidadViento Parámetro que define la velocidad del 
* viento que influenciará en la velocidad actual del vehículo
*/
void recomendarVelocidad(int velocidadViento);
}