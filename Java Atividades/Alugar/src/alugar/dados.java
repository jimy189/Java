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
    private  boolean Disponivel=false; 
    
    
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }
    
     public boolean isDisponivel() {
        return Disponivel;
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
                if (this.Disponivel == true)
        {
            JOptionPane.showMessageDialog(null, "Filme disponível");
        }
                else{
                JOptionPane.showMessageDialog(null, "Filme indisponível");
       }
         
          
    }
       
       public void alocar(){
       
            if (this.Disponivel == true)
        {
            this.Disponivel = false;
            JOptionPane.showMessageDialog(null, "Filme alocado");
        }
                else{
                JOptionPane.showMessageDialog(null, "Filme indisponível");
       }

       }
       
              public void devolver(){
       
            if (this.Disponivel == false)
        {
            this.Disponivel = true;
            JOptionPane.showMessageDialog(null, "Filme devolvido");
        }
                else{
                JOptionPane.showMessageDialog(null, "Filme indisponível");
       }

       }
   
}
