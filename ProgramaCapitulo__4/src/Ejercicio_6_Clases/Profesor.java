package Ejercicio_6_Clases;

public class Profesor {
    private Persona persona;
    private String departamento;
    private String categoría;

    public Profesor(Persona persona, String departamento, String categoría) {
        this.persona = persona;
        this.departamento = departamento;
        this.categoría = categoría;
    }

    public String getNombre() {
        return persona.getNombre();
    }

    public String getDirección() {
        return persona.getDirección();
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getCategoría() {
        return categoría;
    }
}