/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerpoo;

/**
 *
 * @author 57312
 */

public class Banco {

    public static void main(String[] args) {
        // Etapa 1: primer objeto, asignacion e impresion
        CuentaBancaria c1 = new CuentaBancaria();
        c1.titular = "Carlos Perez";
        c1.saldo = 50000;
        System.out.println("Titular: " + c1.titular + " | Saldo inicial: " + c1.consultarSaldo());

        // Etapa 2: consignar 20000 sobre 50000 -> 70000
        c1.consignar(20000);

        // Etapa 3: retiro valido y retiro mayor al saldo
        c1.retirar(15000);
        c1.retirar(200000);

        // Etapa 4: segunda cuenta independiente
        CuentaBancaria c2 = new CuentaBancaria();
        c2.titular = "Laura Gomez";
        c2.saldo = 120000;

        c1.retirar(10000);
        System.out.println("Saldo final cuenta 1 (" + c1.titular + "): " + c1.consultarSaldo());
        System.out.println("Saldo final cuenta 2 (" + c2.titular + "): " + c2.consultarSaldo());

        // Parte C: transferir, consultarSaldo() y validacion de montos negativos
        c1.transferir(c2, 25000);
        c1.consignar(-5000);
        c2.retirar(-1000);

        System.out.println("Consulta saldo c1: " + c1.consultarSaldo() + " | Transacciones: " + c1.numeroTransacciones);
        System.out.println("Consulta saldo c2: " + c2.consultarSaldo() + " | Transacciones: " + c2.numeroTransacciones);
    }
}