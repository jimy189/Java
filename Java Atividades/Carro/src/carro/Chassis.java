/*

 */
package carro;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Chassis {

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
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
   
    private String cor;
    private String modelo;
    private double velocidadeAtual;
    private double velocidadeMaxima=200;
     
    public void ligar(){
       
        this.velocidadeAtual=20;
        JOptionPane.showMessageDialog(null, "O carro estar ligado, sua velocidade atual é: " + velocidadeAtual);
    }
     public void acelerar(double velocimetro, double add){
        velocimetro= this.getVelocidadeAtual()+ add;
        JOptionPane.showMessageDialog(null, "O carro acelerou, sua velocidade atual é: " + velocimetro);
        if(velocimetro>200){
        JOptionPane.showMessageDialog(null, "O carro acedeu a sua velocidade máxima, diminua a sua velocidade: ");
        }
        else{
        JOptionPane.showMessageDialog(null, "realizado com sucesso!");
        }
    }
}
