/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ListaMateriales;
import modelo.Materiales;
import vista.Vista1;


public class ControladorMateriales implements ActionListener {
    
    Materiales modelo;
    Vista1 vista;
    ListaMateriales lista;

    public ControladorMateriales(Materiales modelo, Vista1 vista, ListaMateriales lista) {
        this.modelo = modelo;
        this.vista = vista;
        this.lista = lista;
        this.vista.BtnAgregar.addActionListener(this);
        this.vista.btnModificar.addActionListener(this);
    }
    
    
    public void iniciar_vista(){
        vista.setTitle("lista mvc");
        vista.setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==this.vista.BtnAgregar) {
          agregarMaterial();
            
        }
        
        if (e.getSource()==this.vista.btnModificar) {
          modificarMaterial();
            
        }
        }
    
    
    public void agregarMaterial(){
    Materiales nuevo = new Materiales();
    nuevo.setNombre(String.valueOf(vista.Tfnombre.getText()));
    nuevo.setCantidad(Integer.valueOf(vista.Tfcantidad.getText()));
    lista.agregarMaterial(nuevo);
    mostrarMaterialVIsta();
    
    }
    
    public void modificarMaterial(){
    
    
    
    lista.modificarCantidadLista(String.valueOf(vista.Tfnombre.getText()),Integer.valueOf(vista.Tfcantidad.getText())); 
    
    mostrarMaterialVIsta();
        
        
    }
    
    
    
    public void mostrarMaterialVIsta(){
    String matris[][] = new String [lista.tamañoLista()][2];
        for (int  i = 0; i < lista.tamañoLista(); i++) {
           
            matris[i][0]= lista.getListaMateriales().get(i).getNombre();
            matris[i][1]=String.valueOf(lista.getListaMateriales().get(i).getCantidad());   
        }
   
    vista.actualizarTabla(matris);

    }

    
}
