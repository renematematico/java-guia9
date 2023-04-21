/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.ParDeNumeros;

/**
 *
 * @author crist
 */
public class ParDeNumerosService {
    
    public void mostrarValores(ParDeNumeros pdn){
        System.out.println("El primer valor es "+pdn.getNum1());
        System.out.println("El segundo valor es "+pdn.getNum2());
    }
    
    public double mayorValor(ParDeNumeros pn){
    return Math.max(pn.getNum1(),pn.getNum2());
    }
    
    public double calcularPotencia(ParDeNumeros pn){
    int num1 = (int)(Math.round(pn.getNum1()));
    int num2 = (int)(Math.round(pn.getNum2()));
    int mayor= Math.max(num1,num2);
    int min= Math.min(num1,num2);
    
        System.out.println("El mayor valor es "+mayor+" y el menor valor es "+min);
        System.out.println(mayor+" elevado al exponente "+min+" es:");
     
    return Math.pow(mayor,min);
    
    }
    
    /**RAIZ CUADRADA DEL MENOR
     * 
     * @param pn
     * @return 
     */
    public double calculaRaiz(ParDeNumeros pn){
    int num1 = (int)(Math.round(pn.getNum1()));
    int num2 = (int)(Math.round(pn.getNum2()));
    int min= Math.abs(Math.min(num1,num2));    
        System.out.println("Raíz cuadrada de "+min+" es:");
    double raiz=Math.sqrt(min);
    
    return raiz;
    }
    
}

