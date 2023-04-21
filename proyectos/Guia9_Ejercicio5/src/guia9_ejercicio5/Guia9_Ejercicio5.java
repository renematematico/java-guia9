/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_ejercicio5;

import entidades.Persona;
import servicios.PersonaService;

/**
 *
 * @author crist
 */
public class Guia9_Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonaService ps = new PersonaService();
        Persona p01= ps.crearPersona();
        
        System.out.println(p01.toString());
        
        System.out.println(p01.getNombre()+" actualmente"
                + " tiene "+ps.calcularEdad(p01)+" años.");
            
        System.out.println(ps.menorQue(p01,40));
        
        ps.mostrarPersona(p01);
        
        
    }
    
   
    
}
