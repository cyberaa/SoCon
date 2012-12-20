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
    private ArrayList<Mensagem> mensagens_respostas;
    private int n_respostas = 0;

    public MensagemSala(String assunto, String texto_mensagem, Date data_criada, Date data_envio, String localizacao_imagem, Utilizador emissor,Date m_postagem,boolean resp,int id) {
        super(assunto, texto_mensagem, data_criada, data_envio, localizacao_imagem, emissor,id);
        resposta = resp;
        data_postagem = m_postagem;
        this.mensagens_respostas = new ArrayList<Mensagem>();
    }

    public Date getData_postagem() {
        return data_postagem;
    }


    public ArrayList<Mensagem> getMensagens_respostas() {
        return mensagens_respostas;
    }

    public boolean isResposta() {
        return resposta;
    }

    public void setData_postagem(Date data_postagem) {
        this.data_postagem = data_postagem;
    }

    public int add_resposta_lista(Mensagem resposta){
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
    public int remove_resposta_lista(String mensagem,Utilizador autor){
        
            
        
    }
    public void setResposta(boolean resposta) {
        this.resposta = resposta;
    }
    


    

    
    
    
    
}
