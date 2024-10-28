package org.example;

class Marca {
    private int idMarca;
    private String nombre;

    public Marca(int idMarca, String nombre) {
        this.idMarca = idMarca;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public int getId() {
        return idMarca;
    }

}
