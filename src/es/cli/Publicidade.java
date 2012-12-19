/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cli;

/**
 *
 * @author exceltior
 */
public class Publicidade {
    private Cliente autor;
    private long tempo_publicidade;
    private MensagemSala [] publ;
    private Sala [] salas_publ;
    private long duracao_dias;
    private int n_mensagens = 0;
    private int n_salas_publ = 0;

    public Publicidade(Cliente autor, long tempo_publicidade,MensagemSala mensagm,Sala primeira_sala, long duracao_dias) {
        this.autor = autor;
        this.tempo_publicidade = tempo_publicidade;
        this.publ[n_mensagens] = mensagm;
        n_mensagens++;
        this.salas_publ[n_salas_publ] = primeira_sala;
        this.duracao_dias = duracao_dias;
    }

    public Cliente getAutor() {
        return autor;
    }

    public long getDuracao_dias() {
        return duracao_dias;
    }

    public int getN_mensagens() {
        return n_mensagens;
    }

    public int getN_salas_publ() {
        return n_salas_publ;
    }

    public MensagemSala[] getPubl() {
        return publ;
    }

    public Sala[] getSalas_publ() {
        return salas_publ;
    }

    public long getTempo_publicidade() {
        return tempo_publicidade;
    }
    public String get_nome_autor(){
        return autor.getNome();
    }
    
    
    
}
