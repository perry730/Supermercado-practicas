package com.supermercado.model.actor;

/**
 * Representa a un cliente convencional del supermercado sin membresía preferencial.
 * 
 * @author Docente Prácticas Profesionalizantes
 * @version 1.0
 */
public class ClienteNormal extends Cliente {

    public ClienteNormal(String id, String nombre, String email) {
        super(id, nombre, email);
    }

    @Override
    public double getPorcentajeDescuento() {
        return 0.0; // Sin descuento especial
    }

    @Override
    public String getTipoCliente() {
        return "Cliente Regular (Sin Descuento Adicional)";
    }
}
