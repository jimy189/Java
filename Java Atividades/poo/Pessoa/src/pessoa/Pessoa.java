/*
- Crie uma classe chamada Pessoa. A classe terá os atributos “nome”, “sexo” e “idade”. Deve haver
o método “maiorDeIdade()”, que retorna true se a pessoa for maior de idade, ou false caso contrário.
Considere a maioridade aos 18 anos. Na sequência, instancie um objeto tipo Pessoa e verifique se o
mesmo é ou não maior de idade, imprimindo o resultado via console.
 */
package pessoa;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Pessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Maioridade idade= new Maioridade(); 
     
        int op=1;
        while(op!=0){
        op=Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para as opções, 1-Registra dados da pessoa, 2-Saber se é de maior:, 3-Status"));
        switch (op){
            case 1:
           idade.setNome(JOptionPane.showInputDialog("Digite um nome:"));
           idade.setSexo(JOptionPane.showInputDialog("Digite o sexo:"));
           idade.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:")));
          
            break;    
            
            case 2:
                idade.Idade();
            break;
                 
            case 3:
                 idade.status();
            break; 
      }
    } 
        
    }
    
}
