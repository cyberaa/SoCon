package es.bd;

import es.cli.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import es.cli.Utilizador;

/**
 *
 * @author Douglas
 */
public class BaseDeDados {

    /*
     * Variáveis de sistema caminho contém o caminho da base de dados
     * listUtilizadores contém a lista de utilizadores registados no sistema
     * atual contém o utilizador ativo que realizou o login
     *
     */
    List<Utilizador> listUtilizadores; // lista geral de utilizadores no sistema
    ArrayList<Tema> lista_temas; // lista geral de temas existentes no sistema
    ArrayList<Sala> lista_salas; // lista geral de salas existentes no sistema
    int nlista_user = 0; // numero total de utilizadores na lista de utilizadores
    int nlista_temas = 0;// numero total de temas existente na lista de temas
    int nlista_salas = 0;// numero total de salas existente na lista de salas
    int nlista_clientes = 0;
    int nlista_gestor = 0;
    Utilizador atual;
    private String caminho;

    //Cria um objeto BaseDeDados
    public BaseDeDados() {
        listUtilizadores = new ArrayList<>();
        lista_temas = new ArrayList<Tema>();
        lista_salas = new ArrayList<Sala>();
        caminho = "C:\\dados\\dados.txt";
    }

    /*
     * Esta função verifica se existe um arquivo no diretório indicado no
     * construtor do objeto, se existir, o sistema faz a leitura dos dados, se
     * não existir, o sistema cria uma nova base de dados com um novo utilizador
     * admin
     */
    public void testeBanco() {
        try {
            File f = new File(caminho);
            f = new File(f.getParent());
            f.mkdir();
            f = new File(caminho);
            if (!f.exists()) {
                //JOptionPane.showMessageDialog(null, "Não foi encontrado banco de dados anteriores.\n"
                //        + "será criado um novo banco em C:/dados/", "Erro", 1);
                Gestor g = new Gestor(1, true, "admin", "admin", "Administrador", "", new Date(2012, 01, 01),
                        "admin@admin.com.br", "", "", "", "", "Portugal");
                addUtilizador(g);
                Serializar();
            } else {
                desSerializar();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Um erro ocorreu ao tentar executar essa operação",
                    "Erro", 0);
        }
    }

    /*
     * Esta função faz a escrita dos objetos na base de dados
     */
    public void Serializar() {
        try {
            FileOutputStream arquivoGrav = new FileOutputStream(caminho, false);
            ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
            //objGravar.writeObject(objetos);
            objGravar.writeObject(listUtilizadores);
            objGravar.writeObject(lista_temas);
            objGravar.writeObject(lista_salas);
            objGravar.writeObject(nlista_user);
            objGravar.writeObject(nlista_temas);
            objGravar.writeObject(nlista_salas);
            objGravar.writeObject(nlista_clientes);
            objGravar.writeObject(nlista_gestor);
            objGravar.flush();
            objGravar.close();
            arquivoGrav.flush();
            arquivoGrav.close();
            System.out.println("Arquivo salvo com sucesso");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Um erro ocorreu ao tentar salvar no banco\n\nERRO: " + e.getMessage(),
                    "Erro", 0);
            System.exit(0);
        }
    }

    /*
     * Esta função faz a leitura dos objetos na base de dados
     */
    public void desSerializar() {
        try {
            FileInputStream arquivoLeitura = new FileInputStream(caminho);
            ObjectInputStream objLeitura = new ObjectInputStream(arquivoLeitura);
            //objetos = (List) objLeitura.readObject();
            listUtilizadores = (List) objLeitura.readObject();
            lista_temas = (ArrayList) objLeitura.readObject();
            lista_salas = (ArrayList) objLeitura.readObject();
            nlista_user = (int) objLeitura.readObject();
            nlista_temas = (int) objLeitura.readObject();
            nlista_salas = (int) objLeitura.readObject();
            nlista_clientes = (int) objLeitura.readObject();
            nlista_gestor = (int) objLeitura.readObject();
            objLeitura.close();
            arquivoLeitura.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Um erro ocorreu ao tentar carregar os dados do banco",
                    "Erro", 0);
        }
    }

    /*
     * Esta função faz a validação do login, verifica se o utilizador existe e
     * se a password indicada confere com a password na base de dados
     */
    public boolean checkExists(String user, String pass) {
        for (int i = 0; i < listUtilizadores.size(); i++) {
            es.cli.Utilizador util = (es.cli.Utilizador) listUtilizadores.get(i);
            if (util.getUsername().equals(user) && util.getPassword().equals(pass)) {
                atual = util;
                return true;
            }
        }
        return false;
    }

    /*
     * Esta função adiciona o novo utilizador na base de dados e escreve os
     * dados na base de dados
     */
    public int addUtilizador(Utilizador u) {
        if (check_user_exist(u.getNome()) == 0) {
            listUtilizadores.add(u);
            nlista_user++;
            Serializar();
            return 1; // utilizador adicionado
        } else {
            return 0;// utilizador ja existe
        }
    }
    /*
     * Esta função vai verificar se o tema com o nome pretendido existe no
     * sistema se não existir vai adicionar o tema a lista de temas e vai guarda
     * e devolve 1 se existir devolve 0
     */

    public int addTema(Tema t) {
        if (check_tema_exist(t.getNome_tema()) == 0) {
            lista_temas.add(t);
            nlista_temas++;
            Serializar();
            return 1;
        } else {
            return 0;
        }

    }
    /*
     * Esta função vai vericar se o tema existe, se existir a funcao devolve 1
     * se não existir a função devolve 0 Esta função é para ser usada por
     * addTema() para fazer uma inserção correcta.
     */

    public int check_tema_exist(String name) {

        for (int i = 0; i < nlista_temas; i++) {
            if (lista_temas.get(i).getNome_tema().compareToIgnoreCase(name) == 0) {
                return 1;
            }
        }
        return 0;
    }
    /*
     * Esta função vai verificar se o utilizador ja existe no sistema se existir
     * devolve 1 senão devolve 0 Esta função é para ser usada por
     * addUtilizador() para fazer uma inserção correcta.
     */

    public int check_user_exist(String username) {

        for (int i = 0; i < nlista_user; i++) {
            if (listUtilizadores.get(i).getNome().compareToIgnoreCase(username) == 0) {
                return 1;
            }
        }
        return 0;
    }
    /*
     * Esta função vai verificar se a sala ja existe no sistema se existir
     * devolve 1 senão devolve 0 Esta função é para ser usada por addSala() para
     * fazer uma inserção correcta.
     */

    public int check_sala_exist(String n) {

        for (int i = 0; i < nlista_salas; i++) {
            if (lista_salas.get(i).getNome().compareToIgnoreCase(n) == 0) {
                return 1;
            }
        }
        return 0;
    }
    /*
     * Esta função vai adicionar uma sala ao sistema depois de verificar se já
     * não existir uma com esse nome adiciona e guarda em ficheiro devolvendo 1
     * senão devolve 0 ao sistema para saber que já existe uma sala com esse
     * nome.
     */

    public int addSala(Sala s) {
        if (check_sala_exist(s.getNome()) == 0) {
            lista_salas.add(s);
            nlista_salas++;
            Serializar();
            return 1;
        }
        return 0;
    }
    /*
     * Esta função vai verificar se o utilizador existe através do username se
     * existir a função devolve o utilizador pretendido senão devolve null ao
     * sistema
     */

    public Utilizador get_user_by_name(String username) {
        Utilizador user = null;
        for (int i = 0; i < nlista_user; i++) {
            if (listUtilizadores.get(i).getNome().compareToIgnoreCase(username) == 0) {
                user = listUtilizadores.get(i);
                return user;
            }
        }
        return null;
    }
    /*
     * Esta função procura um tema pelo nome se o tema existir devolve o tema
     * pretendido senão devolve null
     */

    public Tema get_tema_by_name(String n) {
        Tema t = null;
        for (int i = 0; i < nlista_temas; i++) {
            if (lista_temas.get(i).getNome_tema().compareToIgnoreCase(n) == 0) {
                t = lista_temas.get(i);
                return t;
            }
        }
        return null;
    }
    /*
     * Esta função procura uma saça pelo nome se a sala existir devolve a sala
     * pretendida senão devolve null
     */

    public Sala get_sala_by_name(String n) {
        Sala t = null;
        for (int i = 0; i < nlista_salas; i++) {
            if (lista_salas.get(i).getNome().compareToIgnoreCase(n) == 0) {
                t = lista_salas.get(i);
                return t;
            }
        }
        return null;
    }

    /*
     * Função utilizada para listar todos os utilizadores do sistema devolve um
     * array com todos os utilizadores
     */
    public Utilizador[] get_all_users() {
        Utilizador[] users = new Utilizador[nlista_user];
        for (int i = 0; i < nlista_user; i++) {
            users[i] = listUtilizadores.get(i);
        }
        return users;
    }
    /*
     * Função utilizada para listar todos os Temas do sistema devolve um array
     * com todos os Temas
     */

    public Tema[] get_all_temas() {
        Tema[] t = new Tema[nlista_temas];
        for (int i = 0; i < nlista_temas; i++) {
            t[i] = lista_temas.get(i);
        }
        return t;
    }
    /*
     * Função utilizada para listar todas as Salas do sistema devolve um array
     * com todas as salas
     */

    public Sala[] get_all_salas() {
        Sala[] s = new Sala[nlista_salas];
        for (int i = 0; i < nlista_salas; i++) {
            s[i] = lista_salas.get(i);
        }
        return s;
    }
    /*
     * Função que verifica se um cliente existe no sistema devolve 1 se existir
     * se não existir devolve 0
     */

    public int check_client_exist(String username) {
        for (int i = 0; i < nlista_clientes; i++) {
            if (listUtilizadores.get(i).getType() == 1 && listUtilizadores.get(i).getNome().compareToIgnoreCase(username) == 0) {
                return 1;
            }
        }
        return 0;
    }
    /*
     * Função que verifica se um gestor existe no sistema devolve 1 se existir
     * se não existir devolve 0
     */

    public int check_gestor_exist(String username) {
        for (int i = 0; i < nlista_gestor; i++) {
            if (listUtilizadores.get(i).getType() == 2 && listUtilizadores.get(i).getNome().compareToIgnoreCase(username) == 0) {
                return 1;
            }
        }
        return 0;
    }
    /*
     * Esta função vai adicionar um cliente ao sistema depois de verificar se já
     * não existir uma com esse nome adiciona e guarda em ficheiro devolvendo 1
     * senão devolve 0 ao sistema para saber que já existe uma cliente com esse
     * nome.
     */

    public int addCliente(Cliente s) {
        if (check_client_exist(s.getNome()) == 0) {
            listUtilizadores.add(s);
            nlista_clientes++;
            nlista_user++;
            Serializar();
            return 1;
        }
        return 0;
    }
    /*
     * Esta função vai adicionar um gestor ao sistema depois de verificar se já
     * não existir uma com esse nome adiciona e guarda em ficheiro devolvendo 1
     * senão devolve 0 ao sistema para saber que já existe uma gestor com esse
     * nome.
     */

    public int addGestor(Gestor s) {
        if (check_gestor_exist(s.getNome()) == 0) {
            listUtilizadores.add(s);
            nlista_gestor++;
            nlista_user++;
            Serializar();
            return 1;
        }
        return 0;
    }
    /*
     *
     */

    public int remove_utilizador_by_name(String username) {
        if (check_user_exist(username) == 1) {
            for (int i = 0; i < nlista_user; i++) {
                if (listUtilizadores.get(i).getNome().compareToIgnoreCase(username) == 0) {
                    if (listUtilizadores.get(i).getType() == 1) {
                        nlista_clientes--;

                    }
                    if (listUtilizadores.get(i).getType() == 2) {
                        nlista_gestor--;
                    }
                    listUtilizadores.remove(i);
                    nlista_user--;
                    return 1;
                }
            }
        } else {
            return 0;
        }
        return 0;
    }
    /*
     *
     */

    public int remove_tema_by_name(String n) {
        if (check_tema_exist(n) == 1) {
            for (int i = 0; i < nlista_temas; i++) {
                if (lista_temas.get(i).getNome_tema().compareToIgnoreCase(n) == 0) {
                    lista_temas.remove(i);
                    nlista_temas--;
                    return 1;
                }
            }
        } else {
            return 0;
        }
        return 0;

    }
    /*
     *
     */

    public int remove_sala_by_name(String n) {
        if (check_sala_exist(n) == 1) {
            for (int i = 0; i < nlista_salas; i++) {
                if (lista_salas.get(i).getNome().compareToIgnoreCase(n) == 0) {
                    lista_salas.remove(i);
                    nlista_salas--;
                    return 1;
                }
            }
        } else {
            return 0;
        }
        return 0;

    }

    /*
     * Essa função retorna o utilizador atual que está com o login ativo no
     * sistema
     */
    public Utilizador getAtual() {
        return atual;
    }

    public boolean search(String user) {
        for (int i = 0; i < listUtilizadores.size(); i++) {
            es.cli.Utilizador util = (es.cli.Utilizador) listUtilizadores.get(i);
            if (util.getUsername().equals(user)) {
                return true;
            }
        }
        return false;
    }
}
