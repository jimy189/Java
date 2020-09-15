/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemlivro2;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class livro {
    private String Titulo;
    private String autor;
    private int TotPags;
    private int PágAtual;
    private boolean aberto;
    private String leitor;

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
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

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public String getLeitor() {
        return leitor;
    }

    public void setLeitor(String leitor) {
        this.leitor = leitor;
    }

    public int getPágAtual() {
        return PágAtual;
    }

    public void setPágAtual(int PágAtual) {
        this.PágAtual = PágAtual;
    }
    
    public void Detalhes(){
    
    JOptionPane.showMessageDialog(null,"Titulo: "+ this.getTitulo());
    JOptionPane.showMessageDialog(null,"Autor: "+ this.getAutor());
    JOptionPane.showMessageDialog(null,"Total de Páginas: "+ this.getTotPags());
    if(this.isAberto()==false){
    JOptionPane.showMessageDialog(null,"O livro esta fechado");
    }
    else{
    JOptionPane.showMessageDialog(null,"O livro esta Aberto");
    }
    }
    
}
