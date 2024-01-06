package Ejercicio_11_Figuras;

public class PruebaFigurasGeometricas {
    public static void main(String[] args) {
        Círculo círculo = new Círculo(5);
        Rectángulo rectángulo = new Rectángulo(4, 6);
        Cuadrado cuadrado = new Cuadrado(3);
        TriánguloRectángulo triánguloRectángulo = new TriánguloRectángulo(3, 4);

        System.out.println("Área del círculo: " + círculo.calcularÁrea());
        System.out.println("Perímetro del círculo: " + círculo.calcularPerímetro());

        System.out.println("Área del rectángulo: " + rectángulo.calcularÁrea());
        System.out.println("Perímetro del rectángulo: " + rectángulo.calcularPerímetro());

        System.out.println("Área del cuadrado: " + cuadrado.calcularÁrea());
        System.out.println("Perímetro del cuadrado: " + cuadrado.calcularPerímetro());

        System.out.println("Área del triángulo rectángulo: " + triánguloRectángulo.calcularÁrea());
        System.out.println("Perímetro del triángulo rectángulo: " + triánguloRectángulo.calcularPerímetro());
    }
}