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
package questão.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Registro {
    
private  String modelo;
private String marca;
private int ano;
private int tipo;
private double preço;
private int Qtd;
    public int getQtd() {
        return Qtd;
    }

    public void setQtd(int Qtd) {
        this.Qtd = Qtd;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

public void ValordaLocação(Double resultado, Registro car2){

if(this.getTipo()==1){
JOptionPane.showMessageDialog(null, "Preço do Carro Utilitario: " + car2.getPreço());
    resultado= ((car2.getPreço()*this.getQtd())+40);
JOptionPane.showMessageDialog(null, "Valor da locação: " + resultado);
}
else{
JOptionPane.showMessageDialog(null, "Preço do Carro de Passeio: " + car2.getPreço());
resultado= (car2.getPreço()*this.getQtd())-20;
JOptionPane.showMessageDialog(null, "Valor da locação: " + resultado);
}
    
}


}
