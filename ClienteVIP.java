public class ClienteVIP extends Cliente {

    private double descuentoVIP;

    public ClienteVIP(String nombre, String dni,
                      boolean registrado, double descuentoVIP) {

        super(nombre, dni, registrado);
        this.descuentoVIP = descuentoVIP;
    }

    public double aplicarDescuentoVIP(Producto producto) {

        double descuento =
                producto.getPrecio() * descuentoVIP / 100;

        double precioFinal =
                producto.getPrecio() - descuento;

        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Precio original: $" + producto.getPrecio());
        System.out.println("Descuento VIP: " + descuentoVIP + "%");
        System.out.println("Precio final: $" + precioFinal);

        return precioFinal;
    }

    public double getDescuentoVIP() {
        return descuentoVIP;
    }

    public void setDescuentoVIP(double descuentoVIP) {
        this.descuentoVIP = descuentoVIP;
    }
}