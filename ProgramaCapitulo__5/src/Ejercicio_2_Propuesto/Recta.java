package Ejercicio_2_Propuesto;

public class Recta {
    Punto punto1;
    Punto punto2;

    Recta(Punto punto1, Punto punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;
    }
    double calcularPendiente() {
        // Evitar la división por cero
        if (punto1.getX() == punto2.getX()) {
            throw new ArithmeticException("La pendiente es indefinida (división por cero)");
        }

        return (double) (punto2.getY() - punto1.getY()) / (punto2.getX() - punto1.getX());
    }

    double calcularLongitud() {
        return Math.sqrt(Math.pow(punto2.getX() - punto1.getX(), 2) + Math.pow(punto2.getY() - punto1.getY(), 2));
    }
}