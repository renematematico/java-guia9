/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_ejercicio2;

import Servicios.ParDeNumerosService;
import Entidades.ParDeNumeros;

/**
 *
 * @author crist
 */
public class Guia9_Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        ParDeNumerosService pdns = new ParDeNumerosService();
        ParDeNumeros p01 = new ParDeNumeros();
        lineaDoble(1);
        System.out.println("LOS VALORES GENERADOS SON:");        
        pdns.mostrarValores(p01);
        lineaDoble(1);
        System.out.println("EL MAYOR DE LOS NÚMEROS ES");
        System.out.println(pdns.mayorValor(p01));
        lineaDoble(1);
        System.out.println("LA POTENCIA DEL MAYOR ELEVADO AL MENOR");
        System.out.println(pdns.calcularPotencia(p01));
        lineaDoble(1);
        System.out.println("CALCULA RAÍZ DEL MENOR");        
        System.out.println(pdns.calculaRaiz(p01));
        lineaDoble(1);

    }
    public static void lineaDoble(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("==============================================");
        }
    }
    public static void interLinea(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("");
        }
    }

}
