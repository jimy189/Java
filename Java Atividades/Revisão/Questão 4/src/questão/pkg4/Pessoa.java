/*
- Crie uma classe chamada Pessoa. A classe terá os atributos “nome”, “sexo” e “idade”. Deve haver
o método “maiorDeIdade()”, que retorna true se a pessoa for maior de idade, ou false caso contrário.
Considere a maioridade aos 18 anos. Na sequência, instancie um objeto tipo Pessoa e verifique se o
mesmo é ou não maior de idade, imprimindo o resultado via console.
 */
package questão.pkg4;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Pessoa {
 private  String nome;
private String sexo;
private int idade; 
private boolean demaior;
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
  
   public void maiorIdade(){
   if(this.getIdade()>=18){
   this.demaior=true;
   JOptionPane.showMessageDialog(null, "Vdd: " +this.demaior);
   JOptionPane.showMessageDialog(null, "Ele é de maior!");
   }
   else{
       JOptionPane.showMessageDialog(null, "Falso: " +this.demaior);
         JOptionPane.showMessageDialog(null, "Ele é de menor!");

   }
   } 
   public void menu(){
     this.setNome(JOptionPane.showInputDialog("Digite um nome:"));
     this.setSexo(JOptionPane.showInputDialog("Digite o seu sexo:"));
     this.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade:")));
   }
}
