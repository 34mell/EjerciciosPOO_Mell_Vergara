package Ejercicio_11_Figuras;

class Triángulo extends FiguraGeométrica {
    private double lado1;
    private double lado2;
    private double lado3;

    // Constructor
    public Triángulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    // Implementación de los métodos abstractos
    public double calcularÁrea() {
        // Fórmula de Herón para el área de un triángulo
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    public double calcularPerímetro() {
        return lado1 + lado2 + lado3;
    }
}

// Subclase TriánguloRectángulo
class TriánguloRectángulo extends Triángulo {
    // Constructor
    public TriánguloRectángulo(double base, double altura) {
        super(base, altura, Math.sqrt(base * base + altura * altura));
    }
}