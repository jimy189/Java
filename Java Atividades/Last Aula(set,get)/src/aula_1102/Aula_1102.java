/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_1102;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Aula_1102 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
   Class_Aula_1102 a1=new Class_Aula_1102();
     
   a1.setNome(JOptionPane.showInputDialog("Digite seu nome, por favor"));
   a1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade, por favor")));
   a1.setValorcompra(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da compra, por favor")));
   
   a1.status();
   a1.demaior();
   a1.desconto();
    }    
}

