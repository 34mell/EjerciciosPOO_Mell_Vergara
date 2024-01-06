package Ejercicio_4_Carro;

public class Prueba {
    /**
     * Método main que crea un carro con sus partes constituyentes:
     * chasis, motor, carrocería y llantas
     */
    public static void main(String args[]) {
        // Aquí usamos tipoChasis.MONOCASCO, ya que es una constante del enum
        Carro carro = new Carro(2, tipoChasis.MONOCASCO, "Rojo",
                tipoCarrocería.TUBULAR, "Goodyear", 25, 20, 15);
        carro.imprimir();
    }
}
