/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author sring
 */
public class ListaMateriales {
    ArrayList<Materiales> listaMateriales = new ArrayList();
    
    
 
    
    
    public void agregarMaterial(Materiales material){
      int si;
        si=verificarNombre(material.getNombre());
        if(si==0){
        listaMateriales.add(material);
        }
        else{
         JOptionPane.showMessageDialog(null, "El nombre ya se encuentra");
        }
        
        
            
    }
    

    public void borrarMateriales(){
        listaMateriales.clear();
    }
    
    public int tamañoLista(){
    int tamaño;
    tamaño = this.listaMateriales.size(); 
    return tamaño;
    }

    public ArrayList<Materiales> getListaMateriales() {
        return listaMateriales;
    }

    public void setListaMateriales(ArrayList<Materiales> listaMateriales) {
        this.listaMateriales = listaMateriales;
    }
    
   public void mostrarMateriales(){
       
   }
       
   public void modificarCantidadLista(String Nombre, int cantidadNueva){
int si;
        si=verificarNombre(Nombre);
        if(si==1){
       for (int i = 0; i < this.tamañoLista(); i++) {
                 
           if(this.listaMateriales.get(i).getNombre().equals(Nombre)){     
           this.listaMateriales.get(i).setCantidad(cantidadNueva);
           }
           
    
       }
       }
        else{
         JOptionPane.showMessageDialog(null, "El nombre no se encuentra");
        }
   }
   
   public int verificarNombre(String nombre){
    int esta = 0;
       
    for (int i = 0; i < this.tamañoLista(); i++) {          
           if(this.listaMateriales.get(i).getNombre().equals(nombre)){     
           
               esta=1;
           
           }
           
           
       }
    
       
       return esta;
   }
       
       
   
}
