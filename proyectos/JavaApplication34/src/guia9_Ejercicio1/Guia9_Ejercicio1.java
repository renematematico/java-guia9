/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_Ejercicio1;

import Servicios.CadenaServicios;
import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Guia9_Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean menu = true;
        int opc;
        Scanner leer = new Scanner(System.in);
        CadenaServicios cs = new CadenaServicios();

        Cadena c01 = cs.nuevaCadena();

        System.out.println(c01.toString());

        do {
            System.out.println("MENU DE ACCIONES");
            System.out.println("------------------------");
            System.out.println("(1) - MOSTRAR VOCALES");
            System.out.println("(2) - INVERTIR FRASE");
            System.out.println("(3) - CARACTER REPETIDO");
            System.out.println("(4) - COMPARAR LONGITUD");
            System.out.println("(5) - UNIR FRASES");
            System.out.println("(6) - REEMPLAZAR CARACTER");
            System.out.println("(7) - CONTIENE CARACTER");
            System.out.println("(0) - SALIR");
            System.out.println("------------------------");
            System.out.println("Ingresar una opción para continuar.");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    saltarLineas(3);
                    cs.mostrarVocales(c01);
                    break;
                case 2:
                    saltarLineas(3);
                    cs.invertirFrase(c01);
                    break;
                case 3:
                    saltarLineas(3);
                    cs.vecesRepetido(c01);
                    break;
                case 4:
                    saltarLineas(3);
                    Cadena c02 = new Cadena();
                    cs.compararLongitud(c01, c02);
                    break;
                case 5:
                    Cadena c03 = new Cadena();
                    cs.unirFrases(c01, c03);
                    break;
                case 6:
                    saltarLineas(3);
                    cs.reemplazar(c01);
                    break;
                case 7:
                    saltarLineas(3);
                    cs.contiene(c01);
                    break;
                case 0: 
                    
                    menu=false;
                    break;

            }

        } while (menu == true);
System.out.println("==================");
System.out.println("PROGRAMA TERMINADO");
System.out.println("==================");
    }

    public static void saltarLineas(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("");
        }
    }
}
