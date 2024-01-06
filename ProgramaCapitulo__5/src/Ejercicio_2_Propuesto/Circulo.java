package Ejercicio_2_Propuesto;

public class Circulo {
    Punto centro;
    int radio;

    Circulo(int x, int y, int radio) {
        centro = new Punto(x, y);
        this.radio = radio;
    }

    int getRadio() {
        return radio;
    }

    void setRadio(int radio) {
        this.radio = radio;
    }

    void imprimir() {
        System.out.println("El centro del círculo es la coordenada (" + centro.getX() + "," + centro.getY() +
                ") y tiene un radio = " + radio);
    }
}