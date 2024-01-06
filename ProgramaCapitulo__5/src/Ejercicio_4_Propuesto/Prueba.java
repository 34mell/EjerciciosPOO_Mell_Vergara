package Ejercicio_4_Propuesto;



public class Prueba {
    public static void main(String args[]) {
        // Ejemplo: Crear un carro con asientos de cuero, airbags y vidrios eléctricos
        Carro carro = new Carro(2, tipoChasis.MONOCASCO, "Rojo",
                tipoCarrocería.TUBULAR, "Goodyear", 25, 20, 15,
                "Cuero", true, true, false, true, false);

        carro.imprimir();
    }
    
    
}

