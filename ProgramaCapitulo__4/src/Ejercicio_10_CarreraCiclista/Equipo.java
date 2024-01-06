package Ejercicio_10_CarreraCiclista;

/**
* Esta clase denominada Equipo modela un equipo de ciclismo 
* conformado por un vector de ciclistas. La clase tiene atributos como 
* el nombre del equipo, el país del equipo y el tiempo total acumulado 
* del equipo
* @version 1.2/2020
*/
import java.util.Vector;
import java.util.Scanner;

public class Equipo {
    private String nombre;
    private static double totalTiempo;
    private String país;
    Vector<Ciclista> listaCiclistas; // Cambié Vector a Vector<Ciclista>

    public Equipo(String nombre, String país) {
        this.nombre = nombre;
        this.país = país;
        totalTiempo = 0;
        listaCiclistas = new Vector<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    void añadirCiclista(Ciclista ciclista) {
        listaCiclistas.add(ciclista);
    }

    void listarEquipo() {
        for (Ciclista c : listaCiclistas) { // Utilizo un bucle for-each
            System.out.println(c.getNombre());
        }
    }

    void buscarCiclista() {
        try (Scanner sc = new Scanner(System.in)) {
			String nombreCiclista = sc.next();
			for (Ciclista c : listaCiclistas) {
			    if (c.getNombre().equals(nombreCiclista)) {
			        System.out.println(c.getNombre());
			    }
			}
		}
    }

    void calcularTotalTiempo() {
        totalTiempo = 0; // Inicializo totalTiempo a 0 antes de acumular
        for (Ciclista c : listaCiclistas) {
            totalTiempo = totalTiempo + c.getTiempoAcumulado();
        }
    }

    void imprimir() {
        System.out.println("Nombre del equipo = " + nombre);
        System.out.println("País = " + país);
        System.out.println("Total tiempo del equipo = " + totalTiempo);
    }
}
