package Ejercicio_16_Deportes;

public interface MatchDeportivo {

	/**
	* Método abstracto que establece el nombre del equipo local en un 
	* encuentro deportivo
	* @param nombreEquipo Parámetro que define el nombre del 
	* equipo local del encuentro deportivo
	*/
	void setEquipoLocal(String nombreEquipo);
	/**
	* Método abstracto que establece el nombre del equipo visitante en 
	* un encuentro deportivo
	* @param nombreEquipo Parámetro que define el nombre del 
	* equipo visitante del encuentro deportivo
	*/
	void setEquipoVisitante(String nombreEquipo);
}
