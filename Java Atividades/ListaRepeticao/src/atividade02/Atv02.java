/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade02;

/**
 *
 * @author aluno
 */
public class Atv02 {
    public static double calcularValorL(double n){
        double valorL = 1;
        for (double i = 2; i <= n; i++) {
            if (i%2 == 0) {
                valorL = valorL - (1/i);
            }else{
                valorL = valorL + (1/i);
            }
        }
        return valorL;
    }
}
