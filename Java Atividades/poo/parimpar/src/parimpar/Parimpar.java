/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parimpar;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Parimpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         classe1 num = new classe1();
        
      num.n1 =Double.parseDouble(JOptionPane.showInputDialog("Digite a primeiro numero"));

      
      num.parimpar(num.n1);
    }
    
}
