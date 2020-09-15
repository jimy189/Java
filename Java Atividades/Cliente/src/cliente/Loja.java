/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Loja {
    
    private String nome;
    private int idade;
    private double valorCompra;
    
    
    
    
    
    public void status (){
        JOptionPane.showMessageDialog (null, "Nome: " +this.getnome());
        JOptionPane.showMessageDialog (null, "Idade:" +this.getIdade());
        JOptionPane.showMessageDialog (null, "Valor da Compra: R$" +this.valorCompra);
}
    
   
    public void mariodadade(){
        if(idade>=18){
         JOptionPane.showMessageDialog(null,"Você é de maior, sua idade é: "+this.getIdade()); 
         valorCompra=valorCompra-(valorCompra*10)/100;
    JOptionPane.showMessageDialog(null,"Você tem direito ao desconto de 10%, o preço ficou: "+this.getvalorcompra()); 
        }
        else{
                 JOptionPane.showMessageDialog(null,"Você é de menor,não terá desconto, sua idade é: "+this.getIdade()); 

        }
    }
    
   
    public String getnome() {
       
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        
        return idade;
  
    }

    public void setIdade(int idade) {
          
         this.idade = idade; 
         
    }

    public double getvalorcompra() {
        return valorCompra;
    }

    public void setvalorcompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }
    
    
}