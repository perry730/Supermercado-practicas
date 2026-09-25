/**
 * Clase de ejemplo para probar Promocionable e ImpuestoAplicable juntas.
 * Reemplazá esta clase por la jerarquía real de Producto cuando la
 * integres con las partes de tus compañeros: lo importante es que
 * esa clase implemente estas dos interfaces igual que acá.
 */
public class ProductoEjemplo implements Promocionable, ImpuestoAplicable {

    private String nombre;
    private double precio;

    public ProductoEjemplo(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        double descuento = precio * (porcentaje / 100);
        precio = precio - descuento;
    }

    @Override
    public void aplicarPromocion(String tipoPromocion) {
        switch (tipoPromocion) {
            case "2x1":
                System.out.println(nombre + ": promoción 2x1 aplicada.");
                break;
            case "50% segunda unidad":
                System.out.println(nombre + ": 50% de descuento en la segunda unidad.");
                break;
            default:
                System.out.println(nombre + ": promoción \"" + tipoPromocion + "\" no reconocida.");
        }
    }

    @Override
    public double calcularImpuesto(double porcentaje) {
        return precio * (porcentaje / 100);
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
}
