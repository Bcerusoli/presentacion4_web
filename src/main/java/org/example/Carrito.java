package org.example;

import java.util.ArrayList;
import java.util.List;

class Carrito {
    private List<Producto> productos = new ArrayList<>();
    private float subtotal;

    public void agregarProducto(Producto producto, int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            productos.add(producto);
        }
        subtotal += producto.getPrecio() * cantidad;
    }

    public void eliminarProducto(int idProducto) {
        productos.removeIf(p -> p.getId() == idProducto);
        calcularSubtotal();
    }

    public float calcularSubtotal() {
        subtotal = 0;
        for (Producto producto : productos) {
            subtotal += producto.getPrecio();
        }
        return subtotal;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public float getSubtotal() {
        return subtotal;
    }
}