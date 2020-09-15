/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade03;

/**
 *
 * @author aluno
 */
public class Atv03 {

    static double calcularValorP(double n) {
        double valorP = 0;
        
        for (double i = 1, j = n; j >= 1; i++) {
            valorP+= i/j;
            j-=1;
        }
        valorP+= (n-1)/2;
        valorP+=n;
        
        return valorP;
    }
    
}
