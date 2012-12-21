/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cli;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author exceltior
 */
public class Sala implements Serializable{
    private int id_sala;
    private String nome;
    private Tema tema_sala;
    private String descricao_sala;
    private int n_utilizadores;
    private int n_limite_utlz;
    private int n_moderadores;
    private int n_admins;
    private Permissoes perm_salas;
    private ArrayList <MensagemSala>  mensagens_publ;
    private ArrayList <MensagemSala> mensagens_sala;
    private int intevalo_mensagem;
    private int intervalo_publ;
    private ArrayList <Utilizador> lista_moderadores;
    private ArrayList <Utilizador> lista_administradores;
    private ArrayList <Utilizador> lista_pessoas_banidas;
    private ArrayList <Utilizador> lista_utilizadores;
    private int rating_pessoas;
    private int ratio_popularidade;
    private int n_visitantes;
    private ArrayList <MensagemPrivada> ticket_help;

    public Sala(int id_sala, String nome, Tema tema_sala, String descricao_sala, int n_limite_utlz,Permissoes perm_salas) {
        this.id_sala = id_sala;
        this.nome = nome;
        this.tema_sala = tema_sala;
        this.descricao_sala = descricao_sala;
        this.n_utilizadores = 0;
        this.n_limite_utlz = n_limite_utlz;
        this.n_moderadores = 0;
        this.n_admins = 1;
        this.perm_salas = perm_salas;
        this.mensagens_publ = new ArrayList<MensagemSala>();
        this.mensagens_sala = new ArrayList<MensagemSala>();
        this.lista_utilizadores = new ArrayList<Utilizador>();
        this.intevalo_mensagem = 60;
        this.intervalo_publ = 120;
        this.lista_moderadores = new ArrayList<Utilizador>();
        this.lista_administradores = new ArrayList <Utilizador>();
        this.lista_pessoas_banidas = new ArrayList<Utilizador>();
        this.rating_pessoas = 0;
        this.ratio_popularidade = 0;
        this.n_visitantes = 0;
        this.ticket_help = new ArrayList<MensagemPrivada>();
    }

    public ArrayList<Utilizador> getLista_utilizadores() {
        return lista_utilizadores;
    }

    public void addLista_utilizadores(Utilizador utilizador) {
        this.lista_utilizadores.add(utilizador);
    }

    public String getDescricao_sala() {
        return descricao_sala;
    }

    public int getId_sala() {
        return id_sala;
    }

    public int getIntervalo_publ() {
        return intervalo_publ;
    }

    public int getIntevalo_mensagem() {
        return intevalo_mensagem;
    }

    public int getN_admins() {
        return n_admins;
    }

    public int getN_limite_utlz() {
        return n_limite_utlz;
    }

    public int getN_moderadores() {
        return n_moderadores;
    }

    public int getN_utilizadores() {
        return n_utilizadores;
    }

    public int getN_visitantes() {
        return n_visitantes;
    }

    public String getNome() {
        return nome;
    }

    public Permissoes getPerm_salas() {
        return perm_salas;
    }

    public int getRating_pessoas() {
        return rating_pessoas;
    }

    public int getRatio_popularidade() {
        return ratio_popularidade;
    }

    public Tema getTema_sala() {
        return tema_sala;
    }

    public ArrayList<Utilizador> getLista_administradores() {
        return lista_administradores;
    }

    public ArrayList<Utilizador> getLista_moderadores() {
        return lista_moderadores;
    }

    public ArrayList<Utilizador> getLista_pessoas_banidas() {
        return lista_pessoas_banidas;
    }

    public ArrayList<MensagemSala> getMensagens_publ() {
        return mensagens_publ;
    }

    public ArrayList<MensagemSala> getMensagens_sala() {
        return mensagens_sala;
    }

    public ArrayList<MensagemPrivada> getTicket_help() {
        return ticket_help;
    }

    public void setId_sala(int id_sala) {
        this.id_sala = id_sala;
    }

    public void setIntervalo_publ(int intervalo_publ) {
        this.intervalo_publ = intervalo_publ;
    }

    public void setIntevalo_mensagem(int intevalo_mensagem) {
        this.intevalo_mensagem = intevalo_mensagem;
    }

    public void setN_admins(int n_admins) {
        this.n_admins = n_admins;
    }

    public void setN_limite_utlz(int n_limite_utlz) {
        this.n_limite_utlz = n_limite_utlz;
    }

    public void setN_moderadores(int n_moderadores) {
        this.n_moderadores = n_moderadores;
    }

    public void setN_utilizadores(int n_utilizadores) {
        this.n_utilizadores = n_utilizadores;
    }

    public void setN_visitantes(int n_visitantes) {
        this.n_visitantes = n_visitantes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPerm_salas(Permissoes perm_salas) {
        this.perm_salas = perm_salas;
    }

    public void setRating_pessoas(int rating_pessoas) {
        this.rating_pessoas = rating_pessoas;
    }

    public void setRatio_popularidade(int ratio_popularidade) {
        this.ratio_popularidade = ratio_popularidade;
    }

    public void setTema_sala(Tema tema_sala) {
        this.tema_sala = tema_sala;
    }

    public void setDescricao_sala(Tema tema_sala,String descricao) {
        this.descricao_sala = tema_sala.setDescricao(descricao);
    }
    
    public void addMensagem(MensagemSala msg){
        this.mensagens_sala.add(msg);
    }
    
    @Override
    public String toString(){
        return this.id_sala+" - "+this.nome;
    } 
}
