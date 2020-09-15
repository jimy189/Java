/*
- Você foi contratado pela Scuderia Ferrari para desenvolver o sistema de controle de sua nova linha
de montagem.
Escreva uma classe Carro que tem como atributos cor, modelo, velocidadeAtual, velocidadeMaxima
e também os métodos ligar() e acelerar() que recebe como parâmetro a velocidade a ser
acrescentada a velocidade atual.
Esta classe também deve conter métodos get e set para cada um dos atributos listados.
O método acelerar() deve avisar ao usuário da classe se a velocidade máxima designada para o
carro for excedida.
 */
package questão.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Velocimetro {
    
private String cor;
private String modelo;
private double velocidadeAtual;
private double VelocidadeMaxima=200;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public double getVelocidadeMaxima() {
        return VelocidadeMaxima;
    }

    public void setVelocidadeMaxima(double VelocidadeMaxima) {
        this.VelocidadeMaxima = VelocidadeMaxima;
    }


public void ligar(){
 JOptionPane.showMessageDialog(null, "O carro está ligado!\n Sua velocidade é: km/h " + this.getVelocidadeAtual());
}

public void acelerar(){
    this.setVelocidadeAtual(Double.parseDouble(JOptionPane.showInputDialog("Digite aceleração:")));
    if(this.getVelocidadeAtual()==this.getVelocidadeMaxima()){
    JOptionPane.showMessageDialog(null, "A velocidade máxima foi execida!Por favor diminua a velocidade!");
    }
    else{
    this.setVelocidadeAtual(Double.parseDouble(JOptionPane.showInputDialog("Digite aceleração:")));
    }
}
    
}
