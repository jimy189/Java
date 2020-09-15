/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intervalo;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Intervalo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String aluno;
        float x;
        int i;
        int contador=0;
        
       
        
        for(i = 0; i <=3; i++){
            
        x = Float.parseFloat(JOptionPane.showInputDialog("Digite um numero!"));
            
            if(x>=10 && x<=150){
                 contador++; 
            }
        }
          JOptionPane.showMessageDialog(null,"A quantidade de nuemro dentro do intervalor é " +contador);

    }
    }
    

