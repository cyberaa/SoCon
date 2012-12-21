package Principal;

import es.bd.BaseDeDados;
import es.cli.Utilizador;
import es.gui.main_uset;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Douglas
 */
public class Main {

    /*
     * Variáveis de sistema
     * bd aponta a base de dados utilizada
     * atual aponta o utilizador atual que está ativo no sistema
     */
    public static BaseDeDados bd;
    public static Utilizador atual;
    public string teste;

    /*
     * inicia o sistema criando uma nova base de dados e fazendo o teste para
     * verificar se já existe uma versão de base de dados ou se é necessário criar 
     * uma nova.
     */
    public static void main(String args[]) {
        JFrame j = new main_uset();
        bd = new BaseDeDados();
        bd.testeBanco();
        j.setVisible(true);
    }

    /*
     * Esta função faz a validação dos dados do login
     */
    public static boolean validarLogin(JDialog j, String text, String pass) {
        if (text.trim().isEmpty()) {
            JOptionPane.showMessageDialog(j, "Digite o seu nome de utilizador");
            return false;
        }
        if (pass.trim().isEmpty()) {
            JOptionPane.showMessageDialog(j, "Digite a sua password");
            return false;
        }
        return true;
    }

    /*
     * função de apoio para retornar as mensagens do ecrã de registo de utilizador
     */
    private static String returnMessage(int i) {
        switch (i) {
            case 0: {
                return "Introduz o nome de utilizador";
            }
            case 1: {
                return "Introduz a password";
            }
            case 2: {
                return "Introduz a password novamente";
            }
            case 3: {
                return "Introduz o seu nome";
            }
            case 4: {
                return "Introduz o seu email";
            }
            case 5: {
                return "A data deve ser no formato: dd/mm/aaaa";
            }
            case 6: {
                return "Introduz a rua da sua morada";
            }
            case 7: {
                return "Introduz o número da morada válido";
            }
            case 8: {
                return "Introduz a cidade";
            }
            case 9: {
                return "Introduz o país";
            }
            case 10: {
                return "Introduz o seu apelido";
            }
        }
        return "";
    }

    /*
     * Esta função faz a validação dos dados introduzidos no ecrã de registo de novo
     * utilizador
     */
    public static boolean validarRegisto(JDialog j, String user, String pass1, String pass2,
            String nome, String apelido, String email, String dataAniversario,
            String rua, String numero, String cidade, String pais) {
        String text = "";
        boolean x = true;
        if (user.trim().isEmpty()) {
            text += "- " + returnMessage(0) + "\n";
            x = false;
        }
        if (pass1.trim().isEmpty()) {
            text += "- " + returnMessage(1) + "\n";
            x = false;
        }
        if (pass2.trim().isEmpty()) {
            text += "- " + returnMessage(2) + "\n";
            x = false;
        }
        if (!pass1.equals(pass2)) {
            text += "- Introduz a mesma password no campo de confirmação\n";
            x = false;
        }
        if (nome.trim().isEmpty()) {
            text += "- " + returnMessage(3) + "\n";
            x = false;
        }
        if (apelido.trim().isEmpty()) {
            text += "- " + returnMessage(10) + "\n";
            x = false;
        }
        
        //Set the email pattern string  
        Pattern p = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,7}$");

        //Match the given string with the pattern  
        Matcher m = p.matcher(email);

        //check whether match is found   
        boolean matchFound = m.matches();

        if (!matchFound) {
            text += "- Introduz um email válido\n";
            x = false;
        }


        if (dataAniversario.trim().isEmpty()) {
            text += "- " + returnMessage(5) + "\n";
            x = false;
        } else {
            try {
                DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                Date data = (java.util.Date) formatter.parse(dataAniversario);
            } catch (Exception e) {
                text += "- Introduz uma data de aniversário válida\n";
                x = false;
            }
        }

        if (rua.trim().isEmpty()) {
            text += "- " + returnMessage(6) + "\n";
            x = false;
        }


        try {
            int n = Integer.parseInt(numero);
        } catch (Exception e) {
            text += "- " + returnMessage(7) + "\n";
            x = false;
        }

        if (cidade.trim().isEmpty()) {
            text += "- " + returnMessage(8) + "\n";
            x = false;
        }

        if (pais.trim().isEmpty()) {
            text += "- " + returnMessage(9) + "\n";
            x = false;
        }

        if (searchUser(user)) {
            text += "- Já existe um utilizador com esse nome!";
            x = false;
        }
        if (!x) {
            text = "Os seguintes erros foram encontrados: \n\n" + text;
            JOptionPane.showMessageDialog(j, text, "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return x;
    }

    private static boolean searchUser(String user) {
        return bd.search(user);
    }
}
