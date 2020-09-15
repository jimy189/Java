/*
 
 */
package carro;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Carro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Chassis car= new Chassis(); 
       int op = 1;
       
        while(op!=0){
          op=Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para as opções, 1-Ligue o Carro,/n 2-Acelere o Carro:"));   
         switch (op){
            case 1:
            car.ligar();
            break;    
            
            case 2:
            car.acelerar(op, Double.parseDouble(JOptionPane.showInputDialog("Digite o adicional na velocidade:")));
            break;
            
            
            }
        }
    }
}
