/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_modelo_integrador_video;

import Servicio.VendedorServicio;
import entidades.Vendedor;

/**
 *
 * @author crist
 */
public class Guia9_Modelo_Integrador_Video {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VendedorServicio vs = new VendedorServicio();
        
        Vendedor v1= vs.altaVendedor();
        vs.SueldoMensual(v1);
        vs.vacaciones(v1);
    }
    
}
