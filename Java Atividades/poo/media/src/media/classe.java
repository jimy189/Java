/*
 - Elaborar um programa em Java que:

Solicite que o usuário digite 2 números.

Decida qual deles é o maior e exiba na tela o resultado da seguinte
maneira:“Maior = [número] / Menor = [número]”

Caso os dois sejam iguais, deverá exibir como resultado:“Os números são
iguais!”.
 */
package media;
import javax.swing.JOptionPane;


public class classe {
        
    public double n1;
    public double n2;
  
    
    public void numero(double x, double z){
        if(n1>n2){
            JOptionPane.showMessageDialog(null,"N1 É MAIOR " +n1);
        }
        else if(n1==n2){
             JOptionPane.showMessageDialog(null,"Igual");   
       }
        else{
            JOptionPane.showMessageDialog(null,"N2 É MAIOR " +n2);
        }
    }
    
    
}
