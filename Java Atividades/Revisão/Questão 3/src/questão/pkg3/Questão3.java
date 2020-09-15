/*
- Uma locadora possui dois tipos de veículos: utilitário e de passeio. O veículo deve ser identificado
pelo modelo, marca, ano, tipo (1-utilitário ou 2 passeio), preço de locação e quantidade de dias de
locação.
Para calcular o preço da locação e construir as entidades apresentadas, utilize como regra as
definições a seguir:
– Veículos utilitários possuem um valor fixo acrescentado de R$ 40,00;
– Veículos de passeio possuem um valor fixo com desconto de R$ 20,00;
– Crie uma classe, que mostra o valor da locação de acordo com o tipo do veículo
 */
package questão.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Questão3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int op;
       Registro car=new Registro();
       Registro car2=new Registro();
       
       car.setModelo(JOptionPane.showInputDialog("Digete o modelo do carro:"));
       car.setMarca(JOptionPane.showInputDialog("Digete a marca do carro:"));
       car.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do carro")));
       car.setQtd(Integer.parseInt(JOptionPane.showInputDialog("Digite os dias que vai sair:")));
       op=Integer.parseInt(JOptionPane.showInputDialog("Digite, 1- Utilitario, 2-Passeio"));
       switch(op){
           case 1:
              car.setTipo(op);
              car2.setPreço(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do Carro:")));
           break;
           case 2:
               car.setTipo(op);
               car2.setPreço(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do Carro:")));
           break;
       }
      car.ValordaLocação(Double.NaN, car2);
    }
    
}
