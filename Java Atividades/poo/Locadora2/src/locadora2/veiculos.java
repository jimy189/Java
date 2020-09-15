/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora2;

/**
 *
 * @author Admin
 */
public class veiculos {
    private String marca;
   private String modelo;
   private int ano;

    public int getUtilitario() {
        return Utilitario;
    }

    public void setUtilitario(int Utilitario) {
        this.Utilitario = Utilitario;
    }

    public int getTipos() {
        return tipos;
    }

    public void setTipos(int tipos) {
        this.tipos = tipos;
    }
   private  int Utilitario;
   private  int Passeio;

    public int getPasseio() {
        return Passeio;
    }

    public void setPasseio(int Passeio) {
        this.Passeio = Passeio;
    }
   private int tipos;
   private int qtD;
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getQtD() {
        return qtD;
    }

    public void setQtD(int qtD) {
        this.qtD = qtD;
    }
}
