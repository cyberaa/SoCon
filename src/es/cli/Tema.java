/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cli;

import java.io.Serializable;

/**
 *
 * @author exceltior
 */
public class Tema implements Serializable{
    private String nome_tema;
    private String descricao;
    private int n_total_salas;
    private int n_total_entradas_utlz;
    private int ratio_popularidade;

    public Tema(String nome_tema, String descricao) {
        this.nome_tema = nome_tema;
        this.descricao = descricao;
        this.n_total_salas = 0;
        this.n_total_entradas_utlz = 0;
        this.ratio_popularidade = 0;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getN_total_entradas_utlz() {
        return n_total_entradas_utlz;
    }

    public int getN_total_salas() {
        return n_total_salas;
    }

    public String getNome_tema() {
        return nome_tema;
    }

    public int getRatio_popularidade() {
        //n_total_utilizadores_tema /n_total_utilizadores 
        return ratio_popularidade;
    }

    public String setDescricao(String descricao) {
        return this.descricao = descricao;
    }

    public void addN_total_entradas_utlz(int n_total_entradas_utlz) {
        this.n_total_entradas_utlz += n_total_entradas_utlz;
    }

    public void addN_total_salas(int n_total_salas) {
        this.n_total_salas += n_total_salas;
    }
    

    public void setNome_tema(String nome_tema) {
        this.nome_tema = nome_tema;
    }

    public void setRatio_popularidade(int ratio_popularidade) {
        this.ratio_popularidade = ratio_popularidade;
    }
    
    @Override
    public String toString(){
        return this.nome_tema;
    }
    
    
    
}
