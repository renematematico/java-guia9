/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_practica1;

import java.util.Date;

/**
 *
 * @author crist
 */
public class Guia9_Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date d1=new Date();
        Date d2= new Date(14,04,23);
        
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d1.getDay());
        System.out.println(d1.getDate());
        System.out.println(d2.toString());
    }
    
}

