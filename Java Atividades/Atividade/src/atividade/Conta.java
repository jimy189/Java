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
public class Conta {
    
    public String agencia;
    public int conta;
    public double saldo;
    public String nome;
    
    
    public void sacar (double saque) {
        if (saldo >= saque) {
            saldo -= saque;
            JOptionPane.showMessageDialog (null, "Saque de R$" +saque+ " realizado com sucesso.");
        }
        else {
            JOptionPane.showMessageDialog (null, "Saque de R$" +saque+ " não é possivel, pois o saldo está baixo.");

        }
    }
    
    public void consultarSaldo () {
        JOptionPane.showMessageDialog (null, "Seu saldo atual é: R$" +saldo);
    }
    
    public void transferir (Conta c2, double saque ) {
        if (saldo >= saque) {
            saldo -= saque;
            c2.saldo += saque;
            JOptionPane.showMessageDialog (null, "Transferência realizada com sucesso.");
        }
        else {
            JOptionPane.showMessageDialog (null, "Transferência não foi possivel devido ao saldo baixo.");
        }
    }
    
    public void status () {
        JOptionPane.showMessageDialog(null, "Nome: " +nome);
        JOptionPane.showMessageDialog(null, "Número da conta: " +conta);
        JOptionPane.showMessageDialog(null, "Agência: " +agencia);
        JOptionPane.showMessageDialog(null, "Saldo: R$" +saldo);
    }
    
    public void depositar (double deposito) {
        JOptionPane.showInputDialog ("Digite o valor que deseja depositar: R$");
        saldo += deposito;
        JOptionPane.showMessageDialog (null, "Depósito realizado com sucesso.");

    }
}
