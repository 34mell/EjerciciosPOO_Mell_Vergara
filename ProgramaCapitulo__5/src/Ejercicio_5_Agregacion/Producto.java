package Ejercicio_5_Agregacion;

/**
* Esta clase denominada Producto modela un producto comercial con 
* los atributos: identificador de producto, nombre del producto, una 
* descripción del producto y un precio del producto.
* @version 1.2/2020
*/

public class Producto {
	private int identificador; /* Atributo que representa el identificador 
	de un producto */
	private String nombre; // Atributo que identifica el nombre de un producto
	private String descripción; /* Atributo que identifica la descripción 
	de un producto */
	private int precio; // Atributo que identifica el precio de un producto
	/**
	* Constructor de la clase Producto
	* @param identificador Parámetro que define el identificador de un 
	* producto
	* @param nombre Parámetro que define el nombre de un producto
	* @param descripción Parámetro que define la descripción de un 
	* producto
	* @param precio Parámetro que define el precio de un producto
	*/
	public Producto(int identificador, String nombre, String descripción, 
	int precio) {
	this.identificador = identificador;
	this.nombre = nombre;
	this.descripción = descripción;
	this.precio = precio;
	}
	/**
	* Método que obtiene el identificador de un producto
	* @return El identificador de un producto
	*/
	public int getIdentificador() {
	return identificador;
	}
	/**
	* Método que establece el identificador de un producto
	* @param identificador Parámetro que define el identificador de un 
	* producto
	*/
	public void setIdentificador(int identificador) {
	this.identificador = identificador;
	}
	/**
	* Método que obtiene el nombre de un producto
	* @return El nombre de un producto
	*/
	public String getNombre() {
	return nombre;
	}
	/**
	* Método que establece el nombre de un producto
	* @param nombre Parámetro que define el nombre de un producto
	*/
	public void setNombre(String nombre) {
	this.nombre = nombre;
	}
	/**
	* Método que obtiene la descripción de un producto
	* @return La descripción de un producto
	*/
	public String getDescripción() {
	return descripción;
	}
	
	/**
	* Método que establece la descripción de un producto
	* @param descripción Parámetro que define la descripción de un 
	* producto
	*/
	public void setDescripción(String descripción) {
	this.descripción = descripción;
	}
	/**
	* Método que obtiene el precio de un producto
	* @return El precio de un producto
	*/
	public int getPrecio() {
	return precio;
	}
	/**
	* Método que establece el precio de un producto
	* @param precio Parámetro que define el precio de un producto
	*/
	public void setPrecio(int precio) {
	this.precio = precio;
	}
	/**
	* Método que convierte a String los datos de un producto
	* @return Un String con los datos concatenados de un producto
	*/
	public String toString() {
	return "id = " + identificador + ", Nombre = " + nombre + ", "
			+ "Descripción = " + descripción + ", Precio = $ " + precio;
	}

}
