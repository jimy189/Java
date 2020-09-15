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
public class banquinho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         classe num = new classe();
         classe conta2 = new classe ();
        
         
        
         
      num.agencia =Double.parseDouble(JOptionPane.showInputDialog("Digite o numero da Agencia"));
      num.conta =Double.parseDouble(JOptionPane.showInputDialog("Digite o numero da conta"));
      num.saldo =Float.parseFloat(JOptionPane.showInputDialog("Digite o saldo"));
      num.nome =JOptionPane.showInputDialog("Digite o seu nome");

      
        
        num.sacar(0, 0); 
        num.depositar(0, 0);
        num.consultar(0);
        num.transferir(float z,classe conta2);
   
    }
    
}
