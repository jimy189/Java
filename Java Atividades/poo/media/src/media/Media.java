/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Media {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         classe num = new classe();
       
      num.n1 =Double.parseDouble(JOptionPane.showInputDialog("Digite a primeiro numero"));
      num.n2 =Double.parseDouble(JOptionPane.showInputDialog("Digite a segundo numero"));
      
      num.numero(num.n1, num.n2);
      
    }
    
}
