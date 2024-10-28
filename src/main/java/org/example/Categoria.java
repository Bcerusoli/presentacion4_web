package org.example;

import java.util.ArrayList;
import java.util.List;

class Categoria {
    private int id;
    private String nombre;
    private List<Marca> marcas = new ArrayList<>();
    private List<String> subcategorias = new ArrayList<>();

    public Categoria(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public void agregarMarca(Marca marca) {
        marcas.add(marca);
    }

    public void agregarSubcategoria(String subcategoria) {
        subcategorias.add(subcategoria);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Marca> getMarcas() {
        return marcas;
    }

    public List<String> getSubcategorias() {
        return subcategorias;
    }
}