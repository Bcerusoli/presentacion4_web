package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Pedido {
    private int id;
    private Date fecha;
    private Cliente cliente;
    private float total;
    private List<Producto> productos = new ArrayList<>();
    private static List<Pedido> pedidos = new ArrayList<>();

    public Pedido(int id, Cliente cliente, List<Producto> productos) {
        this.id = id;
        this.fecha = new Date();
        this.cliente = cliente;
        this.productos = productos;
        this.total = calcularTotal();
        pedidos.add(this);
    }

    public void completarPedido() {
        System.out.println("Pedido completado. ID: " + id + ", Cliente: " + cliente.getNombre() + ", Total: " + total);
    }

    public void verDetallesPedido() {
        System.out.println("Detalles del Pedido ID: " + id);
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Fecha: " + fecha);
        System.out.println("Productos:");
        for (Producto producto : productos) {
            System.out.println(" - " + producto.getNombre() + ": " + producto.getPrecio());
        }
        System.out.println("Total: " + total);
    }

    private float calcularTotal() {
        float suma = 0;
        for (Producto producto : productos) {
            suma += producto.getPrecio();
        }
        return suma;
    }

    public static List<Pedido> historialPedidos(Cliente cliente) {
        List<Pedido> historial = new ArrayList<>();
        for (Pedido pedido : pedidos) {
            if (pedido.cliente.equals(cliente)) {
                historial.add(pedido);
            }
        }
        return historial;
    }

    public static List<Pedido> getPedidos() {
        return pedidos;
    }
}