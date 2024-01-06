package Ejercicio_11_Figuras;

//Subclase Círculo
class Círculo extends FiguraGeométrica {
 private double radio;

 // Constructor
 public Círculo(double radio) {
     this.radio = radio;
 }

 // Implementación de los métodos abstractos
 public double calcularÁrea() {
     return Math.PI * Math.pow(radio, 2);
 }

 public double calcularPerímetro() {
     return 2 * Math.PI * radio;
 }
}