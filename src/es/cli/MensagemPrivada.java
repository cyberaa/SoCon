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
public class MensagemPrivada extends Mensagem{
    private String anexos;
    private Utilizador destinatário;

    public MensagemPrivada(String anexos, Utilizador destinatário, String assunto, String texto_mensagem, Date data_criada, Date data_envio, String localizacao_imagem, Utilizador emissor) {
        super(assunto, texto_mensagem, data_criada, data_envio, localizacao_imagem, emissor);
        this.anexos = anexos;
        this.destinatário = destinatário;
    }

    public MensagemPrivada(String assunto, String texto_mensagem,Utilizador destinatário, Date data_criada, Date data_envio, String localizacao_imagem, Utilizador emissor) {
        super(assunto, texto_mensagem, data_criada, data_envio, localizacao_imagem, emissor);
    }

    public String getAnexos() {
        return anexos;
    }

    public Utilizador getDestinatário() {
        return destinatário;
    }

    public void setAnexos(String anexos) {
        this.anexos = anexos;
    }

    public void setDestinatário(Utilizador destinatário) {
        this.destinatário = destinatário;
    }  
}
