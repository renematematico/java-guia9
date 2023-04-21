/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_ejercicio6;

import entidades.Curso;
import servicios.CursoService;

/**
 *
 * @author crist
 */
public class Guia9_Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CursoService cs = new CursoService();
        dobleLinea(1);
        System.out.println("CREAR CURSO");
        Curso c01 = cs.crearCurso();
        dobleLinea(1);
        System.out.println("CARGA DE ALUMNOS");
        cs.cargarAlumnos(c01);

        System.out.println("Las ganancias semanales son: $"+cs.calcularGananciaSemana(c01));
        

    }

    public static void dobleLinea(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("==============================================");
        }
    }

    public static void interlineado(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("");
        }
    }

}
