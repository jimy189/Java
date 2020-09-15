
package fatura;

import javax.swing.JOptionPane;

public class Fatura {

    public static void main(String[] args) {
    
     Descricao fat= new Descricao(); 
     
        int op=1;
        while(op!=0){
        op=Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para as opções, 1-Registra dados do Produto, 2-Consulta da fatura:, 3-Status do Produto"));
        switch (op){
            case 1:
           fat.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite numero do produto:")));
           fat.setDescriProduto(JOptionPane.showInputDialog("Digite a descrição:"));
           fat.setQtdItem(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do ITem:")));
           fat.setPreço(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do Item:")));
            break;    
            
            case 2:
            fat.ExibirValorFatura(op);
            break;
            
            case 3:
            fat.status();
            break; 
      }
    }
    
  }

}
