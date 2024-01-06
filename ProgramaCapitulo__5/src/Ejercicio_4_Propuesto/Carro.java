package Ejercicio_4_Propuesto;

public class Carro {
    Motor motor;
    Chasis chasis;
    Llanta[] llantas;
    Carrocería carrocería;
    Asiento conductor;
    Asiento acompañante;
    Asiento trasero;
    
    // Elementos de "Full Equipo"
    boolean airbags;
    boolean frenosABS;
    boolean vidriosElectricos;
    boolean espejosElectricos;
    boolean sunroof;

    public Carro(int volumen, tipoChasis claseChasis, String color, tipoCarrocería claseCarrocería,
            String marca, int diametro, int altura, int anchura,
            String materialAsientos, boolean fundaAsientos,
            boolean airbags, boolean frenosABS, boolean vidriosElectricos,
            boolean espejosElectricos) {
   motor = new Motor(volumen);
   chasis = new Chasis(claseChasis);
   llantas = new Llanta[4];
   for (int i = 0; i < llantas.length; i++) {
       llantas[i] = new Llanta(marca, diametro, altura, anchura);
   }
   carrocería = new Carrocería(color, claseCarrocería);

   // Asientos
   conductor = new Asiento("Conductor", materialAsientos, fundaAsientos);
   acompañante = new Asiento("Acompañante", materialAsientos, fundaAsientos);
   trasero = new Asiento("Trasero", materialAsientos, fundaAsientos);

   // Elementos de "Full Equipo"
   this.airbags = airbags;
   this.frenosABS = frenosABS;
   this.vidriosElectricos = vidriosElectricos;
   this.espejosElectricos = espejosElectricos;
}


    void imprimir() {
        // ... (código existente para imprimir motor, chasis, carrocería, llantas)

        // Imprimir detalles de los asientos
        System.out.println("Asiento del Conductor:");
        conductor.imprimir();
        System.out.println("Asiento del Acompañante:");
        acompañante.imprimir();
        System.out.println("Asiento Trasero:");
        trasero.imprimir();

        // Imprimir detalles de "Full Equipo"
        System.out.println("Equipamiento Full:");
        System.out.println("Airbags: " + airbags);
        System.out.println("Frenos ABS: " + frenosABS);
        System.out.println("Vidrios Eléctricos: " + vidriosElectricos);
        System.out.println("Espejos Eléctricos: " + espejosElectricos);
        System.out.println("Sunroof: " + sunroof);
    }
}

class Asiento {
    String tipo;
    String material;
    boolean tieneFunda;

    Asiento(String tipo, String material, boolean tieneFunda) {
        this.tipo = tipo;
        this.material = material;
        this.tieneFunda = tieneFunda;
    }

    void imprimir() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Material: " + material);
        System.out.println("Tiene Funda: " + tieneFunda);
    }
}