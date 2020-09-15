
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conveniente;

import java.io.Serializable;

/**
 *
 * @author aluno
 */
public class Aluno implements Serializable{
    private int Codigo;
    private String Nome;
    
    public Aluno(){
    }
    
    public Aluno(int codigo, String nome){
        this.Codigo=codigo;
        this.Nome=nome;
    }

    
    public int getCodigo() {
        return Codigo;
    }
    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    
    
    public String getNome() {
        return Nome;
    }
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    
    
    
    
    
}
