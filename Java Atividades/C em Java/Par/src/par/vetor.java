/*
 1 - Elabore um programa que leia um vetor de 50 números inteiros e mostre a soma de todos os números que
possuem índices pares.
 */
package par;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class vetor {
     private int n;
     private int i;
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

  public void number(){
  
  
   for (int i = 0; i <=3; i++) {
   this.setN(Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:")));
   }

  } 
  public void pares(int soma){
   soma=0;
   for (int i = 0; i <=3; i++) {
       
   if(this.getN()%2==0){
   soma=soma+this.getN();
   }
   }
    JOptionPane.showMessageDialog (null, "Soma dos numeros pares: " +soma);
  }
   
}
