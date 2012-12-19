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
public class MensagemSala extends Mensagem{
    private Date data_postagem;
    private boolean resposta;
    private String [] mensagens_respostas;
    private int n_respostas = 0;

    public MensagemSala(String assunto, String texto_mensagem, Date data_criada, Date data_envio, String localizacao_imagem, Utilizador emissor,Date m_postagem,boolean resp) {
        super(assunto, texto_mensagem, data_criada, data_envio, localizacao_imagem, emissor);
        resposta = resp;
        data_postagem = m_postagem;
        this.mensagens_respostas = new String [250];
    }

    public Date getData_postagem() {
        return data_postagem;
    }


    public String[] getMensagens_respostas() {
        return mensagens_respostas;
    }

    public boolean isResposta() {
        return resposta;
    }

    public void setData_postagem(Date data_postagem) {
        this.data_postagem = data_postagem;
    }

    public int add_resposta_lista(String mensagem){
        if(n_respostas<250)
        {
            mensagens_respostas[n_respostas] = mensagem;
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
    
    public String[] remove_resposta_lista(String mensagem,Utilizador autor){
        String [] cpy = new String[n_respostas];
        if(n_respostas>0)
        {
            for(int i = 0;i<n_respostas;i++)
            {
             if(mensagens_respostas[i].compareToIgnoreCase(mensagem) == 0 && autor.getNome().compareToIgnoreCase(getEmissor().getNome()) == 0){
                mensagens_respostas[i] = "0empty";
                addN_respostas(-1);
                for(int j = 0;j<n_respostas;j++)
                {
                    int soma = 0;
                    if(mensagens_respostas[j].compareToIgnoreCase("0empty")!=0)
                    {
                        cpy[soma] = mensagens_respostas[j];
                        soma++;
                    }
                }
             }
             
             else{
                 return null;
             }
            }
            
        }
        else{
            return null;
        }
        return cpy;
        
    }
    public void setResposta(boolean resposta) {
        this.resposta = resposta;
    }
    


    

    
    
    
    
}
