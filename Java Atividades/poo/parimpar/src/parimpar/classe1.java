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
public class classe1 {
    public double n1;

  
    
    public void parimpar(double x){
        if(n1%2==0){
            JOptionPane.showMessageDialog(null,"N1 É Par " +n1);
        }
      
        else{
            JOptionPane.showMessageDialog(null,"N2 É Impar " +n1);
        }
    }

}