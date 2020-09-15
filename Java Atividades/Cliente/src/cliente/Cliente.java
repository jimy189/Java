
package cliente;

import javax.swing.JOptionPane;


public class Cliente {

    
    public static void main(String[] args) {
     
        Loja num = new Loja();

          
   num.setnome(JOptionPane.showInputDialog("Digite seu nome:"));
   num.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:")));
   num.setvalorcompra(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da compra:")));
   
   num.status();
   num.mariodadade();
   
    }
    
}
