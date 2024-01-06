package Ejercicio_6_Propuesto;

import java.util.Arrays;
import java.util.List;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tecnico tecnico = new Tecnico("Carlos","Queiroz", 66, 30, false); 
		// Crea un técnico 
		Portero portero = new Portero("David", "Ospina", 30, true, 10); 
		// Crea un portero 
		Defensa[] defensas = new Defensa[4]; 
		/* Crea un array de 4 defensas */ 
		Mediocampo[] mediocampos = new Mediocampo[4]; 
		/* Crea un array de 4 mediocampos */ 
		Delantero[] delanteros = new Delantero[2]; 
		/* Crea un array de 2 delanteros */
		defensas[0] = new Defensa("Yerry", "Mina", 24, true); 
		defensas[1] = new Defensa("Davison", "Sánchez", 23, true); 
		defensas[2] = new Defensa("William", "Tesillo", 29, true); 
		defensas[3] = new Defensa("Stefan", "Medina", 29, true);
		
		mediocampos[0] = new Mediocampo("Mateus", "Uribe", 28, true, 12); 
		mediocampos[1] = new Mediocampo("Wilmar", "Barrios", 25, true, 12); 
		mediocampos[2] = new Mediocampo("Juan Guillermo", "Cuadrado", 31, true, 10); 
		mediocampos[3] = new Mediocampo("James", "Rodríguez", 28, true, 32);
		
		delanteros[0] = new Delantero("Radamel Falcao", "García", 33, true, 15); 
		delanteros[1] = new Delantero("Duvan", "Zapata", 28, true, 12); 
		/* Crea el equipo pasando como parámetros cada jugador creado anteriormente */ 
		EquipoFutbol equipo = new EquipoFutbol("Selección mayores", "Colombia", tecnico, portero, defensas, mediocampos, delanteros); 
		equipo.imprimir(); // Muestra los datos del equipo de fútboL
		
		
		   // Crear 10 equipos con nombres de países de Sudamérica
        EquipoFutbol equipo1 = new EquipoFutbol("Argentina", "Argentina");
        EquipoFutbol equipo2 = new EquipoFutbol("Brasil", "Brasil");
        EquipoFutbol equipo3 = new EquipoFutbol("Chile", "Chile");
        EquipoFutbol equipo4 = new EquipoFutbol("Colombia", "Colombia");
        EquipoFutbol equipo5 = new EquipoFutbol("Uruguay", "Uruguay");
        EquipoFutbol equipo6 = new EquipoFutbol("Paraguay", "Paraguay");
        EquipoFutbol equipo7 = new EquipoFutbol("Ecuador", "Ecuador");
        EquipoFutbol equipo8 = new EquipoFutbol("Perú", "Perú");
        EquipoFutbol equipo9 = new EquipoFutbol("Bolivia", "Bolivia");
        EquipoFutbol equipo10 = new EquipoFutbol("Venezuela", "Venezuela");

        // Lista de todos los equipos
        List<EquipoFutbol> todosLosEquipos = Arrays.asList(equipo1, equipo2, equipo3, equipo4, equipo5, equipo6, equipo7, equipo8, equipo9, equipo10);

        // Simular partidos
        simularPartidos(todosLosEquipos);

        // Generar la tabla de posiciones
        equipo1.generarTablaPosiciones(todosLosEquipos);
    }

    private static void simularPartidos(List<EquipoFutbol> equipos) {
        for (int i = 0; i < equipos.size(); i++) {
            for (int j = i + 1; j < equipos.size(); j++) {
                // Simular partido, el equipo i juega como local
                int golesLocal = (int) (Math.random() * 4); // Número de goles entre 0 y 3
                int golesVisitante = (int) (Math.random() * 4);

                equipos.get(i).jugarPartido(equipos.get(j), golesLocal, golesVisitante);
            }
        }
    }
}
