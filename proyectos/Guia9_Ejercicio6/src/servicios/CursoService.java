/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class CursoService {

    Scanner leer = new Scanner(System.in);
    Scanner leer2 = new Scanner(System.in);

    /**
     * CREAR CURSO
     *
     * @return
     */
    public Curso crearCurso() {
        int opc = 0;
        String turno;
        System.out.println("Ingresar el nombre del curso");
        String nombreCurso = leer.next();
        System.out.println("Ingresar las horas por día que funcionará");
        int horasPorDia = leer.nextInt();
        System.out.println("Ingresar los días por semana que funcionará el curso");
        int diasPorSemana = leer.nextInt();
        do {
            System.out.println("Indicar si el turno será ");
            System.out.println("(1)- MAÑANA");
            System.out.println("(2)- TARDE");
            opc = leer.nextInt();
        } while (opc > 2 || opc < 1);
        if (opc == 1) {
            turno = "MAÑANA";
        } else {
            turno = "TARDE";
        }
        System.out.println("Ingresar el monto a cobrar por hora.");
        double precioPorHora = leer.nextDouble();

        return new Curso(nombreCurso, horasPorDia, diasPorSemana, turno, precioPorHora);
    }

    /**
     * CARGAR ALUMNOS
     *
     * @param c
     */
    public void cargarAlumnos(Curso c) {
        /*DEBEMOS CREAR UN VECTOR donde se guardará la infomración
        de manera inicial*/
        String[] alumnos = new String[5];

        System.out.println("Cargar alumnos al curso.");

        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Nombre de alumno Nº" + (i + 1));
            alumnos[i] = leer2.nextLine(); //Guardamos en el vector
            
        //Finalmente pasamos la información del vector al objeto.
        }
        c.setAlumnos(alumnos);

    }
    
    /**CALCULO DE GANANCIAS
     * 
     * @param c
     * @return 
     */
    public double calcularGananciaSemana(Curso c){
        double ganancia=c.getCantidadHorasPorDia()*c.getCantidadDiasPorSemana()*c.getPrecioPorHora()*5;
        
    return ganancia;
    }

}
