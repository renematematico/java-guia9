/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_extras_integrador;
import service.EstudianteService;
import entidades.Estudiante;

/**
 *
 * @author crist
 */
public class Guia9_Extras_Integrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EstudianteService es = new EstudianteService();
        
        //Creamos los elementos
        Estudiante es1=es.crearEstudiante();
        Estudiante es2=es.crearEstudiante();
        Estudiante es3=es.crearEstudiante();
        Estudiante es4=es.crearEstudiante();
        Estudiante es5=es.crearEstudiante();
        Estudiante es6=es.crearEstudiante();
        Estudiante es7=es.crearEstudiante();
        Estudiante es8=es.crearEstudiante();
       
        
       //Devuelve el promedio de notas 
       es.notasPromedio(es1,es2,es3,es4,es5,es6,es7,es8);     
       
       
       //Listado de alumnos con su nota correspondiente
       es.alumnosNotas(es1, es2, es3, es4, es5, es6, es7, es8);
        
       
       //Listado de alumnos sobre el promedio
       es.alumnosSobrePromedio(es1, es2, es3, es4, es5, es6, es7, es8);
    }
    
}
