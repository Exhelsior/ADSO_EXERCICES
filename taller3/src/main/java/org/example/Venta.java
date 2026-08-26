package org.example;

public class Venta {

    private Cliente cliente;
    private Producto producto;
    private int cantidad;

    public Venta(Cliente cliente, Producto producto, int cantidad) {
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public double calcularTotal() {
        return producto.getPrecio() * cantidad;
    }

    public void MostrarDetalle() {
        double total = calcularTotal();

        if (total > 3333) {
            total -= total * 0.10;
        }

        System.out.println("---------------------------------------------------");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Precio: $" + producto.getPrecio());
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Total a pagar: $" + total);
    }
}
