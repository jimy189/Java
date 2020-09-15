/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author aluno
 */
public class Program {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            ArrayList<Integer> votos = new ArrayList<>();
            while(true){
                System.out.println("Insira um voto, ou 999 para sair");
                int voto = sc.nextInt();
                if (voto == 999) {
                    break;
                }
                votos.add(voto);
            }
            int[] votosPorCandidato = Eleicao.calcularTotalPorCandidato(votos);
            System.out.println("O candidato 1 recebeu "+votosPorCandidato[0]+" votos, "+
                    "o candidato 2 recebeu "+votosPorCandidato[1]+" votos, "+
                    "o candidato 3 recebeu "+votosPorCandidato[2]+" votos, "+
                    "o candidato 4 recebeu "+votosPorCandidato[3]+" votos, ");
            System.out.println("O total de votos nulos é "+Eleicao.calcularVotosNulos(votos));
            System.out.println("O total de votos brancos é "+Eleicao.calcularVotosBrancos(votos));
            
            double[] porcentagens = Eleicao.calcularPorcentagens(votos);
            
            System.out.println("O candidato 1 recebeu "+porcentagens[0]+"% dos votos, "+
                    "o candidato 2 recebeu "+porcentagens[1]+"% dos votos, "+
                    "o candidato 3 recebeu "+porcentagens[2]+"% dos votos, "+
                    "o candidato 4 recebeu "+porcentagens[3]+"% dos votos, ");
        }
    }
}
