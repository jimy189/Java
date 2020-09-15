/*
 *1 - Elabore um programa que leia um vetor de 50 números inteiros e mostre a soma de todos os números que
possuem índices pares.
 */
package par;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Par {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        vetor num= new vetor();
         int op=1;
        while(op!=0){
        op=Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para as opções, 1-Digite um numero, 2-Veja a soma dos numeros pares"));
        switch (op){
            case 1:
           num.number();
            break;    
            
            case 2:
            num.pares(op);
            break;
       
      }
    }
    }
    
}
