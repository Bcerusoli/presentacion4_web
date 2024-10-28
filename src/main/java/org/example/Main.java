package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente(1, "Cliente Prueba", "cliente@prueba.com", "password", "123456", "Calle 123");
        Administrador admin = null;

        List<Producto> productosDisponibles = new ArrayList<>();
        List<Pedido> pedidos = new ArrayList<>();

        Categoria categoriaPerfumes = new Categoria(1, "Perfumes");
        categoriaPerfumes.agregarSubcategoria("Hombre");
        categoriaPerfumes.agregarSubcategoria("Mujer");
        categoriaPerfumes.agregarSubcategoria("Todos");

        Marca dior = new Marca(1, "Dior");
        Marca antonioBandera = new Marca(2, "Antonio Banderas");
        Marca esika = new Marca(3, "Esika");
        Marca yanbal = new Marca(4, "Yanbal");
        Marca cr7 = new Marca(5, "CR7");

        categoriaPerfumes.agregarMarca(dior);
        categoriaPerfumes.agregarMarca(antonioBandera);
        categoriaPerfumes.agregarMarca(esika);
        categoriaPerfumes.agregarMarca(yanbal);
        categoriaPerfumes.agregarMarca(cr7);

        Producto perfume1 = new Producto(1, "Chanel No. 5", 50.0f, "imagen1.jpg", categoriaPerfumes, dior, "50ml");
        Producto perfume2 = new Producto(2, "Dior Sauvage", 65.0f, "imagen2.jpg", categoriaPerfumes, dior, "100ml");
        Producto perfume3 = new Producto(3, "Acqua di Gio", 70.0f, "imagen3.jpg", categoriaPerfumes, antonioBandera, "150ml");
        Producto perfume4 = new Producto(4, "Bleu de Chanel", 55.0f, "imagen4.jpg", categoriaPerfumes, esika, "50ml");
        Producto perfume5 = new Producto(5, "Tom Ford Black Orchid", 60.0f, "imagen5.jpg", categoriaPerfumes, yanbal, "100ml");
        Producto perfume6 = new Producto(6, "Creed Aventus", 75.0f, "imagen6.jpg", categoriaPerfumes, cr7, "150ml");
        Producto perfume7 = new Producto(7, "Yves Saint Laurent La Nuit de L'Homme", 80.0f, "imagen7.jpg", categoriaPerfumes, dior, "50ml");
        Producto perfume8 = new Producto(8, "Dior Homme", 85.0f, "imagen8.jpg", categoriaPerfumes, dior, "100ml");
        Producto perfume9 = new Producto(9, "Dior Addict", 90.0f, "imagen9.jpg", categoriaPerfumes, dior, "150ml");
        Producto perfume10 = new Producto(10, "Antonio Banderas Blue Seduction", 45.0f, "imagen10.jpg", categoriaPerfumes, antonioBandera, "50ml");
        Producto perfume11 = new Producto(11, "Antonio Banderas The Secret", 50.0f, "imagen11.jpg", categoriaPerfumes, antonioBandera, "100ml");
        Producto perfume12 = new Producto(12, "Esika Fascina Collection", 55.0f, "imagen12.jpg", categoriaPerfumes, esika, "150ml");
        Producto perfume13 = new Producto(13, "Esika Magnat", 60.0f, "imagen13.jpg", categoriaPerfumes, esika, "50ml");
        Producto perfume14 = new Producto(14, "Yanbal Iluminas", 65.0f, "imagen14.jpg", categoriaPerfumes, yanbal, "100ml");
        Producto perfume15 = new Producto(15, "Yanbal Essenza", 70.0f, "imagen15.jpg", categoriaPerfumes, yanbal, "150ml");
        Producto perfume16 = new Producto(16, "CR7 Play It Cool", 75.0f, "imagen16.jpg", categoriaPerfumes, cr7, "50ml");
        Producto perfume17 = new Producto(17, "CR7 Game On", 80.0f, "imagen17.jpg", categoriaPerfumes, cr7, "100ml");

        productosDisponibles.add(perfume1);
        productosDisponibles.add(perfume2);
        productosDisponibles.add(perfume3);
        productosDisponibles.add(perfume4);
        productosDisponibles.add(perfume5);
        productosDisponibles.add(perfume6);
        productosDisponibles.add(perfume7);
        productosDisponibles.add(perfume8);
        productosDisponibles.add(perfume9);
        productosDisponibles.add(perfume10);
        productosDisponibles.add(perfume11);
        productosDisponibles.add(perfume12);
        productosDisponibles.add(perfume13);
        productosDisponibles.add(perfume14);
        productosDisponibles.add(perfume15);
        productosDisponibles.add(perfume16);
        productosDisponibles.add(perfume17);

        crearPedidosDePrueba(pedidos, cliente, productosDisponibles);

        System.out.println("Bienvenido. Seleccione una opción:");
        System.out.println("1. Registrarse como Cliente");
        System.out.println("2. Iniciar sesión como Cliente");
        System.out.println("3. Iniciar sesión como Administrador");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese su nombre: ");
                String nombreCliente = scanner.nextLine();
                System.out.print("Ingrese su email: ");
                String emailCliente = scanner.nextLine();
                System.out.print("Ingrese su contraseña: ");
                String passwordCliente = scanner.nextLine();
                System.out.print("Ingrese su teléfono: ");
                String telefonoCliente = scanner.nextLine();
                System.out.print("Ingrese su dirección: ");
                String direccionCliente = scanner.nextLine();
                cliente = new Cliente(1, nombreCliente, emailCliente, passwordCliente, telefonoCliente, direccionCliente);
                cliente.registrarse();
                break;
            case 2:
                System.out.print("Ingrese su email: ");
                emailCliente = scanner.nextLine();
                System.out.print("Ingrese su contraseña: ");
                passwordCliente = scanner.nextLine();
                cliente = new Cliente(1, "Cliente Existente", emailCliente, passwordCliente, "123456", "Calle 123");
                cliente.iniciarSesion();
                break;
            case 3:
                System.out.print("Ingrese su email: ");
                String emailAdmin = scanner.nextLine();
                System.out.print("Ingrese su contraseña: ");
                String passwordAdmin = scanner.nextLine();
                admin = new Administrador(2, "Administrador Existente", emailAdmin, passwordAdmin);
                admin.iniciarSesion();
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        if (admin != null) {
            while (true) {
                System.out.println("Seleccione una opción:");
                System.out.println("1. Crear producto");
                System.out.println("2. Editar producto");
                System.out.println("3. Eliminar producto");
                System.out.println("4. Ver pedidos");
                System.out.println("5. Salir");
                int adminOpcion = scanner.nextInt();
                scanner.nextLine();

                switch (adminOpcion) {
                    case 1:
                        System.out.print("Ingrese el nombre del producto: ");
                        String nombreProducto = scanner.nextLine();
                        System.out.print("Ingrese el precio del producto: ");
                        float precioProducto = scanner.nextFloat();
                        scanner.nextLine();
                        System.out.print("Ingrese la imagen del producto: ");
                        String imagenProducto = scanner.nextLine();
                        System.out.print("Ingrese el tamaño del producto (50ml, 100ml, 150ml): ");
                        String tamañoProducto = scanner.nextLine();
                        Producto nuevoProducto = new Producto(productosDisponibles.size() + 1, nombreProducto, precioProducto, imagenProducto, categoriaPerfumes, dior, tamañoProducto);
                        admin.crearProducto(nuevoProducto);
                        productosDisponibles.add(nuevoProducto);
                        break;
                    case 2:
                        System.out.print("Ingrese el ID del producto a editar: ");
                        int idEditar = scanner.nextInt();
                        scanner.nextLine();
                        Producto productoEditar = null;
                        for (Producto producto : productosDisponibles) {
                            if (producto.getId() == idEditar) {
                                productoEditar = producto;
                                break;
                            }
                        }
                        if (productoEditar != null) {
                            System.out.print("Ingrese el nuevo nombre del producto: ");
                            nombreProducto = scanner.nextLine();
                            System.out.print("Ingrese el nuevo precio del producto: ");
                            precioProducto = scanner.nextFloat();
                            scanner.nextLine();
                            System.out.print("Ingrese la nueva imagen del producto: ");
                            imagenProducto = scanner.nextLine();
                            System.out.print("Ingrese el nuevo tamaño del producto (50ml, 100ml, 150ml): ");
                            tamañoProducto = scanner.nextLine();
                            productoEditar = new Producto(idEditar, nombreProducto, precioProducto, imagenProducto, categoriaPerfumes, dior, tamañoProducto);
                            admin.editarProducto(productoEditar);
                        } else {
                            System.out.println("Producto no encontrado.");
                        }
                        break;
                    case 3:
                        System.out.print("Ingrese el ID del producto a eliminar: ");
                        int idEliminar = scanner.nextInt();
                        scanner.nextLine();
                        admin.eliminarProducto(idEliminar);
                        productosDisponibles.removeIf(producto -> producto.getId() == idEliminar);
                        break;
                    case 4:
                        if (pedidos.isEmpty()) {
                            System.out.println("No hay pedidos.");
                        } else {
                            for (Pedido pedido : pedidos) {
                                pedido.verDetallesPedido();
                            }
                        }
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("Opción no válida.");
                }
            }
        }

        if (cliente != null) {
            while (true) {
                System.out.println("Seleccione una marca:");
                for (Marca marca : categoriaPerfumes.getMarcas()) {
                    System.out.println(marca.getId() + ". " + marca.getNombre());
                }
                int marcaOpcion = scanner.nextInt();
                scanner.nextLine();

                Marca marcaSeleccionada = null;
                for (Marca marca : categoriaPerfumes.getMarcas()) {
                    if (marca.getId() == marcaOpcion) {
                        marcaSeleccionada = marca;
                        break;
                    }
                }

                if (marcaSeleccionada != null) {
                    System.out.println("Productos disponibles de la marca " + marcaSeleccionada.getNombre() + ":");
                    for (Producto producto : productosDisponibles) {
                        if (producto.getMarca().getId() == marcaSeleccionada.getId()) {
                            System.out.println("ID: " + producto.getId() + ", Nombre: " + producto.getNombre() + ", Precio: " + producto.getPrecio());
                        }
                    }

                    System.out.print("Ingrese el ID del producto para ver detalles: ");
                    int productoId = scanner.nextInt();
                    scanner.nextLine();

                    Producto productoSeleccionado = null;
                    for (Producto producto : productosDisponibles) {
                        if (producto.getId() == productoId) {
                            productoSeleccionado = producto;
                            break;
                        }
                    }

                    if (productoSeleccionado != null) {
                        productoSeleccionado.verDetalle();

                        System.out.print("Ingrese la cantidad: ");
                        int cantidad = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Ingrese el tamaño del producto (50ml, 100ml, 150ml): ");
                        String tamaño = scanner.nextLine();

                        Producto productoConTamaño = new Producto(productoSeleccionado.getId(), productoSeleccionado.getNombre(), productoSeleccionado.getPrecio(), productoSeleccionado.getImagen(), productoSeleccionado.getCategoria(), productoSeleccionado.getMarca(), tamaño);
                        cliente.getCarrito().agregarProducto(productoConTamaño, cantidad);
                        System.out.println("Producto agregado al carrito.");
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                } else {
                    System.out.println("Marca no encontrada.");
                }

                System.out.print("\n¿Desea agregar más productos al carrito? (s/n): ");
                String agregarMas = scanner.next();
                if (!agregarMas.equalsIgnoreCase("s")) {
                    break;
                }
            }

            System.out.println("\nProductos en el carrito:");
            for (Producto producto : cliente.getCarrito().getProductos()) {
                System.out.println("Producto: " + producto.getNombre() + ", Precio: " + producto.getPrecio() + ", Tamaño: " + producto.getTamaño());
            }
            System.out.println("Subtotal del carrito: " + cliente.getCarrito().calcularSubtotal());

            System.out.print("\n¿Desea eliminar algún producto del carrito? (s/n): ");
            String eliminar = scanner.next();
            if (eliminar.equalsIgnoreCase("s")) {
                System.out.print("Ingrese el ID del producto a eliminar: ");
                int idProductoEliminar = scanner.nextInt();
                cliente.getCarrito().eliminarProducto(idProductoEliminar);
                System.out.println("Producto eliminado del carrito.");
            }

            System.out.print("\n¿Desea confirmar el pedido? (s/n): ");
            String confirmar = scanner.next();
            if (confirmar.equalsIgnoreCase("s")) {
                Pedido pedido = new Pedido(pedidos.size() + 1, cliente, cliente.getCarrito().getProductos());
                pedido.completarPedido();
                pedidos.add(pedido);
                System.out.println("Pedido confirmado.");
            } else {
                System.out.println("Pedido cancelado.");
            }
        }

        scanner.close();
    }

    private static void crearPedidosDePrueba(List<Pedido> pedidos, Cliente cliente, List<Producto> productosDisponibles) {
        if (productosDisponibles.size() >= 4) {
            List<Producto> productosPedido1 = new ArrayList<>();
            productosPedido1.add(productosDisponibles.get(0));
            productosPedido1.add(productosDisponibles.get(1));
            Pedido pedido1 = new Pedido(pedidos.size() + 1, cliente, productosPedido1);
            pedidos.add(pedido1);

            List<Producto> productosPedido2 = new ArrayList<>();
            productosPedido2.add(productosDisponibles.get(2));
            productosPedido2.add(productosDisponibles.get(3));
            Pedido pedido2 = new Pedido(pedidos.size() + 1, cliente, productosPedido2);
            pedidos.add(pedido2);
        } else {
            System.out.println("No hay suficientes productos disponibles para crear pedidos de prueba.");
        }
    }
}