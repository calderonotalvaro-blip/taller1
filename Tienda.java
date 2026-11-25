/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerpoo;

/**
 *
 * @author 57312
 */
public class Tienda {

    public static void main(String[] args) {
        Producto p1 = new Producto();
        p1.nombre = "Teclado Mecanico";
        p1.precio = 185000;
        p1.stock = 8;

        Producto p2 = new Producto();
        p2.nombre = "Mouse Inalambrico";
        p2.precio = 65000;
        p2.stock = 5;

        p1.mostrarInformacion();
        p2.mostrarInformacion();

        // Operaciones sobre p1
        p1.registrarVenta(3);
        p1.reponer(4);
        p1.registrarVenta(20); // supera el stock

        // Operaciones sobre p2
        p2.registrarVenta(2);
        p2.reponer(10);

        System.out.println("--- Estado final de los productos ---");
        p1.mostrarInformacion();
        p2.mostrarInformacion();
    }
}