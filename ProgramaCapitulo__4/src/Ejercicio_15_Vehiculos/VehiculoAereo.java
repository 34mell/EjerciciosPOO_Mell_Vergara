package Ejercicio_15_Vehiculos;

public class VehiculoAereo implements Alas, Reactor {
    public void despegar(){
        System.out.println("Despegando vehículo aéreo");
    }
    public void aterrizar(){
        System.out.println("Aterrizando vehículo aéreo");
    }

    public void volar(){
        System.out.println("Volando vehículo aéreo");
    }
    @Override
    public void soltarTren() {
        System.out.println("Soltando tren de aterrizaje");
    }

    @Override
    public void subirTren() {
        System.out.println("Subiendo tren de aterrizaje");
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo reactor - reactor encendido");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando reactor - reactor apagado");
    }
}