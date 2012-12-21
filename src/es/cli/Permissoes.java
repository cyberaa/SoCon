package es.cli;

import java.io.Serializable;

/**
 *
 * @author exceltior
 */
public class Permissoes implements Serializable{
    private boolean kick;
    private boolean ban;
    private boolean unban;
    private boolean mod_sala_name;
    private boolean mod_sala_tema;
    private boolean mod_n_utlz_limite;
    private boolean mod_intervalo_mensagens;
    private boolean mod_mensagens;
    private boolean add_admin;
    private boolean remove_admin;
    private boolean check_popularity;
    private boolean super_user_access;

    public Permissoes() {
        this.kick = false;
        this.ban = false;
        this.unban = false;
        this.mod_sala_name = false;
        this.mod_sala_tema = false;
        this.mod_n_utlz_limite = false;
        this.mod_intervalo_mensagens = false;
        this.mod_mensagens = false;
        this.add_admin = false;
        this.remove_admin = false;
        this.check_popularity = false;
        this.super_user_access = false;
    }

    public Permissoes(boolean kick, boolean ban, boolean unban, boolean mod_sala_name,
            boolean mod_sala_tema, boolean mod_n_utlz_limite, boolean mod_intervalo_mensagens, 
            boolean mod_mensagens, boolean add_admin, boolean remove_admin, boolean check_popularity, 
            boolean super_user_access) {
        this.kick = kick;
        this.ban = ban;
        this.unban = unban;
        this.mod_sala_name = mod_sala_name;
        this.mod_sala_tema = mod_sala_tema;
        this.mod_n_utlz_limite = mod_n_utlz_limite;
        this.mod_intervalo_mensagens = mod_intervalo_mensagens;
        this.mod_mensagens = mod_mensagens;
        this.add_admin = add_admin;
        this.remove_admin = remove_admin;
        this.check_popularity = check_popularity;
        this.super_user_access = super_user_access;
    }

    public boolean isAdd_admin() {
        return add_admin;
    }

    public boolean isBan() {
        return ban;
    }

    public boolean isCheck_popularity() {
        return check_popularity;
    }

    public boolean isKick() {
        return kick;
    }

    public boolean isMod_intervalo_mensagens() {
        return mod_intervalo_mensagens;
    }

    public boolean isMod_mensagens() {
        return mod_mensagens;
    }

    public boolean isMod_n_utlz_limite() {
        return mod_n_utlz_limite;
    }

    public boolean isMod_sala_name() {
        return mod_sala_name;
    }

    public boolean isMod_sala_tema() {
        return mod_sala_tema;
    }

    public boolean isRemove_admin() {
        return remove_admin;
    }


    public boolean isSuper_user_access() {
        return super_user_access;
    }

    public boolean isUnban() {
        return unban;
    }

    public void setAdd_admin(boolean add_admin) {
        this.add_admin = add_admin;
    }


    public void setBan(boolean ban) {
        this.ban = ban;
    }

    public void setCheck_popularity(boolean check_popularity) {
        this.check_popularity = check_popularity;
    }

    public void setKick(boolean kick) {
        this.kick = kick;
    }

    public void setMod_intervalo_mensagens(boolean mod_intervalo_mensagens) {
        this.mod_intervalo_mensagens = mod_intervalo_mensagens;
    }

    public void setMod_mensagens(boolean mod_mensagens) {
        this.mod_mensagens = mod_mensagens;
    }

    public void setMod_n_utlz_limite(boolean mod_n_utlz_limite) {
        this.mod_n_utlz_limite = mod_n_utlz_limite;
    }

    public void setMod_sala_name(boolean mod_sala_name) {
        this.mod_sala_name = mod_sala_name;
    }

    public void setMod_sala_tema(boolean mod_sala_tema) {
        this.mod_sala_tema = mod_sala_tema;
    }

    public void setRemove_admin(boolean remove_admin) {
        this.remove_admin = remove_admin;
    }


    public void setSuper_user_access(boolean super_user_access) {
        this.super_user_access = super_user_access;
    }

    public void setUnban(boolean unban) {
        this.unban = unban;
    }
       
    
    
}
