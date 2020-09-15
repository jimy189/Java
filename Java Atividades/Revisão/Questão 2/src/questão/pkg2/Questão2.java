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

/**
 *
 * @author Admin
 */
public class Questão2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Velocimetro car=new Velocimetro();
       car.ligar();
       car.acelerar();
    }
    
}
