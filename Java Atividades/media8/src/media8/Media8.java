
package media8;

import javax.swing.JOptionPane;

public class Media8 {

    
    public static void main(String[] args) {
    
        String aluno;
        float x;
        int i;
        
        
       
        
        for(i = 0; i <=3; i++){
            
             aluno = JOptionPane.showInputDialog("Digite o nome do Aluno");
        x = Float.parseFloat(JOptionPane.showInputDialog("Digite a média do aluno!"));
            
            if(x>8){
                 JOptionPane.showMessageDialog(null,"O aluno"+aluno+ "obteve a nota" +x);
            }
        }
        
    }
    
}
