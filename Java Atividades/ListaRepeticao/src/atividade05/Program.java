/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade05;

/**
 *
 * @author aluno
 */
public class Program {
    public static void main(String[] args) {
        Espectador[] entrevistados = {new Espectador(20, 1),new Espectador(10, 1),new Espectador(20, 3)};
        System.out.println("A) A média das idades das pessoas que responderam excelente é: "+Atv05.calcularMediaIdade(entrevistados));
        System.out.println("B) A quantidade de pessoas que responderam regular é: "+Atv05.obterQuantidadePessoasNotaRegular(entrevistados));
        double[] porcentagens = Atv05.obterPorcentagens(entrevistados);
        System.out.println("C) A porcentagem de pessoas que responderam bom é "+porcentagens[0]+
                ", a porcentagem de pessoas que responderam regular é "+porcentagens[1]+
                ", a porcentagem de pessoas que responderam excelente é "+porcentagens[2]);
    }
}
