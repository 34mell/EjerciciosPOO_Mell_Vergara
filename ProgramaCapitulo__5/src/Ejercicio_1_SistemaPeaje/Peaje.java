package Ejercicio_1_SistemaPeaje;

import java.util.*;
/**
* Esta clase denominada Peaje modela una estación de peaje de una 
* carretera. Tiene los atributos nombre de la estación de peaje, el 
* departamento al que pertenece la estación, un vector de Vehículos 
* que llegan a la estación y total de dinero en peajes recibido. Además 
* cuenta con tres atributos estáticos para calcular el total de carros, 
* motos y camiones que llegan al peaje.
Relaciones de asociación, agregación y composición 313
* @version 1.2/2020
*/
public class Peaje {
// Atributo que identifica el nombre de una estación de peaje
String nombre;
/* Atributo que identifica el nombre del departamento donde está 
ubicada la estación de peaje */
String departamento;
/* Atributo que identifica el conjunto de vehículos que llega a la 
estación de peaje */
Vector<Vehículo> vehículos;
/* Atributo que identifica el total de dinero recolectado por la estación 
de peaje */
int totalPeaje = 0;
/* Atributo que identifica el total de camiones que llegó a la estación 
de peaje */
static int totalCamiones = 0;
/* Atributo que identifica el total de motos que llegó a la estación de 
peaje */
static int totalMotos = 0;
/* Atributo que identifica el total de carros que llegó a la estación de 
peaje */
static int totalCarros = 0;
/**
* Constructor de la clase Peaje
* @param nombre Parámetro que define el nombre de la estación de 
* peaje
* @param departamento Parámetro que define el departamento 
* donde se encuentra localizado el peaje
*/
Peaje(String nombre, String departamento) {
this.nombre = nombre;
this.departamento = departamento;
vehículos = new Vector<Vehículo>(); // Crea el vector de vehículos
}
/**
* Método que devuelve el nombre de la estación de peaje
* @return El nombre de la estación de peaje
*/
public String getNombre() {
return nombre;
}
/**
* Método que devuelve el departamento donde está localizada la 
* estación de peaje
* @return El departamento donde está localizada la estación de 
* peaje
*/
public String getDepartamento() {
return departamento;
}
/**
* Método que permite añadir un vehículo al vector de vehículos de 
* la estación de peaje
* @param vehículo Parámetro que define el vehículo a agregar al 
* vector de vehículos de la estación de peaje
*/
public void añadirVehículo(Vehículo vehículo) {
vehículos.add(vehículo);
}
/**
* Método que permite calcular el peaje de un vehículo que llega a la 
* estación de peaje
* @param Parámetro que define el vehículo que llega a la estación 
* de peaje
*/
public int calcularPeaje(Vehículo vehículo) {
if (vehículo instanceof Carro) { /* Si el vehículo que llegó es un 
carro */
totalCarros++; // Actualiza el total de carros que llega al peaje
totalPeaje += Carro.valorPeaje; /* Actualiza el total de dinero 
del peaje */
return Carro.valorPeaje; // Retorna el dinero pagado por un carro
} else if (vehículo instanceof Moto) { /* Si el vehículo que llegó es 
una moto */
totalMotos++; // Actualiza el total de motos que llega al peaje
totalPeaje += Moto.valorPeaje; /* Actualiza el total de dinero 
del peaje */
return Moto.valorPeaje; // Retorna el dinero pagado por una moto
} else if (vehículo instanceof Camión) { /* Si el vehículo que llegó 
es un camión */
totalCamiones++; /* Actualiza el total de camiones que llega 
al peaje */
Camión camión = (Camión) vehículo; /* Obtiene un objeto 
Camión */
/* Calcula el peaje del camión y actualiza total de dinero del 
peaje */
totalPeaje += camión.númeroEjes * Camión.valorPeajeEje;
// Retorna el dinero pagado por un camión
return camión.númeroEjes * Camión.valorPeajeEje;
} else return -1; // Si llega otro tipo de objeto
}
/**
* Método que muestra en pantalla los datos del peaje, el total de 
* vehículos que llegó al peaje discriminado por tipo y el total de 
* dinero recaudado por la estación de peaje
*/
public void imprimir() {
System.out.println("Peaje = " + getNombre());
System.out.println("Ubicación = " + getDepartamento());
System.out.println("Total de carros = " + totalCarros);
System.out.println("Total de motos = " + totalMotos);
System.out.println("Total de camiones = " + totalCamiones);
int totalVehículos = totalCarros + totalMotos +totalCamiones;
System.out.println("Total de vehículos = " + totalVehículos);
System.out.println("Dinero total = $" + totalPeaje);
}
}
