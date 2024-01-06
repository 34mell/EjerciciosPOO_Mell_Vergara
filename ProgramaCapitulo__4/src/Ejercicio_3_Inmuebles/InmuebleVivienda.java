package Ejercicio_3_Inmuebles;

/**
* Esta clase denominada InmuebleVivienda modela un inmueble 
* destinado para la vivienda con atributos como el número de 
* habitaciones y el número de baños que posee
* @version 1.2/2020
*/
/**
 * Esta clase denominada InmuebleVivienda modela un inmueble destinado para la
 * vivienda con atributos como el número de habitaciones y el número de baños
 * que posee
 * 
 * @version 1.2/2020
 */
public class InmuebleVivienda extends Inmueble {
    // Atributos que identifican el número de habitaciones y baños de un inmueble para vivienda
    private int númeroHabitaciones;
    private int númeroBaños;

    /**
     * Constructor de la clase InmuebleVivienda
     * 
     * @param identificadorInmobiliario Parámetro que define el identificador
     *                                   inmobiliario de un inmueble para la
     *                                   vivienda
     * @param área                      Parámetro que define el área de un
     *                                   inmueble para la vivienda
     * @param dirección                 Parámetro que define la dirección donde se
     *                                   encuentra localizado un inmueble para la
     *                                   vivienda
     * @param númeroHabitaciones        Parámetro que define el número de
     *                                   habitaciones que tiene un inmueble para la
     *                                   vivienda
     * @param númeroBaños               Parámetro que define el número de baños
     *                                   que tiene un inmueble para la vivienda
     */
    public InmuebleVivienda(int identificadorInmobiliario, int área, String dirección, int númeroHabitaciones,
            int númeroBaños) {
        super(identificadorInmobiliario, área, dirección);
        this.númeroHabitaciones = númeroHabitaciones;
        this.númeroBaños = númeroBaños;
    }

    /**
     * Método que muestra en pantalla los datos de un inmueble para la vivienda
     */
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Número de habitaciones = " + númeroHabitaciones);
        System.out.println("Número de baños = " + númeroBaños);
    }
}

