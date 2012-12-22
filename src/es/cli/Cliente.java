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
public class Cliente extends Utilizador implements Serializable{
    private Publicidade publ_activa []; // todas as publicidades do cliente
    private int total_publ_actuais;// numero total de publicidades activas nas salas
    private int total_publ_realizadas; // numero total de publicidades
    private int total_publ_expiradas;// numero total de publicidades que estão desactivadas
    private int investimento_feito; // investimento total realizado em todas as publicdades
    private Publicidade [] publ_historico; // todas publicidades que expiraram e que o cliente investiu
    private int n_publ_hist; // numero total de publicidades existentes no histórico
    private int n_publ_activa;// numero total de publicidades activas

    public Cliente(String username, String password, String nome, String apelido,
            Date data_nascimento, String email, String rua, String numero, String complemento,
            String cidade, String pais) {
        super(username, password, nome, apelido, data_nascimento, email, rua, numero,
                complemento, cidade, pais,1);
        publ_activa = new Publicidade[250];
        total_publ_actuais = 0;
        total_publ_expiradas = 0;
        total_publ_realizadas = 0;
        n_publ_activa = 0;
        n_publ_hist = 0;
        publ_historico = new Publicidade[250];
        investimento_feito = 0;
        
    }

    
}
