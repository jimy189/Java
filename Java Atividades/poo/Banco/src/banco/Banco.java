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
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op;
        conta pux= new conta();
        conta pux2 = new conta ();
        
      pux.agencia =Double.parseDouble(JOptionPane.showInputDialog("Digite o numero da Agencia"));
      pux.conta =Double.parseDouble(JOptionPane.showInputDialog("Digite o numero da conta"));
      pux.nome =JOptionPane.showInputDialog("Digite o seu nome");
      pux.saldo =Float.parseFloat(JOptionPane.showInputDialog("Digite o saldo"));
       
      op=Integer.parseInt(JOptionPane.showInputDialog("Digite 1-Consulta, 2-Sacar,3-Depositar, 4- Status, 5-Transferir"));
       switch (op){
            case 1:
                pux.consultar();
                break;
            case 2:
                pux.sacar(0);
                break;
            case 3:
                 pux.depositar(0);
                break;
              case 4:
                 pux.status();
                break;
              case 5:
                 pux.transferir(pux2, op);
                break;
                
        }
      
   
        
    }
    
}
