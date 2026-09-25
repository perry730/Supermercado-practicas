import java.util.ArrayList;

public class Cliente {

    protected String nombre;
    protected String dni;
    protected boolean registrado;

    protected ArrayList<Producto> compras;

    private static int totalClientes = 0;

    public Cliente(String nombre, String dni, boolean registrado) {
        this.nombre = nombre;
        this.dni = dni;
        this.registrado = registrado;
        this.compras = new ArrayList<>();

        totalClientes++;
    }

    public void comprar(Producto producto)
            throws ProductoNoDisponibleException,
            ClienteNoRegistradoException {

        if (!registrado) {
            throw new ClienteNoRegistradoException(
                    "El cliente " + nombre + " no está registrado."
            );
        }

        if (producto.getStock() <= 0) {
            throw new ProductoNoDisponibleException(
                    "El producto " + producto.getNombre()
                            + " no tiene stock disponible."
            );
        }

        compras.add(producto);
        producto.descontarStock();

        System.out.println("Cliente normal: " + nombre);
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Precio pagado: $" + producto.getPrecio());
    }

    public void mostrarCompras() {

        System.out.println("\nHistorial de compras de " + nombre);

        if (compras.isEmpty()) {
            System.out.println("No tiene compras.");
        } else {
            for (Producto producto : compras) {
                System.out.println(producto.getNombre()
                        + " - $" + producto.getPrecio());
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public boolean isRegistrado() {
        return registrado;
    }

    public static int getTotalClientes() {
        return totalClientes;
    }
}