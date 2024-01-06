package Ejercicio_15_Vehiculos;

/**
* Esta interfaz denominada Motor modela un motor que será 
* implementado por las clases Terrestre y Acuático
* @version 1.2/2020
*/
interface Motor {
/**
* Método abstracto que permite calcular las revoluciones de un 
* motor a partir de la fuerza y radio del motor
* @param fuerza Parámetro que define la fuerza del motor de un 
* vehículo
* @param radio Parámetro que define el radio del motor de un 
* vehículo
*/
int calcularRevolucionesMotor(int fuerza, int radio);
}
