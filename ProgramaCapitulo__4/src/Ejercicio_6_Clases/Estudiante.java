package Ejercicio_6_Clases;

public class Estudiante {
    private Persona persona;
    private String carrera;
    private int semestre;

    public Estudiante(Persona persona, String carrera, int semestre) {
        this.persona = persona;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public String getNombre() {
        return persona.getNombre();
    }

    public String getDirección() {
        return persona.getDirección();
    }

    public String getCarrera() {
        return carrera;
    }

    public int getSemestre() {
        return semestre;
    }
}