
package fatura;
    
import javax.swing.JOptionPane;


public class Descricao {
    
    private int numero;
    private String descriProduto;
    private int qtdItem;
    private double preço;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescriProduto() {
        return descriProduto;
    }

    public void setDescriProduto(String descriProduto) {
        this.descriProduto = descriProduto;
    }

    public int getQtdItem() {
        return qtdItem;
    }

    public void setQtdItem(int qtdItem) {
        this.qtdItem = qtdItem;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }
    
   
    public void ExibirValorFatura(double Fatura){
    
        
    Fatura=this.getQtdItem()*this.getPreço();
    if(Fatura>200){
    Fatura=Fatura-(Fatura*0.10);
    JOptionPane.showMessageDialog(null, "O valor  da Fatura com desconto: " +Fatura);
    }
    else{
     JOptionPane.showMessageDialog(null, "O valor  da Fatura é: " +Fatura);
    }
    JOptionPane.showMessageDialog(null, "O valor  da Fatura é: " +Fatura);
    
    }
    
    public void status(){
    JOptionPane.showMessageDialog (null, "A numero do Produto é: " +this.getNumero());
    JOptionPane.showMessageDialog (null, "A descrição do produto: " +this.getDescriProduto());
    JOptionPane.showMessageDialog (null, "Quantidade do Produto: " +this.getQtdItem());
    JOptionPane.showMessageDialog (null, "Preço do Item: " +this.getPreço());
    
    }
    
    
    
}
