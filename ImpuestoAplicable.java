/**
 * Interfaz que deben implementar los productos a los que se les
 * calcula un impuesto (que puede variar según el tipo de producto).
 */
public interface ImpuestoAplicable {

    /**
     * Calcula el impuesto a aplicar sobre el producto.
     * @param porcentaje porcentaje de impuesto (ej: 21.0 => 21%)
     * @return el monto de impuesto calculado
     */
    double calcularImpuesto(double porcentaje);
}
