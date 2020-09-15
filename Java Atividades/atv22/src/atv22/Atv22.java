/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv22;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Atv22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int x;
        float y;
        String w;
        float conta;
        
        x=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor de x"));
        y = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor  de y"));
        
        
              JOptionPane.showMessageDialog(null,"O valor da média  é"+(x+y)/2); 
      
    }
    
}
