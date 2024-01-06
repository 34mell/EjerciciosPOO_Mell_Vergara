package Ejercicio_16_Deportes;

/**
* Esta clase denominada PartidoFútbolLigaEspañola modela un partido 
* de fútbol de la liga española. La clase tiene atributos como el nombre 
* del equipo local, el nombre del equipo visitante, la cantidad de goles 
* marcados por el equipo local y la cantidad de goles marcados por el 
* equipo visitante.
* @version 1.2/2020
*/

public class PartidoFútbolLigaEspañola implements PartidoFútbol {

	/* Atributo que identifica el nombre del equipo local en un partido de 
	fútbol de la liga española */
	String equipoLocal;
	/* Atributo que identifica el nombre del equipo visitante en un partido 
	de fútbol de la liga española */
	String equipoVisitante;
	/* Atributo que identifica la cantidad de goles realizados por el equipo 
	local en un partido de fútbol de la liga española */
	int golesEquipoLocal;
	/* Atributo que identifica la cantidad de goles realizados por el equipo 
	visitante en un partido de fútbol de la liga española */
	int golesEquipoVisitante;
	/**
	* Implementación del método abstracto heredado de la interfaz 
	* MatchDeportivo que establece el nombre del equipo local del 
	* partido de fútbol
	* @param nombreEquipo Parámetro que define el nombre del 
	* equipo local del partido de fútbol
	*/
	public void setEquipoLocal(String nombreEquipo) {
	this.equipoLocal = nombreEquipo;
	}
	/**
	* Implementación del método abstracto de la interfaz 
	* MatchDeportivo que establece el nombre del equipo visitante del 
	* partido de fútbol
	* @param nombreEquipo Parámetro que define el nombre del 
	* equipo visitante del partido de fútbol
	*/
	public void setEquipoVisitante(String nombreEquipo) {
	this.equipoVisitante = nombreEquipo;
	}
	/**
	* Implementación del método abstracto heredado de la interfaz 
	* PartidoFútbol que establece la cantidad de goles que marcó el 
	* equipo local en el partido de fútbol
	* @param marcador Parámetro que define el marcador obtenido en 
	* goles por el equipo local en el partido de fútbol
	*/
	public void setGolesEquipoLocal(int marcador) {
	this.golesEquipoLocal = marcador;
	}
	/**
	* Implementación del método abstracto heredado de la interfaz 
	* PartidoFútbol que establece la cantidad de goles que marcó el 
	* equipo visitante en el partido de fútbol
	* @param marcador Parámetro que define el marcador obtenido en 
	* goles por el equipo visitante en el partido de fútbol
	*/
	
	public void setGolesEquipoVisitante(int marcador) {
		this.golesEquipoVisitante = marcador;
		}
		/**
		* Método que muestra en pantalla el marcador de un partido de 
		* fútbol de la liga española
		*/
		void imprimirMarcador() {
		System.out.println("Equipo local: " + equipoLocal + ": " + 
		golesEquipoLocal + " - Equipo visitante: " + equipoVisitante + 
		":" + golesEquipoVisitante);
		}


}
