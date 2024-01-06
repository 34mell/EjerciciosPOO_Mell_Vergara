package Ejercicio_16_Deportes;

public interface PartidoFútbol extends MatchDeportivo {
/* Atributo final que representa la duración de un partido de fútbol 
en minutos */
static final int duraciónPartidoFútbol = 90;
/**
* Método abstracto que establece la cantidad de goles que marcó el 
* equipo local en el partido de fútbol
* @param marcador Parámetro que define el marcador en goles del 
* equipo local en el partido de fútbol
*/
void setGolesEquipoLocal(int marcador);
/**
* Método abstracto que establece la cantidad de goles que marcó el 
* equipo visitante en el partido de fútbol
* @param marcador Parámetro que define el marcador en goles del 
* equipo visitante en el partido de fútbol
*/
void setGolesEquipoVisitante(int marcador);
}