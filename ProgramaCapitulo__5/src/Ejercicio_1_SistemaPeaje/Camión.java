package Ejercicio_1_SistemaPeaje;

/**
* Esta clase denominada Camión modela un tipo específico de Vehículo 
* que llega a un peaje. Tiene un atributo para representar el número de 
* ejes que tiene un camión y un atributo estático que representa su 
* valor del peaje en $5000 por cada eje.
* @version 1.2/2020
*/
public class Camión extends Vehículo {
// Atributo estático que identifica el valor de peaje a pagar por un camión
static int valorPeajeEje = 5000;
// Atributo que identifica el número de ejes que tiene un camión
int númeroEjes;
/**
* Constructor de la clase Camión
* @param placa Parámetro que define la placa de un camión
* @param númeroEjes Parámetro que define el número de ejes de 
* un camión
*/
Camión(String placa, int númeroEjes) {
super(placa); // Invoca al constructor de la clase padre
this.númeroEjes = númeroEjes;
}
/**
* Método que devuelve el valor del peaje para un camión
* @return El valor del peaje para un camión
*/
public int getValorPeajeEje() {
return valorPeajeEje;
}
/**
* Método que establece el valor del peaje para un camión
* @param Parámetro que define el valor del peaje para un camión
*/
static void setValorPeajeEje(int valorPeajeEje) {
Camión.valorPeajeEje = valorPeajeEje;
} 
/**
* Método que muestra en pantalla la placa, el número de ejes y el 
* valor del peaje de un camión
*/
void imprimit() {
System.out.println("Placa = " + placa);
System.out.println("Número de ejes = " + númeroEjes);
System.out.println("Valor del peaje = " + valorPeajeEje);
}
}

