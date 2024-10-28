package org.example;

// Clase Usuario
class Usuario {
    protected int id;
    protected String nombre;
    protected String email;
    protected String contraseña;
    protected String tipo;

    public Usuario(int id, String nombre, String email, String contraseña, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void registrarse() {
        System.out.println(nombre + " se ha registrado.");
    }

    public void iniciarSesion() {
        System.out.println(nombre + " ha iniciado sesión.");
    }
}
