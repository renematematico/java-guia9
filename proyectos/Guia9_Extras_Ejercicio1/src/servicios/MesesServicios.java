/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Meses;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class MesesServicios {

    Scanner leer = new Scanner(System.in);

    public void adivinarMes(Meses m) {
        String intento;

        System.out.println("Introduzca el nombre del mes.");
        intento = leer.nextLine();

        while (!(intento.equalsIgnoreCase(m.getMesSecreto()))) {
            lineaSimple(1);
            System.out.println("¡¡¡NO ACERTASTE!!!");
            System.out.println("Intená nuevamente.");
            intento = leer.nextLine();
            lineaSimple(1);

        }

        if (intento.equalsIgnoreCase(m.getMesSecreto())) {
            lineaDoble(2);
            System.out.println("¡¡¡ACERTASTE!!!");
            System.out.println("El mes oculto es " + m.getMesSecreto());
            lineaDoble(2);
        }

    }

    private void lineaDoble(int n) {
        System.out.println("=================================================");
    }

    private void lineaSimple(int n) {
        System.out.println("-------------------------------------------------");
    }

}
