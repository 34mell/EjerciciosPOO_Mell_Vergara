package Ejercicio_6_Propuesto;


public class Partido {
    EquipoFutbol equipoLocal;
    EquipoFutbol equipoVisitante;
    int golesLocal;
    int golesVisitante;

    public Partido(EquipoFutbol equipoLocal, EquipoFutbol equipoVisitante, int golesLocal, int golesVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }
}
