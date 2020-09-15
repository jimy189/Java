
package casa;

import javax.swing.JOptionPane;



public class Casa {

    public static void main(String[] args) {
       
        Home casa = new Home();
        int op=1;
        while(op!=0){
        op=Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para as opções, 1-Abrir a casa, 2-Fechar a casa,3-Entrar na casa, 4- Adicionar Portas:, 5-Pintar Casa, 6-Status da casa:"));
        switch (op){
            case 1:
           casa.abrircasa();
            break;    
            
            case 2:
            casa.fecharcasa();
            break;
            
            case 3:
            casa.entrar();
            break;
            
            case 4:
            casa.addportas();
            break;  
            
            case 5:
            casa.pintarcasa();
            break;
           
            case 6:
            casa.status();
            break;
        }
    }
    }
}
