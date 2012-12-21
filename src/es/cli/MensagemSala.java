/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cli;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author exceltior
 */
public class MensagemSala extends Mensagem{
    private Date data_postagem;
    private boolean resposta;
    private ArrayList<String> mensagens_respostas;
    private int n_respostas = 0;

    public MensagemSala(){
        
    }
    
    public MensagemSala(String assunto, String texto_mensagem, Date data_criada, Date data_envio, String localizacao_imagem, Utilizador emissor,Date m_postagem,boolean resp,int delay) {
        super(assunto, texto_mensagem, data_criada, data_envio, localizacao_imagem, emissor,delay);
        resposta = resp;
        data_postagem = m_postagem;
        this.mensagens_respostas = new ArrayList<String>();
    }


    public Date getData_postagem() {
        return data_postagem;
    }


    public ArrayList<String> getMensagens_respostas() {
        return mensagens_respostas;
    }

    public boolean isResposta() {
        return resposta;
    }

    public void setData_postagem(Date data_postagem) {
        this.data_postagem = data_postagem;
    }

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

    public int getN_respostas() {
        return n_respostas;
    }

    public void addN_respostas(int n_respostas) {
        this.n_respostas += n_respostas;
    }

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
    public void setResposta(boolean resposta) {
        this.resposta = resposta;
    }
    


    

    
    
    
    
}
