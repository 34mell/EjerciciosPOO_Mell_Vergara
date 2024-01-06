package Ejercicio_2_Propuesto;

public class Prueba {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
        // Crear una recta
        Punto puntoA = new Punto(1, 1);
        Punto puntoB = new Punto(4, 5);
        Recta rectaAB = new Recta(puntoA, puntoB);

        System.out.println("Pendiente de la recta AB: " + rectaAB.calcularPendiente());
        System.out.println("Longitud de la recta AB: " + rectaAB.calcularLongitud());

        // Crear un polígono
        Punto[] puntosPoligono = {new Punto(0, 0), new Punto(3, 0), new Punto(3, 3)};
        Poligono poligono = new Poligono("Triángulo", puntosPoligono);
    }
}