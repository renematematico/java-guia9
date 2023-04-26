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

    Estudiante[] planilla = new Estudiante[8];
    Estudiante[] planilla2;
    Scanner leer = new Scanner(System.in);
    Scanner leer2 = new Scanner(System.in);

    public void crearEstudiante() {

        for (int i = 0; i < planilla.length; i++) {
            System.out.println("Ingresar nombre de alumno.");
            String nombre = leer.nextLine();
            float nota = (float) (Math.random() * 10);
            planilla[i] = new Estudiante(nombre, nota);
        }
    }

    /**
     * CREAMOS UNA LISTA CON LOS OBJETOS Y LUEGO CALCULAMOS EL PROMEDIO
     *
     * @return promedio de notas
     */
    public float notasPromedio() {

        float sumaNotas = 0;
        /*estructura de for each, es un for mejorado que permite recorrer el
        vector de principio a fin*/
        for (Estudiante estudiante : planilla) {
            sumaNotas += estudiante.getNota();
        }

        float promedio = sumaNotas / planilla.length;

        //System.out.println("El promedio de notas del curso es: " + promedio);
        //System.out.println(planilla[0].getNombre());
        return promedio;
    }

    public void alumnosNotas() {
        System.out.println("LISTADO DE ALUMNOS Y NOTAS");
        //For each - es el for mejorado
        for (Estudiante estudiante : planilla) {
            System.out.println(estudiante.getNombre() + " - " + estudiante.getNota());
        }

//        for (int i = 0; i < planilla.length; i++) {
//            System.out.println(planilla[i].getNombre() + " - " + planilla[i].getNota());
//        }
    }

    public void alumnosSobrePromedio() {
        System.out.println("ALUMNOS SOBRE EL PROMEDIO");

        for (Estudiante estudiante : planilla) {
            if (estudiante.getNota() > notasPromedio()) {
                System.out.println(estudiante.getNombre() + " - " + estudiante.getNota());
            }

        }

    }

    public void arregloAlumnosSobrePromedio() {
        int cont = 0, j = 0;

        for (Estudiante est : planilla) {
            if (est.getNota() > notasPromedio()) {
                cont += 1;
            }
        }
        planilla2 = new Estudiante[cont];

        for (int i = 0; i < planilla.length; i++) {
            if (planilla[i].getNota() > notasPromedio()) {
                planilla2[j] = planilla[i];
                j += 1;
            }
        }
        System.out.println("ALUMNOS SOBRE EL PROMEDIO - ARREGLO EXCLUSIVO");

        for (Estudiante est : planilla2) {
            System.out.println(est.getNombre()+" - "+est.getNota());
            }
        }
    }

