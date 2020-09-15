/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Atividade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        double saque, deposito;
        String agencia, nome;
        int conta, opcao; 
                
       
       
        Conta c1 = new Conta();
        Conta c2 = new Conta ();
        
        nome = JOptionPane.showInputDialog ("Digite o seu nome: ");
        conta = Integer.parseInt (JOptionPane.showInputDialog ("Digite o número da conta: "));
        agencia = JOptionPane.showInputDialog ("Digite o nome da agência: ");
         
        
        
        opcao = Integer.parseInt (JOptionPane.showInputDialog ("Escolha a opção que deseja realizar: 1 - Sacar | 2 - Consultar saldo | 3 - Depositar | 4 - Transferir | 5 - Status"));
        switch (opcao) {
            case 1:
                saque = Double.parseDouble (JOptionPane.showInputDialog ("Digite o valor que deseja sacar: "));
                c1.sacar(saque);
            break;
            case 2:
                c1.consultarSaldo();
            break;
            case 3:
                deposito = Double.parseDouble (JOptionPane.showInputDialog ("Digite o valor que deseja depositar: "));
                c1.depositar(deposito);
            break;
            case 4:
                saque = Double.parseDouble (JOptionPane.showInputDialog ("Digite o valor que deseja transferir: "));
                c1.transferir(c2, saque);
            break;
            case 5:
                c1.status();
            break;
        }
        
    }
    
}
