/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv3;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Atv3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int x;
        float y;
        String w;
        float conta;
        
        x=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor de x"));
        
        
        
        conta = x % 2;
        
        if(conta==0){
              JOptionPane.showMessageDialog(null,x+"O valor par é"); 
        }
       
        else {
            JOptionPane.showMessageDialog(null,x+" O valor é impar");
        }
    }
    
}
