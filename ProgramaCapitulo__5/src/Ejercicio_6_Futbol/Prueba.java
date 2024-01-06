package Ejercicio_6_Futbol;

public class Prueba {
/**
* Método main que crea en primer lugar los integrantes específicos 
* de un equipo de fútbol. Luego, compone el equipo con sus 
* integrantes y muestra sus datos en pantalla
*/
public static void main(String[] args) {
Técnico técnico = new Técnico("Carlos","Queiroz", 66, 30, false); 
// Crea un técnico
Portero portero = new Portero("David", "Ospina", 30, true, 10);
// Crea un portero
Defensa[] defensas = new Defensa[4]; /* Crea un array de 4 
defensas */
Mediocampo[] mediocampos = new Mediocampo[4]; /* Crea un 
array de 4 mediocampos */
Delantero[] delanteros = new Delantero[2]; /* Crea un array de 2 
delanteros */
// Crea los jugadores específicos de acuerdo a su tipo
defensas[0] = new Defensa("Yerry", "Mina", 24, true);
defensas[1] = new Defensa("Davison", "Sánchez", 23, true);
defensas[2] = new Defensa("William", "Tesillo", 29, true);
defensas[3] = new Defensa("Stefan", "Medina", 29, true);
mediocampos[0] = new Mediocampo("Mateus", "Uribe", 28, true, 
12);
mediocampos[1] = new Mediocampo("Wilmar", "Barrios", 25, 
true, 12);
mediocampos[2] = new Mediocampo("Juan Guillermo", 
"Cuadrado", 31, true, 10);
mediocampos[3] = new Mediocampo("James", "Rodríguez", 28, 
true, 32);
delanteros[0] = new Delantero("Radamel Falcao", "García", 33, 
true, 15);
delanteros[1] = new Delantero("Duvan", "Zapata", 28, true, 12);
/* Crea el equipo pasando como parámetros cada jugador creado 
anteriormente */
EquipoFútbol equipo = new EquipoFútbol("Selección mayores", 
"Colombia", 
técnico, portero, defensas, mediocampos, delanteros);
equipo.imprimir(); // Muestra los datos del equipo de fútbol
}
}