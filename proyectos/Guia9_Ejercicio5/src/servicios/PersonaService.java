/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;
import entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class PersonaService {
    Scanner leer = new Scanner(System.in);
    
    /**CREA PERSONA
     * 
     * @return 
     */
    public Persona crearPersona(){
        System.out.println("Ingresar su nombre.");    
    String nombre=leer.next();
    
        System.out.println("Hola "+nombre+", ingresá tu fecha de nacimiento.");
        System.out.println("Primero indicanos el día.");
    int dia=leer.nextInt();
    System.out.println("Ahora el mes.");
    int mes=leer.nextInt()-1;
    System.out.println("Por último ingresá el año de nacimiento.");
    int anio=leer.nextInt()-1900;
      
    Date fechaNac=new Date(anio, mes, dia);    
    
    return new Persona(nombre, fechaNac);
    }
    
    
    /**CALCULA EDAD
     * 
     * @param p
     * @return 
     */
    public int calcularEdad(Persona p){
    int edad;
    p.getFechaNac();
    Date fechaActual=new Date();
    int dia=fechaActual.getDay()-p.getFechaNac().getDay();
    int mes=fechaActual.getMonth()-p.getFechaNac().getMonth();
    int anio=fechaActual.getYear()-p.getFechaNac().getYear();
    
    Date f01=new Date(anio,mes,dia);
    edad= f01.getYear();
    
    return edad;
    }
    
    public boolean menorQue(Persona p1, int edad){
    
    int edadp = calcularEdad(p1); 
    if(edadp<edad){        
    return true;
    }else{
    return false;
    }    
    }
    
    public void mostrarPersona(Persona p){
        System.out.println("La persona agendada es:");
        System.out.println("Nombre: "+p.getNombre());
        System.out.println("Fecha de Nacimiento: "+p.getFechaNac());
        System.out.println("Edad: "+calcularEdad(p));
    
    
    }
    
}
