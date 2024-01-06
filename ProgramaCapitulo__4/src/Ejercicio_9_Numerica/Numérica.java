package Ejercicio_9_Numerica;

public abstract class Numérica {
    public abstract String toString();

    public abstract boolean equals(Object obj);

    public abstract Numérica sumar(Numérica número);

    public abstract Numérica restar(Numérica número);

    public abstract Numérica multiplicar(Numérica número);

    public abstract Numérica dividir(Numérica número);
}