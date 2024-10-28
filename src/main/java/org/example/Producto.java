package org.example;

class Producto {
    private int id;
    private String nombre;
    private float precio;
    private String imagen;
    private Categoria categoria;
    private Marca marca;
    private String tamaño; // New attribute

    public Producto(int id, String nombre, float precio, String imagen, Categoria categoria, Marca marca, String tamaño) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.imagen = imagen;
        this.categoria = categoria;
        this.marca = marca;
        this.tamaño = tamaño;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public String getImagen() {
        return imagen;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Marca getMarca() {
        return marca;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void verDetalle() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Imagen: " + imagen);
        System.out.println("Categoria: " + categoria.getNombre());
        System.out.println("Marca: " + marca.getNombre());
        System.out.println("Tamaño: " + tamaño);
    }
}