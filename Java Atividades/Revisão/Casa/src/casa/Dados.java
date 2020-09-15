/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Dados {
 private  String cor;
private String sexo;
private int numero; 
private int Qtp; 
private boolean Aberta=true;    

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getQtp() {
        return Qtp;
    }

    public void setQtp(int Qtp) {
        this.Qtp = Qtp;
    }

    public boolean isAberta() {
        return Aberta;
    }

    public void setAberta(boolean Aberta) {
        this.Aberta = Aberta;
    }
    
    public void Abricasa(){
    if (this.Aberta == false){
            this.Aberta = true;
            JOptionPane.showMessageDialog(null,"A casa está aberta.");
        }else{
            JOptionPane.showMessageDialog(null, "A casa já está aberta.");
        }    
    }
    
    public void FecharCasa(){
           if (this.Aberta == true){
            this.Aberta = false;
            JOptionPane.showMessageDialog(null,"A casa foi fechada!");
        }else{
            JOptionPane.showMessageDialog(null, "A casa já está fechada!.");
        } 
    }
     public void EntrarCasa(){
            if (this.Aberta == false){
            JOptionPane.showMessageDialog(null,"A casa está fechada.");
        }else{
            JOptionPane.showMessageDialog(null, "A casa já está aberta, Bem vindo!.");
        } 
    }
     public void PintarCasa(){
     this.setCor(JOptionPane.showInputDialog("Digite a cor da Casa"));
    }
      public void AddPortas(int soma, int addp){
    addp=Integer.parseInt(JOptionPane.showInputDialog("Digite quantas portas pode adicionar"));
    soma=addp+this.getQtp();
    }
      
     public void Status(){
        JOptionPane.showMessageDialog (null, "A cor da casa é: " +this.getCor());
        JOptionPane.showMessageDialog (null, "O numero da casa é: " +this.getNumero());
        JOptionPane.showMessageDialog (null, "A quantidade de portas é: " +this.getQtp());
        JOptionPane.showMessageDialog (null, "A casa esta aberta?: " +this.isAberta());
     }
     
     public void Rgistro(){
     this.setCor(JOptionPane.showInputDialog("Digite a cor da casa"));
     this.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da casa:")));
     this.setQtp(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Portas da Casa:")));
     }
}
