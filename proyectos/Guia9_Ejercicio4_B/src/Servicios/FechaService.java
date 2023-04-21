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
    /**FECHA DE NACIMIENTO
     * 
     * @return 
     */ 
    public Date fechaNacimiento(){
        Scanner leer = new Scanner(System.in);
        System.out.println("FECHA DE NACIMIENTO");
        System.out.println("-------------------");
        System.out.println("");
        System.out.println("Indicar día");
        int dia=leer.nextInt();
        System.out.println("Indicar mes");
        int mes=leer.nextInt()-1;
        System.out.println("Indicar año");
        int anio=leer.nextInt()-1900;
        
        return new Date(anio, mes, dia);
    }
     
     /**FECHA ACTUAL
      * 
      * @return 
      */
     public Date fechaActual(){
     
     return new Date();
     }
     
     /**EDAD QUE CUMPLIRÁS ESTE AÑO
      * 
      * @param f1
      * @param f2
      * @return 
      */
     public int diferencia(Date f1,Date f2){
     int anio1=f1.getYear();
     int anio2=f2.getYear();
     int diferencia=anio2-anio1;
         
     return diferencia;
     }
     
     
}
