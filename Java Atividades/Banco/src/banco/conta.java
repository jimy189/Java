/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class conta {
     public double conta;
     public double agencia;
     public float saldo;
     public String nome;
    
     
      public void consultar(){
       
        JOptionPane.showMessageDialog(null,"Seu saldo é: " +saldo);
    }
    
      
       public void sacar(float retirar){
       
        
        retirar=Float.parseFloat(JOptionPane.showInputDialog("Retirar dinheiro da conta"));
        saldo -= retirar;
        JOptionPane.showMessageDialog(null,"Seu saldo é: " +saldo);
    }
    
      public void depositar(float ad){
       
        
        ad=Float.parseFloat(JOptionPane.showInputDialog("Digete o valor que irar depositar na conta"));
        saldo += ad;
        JOptionPane.showMessageDialog(null,"O seu saldo é: " +saldo);
       
    }
      
            public void status () {
        JOptionPane.showMessageDialog(null, "Nome: " +nome);
        JOptionPane.showMessageDialog(null, "Número da conta: " +conta);
        JOptionPane.showMessageDialog(null, "Agência: " +agencia);
        JOptionPane.showMessageDialog(null, "Saldo: R$" +saldo);
    }
            
            
            public void transferir (conta pux2, double saque ) {
         saque=Double.parseDouble(JOptionPane.showInputDialog("Digete o valor que irar depositar na conta"));
        if (saldo >= saque) {
            saldo -= saque;
           pux2.saldo += saque;
            JOptionPane.showMessageDialog (null, "Transferência realizada com sucesso.");
        }
        else {
            JOptionPane.showMessageDialog (null, "Transferência não foi possivel devido ao saldo baixo.");
        }
    }
}
