/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasimplemvc;

import modelo.Materiales;
import modelo.ListaMateriales;
import vista.Vista1;

import controlador.ControladorMateriales;
import java.util.ArrayList;

public class ListaSimpleMvc {

    
    public static void main(String[] args) {
        
        
    ListaMateriales lista = new ListaMateriales(); 
    
    
    Materiales modelo = new Materiales();
    Vista1 vista = new Vista1();
    ControladorMateriales controlador = new ControladorMateriales(modelo, vista, lista);
    
    
    controlador.iniciar_vista();
    vista.setVisible(true);
    
        
    }
    
}
