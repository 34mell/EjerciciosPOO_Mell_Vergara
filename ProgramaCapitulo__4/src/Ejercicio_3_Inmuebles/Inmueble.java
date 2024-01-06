package Ejercicio_3_Inmuebles;

/**
* Esta clase denominada Inmueble modela un inmueble que posee 
* como atributos un identificador, un área, una dirección y un precio 
* de venta. Es la clase raíz de una jerarquía de herencia.
* @version 1.2/2020
*/

public class Inmueble {
    // Atributos para el identificador inmobiliario, área, dirección y precio de venta de un inmueble
    protected int identificadorInmobiliario;
    protected int área;
    protected String dirección;
    protected double precioVenta;

    /**
     * Constructor de la clase Inmueble
     * 
     * @param identificadorInmobiliario Parámetro que define el identificador de
     *                                   un inmueble
     * @param área                      Parámetro que define el área de un inmueble
     * @param dirección                 Parámetro que define la dirección donde se
     *                                   encuentra localizado un inmueble
     */
    public Inmueble(int identificadorInmobiliario, int área, String dirección) {
        this.identificadorInmobiliario = identificadorInmobiliario;
        this.área = área;
        this.dirección = dirección;
        this.precioVenta = 0; // Inicializamos el precio de venta en 0
    }

    /**
     * Método que a partir del valor del área de un inmueble, calcula su precio de
     * venta
     * 
     * @param valorArea El valor unitario por área de un determinado inmueble
     * @return Precio de venta del inmueble
     */
    public double calcularPrecioVenta(double valorArea) {
        this.precioVenta = área * valorArea;
        return this.precioVenta;
    }

    /**
     * Método que muestra en pantalla los datos de un inmueble
     */
    public void imprimir() {
        System.out.println("Identificador inmobiliario = " + identificadorInmobiliario);
        System.out.println("Área = " + área);
        System.out.println("Dirección = " + dirección);
        System.out.println("Precio de venta = $" + precioVenta);
    }
}
