package org.example;

import java.util.List;

class Cliente extends Usuario {
    private String nit;
    private String direccionEntrega;
    private Carrito carrito;

    public Cliente(int id, String nombre, String email, String contraseña, String nit, String direccionEntrega) {
        super(id, nombre, email, contraseña, "Cliente");
        this.nit = nit;
        this.direccionEntrega = direccionEntrega;
        this.carrito = new Carrito();
    }

    public void registrarPedido(Pedido pedido) {
        System.out.println("Pedido registrado para el cliente: " + nombre);
    }

    public List<Pedido> verPedidos() {
        return Pedido.historialPedidos(this);
    }

    public Carrito getCarrito() {
        return carrito;
    }
}