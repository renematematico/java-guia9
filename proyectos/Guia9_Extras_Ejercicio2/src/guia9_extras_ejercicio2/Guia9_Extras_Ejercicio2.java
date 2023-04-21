/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_extras_ejercicio2;
import servicios.AhorcadoServices;
import entidades.Ahorcado;

/**
 *
 * @author crist
 */
public class Guia9_Extras_Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
        
        AhorcadoServices as= new AhorcadoServices();
        
        Ahorcado j01=as.crearJuego();
        
        saltoLinea(15);
        as.juego(j01);
        
    }
    
    public static void lineaDoble(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("=============================================");
        }
    }
    public static void lineaSimple(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("---------------------------------------------");
        }
    }
    public static void saltoLinea(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("");
        }
    }
}
