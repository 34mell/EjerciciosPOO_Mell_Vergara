package Ejercicio_5_Propuesto;

import java.util.Vector;

public class Orden {
	 private int identificador;
	    private Vector<LíneaPedido> itemsPedido;
	    private Cliente cliente; // Agregamos el atributo cliente

	    public Orden(int identificador, Cliente cliente) {
	        this.identificador = identificador;
	        this.cliente = cliente;
	        itemsPedido = new Vector<>();
	    }

	    public void setCliente(Cliente cliente) {
	        this.cliente = cliente;
	    }

    public void añadirItem(int identificador, int cantidad, Producto producto) {
        LíneaPedido línea = new LíneaPedido(identificador, cantidad, producto);
        itemsPedido.add(línea);
    }

    public int calcularTotalOrden() {
        int totalOrden = 0;
        for (LíneaPedido línea : itemsPedido) {
            totalOrden += línea.calcularSubtotalLíneaPedido();
        }
        return totalOrden;
    }

    @Override
    public String toString() {
        return "Orden [identificador=" + identificador + ", cliente=" + cliente + ", itemsPedido=" + itemsPedido + ", totalOrden=" + calcularTotalOrden() + "]";
    }
}

