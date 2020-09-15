/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade07;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Eleicao {
    final int CANDIDATO_1=101;
    final int CANDIDATO_2=102;
    final int CANDIDATO_3=103;
    final int CANDIDATO_4=104;
    final int NULO=105;
    final int BRANCO=106;
    
    static int[] calcularTotalPorCandidato(ArrayList<Integer> votos) {
        int[] votosPorCandidato = new int[4];
        for (Integer voto : votos) {
            switch(voto){
                case 101:
                    votosPorCandidato[0]++;
                    break;
                case 102:
                    votosPorCandidato[1]++;
                    break;
                case 103:
                    votosPorCandidato[2]++;
                    break;
                case 104:
                    votosPorCandidato[3]++;
                    break;
            }
        }
        return votosPorCandidato;
    }
    
    static int calcularVotosNulos(ArrayList<Integer> votos) {
        int contNulo = 0;
        for (Integer voto : votos) {
            switch(voto){
                case 105:
                    contNulo++;
                    break;
            }
        }
        return contNulo;
    }
    
    static int calcularVotosBrancos(ArrayList<Integer> votos) {
        int contBranco = 0;
        for (Integer voto : votos) {
            switch(voto){
                case 106:
                    contBranco++;
                    break;
            }
        }
        return contBranco;
    }
    
    static double[] calcularPorcentagens(ArrayList<Integer> votos) {
        double[] porcentagens = new double[4];
        int[] votosValidos = calcularTotalPorCandidato(votos);
        
        porcentagens[0] = votosValidos[0]*100/votosValidos.length;
        porcentagens[1] = votosValidos[1]*100/votosValidos.length;
        porcentagens[2] = votosValidos[2]*100/votosValidos.length;
        porcentagens[3] = votosValidos[3]*100/votosValidos.length;
        
        return porcentagens;
    }
}
