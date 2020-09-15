
package sistemlivro2;

import javax.swing.JOptionPane;


public class Publicação {
    livro cap2 = new livro();
     public void Abrir(){
      if(cap2.isAberto()==false){
    cap2.isAberto();
    JOptionPane.showMessageDialog(null,"O livro foi aberto");
    }
    else{
    cap2.isAberto();
    JOptionPane.showMessageDialog(null,"O livro foi fechado");
    }
       
    }
       public void Fechar(){
                if(cap2.isAberto()==false){
    cap2.isAberto();
    JOptionPane.showMessageDialog(null,"O livro foi aberto");
    }
    else{
    cap2.isAberto();
    JOptionPane.showMessageDialog(null,"O livro foi fechado");
    }
       
    }
      public void Avançar(){
      
     this.cap2.setPágAtual(+1);
     JOptionPane.showMessageDialog(null,"Página Atual: " + this.cap2.getPágAtual());
       
    }
      public void voltarPag(){
           this.cap2.setPágAtual(-1);
            JOptionPane.showMessageDialog(null,"Página Atual: " + this.cap2.getPágAtual());
    }
}
