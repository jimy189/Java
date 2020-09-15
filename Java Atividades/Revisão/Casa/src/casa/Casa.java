/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Casa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          Dados casa = new Dados();
        int op=1;
        while(op!=0){
        op=Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para as opções da casa, \n1-Abrir a casa, \n2-Entrar na casa,\n3-Fechar a casa, \n4-Pintar a casa:,\n 5-Adicione Portas,\n 6-Status da casa:"));
        switch (op){
            case 1:
                casa.Abricasa();
            break;    
               
            case 2:
             casa.EntrarCasa();
             break;
             
            case 3:
                casa.FecharCasa();
            break;
            
            case 4:
                casa.PintarCasa();
            break;  
            
            case 5:
                 casa.AddPortas(op, op);
            break;
           
            case 6:
                  casa.Status();
            break;
            
            case 7:
                casa.Rgistro();
            break;
        }
    }
    }
}