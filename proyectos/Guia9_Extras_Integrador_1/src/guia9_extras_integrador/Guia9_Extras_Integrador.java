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

        es.crearEstudiante();

        interLinea(5);
        lineaDoble(1);
        System.out.println("El promedio de calificaciones es: " + es.notasPromedio());

        interLinea(5);
        lineaDoble(1);
        es.alumnosNotas();

        interLinea(5);
        lineaDoble(1);
        es.alumnosSobrePromedio();

        interLinea(5);
        lineaDoble(1);
        es.arregloAlumnosSobrePromedio();

    }

    public static void interLinea(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("");
        }
    }

    public static void lineaDoble(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("=============================================");
        }
    }

    public static void lineaSimple(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("---------------------------------------------");
        }
    }
}
