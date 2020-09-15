/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alugar;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Alugar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         dados alugar = new dados();
     
     alugar.setTitulo(JOptionPane.showInputDialog("Digite o titulo do filme:")); 
     alugar.setCategoria(JOptionPane.showInputDialog("Digite a categoria:"));
     
    }
    
}
