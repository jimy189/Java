/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora2;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Locadora2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      veiculos car= new veiculos(); 
     
        int op=1;
        int op2 = 1;
        while(op!=1){
        op=Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para as opções, 1-Registra dados do Produto 2-Ver o valor o da aluguel do carro:, 3-Status"));
        switch (op){
            case 1:
                car.setModelo(JOptionPane.showInputDialog("Digite o modelo do carro:"));
                car.setMarca(JOptionPane.showInputDialog("Digite a marca do Carro:"));
                car.setPasseio(Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo de carro, 1-Passeio, 2-Utilitario")));
                switch (op2){
                    case 1:
                     car.setPasseio(op2);
                    break;
                    case 2:
                     car.setUtilitario(op2);
                    break;    
                }
                car.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do carro:")));
                car.setQtD(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do carro:")));
            break;    
            
            case 2:
           
            break;
            
            case 3:
       
            break; 
      }
    }
    }
    
}
