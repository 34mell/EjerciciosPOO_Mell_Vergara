package Ejercicio_6_Futbol;

/**
* Esta clase denominada EquipoFútbol es una clase que modela un 
* equipo de fútbol. Un equipo de fútbol tiene un nombre, país, un 
* técnico, un portero, cuatro defensas y dos delanteros.
* @version 1.2/2020
*/
public class EquipoFútbol {

    String nombre; /* Atributo que identifica el nombre de un equipo de fútbol */
    String país; // Atributo que identifica el país de un equipo de fútbol
    Técnico técnico; /* Atributo que identifica el técnico de un equipo de fútbol */
    Portero portero; /* Atributo que identifica el portero de un equipo de fútbol */
    Defensa[] defensas; /* Atributo que identifica los defensas de un equipo de fútbol */
    Mediocampo[] mediocampos; /* Atributo que identifica los mediocampos de un equipo de fútbol */
    Delantero[] delanteros; /* Atributo que identifica los delanteros de un equipo de fútbol */

    /**
     * Constructor de la clase EquipoFútbol
     * 
     * @param nombre Parámetro que define el nombre de un equipo de fútbol
     * @param país   Parámetro que define el país del equipo de fútbol
     */
    public EquipoFútbol(String nombre, String país) {
        this.nombre = nombre;
        this.país = país;
    }

    /**
     * Constructor sobrecargado de la clase EquipoFútbol
     * 
     * @param nombre      Parámetro que define el nombre de un equipo de fútbol
     * @param país        Parámetro que define el país del equipo de fútbol
     * @param técnico     Parámetro que define el técnico de un equipo de fútbol
     * @param portero     Parámetro que define el portero de un equipo de fútbol
     * @param defensas    Parámetro que define los defensas de un equipo de fútbol
     * @param mediocampos Parámetro que define los mediocampos de un equipo de
     *                    fútbol
     * @param delanteros  Parámetro que define los delanteros de un equipo de fútbol
     */
    public EquipoFútbol(String nombre, String país, Técnico técnico, Portero portero, Defensa[] defensas,
            Mediocampo[] mediocampos, Delantero[] delanteros) {
        this(nombre, país); // Invoca al constructor inicial
        this.técnico = técnico;
        this.portero = portero;
        this.defensas = defensas;
        this.mediocampos = mediocampos;
        this.delanteros = delanteros;
    }

    /**
     * Método que muestra en pantalla los datos del equipo junto con la información
     * de su técnico, portero, defensas y delanteros
     */
    void imprimir() {
        System.out.println("Nombre del equipo = " + nombre);
        System.out.println("País = " + país);
        System.out.println("Portero [" + portero + "]");
        System.out.println("Defensas");
        for (int i = 0; i < defensas.length; i++) { /* Recorre el array de defensas */
            System.out.println(defensas[i]);
        }
        System.out.println("MedioCampo");
        for (int j = 0; j < mediocampos.length; j++) { /* Recorre el array de mediocampos */
            System.out.println(mediocampos[j]);
        }
        System.out.println("Delanteros");
        for (int k = 0; k < delanteros.length; k++) { /* Recorre el array de delanteros */
            System.out.println(delanteros[k]);
        }

    }
}

