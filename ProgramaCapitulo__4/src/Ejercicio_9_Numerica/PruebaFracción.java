package Ejercicio_9_Numerica;

public class PruebaFracción {
    public static void main(String[] args) {
        Fracción fracción1 = new Fracción(1, 2);
        Fracción fracción2 = new Fracción(3, 4);

        // Prueba de los métodos
        System.out.println("Fracción 1: " + fracción1.toString());
        System.out.println("Fracción 2: " + fracción2.toString());

        System.out.println("Suma: " + fracción1.sumar(fracción2).toString());
        System.out.println("Resta: " + fracción1.restar(fracción2).toString());
        System.out.println("Multiplicación: " + fracción1.multiplicar(fracción2).toString());
        System.out.println("División: " + fracción1.dividir(fracción2).toString());
    }
}