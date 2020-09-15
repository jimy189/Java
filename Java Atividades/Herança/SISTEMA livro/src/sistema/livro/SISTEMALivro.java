/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.livro;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class SISTEMALivro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       Pessoa cap=new Pessoa();
       Livro cap2=new Livro();
       
        int op=1;
      while(op!=0){
     op=Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para as opções:\n 1-Registra dados da Pessoa \n 2-Registrar Dados do Livro"));
     switch(op){
         case 1:    
                cap.setNome(JOptionPane.showInputDialog("Digite o nome:"));
                cap.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:")));
                cap.setSexo(JOptionPane.showInputDialog("Digite o sexo:"));
          break;
          
         case 2:
               cap2.setTitulo(JOptionPane.showInputDialog("Digite o titulo do livro:"));
               cap2.setAutor(JOptionPane.showInputDialog("Digite o nome do Autor"));
              cap2.setTotPags(Integer.parseInt(JOptionPane.showInputDialog("Digite o total de páginas:")));
         break;
         
         case 3:
           cap2.Detalhes();
         break;
        
     }
    }
    }
       
    
}
