/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Aula1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x;
        float y;
        String w;
        float conta;
        
        x=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor de x"));
        y = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor  de y"));
        
        if(x>y){
              JOptionPane.showMessageDialog(null,"O valor maior é"+x); 
        }
       else if(x==y)  {
           JOptionPane.showMessageDialog(null,"Os valores são iguais"+x);
       }
        else{
            JOptionPane.showMessageDialog(null,"O valor menor é"+y);
        }
        
        
   
        


    }
    
}
