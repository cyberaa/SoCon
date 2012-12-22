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
/*Funçao para devolver a localização da imagem da mensagem*/
    public String getLocalizacao_imagem() {
        return localizacao_imagem;
    }
/*Funçao para devolver o texto da mensagem*/
    public String getTexto_mensagem() {
        return texto_mensagem;
    }
/*Funçao para introduzir a data a que foi criada a mensagem*/
    public void setData_criada(Date data_criada) {
        this.data_criada = data_criada;
    }
/*Funçao para introduzir a data de envio da mensagem*/
    public void setData_envio(Date data_envio) {
        this.data_envio = data_envio;
    }
    /*Funçao para introduzir o emissor da mensagem*/
    public void setEmissor(Utilizador emissor) {
        this.emissor = emissor;
    }

    /*Funçao para introduzir a localizacao da imagem na mensagem*/
    public void setLocalizacao_imagem(String localizacao_imagem) {
        this.localizacao_imagem = localizacao_imagem;
    }
    /*Funçao para preencher introduzir mensagem de texto no corpo da mensagem*/

    public void setTexto_mensagem(String texto_mensagem) {
        this.texto_mensagem = texto_mensagem;
    }
}
