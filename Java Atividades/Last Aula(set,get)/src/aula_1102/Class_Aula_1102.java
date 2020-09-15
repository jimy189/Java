/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_1102;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Class_Aula_1102 {
    
   private String nome;
   private int idade;
   private float valorcompra;

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    { 
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getValorcompra() {
        return valorcompra;
    }

    public void setValorcompra(float valorcompra) {
        this.valorcompra = valorcompra;
    }
    
  public void status()
  {
      JOptionPane.showMessageDialog(null,"Seu nome é: "+this.getNome());
     JOptionPane.showMessageDialog(null,"Sua idade é: "+this.getIdade());
     JOptionPane.showMessageDialog(null,"O valor de sua compra é: "+this.getValorcompra());
  }
  
  public void demaior()
  {
      if(idade>=18)
      {
         JOptionPane.showMessageDialog(null,"Você é de maior, sua idade é: "+this.getIdade()); 
      }
      else
      {
          JOptionPane.showMessageDialog(null,"Você é de menor, sua idade é: "+this.getIdade());
      }
  }
  
  public void desconto()
  {
      if(idade>=20)
      { 
         valorcompra=valorcompra-(valorcompra*10)/100;
         JOptionPane.showMessageDialog(null,"Você tem direito ao desconto de 10%, o preço ficou: "+this.getValorcompra()); 
      }
      else
      {
       JOptionPane.showMessageDialog(null,"Você não tem direito a desconto ");  
      }
  }
}
