/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;

/**
 *
 * @author crist
 */
public class Vendedor {
    private String nombre;
    private Integer dni;
    private double sueldoBasico;
    private double comisiones;
    private double sueldoMensual;
    private Date fechaInicio;
    
    
    //////CONSTRUCTORES

    public Vendedor() {
    }

    public Vendedor(String nombre, Integer dni, double sueldoBasico, double comisiones, double sueldoMensual, Date fechaInicio) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldoBasico = sueldoBasico;
        this.comisiones = comisiones;
        this.sueldoMensual = sueldoMensual;
        this.fechaInicio = fechaInicio;
    }
    //////////// GETTERS

    public String getNombre() {
        return nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public double getComisiones() {
        return comisiones;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }
    
    /////SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public void setComisiones(double comisiones) {
        this.comisiones = comisiones;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    /////////// TO STRING

    @Override
    public String toString() {
        return "Vendedor{" + "nombre=" + nombre + ", dni=" + dni + ", sueldoBasico=" + sueldoBasico + ", comisiones=" + comisiones + ", sueldoMensual=" + sueldoMensual + ", fechaInicio=" + fechaInicio + '}';
    }
    
    
}
