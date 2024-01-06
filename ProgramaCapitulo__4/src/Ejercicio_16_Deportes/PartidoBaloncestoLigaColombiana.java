package Ejercicio_16_Deportes;

/**
 * Esta clase modela un partido de baloncesto de la liga colombiana.
 * @version 1.2/2020
 */
public class PartidoBaloncestoLigaColombiana implements PartidoBaloncesto {
    // Atributos de la clase
    private String equipoLocal;
    private String equipoVisitante;
    private int cestasEquipoLocal;
    private int cestasEquipoVisitante;

    /**
     * Implementación del método abstracto heredado de la interfaz MatchDeportivo que establece
     * el nombre del equipo local del partido de baloncesto.
     * @param nombreEquipo El nombre del equipo local del partido de baloncesto.
     */
    @Override
    public void setEquipoLocal(String nombreEquipo) {
        this.equipoLocal = nombreEquipo;
    }

    /**
     * Implementación del método abstracto heredado de la interfaz MatchDeportivo que establece
     * el nombre del equipo visitante del partido de baloncesto.
     * @param nombreEquipo El nombre del equipo visitante del partido de baloncesto.
     */
    @Override
    public void setEquipoVisitante(String nombreEquipo) {
        this.equipoVisitante = nombreEquipo;
    }

    /**
     * Implementación del método abstracto heredado de la interfaz PartidoBaloncesto que establece
     * la cantidad de cestas que marcó el equipo local en el partido de baloncesto.
     * @param marcador La cantidad de cestas marcadas por el equipo local.
     */
    @Override
    public void setCestasEquipoLocal(int marcador) {
        this.cestasEquipoLocal = marcador;
    }

    /**
     * Implementación del método abstracto heredado de la interfaz PartidoBaloncesto que establece
     * la cantidad de cestas que marcó el equipo visitante en el partido de baloncesto.
     * @param marcador La cantidad de cestas marcadas por el equipo visitante.
     */
    @Override
    public void setCestasEquipoVisitante(int marcador) {
        this.cestasEquipoVisitante = marcador;
    }

    /**
     * Método que muestra en pantalla el marcador de un partido de baloncesto de la liga colombiana.
     */
    public void imprimirMarcador() {
        System.out.println("Equipo local: " + equipoLocal + ": " +
                cestasEquipoLocal + " - Equipo visitante: " + equipoVisitante +
                ": " + cestasEquipoVisitante);
    }
}
