package Ejercicio_1;

/**
* Esta clase denominada CuentaCorriente modela una cuenta bancaria 
* que es una subclase de Cuenta. Tiene un nuevo atributo: sobregiro.
* @version 1.2/2020
*/


public class CuentaCorriente extends Cuenta {

    private float sobregiro;

    public CuentaCorriente(float saldo, float tasa) {
        super(saldo, tasa);
        sobregiro = 0;
    }

    @Override
    public void retirar(float cantidad) {
        float resultado = saldo - cantidad;
        if (resultado < 0) {
            sobregiro -= resultado;
            saldo = 0;
        } else {
            super.retirar(cantidad);
        }
    }

    @Override
    public void consignar(float cantidad) {
        float residuo = sobregiro - cantidad;

        if (sobregiro > 0) {
            if (residuo > 0) {
                sobregiro = 0;
                saldo = residuo;
            } else {
                sobregiro = -residuo;
                saldo = 0;
            }
        } else {
            super.consignar(cantidad);
        }
    }

    @Override
    public void extractoMensual() {
        super.extractoMensual();
    }

    public void imprimir() {
        System.out.println("Saldo = $ " + saldo);
        System.out.println("Cargo mensual = $ " + comisiónMensual);
        System.out.println("Número de transacciones = " + (númeroConsignaciones + númeroRetiros));
        System.out.println("Valor de sobregiro = $" + sobregiro);
        System.out.println();
    }
}
