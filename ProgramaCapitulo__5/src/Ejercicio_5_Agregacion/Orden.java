package Ejercicio_5_Agregacion;

import java.util.Vector;

/**
* Esta clase denominada Orden modela una orden de pedido que está 
* conformada por el identificador de la orden y un vector de líneas de 
* pedido.
* @version 1.2/2020
 * @param <itemsPedido>
*/

public class Orden<itemsPedido> {
	
	// Atributo que representa el identificador de la orden
	private int identificador;
	/* Atributo que identifica los ítems del pedido por medio de un vector 
	de Líneas de Pedido */
	private Vector<LíneaPedido> itemsPedido;
	/**
	* Constructor de la clase Orden
	* @param identificador Parámetro que define el identificador de la 
	* orden de pedido
	*/
	public Orden(int identificador) {
	this.identificador = identificador;
	itemsPedido = new Vector<LíneaPedido>(); // Crea el vector de líneas de pedido
	}
	
	/**
	* Método que obtiene el identificador de una orden de pedido
	* 
	* * @return El identificador de una orden de pedido
	* */
	
	public int getIdentificador() {
		return identificador;
		}
		/**
		* Método que establece el identificador de una orden de pedido
		* @param identificador Parámetro que define el identificador de una 
		* orden de pedido
		*/
		public void setIdentificador(int identificador) {
		this.identificador = identificador;
		}
		/**
		* Método que calcula el total de una orden de pedido
		* @return El total de una orden de pedido
		*/
		public int calcularTotalOrden() {
		int totalOrden = 0;
		for(int i = 0; i < itemsPedido.size(); i++) { /* Recorre el vector de 
		líneas de pedido */
		// Obtiene cada objeto del vector aplicando casting
		LíneaPedido línea = (LíneaPedido) itemsPedido.elementAt(i);
		// Va totalizando la orden mediante la suma de los subtotales
		totalOrden = totalOrden + línea.calcularSubtotalLíneaPedido();
		}
		return totalOrden;
		}
		/**
		* Método que convierte a String los datos de una orden de pedido
		* @return Un String con los datos de una orden de pedido
		*/
		public String toString() {
		return "Orden [id = " + identificador +"]\n" + "Items del pedido\n" 
		+ itemsPedido + 
		"\nTotal orden = $" + calcularTotalOrden();
		}
		
		/**
		* Método que permite agregar una línea de pedido a la orden
		* * @param identificador Parámetro que define el identificador de la 
		* línea de pedido
		*  @param cantidad Parámetro que define la cantidad de producto 
		*  solicitado en la línea de pedido
		*  @param producto Parámetro que define el producto solicitado en 
		*   la línea de pedido
		**/
		
		public void añadirItem(int identificador, int cantidad, Producto 
				producto) {
				// Crea un línea de pedido
				LíneaPedido línea= new LíneaPedido(identificador, cantidad, 
				producto);
				itemsPedido.add(línea); /* Añade la línea de pedido creada al 
				vector de líneas de pedido */
				}
}
