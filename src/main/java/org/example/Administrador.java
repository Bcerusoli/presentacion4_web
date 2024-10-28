package org.example;

import java.util.List;

class Administrador extends Usuario {

    public Administrador(int id, String nombre, String email, String contraseña) {
        super(id, nombre, email, contraseña, "Administrador");
    }

    public void crearProducto(Producto producto) {
        System.out.println("Producto creado: " + producto.getNombre());
    }

    public void editarProducto(Producto producto) {
        System.out.println("Producto editado: " + producto.getNombre());
    }

    public void eliminarProducto(int idProducto) {
        System.out.println("Producto eliminado con ID: " + idProducto);
    }

    public List<Pedido> verPedido() {
        return Pedido.getPedidos();
    }



}
