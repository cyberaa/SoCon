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
public class Utilizador implements Serializable {

    private String username;
    private String password;
    private String nome;
    private String apelido;
    private Date data_nascimento;
    private int idade;
    private String email;
    private String rua;
    private String numero;
    private String complemento;
    private String cidade;
    private String pais;
    private int type = 0;
    private ArrayList<MensagemPrivada> inbox = new ArrayList<MensagemPrivada>();
    private ArrayList<MensagemPrivada> outbox = new ArrayList<MensagemPrivada>();
    private ArrayList<Sala> salas_historico = new ArrayList<Sala>();
    private ArrayList<MensagemPrivada> mensagens_rascunho = new ArrayList<MensagemPrivada>();
    private int n_mensagem_inbox = 0;
    private int n_mensagem_outbox = 0;
    private int n_salas_historico = 0;
    private int n_mensagem_rascunho = 0;

    public Utilizador(String username, String password, String nome, String apelido,
            Date data_nascimento, String email, String rua, String numero, String complemento,
            String cidade, String pais,int Type) {
        this.username = username;
        this.password = password;
        this.nome = nome;
        this.apelido = apelido;
        this.email = email;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
        this.data_nascimento = data_nascimento;
        this.pais = pais;
        this.type = 0;
    }
    
    public String getComplemento() {
        return complemento;
    }

    public String getEmail() {
        return email;
    }

    public String getNumero() {
        return numero;
    }

    public String getRua() {
        return rua;
    }

    public String getApelido() {
        return apelido;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public int getIdade() {
        return idade;
    }

    public ArrayList<MensagemPrivada> getInbox() {
        return inbox;
    }

    public ArrayList<MensagemPrivada> getMensagens_rascunho() {
        return mensagens_rascunho;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<MensagemPrivada> getOutbox() {
        return outbox;
    }

    public String getPais() {
        return pais;
    }

    public String getPassword() {
        return password;
    }

    public ArrayList<Sala> getSalas_historico() {
        return salas_historico;
    }

    public String getUsername() {
        return username;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getN_mensagem_outbox() {
        return n_mensagem_outbox;
    }

    public int getN_mensagem_rascunho() {
        return n_mensagem_rascunho;
    }

    public int getN_salas_historico() {
        return n_salas_historico;
    }

    public void addN_mensagem_inbox(int n_mensagem_inbox) {
        this.n_mensagem_inbox += n_mensagem_inbox;
    }

    public void addN_mensagem_outbox(int n_mensagem_outbox) {
        this.n_mensagem_outbox += n_mensagem_outbox;
    }

    public void addN_mensagem_rascunho(int n_mensagem_rascunho) {
        this.n_mensagem_rascunho += n_mensagem_rascunho;
    }

    public void addN_salas_historico(int n_salas_historico) {
        this.n_salas_historico += n_salas_historico;
    }

    public int getN_mensagem_inbox() {
        return n_mensagem_inbox;
    }

    //criar metodos para adicionar e remover mensagens inbox,salas,mensagens rascunhos
    public int add_mensagem_inbox(MensagemPrivada mensagens) {
        if (n_mensagem_inbox < 250) {
            inbox.add(mensagens);
            addN_mensagem_inbox(1);
            return 1;
        } else {
            return 0;
        }

    }

    public int add_mensagem_outbox(MensagemPrivada mensagens) {
        if (n_mensagem_outbox < 250) {
            outbox.add(mensagens);
            addN_mensagem_outbox(1);
            return 1;
        } else {
            return 0;
        }

    }

    public int add_mensagem_rascunho(MensagemPrivada mensagens) {
        if (n_mensagem_rascunho < 250) {
            mensagens_rascunho.add(mensagens);
            addN_mensagem_rascunho(1);
            return 1;
        } else {
            return 0;
        }

    }

    public int add_sala_historico(Sala salas) {
        if (n_salas_historico < 250) {
            salas_historico.add(salas);
            addN_salas_historico(1);
            return 1;
        } else {
            return 0;
        }

    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }
    

    public String getCidade() {
        return this.cidade;
    }
    
    @Override
    public String toString(){
        return this.nome+" "+this.apelido;
    }
}
