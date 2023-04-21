/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author crist
 */
public class Meses {
 /////ATRIBUTOS
    private String[] mes={"enero","febrero","marzo","abril","mayo","junio"
    ,"julio","agosto","septiembre","octubre","noviembre","diciembre"};
    private String mesSecreto=mes[(int)(Math.random()*12)];
    
    ////////CONSTRUCTORES

    public Meses() {
    }
    ///////////GETTERS

    public String[] getMes() {
        return mes;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }
    ////////SETTERS

    public void setMes(String[] mes) {
        this.mes = mes;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
    
    
    
}
