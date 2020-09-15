/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemlivro2;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class SISTEMlivro2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
     Pessoa cap = new Pessoa("Cor");
     livro cap2 = new livro();
     Publicação cap3 = new Publicação();
     
          int op=1;
      while(op!=0){
     op=Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para as opções:\n 1-Registra dados da Pessoa \n 2-Registrar Dados do Livro\n3-Ver a publicação"));
     switch(op){
         case 1:    
                cap.setNome(JOptionPane.showInputDialog("Digite o nome:"));
                cap.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:")));
                cap.setSexo(JOptionPane.showInputDialog("Digite o sexo:"));
                cap.Fazerniver();
               
                
          break;
          
         case 2:
              cap2.setTitulo(JOptionPane.showInputDialog("Digite o titulo do filme:"));
              cap2.setAutor(JOptionPane.showInputDialog("Digite o titulo do filme:"));
              cap2.setTotPags(Integer.parseInt(JOptionPane.showInputDialog("Digite o total de páginas:")));
              cap2.Detalhes();
         break;
         
         case 3:
             cap3.Abrir();
             cap3.Fechar();
             cap3.Avançar();
             cap3.voltarPag();
           
         break;
        
     }
    }
     }
    }    
    
    
