package Ejercicio_4_TiendaMascotas;

class Perro extends Mascota {
    protected double peso;
    protected boolean muerde;

    public Perro(String nombre, int edad, String color, double peso, boolean muerde) {
        super(nombre, edad, color);
        this.peso = peso;
        this.muerde = muerde;
    }

    public static void sonido() {
        System.out.println("Los perros ladran");
    }
}