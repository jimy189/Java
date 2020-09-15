/*
- Crie uma classe chamada Fatura para que uma loja de suprimentos de informática possa utilizá-la
para representar uma fatura de um item vendido na loja.
Uma Fatura deve incluir quatro partes das informações como variáveis de instância – o número (tipo
inteiro), a descrição do produto (tipo String), a quantidade comprada de um item(tipo int) e o preço
por item (tipo double).
Sua classe deve fornecer um método set e um get para cada variável de instância.
Além disso, forneça um método chamado ExibirValorFatura que calcula o valor da fatura e depois
retorna o valor como um double. Crie um método que fornece desconto de 10% caso o valor da
fatura seja maior que 200,00.
 */
package questão.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class back {
    
private int numero;
private String descrição;
private int Qtd;
private double preço;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public int getQtd() {
        return Qtd;
    }

    public void setQtd(int Qtd) {
        this.Qtd = Qtd;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }
 
    public void ExibirValorFatura(double fatura){
    fatura= this.getPreço()*this.getQtd();
    if(fatura>200){
    fatura=fatura-(fatura*0.10);
    JOptionPane.showMessageDialog(null,"Valor da Fatura com desconto: " +fatura);
    }
    else{
    JOptionPane.showMessageDialog(null,"Valor da Fatura: " +fatura);
    }
    
    }
  
    
}
