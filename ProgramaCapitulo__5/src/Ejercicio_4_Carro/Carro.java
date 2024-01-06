package Ejercicio_4_Carro;

public class Carro {
    Motor motor;          // Attribute representing the car's motor
    Chasis chasis;        // Attribute representing the car's chassis
    Llanta[] llantas;     // Attribute representing the car's wheels as an array
    Carrocería carrocería; // Attribute representing the car's body

    // Constructor to initialize the car with various components
    public Carro(int volumen, tipoChasis claseChasis, String color, tipoCarrocería claseCarrocería,
                 String marca, int diametro, int altura, int anchura) {
        motor = new Motor(volumen);              // Creates the car's motor
        chasis = new Chasis(claseChasis);        // Creates the car's chassis
        llantas = new Llanta[4];                  // Creates an array of 4 wheels
        for (int i = 0; i < llantas.length; i++) {
            // Creates each of the four wheels of the car
            llantas[i] = new Llanta(marca, diametro, altura, anchura);
        }
        carrocería = new Carrocería(color, claseCarrocería); // Creates the car's body
    }

    // Method to print the details of the car and its components
    public void imprimir() {
        System.out.println("Datos del Carro");
        System.out.println("Motor - Cilindros = " + motor.volumen);
        System.out.println("Chasis - Tipo = " + chasis.tipo);
        System.out.println("Carrocería - Tipo = " + carrocería.tipo + " Color = " + carrocería.color);
        System.out.println("Llantas - Cantidad = " + llantas.length);
        for (int i = 0; i < llantas.length; i++)
            llantas[i].imprimir(); // Prints the details of each wheel
    }
}

