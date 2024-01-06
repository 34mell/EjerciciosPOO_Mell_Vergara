package Ejercicio_6_Clases;

public class Persona {
    private String nombre;
    private String dirección;

    public Persona(String nombre, String dirección) {
        this.nombre = nombre;
        this.dirección = dirección;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDirección() {
        return dirección;
    }
}