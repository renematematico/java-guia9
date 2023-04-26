/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author crist
 */
public class Estudiante {
    //////ATRIBUTOS
   private String nombre; 
   private double nota;
   
   ///////CONSTRUCTORES

    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public Estudiante() {
    }
   
    //////GETTERS
    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }
    
    
    ///////SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    
    
    
}
