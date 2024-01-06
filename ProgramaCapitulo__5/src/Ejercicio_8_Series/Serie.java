package Ejercicio_8_Series;

public class Serie {
    String titulo;
    String genero;
    String paisOrigen;
    int añoRealizacion;

    public Serie(String titulo, String genero, String paisOrigen, int añoRealizacion) {
        this.titulo = titulo;
        this.genero = genero;
        this.paisOrigen = paisOrigen;
        this.añoRealizacion = añoRealizacion;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", paisOrigen='" + paisOrigen + '\'' +
                ", añoRealizacion=" + añoRealizacion +
                '}';
    }
}