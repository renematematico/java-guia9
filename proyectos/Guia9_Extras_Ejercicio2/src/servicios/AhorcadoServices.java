/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class AhorcadoServices {

    Scanner leer = new Scanner(System.in);
    Scanner leer2 = new Scanner(System.in);
    String aciertos[];
    String letrasUsadas[];
    

    /**
     * CREAR JUEGO
     *
     * @return
     */
    public Ahorcado crearJuego() {
        String palSecret, letra;
        String palabraSecreta[];
        int letEnc = 0, jugMax;
        System.out.println("BIENVENIDO AL JUEGO");
        System.out.println("-------------------");
        System.out.println("Ingresar la palabra secreta que se deberá adivinar.");
        palSecret = leer.nextLine();
        palabraSecreta = new String[palSecret.length()];

        for (int i = 0; i < palabraSecreta.length; i++) {
            letra = palSecret.substring(i, i + 1);
            palabraSecreta[i] = letra;
        }

        aciertos = new String[palabraSecreta.length];
        for (int i = 0; i < aciertos.length; i++) {
            aciertos[i] = "-";
        }
        
//Con esta clase lo que hacemos es llenar el arreglo con el caracter indicado.
        //Arrays.fill(aciertos,"-");
        
        System.out.println("Ingresar la cantidad máxima de intentos.");
        jugMax = leer.nextInt();
        letrasUsadas=new String[jugMax];
        
        for (int i = 0; i < letrasUsadas.length; i++) {
            letrasUsadas[i] = "-";
        }

//Con esta clase lo que hacemos es llenar el arreglo con el caracter indicado.
        //Arrays.fill(letrasUsadas,"-");

        while (jugMax < palSecret.length()) {
            lineaSimple(1);
            System.out.println("Ingresaste " + jugMax + " intentos máximos.");
            System.out.println("La palabra secreta tiene " + palSecret.length()
                    + " caracteres");
            lineaSimple(1);
            System.out.println("Ingresa una cantidad igual o"
                    + " superior a " + palSecret.length());
            jugMax = leer.nextInt();
        }
        return new Ahorcado(palabraSecreta, letEnc, jugMax, aciertos);
    }

    /**
     * BUSCAR LETRA
     *
     * @param p
     */
    private void buscar(Ahorcado p) {
        lineaDoble(1);
        String l = "";
        boolean pertenece = false, usado = false;
        System.out.println("Tienes " + p.getJugadasMax() + " intentos totales.");

        do {
            do {
                System.out.println("Ingresar la letra a buscar");
            l = leer2.nextLine();
            } while (l.length()>1);
            
            for (int i = 0; i < letrasUsadas.length; i++) {
                if (l.equalsIgnoreCase(letrasUsadas[i])) {
                    lineaSimple(1);
                    System.out.println("LA LETRA INGRESADA YA FUE USADA");
                    lineaSimple(1);
                    usado = true;
                    break;
                } else {
                  
                    usado = false;
                }
            }
//          

        } while (usado == true);

        System.out.println("La longitud de la palabra secreta es: " + longitud(p));

        

        
        
        for (int i = 0; i < p.getPalabraSecreta().length; i++) {
            if (l.equalsIgnoreCase(p.getPalabraSecreta()[i])) {
                pertenece = true;
                aciertos[i] = l;
                p.setLetrasEncontradas(p.getLetrasEncontradas() + 1);
            }
        }
        letrasUsadas[p.getJugadasMax()-1]=l;
        if (pertenece) {
            System.out.println("La letra PERTENECE a la palabra secreta");

        } else {
            System.out.println("La letra NO PERTENECE a la palabra secreta");
        }
        p.setJugadasMax(p.getJugadasMax() -1);

    }

    /**
     * INTENTOS RESTANTES
     *
     * @param j
     */
    private void intentos(Ahorcado j) {
        System.out.println("Número de oportunidades restantes " + j.getJugadasMax());
    }

    /**
     * LONGITUD DE PALABRA
     *
     * @param ps
     * @return
     */
    private int longitud(Ahorcado ps) {
        int longitud = ps.getPalabraSecreta().length;

        return longitud;
    }

    /**
     * LLAMADO AL JUEGO
     *
     * @param p
     */
    public void juego(Ahorcado p) {
        lineaDoble(1);
        do {
            buscar(p);
            intentos(p);
            System.out.println("Número de letras (encontradas = " + p.getLetrasEncontradas()
                    + ", faltantes = " + (longitud(p) - p.getLetrasEncontradas()));
            System.out.println("Número de oportunidades restantes = " + p.getJugadasMax());
            for (int j = 0; j < p.getAciertos().length; j++) {
                System.out.print("[");
                System.out.print(p.getAciertos()[j]);
                System.out.print("]");
            }
            saltoLinea(1);
            
            for (int k = 0; k < letrasUsadas.length; k++) {
                System.out.print("[");
                System.out.print(letrasUsadas[k]);
                System.out.print("]");
            }
            System.out.println("");
            System.out.println(p.getLetrasEncontradas() + " y " + longitud(p));
        } while (p.getJugadasMax() > 0 && (p.getLetrasEncontradas() < longitud(p)));

        if ((p.getLetrasEncontradas() == longitud(p))) {
            lineaDoble(1);
            System.out.println("¡¡¡GANASTE!!!");
            System.out.println("¡LOGRASTE COMPLETAR LA PALABRA SECRETA!");
            lineaDoble(1);
        }
        if(p.getJugadasMax()==0 && p.getLetrasEncontradas() != longitud(p)){
        lineaDoble(1);
            System.out.println("¡¡¡PERDISTE!!!");
            System.out.println("¡AGOSTASTE LOS INTENTOS DISPONIBLES!");
            lineaDoble(1);
        }

    }

    private void saltoLinea(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("");
        }
    }

    private void lineaSimple(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("---------------------------------------------");
        }
    }

    private void lineaDoble(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("=============================================");
        }
    }
}
