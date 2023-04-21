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
public class Ahorcado {
    //////ATRIBUTOS
    private String[] palabraSecreta;
    private int letrasEncontradas;
    private int jugadasMax;
    private String[] aciertos;
    
    
    /////////CONSTRUCTORES

    public Ahorcado() {
    }

  
    public Ahorcado(String[] palabraSecreta, int letrasEncontradas, int jugadasMax, String[] aciertos) {
        this.palabraSecreta = palabraSecreta;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasMax = jugadasMax;
        this.aciertos = aciertos;
    }
    
    
    ////////GETTERS

    public String[] getPalabraSecreta() {
        return palabraSecreta;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public int getJugadasMax() {
        return jugadasMax;
    }

    public String[] getAciertos() {
        return aciertos;
    }
    
   
    
    ////////SETTERS

    public void setPalabraSecreta(String[] palabraSecreta) {
        this.palabraSecreta = palabraSecreta;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }

    public void setAciertos(String[] aciertos) {
        this.aciertos = aciertos;
    }
    
    
    
    
}
