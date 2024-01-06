package Ejercicio_4_TiendaMascotas;

class PerroGrande extends Perro {
    protected String raza;

    public PerroGrande(String nombre, int edad, String color, double peso, boolean muerde, String raza) {
        super(nombre, edad, color, peso, muerde);
        this.raza = raza;
    }
}