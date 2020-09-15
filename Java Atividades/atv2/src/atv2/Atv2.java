
package atv2;

import javax.swing.JOptionPane;


public class Atv2 {

  
  
  
    public static void main(String[] args) {
       
        float x;
        float y;
        
        x=Float.parseFloat(JOptionPane.showInputDialog("Digite um valor de x"));
        
        y = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor  de y"));
        
        JOptionPane.showMessageDialog(null,"O valor digitado somado é"+ (x/y));
        
    }
    
}
