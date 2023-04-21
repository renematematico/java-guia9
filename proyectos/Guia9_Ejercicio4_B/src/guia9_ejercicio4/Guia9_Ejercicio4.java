/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_ejercicio4;

import Servicios.FechaService;
import java.util.Date;

/**
 *
 * @author crist
 */
public class Guia9_Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FechaService fs = new FechaService();
        
        Date f01=fs.fechaNacimiento();
        
        System.out.println(f01);
        
        Date f02=fs.fechaActual();
        
        System.out.println(f02);
        
        System.out.println(fs.diferencia(f01,f02));
    }
    
}
