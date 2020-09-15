/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeosimpares;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Numeosimpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int x;
       int y;

     int i;
     int contador=0;
        
        x=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor de x"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor  de y"));
        
  for (i = x; i <= y; i++) {
  if(i%2==1){
           contador++;   
        }
  
  } 
  JOptionPane.showMessageDialog(null,"valor dos numeros pares é " +contador);
}
}