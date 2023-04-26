/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidades.Estudiante;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class EstudianteService {

    Scanner leer = new Scanner(System.in);
    Scanner leer2 = new Scanner(System.in);

    public Estudiante crearEstudiante() {
        System.out.println("Ingresar nombre de alumno.");
        String nombre = leer.nextLine();
        //System.out.println("Ingresar nombre de alumno.");
        float nota = (float) (Math.random() * 10);

        return new Estudiante(nombre, nota);
    }

    
    
    /**CREAMOS UNA LISTA CON LOS OBJETOS Y LUEGO CALCULAMOS EL PROMEDIO
     * 
     * @param e1
     * @param e2
     * @param e3
     * @param e4
     * @param e5
     * @param e6
     * @param e7
     * @param e8 
     */
    public float notasPromedio(Estudiante e1, Estudiante e2, Estudiante e3,
            Estudiante e4, Estudiante e5, Estudiante e6, Estudiante e7,
            Estudiante e8) {

        float sumaNotas = 0;

        Estudiante[] planilla = new Estudiante[8];

        planilla[0] = e1;
        planilla[1] = e2;
        planilla[2] = e3;
        planilla[3] = e4;
        planilla[4] = e5;
        planilla[5] = e6;
        planilla[6] = e7;
        planilla[7] = e8;

        /*estructura de for each, es un for mejorado que permite recorrer el
        vector de principio a fin*/
                        
//        for (Estudiante estudiante : planilla) {
//            sumaNotas += estudiante.getNota();
//        }
        for (int i = 0; i < planilla.length; i++) {
            sumaNotas+=planilla[i].getNota();
        }

        float promedio = sumaNotas / planilla.length;        

        return promedio;
    }

    
    
    public void alumnosNotas(Estudiante e1, Estudiante e2, Estudiante e3,
            Estudiante e4, Estudiante e5, Estudiante e6, Estudiante e7,
            Estudiante e8){
    
     Estudiante[] planilla = new Estudiante[8];

        planilla[0] = e1;
        planilla[1] = e2;
        planilla[2] = e3;
        planilla[3] = e4;
        planilla[4] = e5;
        planilla[5] = e6;
        planilla[6] = e7;
        planilla[7] = e8;
    
        for (int i = 0; i < planilla.length; i++) {
            System.out.println(planilla[i].getNombre()+" - "+planilla[i].getNota());
        }
        
    
    }
    
      public void alumnosSobrePromedio(Estudiante e1, Estudiante e2, Estudiante e3,
            Estudiante e4, Estudiante e5, Estudiante e6, Estudiante e7,
            Estudiante e8){
    
     Estudiante[] planilla = new Estudiante[8];

        planilla[0] = e1;
        planilla[1] = e2;
        planilla[2] = e3;
        planilla[3] = e4;
        planilla[4] = e5;
        planilla[5] = e6;
        planilla[6] = e7;
        planilla[7] = e8;
    
        for (int i = 0; i < planilla.length; i++) {
            if(planilla[i].getNota()>notasPromedio(e1,e2,e3,e4,e5,e6,e7,e8)){
            System.out.println(planilla[i].getNombre()+" - "+planilla[i].getNota());
            }
        }
        
    
    }
    
}
