/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class FechaService {
    
    public Date fechaNacimiento(){
        Scanner leer = new Scanner(System.in);
        System.out.println("FECHA DE NACIMIENTO");
        System.out.println("-------------------");
        System.out.println("");
        System.out.println("Indicar día");
        int dia=leer.nextInt();
        System.out.println("Indicar mes");
        int mes=leer.nextInt();
        System.out.println("Indicar año");
        int anio=leer.nextInt();
        
        return new Date(anio, mes, dia);
    }
    
}
