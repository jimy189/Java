/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade06;

/**
 *
 * @author aluno
 */
public class Atv06 {

    static int calcular() {
        double alturaChico = 180;
        final double CRESCIMENTO_CHICO = 2.0;
        double alturaJuca = 110;
        final double CRESCIMENTO_JUCA = 3.6;
        int i;
        for (i = 1; alturaJuca>alturaChico; i++) {
            alturaChico+=CRESCIMENTO_CHICO;
            alturaJuca+=CRESCIMENTO_JUCA;
        }
        return i;
    }
    
}
