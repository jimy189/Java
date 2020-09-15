/*
- Uma locadora possui dois tipos de veículos: utilitário e de passeio. O veículo deve ser identificado
pelo modelo, marca, ano, tipo (1-utilitário ou 2 passeio), preço de locação e quantidade de dias de
locação.
Para calcular o preço da locação e construir as entidades apresentadas, utilize como regra as
definições a seguir:
– Veículos utilitários possuem um valor fixo acrescentado de R$ 40,00;
– Veículos de passeio possuem um valor fixo com desconto de R$ 20,00;
– Crie uma classe, que mostra o valor da locação de acordo com o tipo do veículo
 */
package locadora;

import javax.swing.JOptionPane;


public class veiculos {
    
   private String marca;
   private String modelo;
   private int ano;

    public int getUtilitario() {
        return Utilitario;
    }

    public void setUtilitario(int Utilitario) {
        this.Utilitario = Utilitario;
    }

    public int getTipos() {
        return tipos;
    }

    public void setTipos(int tipos) {
        this.tipos = tipos;
    }
   private  int Utilitario;
   private  int Passeio;

    public int getPasseio() {
        return Passeio;
    }

    public void setPasseio(int Passeio) {
        this.Passeio = Passeio;
    }
   private int tipos;
   private int qtD;
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getQtD() {
        return qtD;
    }

    public void setQtD(int qtD) {
        this.qtD = qtD;
    }
    
  public void status(){
    JOptionPane.showMessageDialog (null, "A marca do carro é: " +this.getMarca());
    JOptionPane.showMessageDialog (null, "Modelo do carro: " +this.getModelo());
    JOptionPane.showMessageDialog (null, "Ano do Carro: " +this.getAno());
            if(this.getTipos()==1){
            JOptionPane.showMessageDialog (null, "Passeio, Tipo: " +this.getPasseio());
            }
            else{
            
             JOptionPane.showMessageDialog (null, "Utilitario, Tipo: " +this.getUtilitario());
            }                   
   
    JOptionPane.showMessageDialog (null, "Quantidade de Dias: " +this.getQtD());
    }
  
  public void valor(veiculos car2){
      if(this.getTipos()==1){
      car2.Passeio=50;
      JOptionPane.showMessageDialog (null, "Valor do Aluguel de Carros para Passeio: " + ((this.getQtD()*car2.Passeio)-20));
      }
      else{
      car2.Utilitario=60;
      JOptionPane.showMessageDialog (null, "Valor do Aluguel de Carros para Utilitario: " + ((this.getQtD()*car2.Utilitario)+40));
      }
  }
public void ValorLocação(veiculos car2){
car2.Passeio=50;
JOptionPane.showMessageDialog (null, "Valor da locação de Carros para Passeio: " +car2.Passeio);
car2.Utilitario=60;
JOptionPane.showMessageDialog (null, "Valor da locação de Carros para Utilitario: " +car2.Utilitario);  
}
    
}
