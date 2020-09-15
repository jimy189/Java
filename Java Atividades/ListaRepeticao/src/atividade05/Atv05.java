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
public class Atv05 {
    static double calcularMediaIdade(Espectador[] entrevistados){
        int somaIdade = 0;
        int cont = 0;
        for (Espectador entrevistado : entrevistados) {
            if (entrevistado.getNota() == 1) {
                somaIdade += entrevistado.getIdade();
                cont++;
            }
        }
        return somaIdade/cont;
    }

    static int obterQuantidadePessoasNotaRegular(Espectador[] entrevistados) {
        int contPessoas = 0;
        for (Espectador entrevistado : entrevistados) {
            if (entrevistado.getNota() == 3) {
                contPessoas++;
            }
        }
        return contPessoas;
    }

    static double[] obterPorcentagens(Espectador[] entrevistados){
        double[] porcentagens = new double[3];
        int contExcelente = 0;
        int contBom = 0;
        int contRegular = 0;
        for (Espectador entrevistado : entrevistados) {
            switch(entrevistado.getNota()){
                case 1:
                    contExcelente++;
                    break;
                case 2:
                    contBom++;
                    break;
                case 3:
                    contRegular++;
                    break;
            }
        }
        
        porcentagens[0] = contBom*100/entrevistados.length;
        porcentagens[1] = contRegular*100/entrevistados.length;
        porcentagens[2] = contExcelente*100/entrevistados.length;
        
        return porcentagens;
        
    }
}
