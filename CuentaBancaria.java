/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerpoo;

/**
 *
 * @author 57312
 */

public class CuentaBancaria {

    String titular;
    double saldo;
    int numeroTransacciones;

    void consignar(double monto) {
        if (monto <= 0) {
            System.out.println("El monto a consignar debe ser mayor que 0.");
            return;
        }
        saldo += monto;
        numeroTransacciones++;
        System.out.println("Consignacion exitosa en cuenta de " + titular + ". Nuevo saldo: " + saldo);
    }

    void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("El monto a retirar debe ser mayor que 0.");
            return;
        }
        if (monto > saldo) {
            System.out.println("Fondos insuficientes para " + titular + ". Saldo actual: " + saldo);
            return;
        }
        saldo -= monto;
        numeroTransacciones++;
        System.out.println("Retiro exitoso en cuenta de " + titular + ". Nuevo saldo: " + saldo);
    }

    void transferir(CuentaBancaria destino, double monto) {
        if (destino == null) {
            System.out.println("La cuenta destino no existe.");
            return;
        }
        if (monto <= 0) {
            System.out.println("El monto a transferir debe ser mayor que 0.");
            return;
        }
        if (monto > saldo) {
            System.out.println("No se puede transferir: fondos insuficientes en la cuenta de " + titular);
            return;
        }
        saldo -= monto;
        numeroTransacciones++;
        destino.saldo += monto;
        destino.numeroTransacciones++;
        System.out.println("Transferencia de " + monto + " de " + titular + " hacia " + destino.titular + " realizada.");
    }

    double consultarSaldo() {
        return saldo;
    }
}