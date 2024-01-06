package Ejercicio_9_Numerica;

public class Fracción extends Numérica {
    private int numerador;
    private int denominador;

    // Constructor
    public Fracción(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    // Implementación de los métodos abstractos de Numérica

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Fracción fracción = (Fracción) obj;

        return numerador == fracción.numerador && denominador == fracción.denominador;
    }

    @Override
    public Numérica sumar(Numérica número) {
        if (!(número instanceof Fracción)) {
            throw new IllegalArgumentException("El argumento debe ser una fracción");
        }

        Fracción otraFracción = (Fracción) número;
        int nuevoNumerador = this.numerador * otraFracción.denominador + otraFracción.numerador * this.denominador;
        int nuevoDenominador = this.denominador * otraFracción.denominador;

        return new Fracción(nuevoNumerador, nuevoDenominador);
    }

    @Override
    public Numérica restar(Numérica número) {
        if (!(número instanceof Fracción)) {
            throw new IllegalArgumentException("El argumento debe ser una fracción");
        }

        Fracción otraFracción = (Fracción) número;
        int nuevoNumerador = this.numerador * otraFracción.denominador - otraFracción.numerador * this.denominador;
        int nuevoDenominador = this.denominador * otraFracción.denominador;

        return new Fracción(nuevoNumerador, nuevoDenominador);
    }

    @Override
    public Numérica multiplicar(Numérica número) {
        if (!(número instanceof Fracción)) {
            throw new IllegalArgumentException("El argumento debe ser una fracción");
        }

        Fracción otraFracción = (Fracción) número;
        int nuevoNumerador = this.numerador * otraFracción.numerador;
        int nuevoDenominador = this.denominador * otraFracción.denominador;

        return new Fracción(nuevoNumerador, nuevoDenominador);
    }

    @Override
    public Numérica dividir(Numérica número) {
        if (!(número instanceof Fracción)) {
            throw new IllegalArgumentException("El argumento debe ser una fracción");
        }

        Fracción otraFracción = (Fracción) número;
        int nuevoNumerador = this.numerador * otraFracción.denominador;
        int nuevoDenominador = this.denominador * otraFracción.numerador;

        return new Fracción(nuevoNumerador, nuevoDenominador);
    }
}