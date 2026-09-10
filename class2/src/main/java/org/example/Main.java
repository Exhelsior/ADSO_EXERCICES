package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese nombre del cliente: ");
        String nombreCliente = scanner.nextLine();

        System.out.print("Ingrese nombre del producto: ");
        String nombreProducto = scanner.nextLine();

        System.out.print("Ingrese precio del producto: ");
        double price = scanner.nextDouble();

        System.out.print("Cantidad comprada: ");
        int cantidad = scanner.nextInt();

        Cliente cliente = new Cliente(nombreCliente);
        Producto producto = new Producto(nombreProducto, price);

        Venta venta = new Venta(cliente, producto, cantidad);

        venta.MostrarDetalle();

        scanner.close();
    }
}
