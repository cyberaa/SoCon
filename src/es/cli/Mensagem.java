/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cli;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author exceltior
 */
public class Mensagem implements Serializable {

    private String texto_mensagem;
    private Date data_criada;
    private Date data_envio;
    private String localizacao_imagem;
    private Utilizador emissor;
    private int delay = 0;

    public Mensagem() {
        localizacao_imagem = "";
        DateFormat d = new SimpleDateFormat("dd/MM/yyyy");
        try {
            data_criada = d.parse("01/01/2001");
            data_envio = d.parse("01/01/2001");
        } catch (Exception e) {
        }
    }

    public Mensagem(String assunto, String texto_mensagem, Date data_criada, Date data_envio, String localizacao_imagem, Utilizador emissor, int delay) {
        this.texto_mensagem = texto_mensagem;
        this.data_criada = data_criada;
        this.data_envio = data_envio;
        this.localizacao_imagem = localizacao_imagem;
        this.emissor = emissor;
        this.delay = delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
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
