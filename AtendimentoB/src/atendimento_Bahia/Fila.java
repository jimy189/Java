/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atendimento_Bahia;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

/**
 *
 * @author Admin
 */
public class Fila implements Iterable<String> {
    
    public static final boolean CODIGO_MILLIS = true;
    
    private static int codigoIndex = 0;
    
    private final Queue<String> queue;
    
    public Fila(){
        queue = new ArrayDeque<>();
    }
    
    private synchronized String gerarCodigo(){
        if (CODIGO_MILLIS){
            return gerarCodigoMillis();
        }else {
            return gerarCodigoIndex();
        }
    }
    
    private synchronized String gerarCodigoMillis() {
        long millis = System.currentTimeMillis();
        //                1592604559313l
        millis = millis % 1592600000000l;
        return String.valueOf(millis);
    }
    
    private synchronized String gerarCodigoIndex() {
        return String.valueOf(++codigoIndex);
    }
    
    public String adicionar() {
        String codigo = gerarCodigo();
        queue.add(codigo);
        return codigo;
    }
    
    public String atender(){
        return queue.poll();
    }

    @Override
    public Iterator<String> iterator() {
        return queue.iterator();
    }
    
    
    
}
