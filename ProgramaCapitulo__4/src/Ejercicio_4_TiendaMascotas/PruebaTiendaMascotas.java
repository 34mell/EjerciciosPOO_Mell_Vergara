package Ejercicio_4_TiendaMascotas;



public class PruebaTiendaMascotas {
    public static void main(String[] args) {
        // Crear instancias de perros
        PerroPequeno perroPequeno = new PerroPequeno("Buddy", 3, "Marrón", 5.5, false, "Chihuahua");
        PerroMediano perroMediano = new PerroMediano("Max", 4, "Negro", 20.0, true, "Dálmata");

        // Crear instancias de gatos
        GatoSinPelo gatoSinPelo = new GatoSinPelo("Whiskers", 2, "Blanco", 1.5, 2.0, "Sphynx");
        GatoPeloLargo gatoPeloLargo = new GatoPeloLargo("Fluffy", 5, "Gris", 1.0, 1.8, "Angora");

        // Imprimir los datos de las mascotas
        System.out.println("Datos de perros:");
        imprimirDatos(perroPequeno);
        imprimirDatos(perroMediano);

        System.out.println("\nDatos de gatos:");
        imprimirDatos(gatoSinPelo);
        imprimirDatos(gatoPeloLargo);
    }

    public static void imprimirDatos(Mascota mascota) {
        System.out.println("Nombre: " + mascota.nombre);
        System.out.println("Edad: " + mascota.edad + " años");
        System.out.println("Color: " + mascota.color);

        if (mascota instanceof Perro) {
            Perro perro = (Perro) mascota;
            System.out.println("Peso: " + perro.peso + " kg");
            System.out.println("¿Muerde? " + (perro.muerde ? "Sí" : "No"));
            System.out.println("Raza: " + obtenerRaza(perro));
        } else if (mascota instanceof Gato) {
            Gato gato = (Gato) mascota;
            System.out.println("Altura de salto: " + gato.alturaSalto + " metros");
            System.out.println("Longitud de salto: " + gato.longitudSalto + " metros");
            System.out.println("Raza: " + obtenerRaza(gato));
        }

        System.out.println();
    }

    public static String obtenerRaza(Object mascota) {
        if (mascota instanceof PerroPequeno) {
            return ((PerroPequeno) mascota).raza;
        } else if (mascota instanceof PerroMediano) {
            return ((PerroMediano) mascota).raza;
        } else if (mascota instanceof PerroGrande) {
            return ((PerroGrande) mascota).raza;
        } else if (mascota instanceof GatoSinPelo) {
            return ((GatoSinPelo) mascota).raza;
        } else if (mascota instanceof GatoPeloLargo) {
            return ((GatoPeloLargo) mascota).raza;
        } else if (mascota instanceof GatoPeloCorto) {
            return ((GatoPeloCorto) mascota).raza;
        } else {
            return "Desconocida";
        }
    }
}


