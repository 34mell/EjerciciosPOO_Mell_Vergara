package Ejercicio_5_Agregacion;

public class Prueba {
	
	/**
	* Método main que crea una orden conformada por cuatro 
	* productos con sus identificadores y cantidad. Luego, se añaden los 
	* cuatro productos como línea de pedido a la orden y se calcula el 
	* total de la orden
	*/
	@SuppressWarnings("unused")
	public static void main(String[] args) {
	Producto producto1 = new Producto(1, "Carpeta", "Carpeta "
			+ "anillada metálica",1000);
	Producto producto2 = new Producto(2, "Tinta", "Tinta china de "
			+ "color negro.", 3000);
	Producto producto3 = new Producto(3, "Cinta pegante", 
	"Cinta adhesiva de color transparente.",800);
	Producto producto4 = new Producto(4, "Cartulina", "Pliego de "
			+ "cartulina 60x40 cms.",600);
	Orden<?> orden = new Orden<Object>(1);
	orden.añadirItem(1, 5, producto1);
	orden.añadirItem(2, 3, producto2);
	orden.añadirItem(3, 2, producto1);
	orden.añadirItem(4, 4, producto4);
	orden.calcularTotalOrden();
	System.out.println(orden);
	}

}
