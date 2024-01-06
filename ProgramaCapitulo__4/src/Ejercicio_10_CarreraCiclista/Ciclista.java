package Ejercicio_10_CarreraCiclista;

/**
* Esta clase abstracta denominada Ciclista posee como atributos un 
* identificador, un nombre y un tiempo acumulado en una carrera 
* ciclística.
* @version 1.2/2020
*/
public abstract class Ciclista {
    private int identificador;
    private String nombre;
    private int tiempoAcumulado = 0;
	/**
     * Constructor de la clase Ciclista
     *
     * @param identificador Parámetro que define el identificador de un ciclista
     * @param nombre       Parámetro que define el nombre completo de un ciclista
     */
    public Ciclista(int identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
    }

    /**
     * Método abstracto que muestra en pantalla el tipo específico de un ciclista
     *
     * @return Tipo de ciclista
     */
    abstract String imprimirTipo();

    protected int getIdentificador() {
        return identificador;
    }

    protected void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected int getPosiciónGeneral(int posiciónGeneral) {
        return posiciónGeneral;
    }

    protected void setPosiciónGeneral(int posiciónGeneral) {
    }

    protected int getTiempoAcumulado() {
        return tiempoAcumulado;
    }

    protected void setTiempoAcumulado(int tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }

    protected void imprimir() {
        System.out.println("Identificador = " + identificador);
        System.out.println("Nombre = " + nombre);
        System.out.println("Tiempo Acumulado = " + tiempoAcumulado);
    }
}
