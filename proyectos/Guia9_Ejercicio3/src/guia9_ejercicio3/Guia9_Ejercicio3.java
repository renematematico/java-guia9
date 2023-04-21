/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_ejercicio3;

import Servicios.ArregloService;
/**
 *
 * @author crist
 */
public class Guia9_Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] arregloA=new double[50];
        double[] arregloB=new double[20];
        
        ArregloService as =new ArregloService();
        
        as.inicializarA(arregloA);
        as.mostrar(arregloA);
        lineaDoble(1);
        as.ordenar(arregloA);
        
        as.mostrar(arregloA);
        lineaDoble(1);
        as.inicializarB(arregloA, arregloB);
        as.mostrar(arregloB);
        
        
        
        
        
    }
    public static void lineaDoble(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("================================================");
            
        }
    }
}
