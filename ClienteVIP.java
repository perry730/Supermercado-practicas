package com.supermercado.model.actor;

/**
 * Representa a un cliente con membresía distinguida o fidelizada (VIP).
 * Aplica una bonificación porcentual configurable sobre el total de la compra.
 * 
 * @author Docente Prácticas Profesionalizantes
 * @version 1.0
 */
public class ClienteVIP extends Cliente {

    private double porcentajeDescuento;

    /**
     * Constructor con tasa de descuento predeterminada del 15% (0.15).
     * 
     * @param id Identificación fiscal / DNI.
     * @param nombre Nombre y apellido.
     * @param email Correo electrónico.
     */
    public ClienteVIP(String id, String nombre, String email) {
        this(id, nombre, email, 0.15); // 15% por defecto
    }

    /**
     * Constructor con porcentaje de beneficio personalizado.
     * 
     * @param id Identificación fiscal / DNI.
     * @param nombre Nombre y apellido.
     * @param email Correo electrónico.
     * @param porcentajeDescuento Tasa decimal de descuento (ej: 0.20 para 20%).
     */
    public ClienteVIP(String id, String nombre, String email, double porcentajeDescuento) {
        super(id, nombre, email);
        setPorcentajeDescuento(porcentajeDescuento);
    }

    @Override
    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        if (porcentajeDescuento < 0.0 || porcentajeDescuento > 1.0) {
            throw new IllegalArgumentException("El porcentaje de descuento VIP debe estar entre 0.0 y 1.0 (0% a 100%).");
        }
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public String getTipoCliente() {
        return String.format("Cliente VIP (%.0f%% de Descuento en Total)", porcentajeDescuento * 100);
    }
}
