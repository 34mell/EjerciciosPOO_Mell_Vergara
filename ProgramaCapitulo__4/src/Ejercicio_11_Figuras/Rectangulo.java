package Ejercicio_11_Figuras;

class Rectángulo extends FiguraGeométrica {
    private double base;
    private double altura;

    // Constructor
    public Rectángulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Implementación de los métodos abstractos
    public double calcularÁrea() {
        return base * altura;
    }

    public double calcularPerímetro() {
        return 2 * (base + altura);
    }
}