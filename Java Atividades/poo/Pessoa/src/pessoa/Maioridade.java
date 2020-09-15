/*
 - Crie uma classe chamada Pessoa. A classe terá os atributos “nome”, “sexo” e “idade”. Deve haver
o método “maiorDeIdade()”, que retorna true se a pessoa for maior de idade, ou false caso contrário.
Considere a maioridade aos 18 anos. Na sequência, instancie um objeto tipo Pessoa e verifique se o
mesmo é ou não maior de idade, imprimindo o resultado via console.
 */
package pessoa;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Maioridade {
   private String nome;
    private String sexo;
    private int idade;
    private boolean Demaior;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isDemaior() {
        return Demaior;
    }

    public void setDemaior(boolean Demaior) {
        this.Demaior = Demaior;
    }
 
   public void Idade(){
       if(this.getIdade()>=18){
           this.Demaior=true;
            JOptionPane.showMessageDialog(null, "Ele é de maior: " + this.isDemaior());
       }
       else{
       this.Demaior=false;
            JOptionPane.showMessageDialog(null, "Ele é de menor: "  + this.isDemaior());
       }
}
   
    public void status(){
    JOptionPane.showMessageDialog (null, "NOME: " +this.getNome());
    JOptionPane.showMessageDialog (null, "IDADE: " +this.getIdade());
    JOptionPane.showMessageDialog (null, "SEXO: " +this.getSexo());
    }
}
