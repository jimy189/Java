/*
- Crie uma classe chamada Fatura para que uma loja de suprimentos de informática possa utilizá-la
para representar uma fatura de um item vendido na loja.
Uma Fatura deve incluir quatro partes das informações como variáveis de instância – o número (tipo
inteiro), a descrição do produto (tipo String), a quantidade comprada de um item(tipo int) e o preço
por item (tipo double).
Sua classe deve fornecer um método set e um get para cada variável de instância.
Além disso, forneça um método chamado ExibirValorFatura que calcula o valor da fatura e depois
retorna o valor como um double. Crie um método que fornece desconto de 10% caso o valor da
fatura seja maior que 200,00.
 */
package questão.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Questão1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int op=1;
      back fat=new back();
      while(op!=0){
      op=Integer.parseInt(JOptionPane.showInputDialog("Digite, 1-Para registrar o produto, 2- Para exibir o valor da fatura"));
      switch(op){
         case 1:
        fat.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do produto:")));
        fat.setDescrição(JOptionPane.showInputDialog("Digete a descrição do Produto:"));
        fat.setQtd(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do Produto:")));
        fat.setPreço(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do Produto:")));
         break;
         case 2:
          fat.ExibirValorFatura(op);
         break;
      }
      }
    }
    
}
