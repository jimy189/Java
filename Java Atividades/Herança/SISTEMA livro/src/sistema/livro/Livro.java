/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.livro;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Livro extends Publicação {
     private String titulo;
     private String autor;
     private int TotPags;
     private int pagAtual;
     private boolean aberto;

 

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPags() {
        return TotPags;
    }

    public void setTotPags(int TotPags) {
        this.TotPags = TotPags;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Livro(String titulo, String autor, int TotPags, boolean aberto) {
        this.titulo = titulo;
        this.autor = autor;
        this.TotPags = TotPags;
        this.aberto = aberto;
    }

    public void Detalhes() {
      JOptionPane.showInternalMessageDialog(null,"Titulo: "+ this.getTitulo()); 
      JOptionPane.showInternalMessageDialog(null, "Autor:"+ this.getAutor());
      JOptionPane.showInternalMessageDialog(null,"Total Páginas:"+ this.getTotPags());
      JOptionPane.showInternalMessageDialog(null,"Página Atual:"+ this.getPagAtual());
      JOptionPane.showInternalMessageDialog(null,"Aberto: "+ this.aberto);
      
    }
     
     
     
 
     
     
}


