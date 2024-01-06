package Ejercicio_8_Series;

import java.util.ArrayList;
import java.util.Iterator;

class ProgramaSeries {
    private ArrayList<Serie> series;

    public ProgramaSeries() {
        this.series = new ArrayList<>();
    }

    public void agregarSerie(Serie serie) {
        series.add(serie);
        System.out.println("Serie agregada correctamente.");
    }

    public void eliminarSerie(String titulo) {
        Iterator<Serie> iterator = series.iterator();
        while (iterator.hasNext()) {
            Serie serie = iterator.next();
            if (serie.titulo.equals(titulo)) {
                iterator.remove();
                System.out.println("Serie eliminada correctamente.");
                return;
            }
        }
        System.out.println("No se encontró la serie con el título especificado.");
    }

    public void consultarPorTitulo(String titulo) {
        for (Serie serie : series) {
            if (serie.titulo.equals(titulo)) {
                System.out.println(serie);
                return;
            }
        }
        System.out.println("No se encontró la serie con el título especificado.");
    }

    public void consultarPorGenero(String genero) {
        for (Serie serie : series) {
            if (serie.genero.equals(genero)) {
                System.out.println(serie);
            }
        }
    }

    public void consultarPorPais(String pais) {
        for (Serie serie : series) {
            if (serie.paisOrigen.equals(pais)) {
                System.out.println(serie);
            }
        }
    }
}