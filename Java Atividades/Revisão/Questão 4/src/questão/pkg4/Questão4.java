/*
- Crie uma classe chamada Pessoa. A classe terá os atributos “nome”, “sexo” e “idade”. Deve haver
o método “maiorDeIdade()”, que retorna true se a pessoa for maior de idade, ou false caso contrário.
Considere a maioridade aos 18 anos. Na sequência, instancie um objeto tipo Pessoa e verifique se o
mesmo é ou não maior de idade, imprimindo o resultado via console.
 */
package questão.pkg4;

/**
 *
 * @author Admin
 */
public class Questão4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Pessoa maior=new Pessoa();
        
        maior.menu();
        maior.maiorIdade();
        
    }
    
}
