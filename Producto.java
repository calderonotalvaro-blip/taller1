/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerpoo;

/**
 *
 * @author 57312
 */
public class Producto {

    String nombre;
    double precio;
    int stock;

    void registrarVenta(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a vender debe ser mayor que 0.");
            return;
        }
        if (cantidad > stock) {
            System.out.println("No hay unidades suficientes de " + nombre + ". Stock disponible: " + stock);
            return;
        }
        stock -= cantidad;
        System.out.println("Venta registrada: " + cantidad + " unidad(es) de " + nombre + ". Stock restante: " + stock);
    }

    void reponer(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a reponer debe ser mayor que 0.");
            return;
        }
        stock += cantidad;
        System.out.println("Reposicion realizada: +" + cantidad + " unidad(es) de " + nombre + ". Stock actual: " + stock);
    }

    void mostrarInformacion() {
        System.out.println("Producto: " + nombre + " | Precio: " + precio + " | Stock: " + stock);
    }
}
