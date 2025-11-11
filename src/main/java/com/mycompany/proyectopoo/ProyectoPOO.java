/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectopoo;

/**
 *
 * @author molte
 */
public class ProyectoPOO {

    public static void main(String[] args) {
        Configuracion.CConexion objetoConexion = new Configuracion.CConexion();
        objetoConexion.estableceConexion();
        
        Formularios.FrmMenuPrincipal objetoMenuPrincipal = new Formularios.FrmMenuPrincipal();
        objetoMenuPrincipal.setVisible(true);
        
        
    }
}
