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
public class Gestor extends Utilizador implements Serializable {

    private int id_gestor; // id do gestor
    private Sala[] salas_geridas; // todas as salas as quais o gestor foi destacado a gerir
    private boolean superuser; // se e um gestor com poderes totais sobre o sistema

    public Gestor(int id_gestor, boolean superuser, String username, String password, String nome, String apelido,
            Date data_nascimento, String email, String rua, String numero, String complemento,
            String cidade, String pais) {
        super(username, password, nome, apelido, data_nascimento, email, rua, numero,
                complemento, cidade, pais,2);
        this.id_gestor = id_gestor;
        this.superuser = false;
    }

       /*
        * Função serve para devolver todas as salas as quais o gestor foi destacado
        */
    public Sala[] getSalas_geridas() {
        return salas_geridas;
    }
    /*
     * Função criada para devolver o id do gestor
     */
    public int getId_gestor() {
        return id_gestor;
    }
    /*
     * Função destinada a identificar se o gestor tem poderes totais no sistema
     */

    public boolean isSuperuser() {
        return superuser;
    }
    /*
     * Função destinada para receber um id unico que vai ser utilizado no gestor
     * para meios de identificação
     */
    public void setId_gestor(int id_gestor) {
        this.id_gestor = id_gestor;
    }
    /*
     * Função destinada a alterar os poderes totais no sistema de um gestor
     */
    public void setSuperuser(boolean superuser) {
        this.superuser = superuser;
    }
}
