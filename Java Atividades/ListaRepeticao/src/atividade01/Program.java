/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade01;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] num;
        try (Scanner sc = new Scanner(System.in)) {
            num = new int[15];
            for (int i = 0; i < 15; i++) {
                num[i] = sc.nextInt();
            }
        }
        System.out.println("Existem "+Atv01.verificarMaior30Vetor(num)+" números maiores que 30");
    }
    
}
