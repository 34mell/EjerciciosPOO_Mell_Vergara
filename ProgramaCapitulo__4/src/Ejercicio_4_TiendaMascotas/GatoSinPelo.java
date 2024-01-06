package Ejercicio_4_TiendaMascotas;

class GatoSinPelo extends Gato {
    protected String raza;

    public GatoSinPelo(String nombre, int edad, String color, double alturaSalto, double longitudSalto, String raza) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
        this.raza = raza;
    }
}