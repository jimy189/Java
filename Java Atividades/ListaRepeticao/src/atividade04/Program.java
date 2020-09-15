/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade04;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Program {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Insira o primeiro valor:");
            double x = sc.nextInt();
            System.out.print("Insira o segundo valor:");
            double y = sc.nextInt();
            System.out.println(Atv04.calcular(x,y));
        }
    }
}
