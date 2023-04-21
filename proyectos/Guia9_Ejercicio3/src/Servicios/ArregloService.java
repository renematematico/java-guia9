/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Arrays;

/**
 *
 * @author crist
 */
public class ArregloService {
    
    public double[] inicializarA(double[] a){
        for (int i = 0; i < a.length; i++) {
            Arrays.fill(a, i,i+1,Math.random()*10);      
        }
    return a;
    }
    
    public void mostrar(double[] a){
        
    for (int i = 0; i < a.length; i++) {
        //System.out.print("[");
        System.out.println(a[i]);
        //System.out.print("]");
        }
    }
    
    public double[] ordenar(double[] a){
    Arrays.sort(a);
        return a;
    }
    
    public double[] inicializarB(double[] a, double[] b){
        for (int i = 0; i < 10; i++) {
            b[i]=a[i];      
        }
        
        Arrays.fill(b, 11,20,0.5);
        
    return b;
    }
    
}
