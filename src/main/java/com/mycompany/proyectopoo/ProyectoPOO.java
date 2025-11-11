
package com.mycompany.proyectopoo;

public class ProyectoPOO {

    public static void main(String[] args) {
        Configuracion.CConexion objetoConexion = new Configuracion.CConexion();
        objetoConexion.estableceConexion();
        
        Formularios.FrmMenuPrincipal objetoMenuPrincipal = new Formularios.FrmMenuPrincipal();
        objetoMenuPrincipal.setVisible(true);
        
        
    }
}
