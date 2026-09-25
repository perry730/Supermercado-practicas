package com.supermercado.model.actor;

import java.util.Objects;

/**
 * Clase base abstracta que modela a un cliente del supermercado.
 * Implementa el principio de Inversión de Dependencias (DIP) y Sustitución de Liskov (LSP),
 * permitiendo que el sistema de facturación aplique descuentos sin acoplarse al tipo concreto.
 * 
 * @author Docente Prácticas Profesionalizantes
 * @version 1.0
 */
public abstract class Cliente {

    private String id;
    private String nombre;
    private String email;

    /**
     * Constructor base de Cliente.
     * 
     * @param id Identificación fiscal o DNI.
     * @param nombre Nombre y apellido.
     * @param email Correo electrónico de contacto.
     */
    public Cliente(String id, String nombre, String email) {
        setId(id);
        setNombre(nombre);
        setEmail(email);
    }

    /**
     * Retorna la tasa porcentual de descuento aplicable al total de la compra.
     * 
     * @return Valor decimal del descuento (ej: 0.15 para 15%).
     */
    public abstract double getPorcentajeDescuento();

    /**
     * Retorna la denominación descriptiva de la categoría del cliente.
     * 
     * @return Nombre de la categoría.
     */
    public abstract String getTipoCliente();

    // ==========================================
    // Getters y Setters Validados
    // ==========================================

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("El ID del cliente no puede ser nulo ni vacío.");
        }
        this.id = id.trim();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del cliente no puede estar vacío.");
        }
        this.nombre = nombre.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("El email del cliente debe tener un formato válido.");
        }
        this.email = email.trim();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return String.format("[%s] %s (%s) - %s", id, nombre, email, getTipoCliente());
    }
}
