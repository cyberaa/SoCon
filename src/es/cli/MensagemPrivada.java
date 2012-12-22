/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cli;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author exceltior
 */
public class MensagemPrivada extends Mensagem implements Serializable{
    private String anexos; // String com a posição de anexos da mensagem
    private Utilizador destinatário;// Utilizador que vai receber a mensagem
    private String assunto;// assunto para qual a mensagem foi criada
       
    /*
     * Constructor que recebe todos os dados necessários a criação de uma mensagem privada
     */
    public MensagemPrivada(String anexos, Utilizador destinatário, String assunto, String texto_mensagem, Date data_criada, Date data_envio, String localizacao_imagem, Utilizador emissor,int delay) {
        super(assunto, texto_mensagem, data_criada, data_envio, localizacao_imagem, emissor,delay);
        this.anexos = anexos;
        this.destinatário = destinatário;
    }
    /*
     * Constructor que recebe os dados necessários a criação de uma mensagem privada sem anexos
     */
    public MensagemPrivada(String assunto, String texto_mensagem,Utilizador destinatário, Date data_criada, Date data_envio, String localizacao_imagem, Utilizador emissor,int delay) {
        super(assunto, texto_mensagem, data_criada, data_envio, localizacao_imagem, emissor,delay);
    }
    /*
     * Função que devolve os anexos da mensagem privada
     */
    public String getAnexos() {
        return anexos;
    }
    /*
     * Função que devolve o objecto Utilizador que curresponde ao destinatário da mensagem
     */
    public Utilizador getDestinatário() {
        return destinatário;
    }
    /*
     * Função criada para submeter um string correspondente a posição dos anexos da mensagem privada
     */
    public void setAnexos(String anexos) {
        this.anexos = anexos;
    }
    /*
     * Função que recebe um objecto Utilizador como parâmetro
     * este objecto corresponde ao utilizador destinatário da mensagem currente
     */

    public void setDestinatário(Utilizador destinatário) {
        this.destinatário = destinatário;
    }  
}
