/**
 * Interfaz que deben implementar los productos a los que se les
 * pueden aplicar descuentos y promociones.
 */
public interface Promocionable {

    /**
     * Aplica un descuento específico a un producto.
     * @param porcentaje porcentaje de descuento a aplicar (ej: 10.0 => 10%)
     */
    void aplicarDescuento(double porcentaje);

    /**
     * Permite aplicar una promoción específica a un producto
     * (por ejemplo: 2x1, 50% en la segunda unidad, etc.).
     * @param tipoPromocion identificador del tipo de promoción
     */
    void aplicarPromocion(String tipoPromocion);
}
