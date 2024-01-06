package Ejercicio_1_Propuesto;

import java.util.Date;

class Persona {
	String nombre;
	String apellidos;
	String numeroDocumento;
	Date fechaNacimiento;

	Persona(String nombre, String apellidos, String numeroDocumento, Date fechaNacimiento) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.numeroDocumento = numeroDocumento;
		this.fechaNacimiento = fechaNacimiento;
	}
}