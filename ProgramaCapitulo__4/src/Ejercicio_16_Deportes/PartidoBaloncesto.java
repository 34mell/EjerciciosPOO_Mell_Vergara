package Ejercicio_16_Deportes;

public interface PartidoBaloncesto extends MatchDeportivo {
	// Atributo final que representa la duración de un partido en minutos
	static final int duraciónPartidoBaloncesto = 40;
	/**
	* Método abstracto que establece la cantidad de cestas que marcó el 
	* equipo local en el partido de baloncesto
	* @param marcador Parámetro que define el marcado obtenido en 
	* cestas por el equipo local en el partido de baloncesto
	*/
	void setCestasEquipoLocal(int marcador);
	/**
	* Método abstracto que establece la cantidad de cestas que marcó el 
	* equipo visitante en el partido de baloncesto
	* @param marcador Parámetro que define el marcador obtenido en 
	* cestas por el equipo visitante en el partido de baloncesto
	*/
	void setCestasEquipoVisitante(int marcador);
	}