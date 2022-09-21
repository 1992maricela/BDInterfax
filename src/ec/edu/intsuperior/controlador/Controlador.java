/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.vista.formulario.Administrador;
import ec.edu.intsuperior.vista.formulario.Cliente;
import ec.edu.intsuperior.vista.formulario.Loggin;

/**
 *
 * @author jeffe
 */
public class Controlador {
    
    Loggin  loggin =new Loggin (this);
   Administrador administrador= new Administrador (this);
     
   
   public void showLoggin (){
   loggin.setVisible(true);
   }
   public void closeLoggin(){
         loggin.setVisible(false);
}
   public void showAdministrador(){
   administrador.setVisible(true);
   }
   public void closeAdministrador(){
   
   administrador.setVisible(false);
   }
  
   
   
}
