package Ejercicio_6_Propuesto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class EquipoFutbol {
	String nombre; /* Atributo que identifica el nombre de un equipo de fútbol */ 
	String país; // Atributo que identifica el país de un equipo de fútbol
	Tecnico técnico; /* Atributo que identifica el técnico de un equipo de fútbol */ 
	Portero portero; /* Atributo q/ equipo de fútbol */ 
	Mediocampo[] mediocampos; 
	Delantero[] delanteros; /* Atributo que identifica los delfútbol */
	Defensa[] defensas;
	public EquipoFutbol(String nombre, String país) { 
		this.nombre = nombre; this.país = país; 
	}
	public EquipoFutbol(String nombre, String ciudad, Tecnico técnico, Portero portero, Defensa[] defensas, Mediocampo[] mediocampos, Delantero[] delanteros) { 
		this(nombre, ciudad); 
		this.técnico = técnico; 
		this.portero = portero; 
		this.defensas = defensas; 
		this.mediocampos = mediocampos; 
		this.delanteros = delanteros; 
	}
	void imprimir() { 
		System.out.println("Nombre del equipo = " + nombre); 
		System.out.println("País = " + país); 
		System.out.println("Portero [" + portero + "]"); 
		
		System.out.println("Defensas"); 
		for (int i = 0; i < defensas.length; i++) { 
			/* Recorre el array de defensas */ 
			System.out.println(defensas[i]); 
		    } 
		
		System.out.println("Medicampo"); 
		for (int j = 0; j < mediocampos.length; j++) { 
			/* Recorre el array de mediocampos */ 
			System.out.println(mediocampos[j]); 
			}   
		
			System.out.println("Delanteros"); 
		for (int k = 0; k < delanteros.length; k++) { 
				/* Recorre el array de delanteros */ 
			System.out.println(delanteros[k]); }   
	}
	
	
	
	 List<Partido> partidos = new ArrayList<>();
	    int puntos;
	    int golesAFavor;
	    int golesEnContra;

	    public void jugarPartido(EquipoFutbol equipoVisitante, int golesLocal, int golesVisitante) {
	        Partido partido = new Partido(this, equipoVisitante, golesLocal, golesVisitante);
	        partidos.add(partido);

	        // Actualizar estadísticas del equipo y del equipo visitante
	        this.golesAFavor += golesLocal;
	        this.golesEnContra += golesVisitante;

	        equipoVisitante.golesAFavor += golesVisitante;
	        equipoVisitante.golesEnContra += golesLocal;

	        // Calcular puntos
	        if (golesLocal > golesVisitante) {
	            this.puntos += 3; // Gana el equipo local
	        } else if (golesLocal == golesVisitante) {
	            this.puntos += 1; // Empate
	            equipoVisitante.puntos += 1;
	        } else {
	            equipoVisitante.puntos += 3; // Gana el equipo visitante
	        }
	    }
	    public int contarPartidosGanados(EquipoFutbol equipo) {
	        int ganados = 0;
	        for (Partido partido : partidos) {
	            if (partido.equipoLocal.equals(equipo) && partido.golesLocal > partido.golesVisitante) {
	                ganados++;
	            } else if (partido.equipoVisitante.equals(equipo) && partido.golesVisitante > partido.golesLocal) {
	                ganados++;
	            }
	        }
	        return ganados;
	    }

	    public int contarPartidosEmpatados(EquipoFutbol equipo) {
	        int empatados = 0;
	        for (Partido partido : partidos) {
	            if ((partido.equipoLocal.equals(equipo) || partido.equipoVisitante.equals(equipo)) && partido.golesLocal == partido.golesVisitante) {
	                empatados++;
	            }
	        }
	        return empatados;
	    }

	    public int contarPartidosPerdidos(EquipoFutbol equipo) {
	        int perdidos = 0;
	        for (Partido partido : partidos) {
	            if (partido.equipoLocal.equals(equipo) && partido.golesLocal < partido.golesVisitante) {
	                perdidos++;
	            } else if (partido.equipoVisitante.equals(equipo) && partido.golesVisitante < partido.golesLocal) {
	                perdidos++;
	            }
	        }
	        return perdidos;
	    }


	    public void generarTablaPosiciones(List<EquipoFutbol> todosLosEquipos) {
	        // Ordenar equipos según la cantidad de puntos (y otros criterios si es necesario)
	        List<EquipoFutbol> equiposOrdenados = new ArrayList<>(todosLosEquipos);
	        Collections.sort(equiposOrdenados, (e1, e2) -> Integer.compare(e2.puntos, e1.puntos));

	        // Imprimir la tabla de posiciones
	        System.out.println("Tabla de Posiciones:");
	        System.out.printf("%-20s %-5s %-5s %-5s %-5s %-5s%n", "Equipo", "Puntos", "PG", "PE", "PP", "Dif. Goles");

	        for (EquipoFutbol equipo : equiposOrdenados) {
	            int partidosGanados = contarPartidosGanados(equipo);
	            int partidosEmpatados = contarPartidosEmpatados(equipo);
	            int partidosPerdidos = contarPartidosPerdidos(equipo);
	            int diferenciaGoles = equipo.golesAFavor - equipo.golesEnContra;

	            System.out.printf("%-20s %-5d %-5d %-5d %-5d %-5d%n", equipo.nombre, equipo.puntos, partidosGanados, partidosEmpatados, partidosPerdidos, diferenciaGoles);
	        }

	        // Imprimir separador
	        System.out.println("\nResultados de Partidos:");

	        // Imprimir detalles de los partidos para cada equipo
	        for (EquipoFutbol equipo : equiposOrdenados) {
	            System.out.println("Equipo: " + equipo.nombre);
	            for (Partido partido : equipo.partidos) {
	                System.out.printf("%s %d - %d %s%n", partido.equipoLocal.nombre, partido.golesLocal, partido.golesVisitante, partido.equipoVisitante.nombre);
	            }
	            System.out.println(); // Separador entre equipos
	        }
	    }
}