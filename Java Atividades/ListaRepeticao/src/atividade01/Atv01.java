/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade01;

/**
 *
 * @author aluno
 */
public class Atv01 {
    public static int verificarMaior30Vetor(int[] vet){
        int cont = 0;
        for (int i : vet) {
            if (i > 30) {
                cont++;
            }
        }
        return cont;
    }
}
