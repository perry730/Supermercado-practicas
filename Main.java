public class Main {

    public static void main(String[] args) {
        ProductoEjemplo leche = new ProductoEjemplo("Leche", 1000.0);

        System.out.println("Precio original: $" + leche.getPrecio());

        leche.aplicarDescuento(10);
        System.out.println("Precio tras 10% de descuento: $" + leche.getPrecio());

        leche.aplicarPromocion("2x1");

        double impuesto = leche.calcularImpuesto(21);
        System.out.println("Impuesto (21%) sobre el precio actual: $" + impuesto);
    }
}
