package Ejercicio_4_TiendaMascotas;

class PerroPequeno extends Perro {
    protected String raza;

    public PerroPequeno(String nombre, int edad, String color, double peso, boolean muerde, String raza) {
        super(nombre, edad, color, peso, muerde);
        this.raza = raza;
    }
}