/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alugar;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class dados {

    
    private String Titulo;
    private String Categoria;
    private boolean Disponivel=true; 
    
    
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }
 
    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public boolean getDisponivel() {
        return Disponivel;
    }

  
       public void status(){
        JOptionPane.showMessageDialog (null, "Titulo: " +this.getTitulo());
        JOptionPane.showMessageDialog (null, "Titulo: " +this.getCategoria());
           if (Disponivel=true){
             JOptionPane.showMessageDialog (null, "O filme estar disponivel ");
           }
          
    }
   
}
