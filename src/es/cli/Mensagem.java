/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cli;

import java.util.Date;

/**
 *
 * @author exceltior
 */
public class Mensagem {
    private String assunto;
    private String texto_mensagem;
    private Date data_criada;
    private Date data_envio;
    private String localizacao_imagem;
    private Utilizador emissor;

    public Mensagem(String assunto, String texto_mensagem, Date data_criada, Date data_envio, String localizacao_imagem, Utilizador emissor) {
        this.assunto = assunto;
        this.texto_mensagem = texto_mensagem;
        this.data_criada = data_criada;
        this.data_envio = data_envio;
        this.localizacao_imagem = localizacao_imagem;
        this.emissor = emissor;
    }

    public String getAssunto() {
        return assunto;
    }

    public Date getData_criada() {
        return data_criada;
    }

    public Date getData_envio() {
        return data_envio;
    }

    public Utilizador getEmissor() {
        return emissor;
    }

    public String getLocalizacao_imagem() {
        return localizacao_imagem;
    }

    public String getTexto_mensagem() {
        return texto_mensagem;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public void setData_criada(Date data_criada) {
        this.data_criada = data_criada;
    }

    public void setData_envio(Date data_envio) {
        this.data_envio = data_envio;
    }

    public void setEmissor(Utilizador emissor) {
        this.emissor = emissor;
    }

    public void setLocalizacao_imagem(String localizacao_imagem) {
        this.localizacao_imagem = localizacao_imagem;
    }

    public void setTexto_mensagem(String texto_mensagem) {
        this.texto_mensagem = texto_mensagem;
    }
    
    
}
