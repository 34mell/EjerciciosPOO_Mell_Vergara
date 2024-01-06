package Ejercicio_4_TiendaMascotas;

class PerroMediano extends Perro {
    protected String raza;

    public PerroMediano(String nombre, int edad, String color, double peso, boolean muerde, String raza) {
        super(nombre, edad, color, peso, muerde);
        this.raza = raza;
    }
}