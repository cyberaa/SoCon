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
    public Timer timer;
     public MessageTimer(Sala sala, MensagemSala msg) {
        timer = new Timer();
        timer.schedule(new RemindTask(sala,msg), msg.getDelay()*1000);
    }

    class RemindTask extends TimerTask {

        MensagemSala msg;
        Sala sala;
        
        private RemindTask(Sala sala, MensagemSala msg) {
            this.msg = msg;
            this.sala = sala;
        }
        
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
