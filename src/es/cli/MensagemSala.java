/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cli;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author exceltior
 */
public class MensagemSala extends Mensagem implements Serializable{
    private Date data_postagem; // data a que foi publicada a mensagem
    private boolean resposta; // se a mensagem tem respostas
    private ArrayList<String> mensagens_respostas; // arraylist com todas as respostas na mensagem publicada na sala
    private int n_respostas = 0; // numero de respostas a mensagem publicada na sala
    
    /*
     * Constructor de Mensagem sala 
     */
    public MensagemSala(){
        
    }
       /*
        * Constructor de MensagemSala que recebe todos os campos necessários para a criação de uma mensagem de sala
        */
    public MensagemSala(String assunto, String texto_mensagem, Date data_criada, Date data_envio, String localizacao_imagem, Utilizador emissor,Date m_postagem,boolean resp,int delay) {
        super(assunto, texto_mensagem, data_criada, data_envio, localizacao_imagem, emissor,delay);
        resposta = resp;
        data_postagem = m_postagem;
        this.mensagens_respostas = new ArrayList<String>();
    }
    
    /*
     * Função tem como objectivo devolver a data na qual a mensagem foi publicada na sala
     */

    public Date getData_postagem() {
        return data_postagem;
    }

    /*
     * Função tem como objectivo devolver um ArrayList de Strings correspondente a todas as resposta a mensagem publicada na sala
     */
    public ArrayList<String> getMensagens_respostas() {
        return mensagens_respostas;
    }
    /*
     * Função tem como objecto verificar se a mensagem currente tem alguma resposta
     */
    public boolean isResposta() {
        return resposta;
    }
    /*
     * Função destinada a submeter a data a qual a mensagem foi publicada na sala
     * Esta data está no formato DD/MM/YYYY hh:mm:ss
     */
    public void setData_postagem(Date data_postagem) {
        this.data_postagem = data_postagem;
    }
    /*
     * Função que tem como objectivo adicionar uma resposta ao Arraylist da mensagem currente
     * Recebe uma string que corresponde a resposta à mensagem currente que foi publicada na sala
     * devolve 1 se for adicionada
     * caso contrário devolve 0
     */
    public int add_resposta_lista(String resposta){
        if(n_respostas<250)
        {
            mensagens_respostas.add(resposta);
            addN_respostas(1);
            return 1;
        }
        else{
            return 0;
        }
        
    }
    /*
     * Função destinada a devolver o número total de respostas existentes para a mensagem currente publicada na sala
     */

    public int getN_respostas() {
        return n_respostas;
    }
    /*
     * Função tem como objectivo incrementar o numero total de respostas assim que uma for adicionda ao arraylist com todas as respostas
     * Recebe um inteiro que corresponde ao incremento desejado
     */

    public void addN_respostas(int n_respostas) {
        this.n_respostas += n_respostas;
    }
    /*
     * Função tem como objectivo remover uma resposta da lista da mensagen currente que foi publicada numa sala
     * Recebe como parâmetro a mensagem
     * Se a mensagem existir e conter parte do conetudo recebido entao apaga a mensagem da ArrayList das respostas e decrementa devolvendo 1
     * senão devolve 0
     */
    public int remove_resposta_lista(String mensagem){
           for(int i = 0;i<n_respostas;i++){
                if(mensagens_respostas.get(i).contains(mensagem)==true)
                {
                    mensagens_respostas.remove(i);
                    return 1;
                }
         }
            
        return 0;
    }
    /*
     * Esta função tem como objectivo alterar o valor da flag para permitir a verificação de resposta na mensagem currente
     * Recebe como parâmetro o boolean true se houver uma resposta
     * false se não tiver
     */
    public void setResposta(boolean resposta) {
        this.resposta = resposta;
    }
    


    

    
    
    
    
}
