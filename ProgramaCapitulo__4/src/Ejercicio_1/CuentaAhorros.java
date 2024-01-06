package Ejercicio_1;

public class CuentaAhorros extends Cuenta {

    private boolean activa;

    public CuentaAhorros(float saldo, float tasa) {
        super(saldo, tasa);
        activa = saldo >= 10000; // Activar la cuenta si el saldo es mayor o igual a 10000
    }

    @Override
    public void retirar(float cantidad) {
        if (activa) {
            super.retirar(cantidad);
        } else {
            System.out.println("La cuenta no está activa. No se puede realizar el retiro.");
        }
    }

    @Override
    public void consignar(float cantidad) {
        if (activa) {
            super.consignar(cantidad);
        } else {
            System.out.println("La cuenta no está activa. No se puede realizar la consignación.");
        }
    }

    @Override
    public void extractoMensual() {
        if (númeroRetiros > 4) {
            comisiónMensual += (númeroRetiros - 4) * 1000;
        }
        super.extractoMensual();
        if (saldo < 10000) {
            activa = false;
        }
    }

    public void imprimir() {
        System.out.println("Saldo = $ " + saldo);
        System.out.println("Comisión mensual = $ " + comisiónMensual);
        System.out.println("Número de transacciones = " + (númeroConsignaciones + númeroRetiros));
        System.out.println("Estado de la cuenta: " + (activa ? "Activa" : "Inactiva"));
        System.out.println();
    }
}
