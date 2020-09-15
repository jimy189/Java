/*
- Escrever um algoritmo que leia o nome de um vendedor, o seu salário fixo
e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo
que este vendedor ganha 15% de comissão sobre suas vendas
efetuadas, informar o seu nome, o salário fixo e salário no final do mês.
 */
package salario2;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Salario2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String nome;
      float salario;
      float totaldevendas ;
        
        nome=JOptionPane.showInputDialog("Digite o nome do empregado:");
        salario=Float.parseFloat(JOptionPane.showInputDialog("Digite o seu salario fixo:"));
        totaldevendas=Float.parseFloat(JOptionPane.showInputDialog("Digite o valor total das vendas que o empregado fez:"));
        
        JOptionPane.showMessageDialog(null," O nome do empregado é: " +nome); 
        JOptionPane.showMessageDialog(null," O seu salario fixo é: " +salario); 
        JOptionPane.showMessageDialog(null," O seu salario no final do mês é: " + (salario+(totaldevendas*0.15)));
    }
    
}
