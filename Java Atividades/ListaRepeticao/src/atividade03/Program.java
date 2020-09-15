/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade03;

import java.util.Scanner;

/**
 * @author aluno
 */
public class Program {
    public static void main(String[] args) {
        System.out.print("Insira o número de termos da série: ");
        try (Scanner sc = new Scanner(System.in)) {
            double n = sc.nextInt();
            System.out.println(Atv03.calcularValorP(n));
        }
    }
}
