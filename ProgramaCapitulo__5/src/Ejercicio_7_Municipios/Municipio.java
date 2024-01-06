package Ejercicio_7_Municipios;

/**
 * Esta clase denominada Municipio modela un municipio colombiano.
 * Tiene los siguientes atributos: un nombre de municipio, la población
 * del municipio, su temperatura media anual y su altitud sobre el nivel
 * del mar en metros.
 * @version 1.2/2020
 */
public class Municipio {
    // Atributo que define el nombre del municipio
    private String nombre;
    // Atributo que define la población del municipio
    private int población;
    // Atributo que define la temperatura media anual del municipio en grados centígrados
    private double temperaturaMedia;
    // Atributo que define la altitud a la que se encuentra el municipio en metros
    private double altitud;

    /**
     * Constructor de la clase Municipio
     * @param nombre           Parámetro que define el nombre del municipio
     * @param población        Parámetro que define la cantidad de habitantes del municipio
     * @param temperaturaMedia Parámetro que define la temperatura media anual del municipio
     * @param altitud          Parámetro que define la altitud sobre el nivel del mar del municipio
     */
    public Municipio(String nombre, int población, double temperaturaMedia, double altitud) {
        this.nombre = nombre;
        this.población = población;
        this.temperaturaMedia = temperaturaMedia;
        this.altitud = altitud;
    }

    /**
     * Método que devuelve el nombre del municipio
     * @return El nombre del municipio
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que devuelve la población del municipio
     * @return La población del municipio
     */
    public int getPoblación() {
        return población;
    }

    /**
     * Método que devuelve la temperatura media del municipio
     * @return La temperatura media del municipio
     */
    public double getTemperaturaMedia() {
        return temperaturaMedia;
    }

    /**
     * Método que devuelve la altitud del municipio
     * @return La altitud del municipio
     */
    public double getAltitud() {
        return altitud;
    }

    /**
     * Método que muestra en pantalla los datos del municipio
     */
    public void imprimir() {
        System.out.println("Nombre = " + getNombre());
        System.out.println("Población = " + getPoblación());
        System.out.println("Temperatura promedio (C) = " + getTemperaturaMedia());
        System.out.println("Altitud (metros) = " + getAltitud());
    }
}

