/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_extras_ejercicio1;

import entidades.Meses;
import servicios.MesesServicios;

/**
 *
 * @author crist
 */
public class Guia9_Extras_Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MesesServicios ms=new MesesServicios();
        Meses m1=new Meses();
        
        ms.adivinarMes(m1);
                
        System.out.println(m1.getMesSecreto().toUpperCase());
    }
    
}
