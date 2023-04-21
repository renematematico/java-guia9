/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author crist
 */
public class ParDeNumeros {
    ///////////ATRIBUTOS
    private double num1,num2;
    
    ////CONSTRUCTOR

    public ParDeNumeros() {
        num1 = Math.random()*10;
        num2 = Math.random()*10;
    }
    
    //////////GETTERS
    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }
    /////////SETTERS

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    
    
    
    
}
