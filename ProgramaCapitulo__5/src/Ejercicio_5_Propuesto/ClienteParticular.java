package Ejercicio_5_Propuesto;

public  class ClienteParticular implements Cliente {
	
	@Override
	public String toString() {
		return "ClienteParticular [nombre=" + nombre + ", apellidos=" + apellidos + ", numeroDocumento="
				+ numeroDocumento + ", telefono=" + telefono + ", direccion=" + direccion + "]";
	}
	private String nombre;
    private String apellidos;
    private String numeroDocumento;
    private String telefono;
    private String direccion;
    
    
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}
