package Ejercicio_16_Deportes;

/**
 * Esta clase prueba diferentes acciones realizadas por las clases PartidoFútbolLigaEspañola
 * y PartidoBaloncestoLigaColombiana.
 * @version 1.2/2020
 */
public class Prueba {
    /**
     * Método main que crea un partido de fútbol y baloncesto e imprime sus marcadores.
     */
    public static void main(String[] args) {
        // Crear partido de fútbol
        PartidoFútbolLigaEspañola partidoFútbol = new PartidoFútbolLigaEspañola();
        System.out.println("Duración del partido de fútbol = " + PartidoFútbolLigaEspañola.duraciónPartidoFútbol);
        partidoFútbol.setEquipoLocal("Real Madrid");
        partidoFútbol.setEquipoVisitante("Barcelona");
        partidoFútbol.setGolesEquipoLocal(3);
        partidoFútbol.setGolesEquipoVisitante(3);
        partidoFútbol.imprimirMarcador();

        // Crear partido de baloncesto
        PartidoBaloncestoLigaColombiana partidoBaloncesto = new PartidoBaloncestoLigaColombiana();
        System.out.println("Duración del partido de baloncesto = " + PartidoBaloncestoLigaColombiana.duraciónPartidoBaloncesto);
        partidoBaloncesto.setEquipoLocal("Miami Heat");
        partidoBaloncesto.setEquipoVisitante("Golden Warriors");
        partidoBaloncesto.setCestasEquipoLocal(123);
        partidoBaloncesto.setCestasEquipoVisitante(126);
        partidoBaloncesto.imprimirMarcador();
    }
}
