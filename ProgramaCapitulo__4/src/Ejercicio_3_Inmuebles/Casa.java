package Ejercicio_3_Inmuebles;

/**
* Esta clase denominada Casa modela un tipo específico de inmueble 
* destinado para la vivienda con atributos como el número de pisos 
* que tiene una casa.
* @version 1.2/2020
*/
/**
 * Clase que modela una casa, que es un tipo específico de inmueble para vivienda
 * con información adicional sobre el número de pisos.
 * 
 * @version 1.2/2020
 */
public class Casa extends InmuebleVivienda {
    // Atributo que identifica el número de pisos que tiene una casa
    private int númeroPisos;

    /**
     * Constructor de la clase Casa.
     * 
     * @param identificadorInmobiliario Parámetro que define el identificador
     *                                   inmobiliario de una casa.
     * @param área                      Parámetro que define el área de una casa.
     * @param dirección                 Parámetro que define la dirección donde se
     *                                   encuentra localizada una casa.
     * @param númeroHabitaciones        Parámetro que define el número de
     *                                   habitaciones que tiene una casa.
     * @param númeroBaños               Parámetro que define el número de baños que
     *                                   tiene una casa.
     * @param númeroPisos               Parámetro que define el número de pisos que
     *                                   tiene una casa.
     */
    public Casa(int identificadorInmobiliario, int área, String dirección, int númeroHabitaciones, int númeroBaños,
            int númeroPisos) {
        // Invoca al constructor de la clase padre InmuebleVivienda
        super(identificadorInmobiliario, área, dirección, númeroHabitaciones, númeroBaños);
        this.númeroPisos = númeroPisos;
    }

    /**
     * Método que muestra en pantalla los datos de una casa.
     */
    @Override
    public void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre InmuebleVivienda
        System.out.println("Número de pisos = " + númeroPisos);
    }
}

