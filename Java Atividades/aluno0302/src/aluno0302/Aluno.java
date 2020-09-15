
package aluno0302;

import javax.swing.JOptionPane;


public class Aluno {
    
    public double n1;
    public double n2;
    public double n3;
    
    
    
    public double media (double x, double y, double z){

    double resultado;
    
    resultado = (x+y+z)/3;
    
    return resultado;
    
    
    
    

    }
    public void aprova(double x){
        if(x>=7){
            JOptionPane.showMessageDialog(null,"Aprovado");
        }else{
            JOptionPane.showMessageDialog(null,"Reprovado");
        }
    }
    
    
    
    
    
    
    
    
    
}
