package com.supermercado.model.actor;

import java.util.Objects;

/**
 * Modela al personal del supermercado responsable de operar el punto de venta (caja o supervisión).
 * 
 * @author Docente Prácticas Profesionalizantes
 * @version 1.0
 */
public class Empleado {

    private String id;
    private String nombre;
    private String puesto;
    private double salario;

    /**
     * Constructor de la entidad Empleado con validaciones de integridad.
     * 
     * @param id Identificador de legajo del empleado.
     * @param nombre Nombre y apellido.
     * @param puesto Cargo u ocupación (ej. Cajero, Encargado, Repositor).
     * @param salario Salario mensual asignado.
     */
    public Empleado(String id, String nombre, String puesto, double salario) {
        setId(id);
        setNombre(nombre);
        setPuesto(puesto);
        setSalario(salario);
    }

    // ==========================================
    // Getters y Setters Validados
    // ==========================================

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("El legajo del empleado no puede ser nulo ni vacío.");
        }
        this.id = id.trim();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del empleado no puede estar vacío.");
        }
        this.nombre = nombre.trim();
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        if (puesto == null || puesto.trim().isEmpty()) {
            this.puesto = "Cajero General";
        } else {
            this.puesto = puesto.trim();
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException("El salario del empleado no puede ser negativo.");
        }
        this.salario = salario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Objects.equals(id, empleado.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return String.format("[Legajo: %s] %s | Puesto: %s | Salario: $%.2f",
                id, nombre, puesto, salario);
    }
}
