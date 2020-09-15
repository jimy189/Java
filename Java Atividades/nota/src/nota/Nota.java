/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nota;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Nota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float x;
        float y;
        float z;
        String w;
        float conta;
        
         w=JOptionPane.showInputDialog("Digite o nome do Aluno");
        x=Float.parseFloat(JOptionPane.showInputDialog("Digite um valor da primeira nota!"));
        y = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor da segunda nota!"));
        z = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor da terceira nota!"));
         
         conta=(x+y+z)/3;
         
         if(conta>=7){
               JOptionPane.showMessageDialog( null, " O Aluno" + w +"O valor da media é é"+ conta +"Ele esta aprovado"); 
        }
       
        else {
           JOptionPane.showMessageDialog( null, " O Aluno" + w +"O valor da media é é"+ conta +"Ele esta reprovado"); 
        }
    }
    
}
