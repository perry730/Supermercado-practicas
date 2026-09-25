public class Main {

    public static void main(String[] args) {

        // =========================
        // CREAR PRODUCTOS
        // =========================

        Producto notebook = new Producto(
                "Notebook",
                1000000,
                3
        );

        Producto mouse = new Producto(
                "Mouse",
                30000,
                2
        );

        Producto teclado = new Producto(
                "Teclado",
                50000,
                0
        );
        // =========================
        // CREAR CLIENTES
        // =========================

        Cliente clienteNormal = new Cliente(
                "Juan",
                "11111111",
                true
        );

        // Polimorfismo:
        // La variable es Cliente,
        // pero el objeto es ClienteVIP.
        Cliente clienteVIP = new ClienteVIP(
                "Santiago",
                "22222222",
                true,
                20
        );

        Cliente clienteNoRegistrado = new Cliente(
                "Pedro",
                "33333333",
                false
        );


        // =========================
        // PRUEBA 1
        // CLIENTE NORMAL
        // =========================

        System.out.println("===== CLIENTE NORMAL =====");

        try {

            clienteNormal.comprar(notebook);

        } catch (ProductoNoDisponibleException e) {

            System.out.println(
                    "ERROR: " + e.getMessage()
            );

        } catch (ClienteNoRegistradoException e) {

            System.out.println(
                    "ERROR: " + e.getMessage()
            );
        }


        // =========================
        // PRUEBA 2
        // CLIENTE VIP
        // =========================

        System.out.println("\n===== CLIENTE VIP =====");

        try {

            // Gracias al polimorfismo,
            // se ejecuta comprar() de ClienteVIP.
            clienteVIP.comprar(mouse);

        } catch (ProductoNoDisponibleException e) {

            System.out.println(
                    "ERROR: " + e.getMessage()
            );

        } catch (ClienteNoRegistradoException e) {

            System.out.println(
                    "ERROR: " + e.getMessage()
            );
        }


        // =========================
        // PRUEBA 3
        // PRODUCTO SIN STOCK
        // =========================

        System.out.println("\n===== PRODUCTO SIN STOCK =====");

        try {

            clienteNormal.comprar(teclado);

        } catch (ProductoNoDisponibleException e) {

            System.out.println(
                    "ERROR: " + e.getMessage()
            );

        } catch (ClienteNoRegistradoException e) {

            System.out.println(
                    "ERROR: " + e.getMessage()
            );
        }


        // =========================
        // PRUEBA 4
        // CLIENTE NO REGISTRADO
        // =========================

        System.out.println("\n===== CLIENTE NO REGISTRADO =====");

        try {

            clienteNoRegistrado.comprar(notebook);

        } catch (ProductoNoDisponibleException e) {

            System.out.println(
                    "ERROR: " + e.getMessage()
            );

        } catch (ClienteNoRegistradoException e) {

            System.out.println(
                    "ERROR: " + e.getMessage()
            );
        }


        // =========================
        // MOSTRAR COMPRAS
        // =========================

        System.out.println("\n===== HISTORIAL DE COMPRAS =====");

        clienteNormal.mostrarCompras();
        clienteVIP.mostrarCompras();


        // =========================
        // TOTAL DE CLIENTES
        // =========================

        System.out.println(
                "\nTotal de clientes creados: "
                        + Cliente.getTotalClientes()
        );
    }
}