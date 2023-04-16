/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author crist
 */
public class Cadena {

    ////////ATRIBUTOS
    private String frase;
    private int longitud;

    ////CONSTRUCTOR
    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }
/////////GETTERS

    public String getFrase() {
        return frase;
    }

    public int getLongitud() {
        return longitud;
    }

    ///////SETTERS
    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
///////////TOSTRING

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longitud=" + longitud + '}';
    }
    
}
