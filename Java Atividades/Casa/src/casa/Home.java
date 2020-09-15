package casa;

import javax.swing.JOptionPane;

public class Home {
    private String cor;
    private int numero;
    private int qtdPortas;
    private boolean aberta = false;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

  
    public void abrircasa (){
        if (this.aberta == false){
            this.aberta = true;
            JOptionPane.showMessageDialog(null,"A casa está aberta.");
        }else{
            JOptionPane.showMessageDialog(null, "A casa já está aberta.");
        }
    }
    
    public void fecharcasa (){
        if (this.aberta == true){
            this.aberta = false;
            JOptionPane.showMessageDialog(null,"A casa está fechada.");
        }else{
            JOptionPane.showMessageDialog(null, "A casa já está fechada.");
        } 
    }
    
    
    public void pintarcasa(){
        cor=JOptionPane.showInputDialog("Digite a cor com a qual você deseja pintar a casa: ");
        JOptionPane.showMessageDialog(null, "A casa foi pintada de: " +this.cor);
    }
    
    public void entrar(){
        if (this.aberta == true){
            JOptionPane.showMessageDialog(null,"Seja bem vindo.");
        }else{
            JOptionPane.showMessageDialog(null, "Não pode entrar. A casa está trancada");
        }
    }
    
    public void addportas(){
         qtdPortas = Integer.parseInt(JOptionPane.showInputDialog("Digite quantas portas você deseja adicionar: "));
    }

    public void status(){
        JOptionPane.showMessageDialog (null, "A cor da casa é: " +this.getCor());
        JOptionPane.showMessageDialog (null, "O numero da casa é: " +this.getNumero());
        JOptionPane.showMessageDialog (null, "A quantidade de portas é: " +this.getQtdPortas());
        JOptionPane.showMessageDialog (null, "A casa esta aberta?: " +this.isAberta());
        }
    

}
    
    
    
    
    

