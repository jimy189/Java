/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banquinho;

import javax.swing.JOptionPane;


/**
 *
 * @author Admin
 */
public class classe{
     public double conta;
     public double agencia;
     public float saldo;
     public String nome;
     
     

  
    
    public void consultar(float saldo){
       
        JOptionPane.showMessageDialog(null,"Seu saldo é: " +saldo);
    }
    
     public void sacar(float y, float saldo){
       
        JOptionPane.showMessageDialog(null,"Seu saldo é: " +saldo);
        y=Float.parseFloat(JOptionPane.showInputDialog("Retirar dinheiro da conta"));
        saldo -= y;
    }
     
     public void depositar(float i,float saldo){
       
        JOptionPane.showMessageDialog(null,"Seu saldo é: " +saldo);
        i=Float.parseFloat(JOptionPane.showInputDialog("Coloque em dinheiro da conta"));
        saldo += i;
    
       
    }
     public void transferir(float z, classe conta2){
       if (z >= saldo){
       }
        JOptionPane.showMessageDialog(null,"Seu saldo é: " +saldo);
        z=Float.parseFloat(JOptionPane.showInputDialog("Retirar dinheiro da conta"));
        saldo -= z;
        conta2 += z;
        
       

     }

   


}