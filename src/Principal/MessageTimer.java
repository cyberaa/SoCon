/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import es.cli.MensagemSala;
import es.cli.Sala;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author cyberaa
 */
public class MessageTimer {
    public Timer timer; /* criação de um objecto do tipo timer*/
    /*
     * Esta função recebe como parâmetros a sala e a mensagem para comecar a contagem
     * para a mensagem ser publicada
     * A funcao vai chamar remindtask com os mesmo parâmetros para publicar a mensagem quando este método for chamado a executar.
     */
     public MessageTimer(Sala sala, MensagemSala msg) {
        timer = new Timer();/* inicialização de um timer para utilizar em cada mensagem*/
        timer.schedule(new RemindTask(sala,msg), msg.getDelay()*1000);//permite calcular o delay através da mensagem passada na função
    }

        /*Esta classe vai ser chamada a executar quando o delay for cumprido através de uma thread*/
    class RemindTask extends TimerTask {

        MensagemSala msg;
        Sala sala;
        /*Recebe a mensagem e sala onde esta vai ser publicada*/
        private RemindTask(Sala sala, MensagemSala msg) {
            this.msg = msg;
            this.sala = sala;
        }
        /*este metódo é chamado para correr uma thread para publicar a mensagem depois de o delay acabar*/
        @Override
        public void run() {
            System.out.println("Time's up!");
            Calendar c = Calendar.getInstance();
            Date actual = c.getTime();
            msg.setData_envio(actual);
            sala.addMensagem(msg);
            Main.bd.Serializar();
            timer.cancel(); //Terminate the timer thread
        }
    }

    
}
