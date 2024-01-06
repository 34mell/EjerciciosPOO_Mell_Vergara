package Ejercicio_4_TiendaMascotas;


class GatoPeloCorto extends Gato {
    protected String raza;

    public GatoPeloCorto(String nombre, int edad, String color, double alturaSalto, double longitudSalto, String raza) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
        this.raza = raza;
    }
}