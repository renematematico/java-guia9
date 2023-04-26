/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class CadenaServicios {

    Scanner leer = new Scanner(System.in);
    Scanner leer2 = new Scanner(System.in);

    /**
     * CADENA NUEVA
     *
     * @return
     */
    public Cadena nuevaCadena() {
        System.out.println("Ingresar la frase que vamos a almacenar.");
        String frase = leer2.nextLine();
        return new Cadena(frase);
    }

    /**
     * CONTAR LETRAS
     *
     * @param cd
     */
    public void mostrarVocales(Cadena cd) {
        int contvocal = 0, ca = 0, ce = 0, ci = 0, co = 0, cu = 0;
        String letra;
        System.out.println("==================================================");
        for (int i = 0; i < cd.getLongitud(); i++) {
            letra = cd.getFrase().substring(i, i + 1);

            switch (letra) {
                case "a":
                    ca += 1;
                    break;
                case "e":
                    ce += 1;
                    break;
                case "i":
                    ci += 1;
                    break;
                case "o":
                    co += 1;
                    break;
                case "u":
                    cu += 1;
                    break;
            }

            if (letra.equals("a") || letra.equals("e") || letra.equals("i")
                    || letra.equals("o") || letra.equals("u")) {
                contvocal += 1;
            }

        }
        System.out.println("La frase tiene " + contvocal + " vocales en total.");
        System.out.println("Son a=" + ca + ", e=" + ce + ", i=" + ci + ", o=" + co + ", u=" + cu);
        System.out.println("==================================================");
    }

    /**
     * INVERTIR FRASE
     *
     * @param cd
     */
    public void invertirFrase(Cadena cd) {
        System.out.println("==================================================");
        System.out.println("FRASE INVERTIDA");
        System.out.println("---------------");
        String fraseInv = "";
        for (int i = 0; i < cd.getLongitud(); i++) {
            fraseInv += cd.getFrase().substring(cd.getLongitud() - i - 1, cd.getLongitud() - i);
        }
        System.out.println(fraseInv);
        //cd.setFrase(fraseInv);
        System.out.println("==================================================");
    }

    /**
     * VECES REPETIDO
     *
     * @param cd
     */
    public void vecesRepetido(Cadena cd) {
        System.out.println("==================================================");
        System.out.println("BUSCANDO CARACTER");
        System.out.println("-----------------");
        String letra = "", caracter = "";
        int contcaracter = 0;

        do {
            System.out.println("Ingresar el caracter a buscar");
            caracter = leer.next();
        } while (caracter.length() > 1);

        for (int i = 0; i < cd.getLongitud(); i++) {
            letra = cd.getFrase().substring(i, i + 1);

            if (letra.equals(caracter)) {
                contcaracter += 1;
            }
        }
        System.out.println("El caracter '" + caracter + "' se repite " + contcaracter + " veces.");
        System.out.println("==================================================");
    }

    /**
     * COMPARAR LONGITUD DE CADENAS
     *
     * @param cd1
     * @param cd2
     */
    public void compararLongitud(Cadena cd1, Cadena cd2) {
        interlineado(3);
        lineaDoble(1);
        System.out.println("COMPARANDO LONGITUD DE CADENAS");
        System.out.println("------------------------------");
        cd2 = nuevaCadena();
        int lcd1 = cd1.getLongitud();
        int lcd2 = cd2.getLongitud();
        if (lcd1 == lcd2) {
            System.out.println("Ambas cadenas contienen " + lcd1 + " caracteres.");
        } else {
            System.out.println("La primera cadena tiene " + lcd1 + " y la segunda " + lcd2);
        }
        lineaDoble(1);

    }

    /**
     * UNIR FRASES
     *
     * @param cd1
     * @param cd2
     */
    public void unirFrases(Cadena cd1, Cadena cd2) {
        interlineado(5);
        System.out.println("CONCATENANDO CADENAS");
        System.out.println("--------------------");
        cd2 = nuevaCadena();
        interlineado(5);
        lineaDoble(1);
        System.out.println("CONCATENANDO CADENAS");
        System.out.println("--------------------");
        System.out.println(cd1.getFrase().concat(cd2.getFrase()));
        lineaDoble(1);
    }

    /**
     * REEMPLAZAR LETRAS "A"
     *
     * @param cd
     */
    public void reemplazar(Cadena cd) {
        System.out.println("==================================================");
        String caracter = "", fraseMod = "";
        System.out.println("REEMPLAZANDO LETRAS A");
        System.out.println("---------------------");
        do {
            System.out.println("Ingresar el caracter con el cual reemplazará"
                    + "las letras 'a'");
            caracter = leer.next();
        } while (caracter.length() > 1);

        for (int i = 0; i < cd.getLongitud(); i++) {
            if (cd.getFrase().substring(i, i + 1).equalsIgnoreCase("a")) {
                fraseMod += caracter;
            } else {
                fraseMod += cd.getFrase().substring(i, i + 1);
            }
        }
        System.out.println(fraseMod);
        System.out.println("==================================================");
    }

    /**
     * BUSCA CARACTER DENTRO DE LA CADENA
     *
     * @param cd
     */
    public void contiene(Cadena cd) {
        System.out.println("==================================================");
        String caracter = "";
        boolean verifica = false;
        System.out.println("BUSCANDO CARACTER");
        System.out.println("---------------------");
        do {
            System.out.println("Ingresar el caracter que se debe buscar"
                    + "dentro de la frase");
            caracter = leer.next();
        } while (caracter.length() > 1);

        for (int i = 0; i < cd.getLongitud(); i++) {
            
            if (cd.getFrase().substring(i, i + 1).equalsIgnoreCase(caracter)) {
                verifica = true;

            }
        }

        if (verifica) {
            System.out.println("La frase CONTIENE el caracter " + caracter);
        } else {
            System.out.println("La frase NO CONTIENE el caracter " + caracter);
        }

        System.out.println("==================================================");
    }

    private void interlineado(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("");
        }
    }

    private void lineaDoble(int n) {

        for (int i = 0; i < n; i++) {
            System.out.println("==================================================");
        }
    }

}
