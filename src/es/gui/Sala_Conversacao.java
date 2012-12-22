/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.gui;

import Principal.Main;
import Principal.MessageTimer;
import es.cli.MensagemSala;
import es.cli.Sala;
import es.cli.Utilizador;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.util.*;
import javax.rmi.CORBA.Util;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author exceltior
 */
public class Sala_Conversacao extends javax.swing.JFrame {

    Sala sala_actual;
    MensagemSala mensagem_actual;

    /**
     * Creates new form Sala_Conversacao
     */
    public Sala_Conversacao(Sala s) {
        this.sala_actual = s;
        mensagem_actual = new MensagemSala();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem8 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        close_bttn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mensagem = new javax.swing.JTextField();
        post_bttn = new javax.swing.JButton();
        advanced_bttn = new javax.swing.JButton();
        roomName = new javax.swing.JTextField();
        roomMessage = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JPanel();
        refresh_buttn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        jMenuItem8.setText("jMenuItem8");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Utilizadores");

        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jList1);

        jButton1.setText("Start Conversation");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Online", "Busy", "Away", "Offline" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        close_bttn.setText("Close");
        close_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_bttnActionPerformed(evt);
            }
        });

        jLabel2.setText("Room Name:");

        jLabel3.setText("Room Message:");

        post_bttn.setText("Post");
        post_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                post_bttnActionPerformed(evt);
            }
        });

        advanced_bttn.setText("Advanced");
        advanced_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                advanced_bttnActionPerformed(evt);
            }
        });

        roomName.setEditable(false);

        roomMessage.setEditable(false);

        javax.swing.GroupLayout tableLayout = new javax.swing.GroupLayout(table);
        table.setLayout(tableLayout);
        tableLayout.setHorizontalGroup(
            tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 492, Short.MAX_VALUE)
        );
        tableLayout.setVerticalGroup(
            tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 314, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(table);

        refresh_buttn.setText("Refresh");
        refresh_buttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh_buttnActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setText("Upload Image");
        jMenu1.add(jMenuItem1);

        jMenuItem17.setText("Upload Text File");
        jMenu1.add(jMenuItem17);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Close");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem4.setText("Name");
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Limit Users Numbers");
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Add/Remove Mods");
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Add/Remove Admins");
        jMenu2.add(jMenuItem7);

        jMenuItem3.setText("Permissions");
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Kick");

        jMenuItem10.setText("User by Name");
        jMenu3.add(jMenuItem10);

        jMenuItem11.setText("User w/message");
        jMenu3.add(jMenuItem11);

        jMenuItem12.setText("Warn User");
        jMenu3.add(jMenuItem12);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Ban");

        jMenuItem13.setText("Ban User By Name");
        jMenu4.add(jMenuItem13);

        jMenuItem14.setText("Ban Multiple Users");
        jMenu4.add(jMenuItem14);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Options");

        jMenuItem15.setText("Invite Friends");
        jMenu5.add(jMenuItem15);

        jMenuItem16.setText("Request System Admin Help");
        jMenu5.add(jMenuItem16);

        jMenuItem9.setText("Set Visibility");
        jMenu5.add(jMenuItem9);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(roomMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(roomName, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(post_bttn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(advanced_bttn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(refresh_buttn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(close_bttn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(roomName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(roomMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mensagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(post_bttn)
                            .addComponent(advanced_bttn))
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(close_bttn)
                            .addComponent(refresh_buttn))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void post_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_post_bttnActionPerformed

        if (mensagem.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite a mensagem");
        } else {
            mensagem_actual.setTexto_mensagem(mensagem.getText());
            Calendar c = Calendar.getInstance();
            Date actual = c.getTime();
            mensagem_actual.setData_criada(actual);
            mensagem_actual.setEmissor(Main.atual);
            if (mensagem_actual.getDelay() > 0) {
                MessageTimer mt = new MessageTimer(sala_actual, mensagem_actual);
                JOptionPane.showMessageDialog(this, "A mensagem será publicada em "+mensagem_actual.getDelay()
                        +" segundos");
            } else {
                mensagem_actual.setData_envio(actual);
                sala_actual.addMensagem(mensagem_actual);
                Main.bd.Serializar();
            }
            atualizarMensagens();
            mensagem_actual = new MensagemSala();
        }

    }//GEN-LAST:event_post_bttnActionPerformed

    private void advanced_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_advanced_bttnActionPerformed
        Upload_File_Delay upd = new Upload_File_Delay(this, mensagem_actual);
        upd.setVisible(true);
    }//GEN-LAST:event_advanced_bttnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        roomName.setText(sala_actual.getNome());
        roomMessage.setText(sala_actual.getDescricao_sala());
        sala_actual.addLista_utilizadores(Main.atual);
        Main.bd.Serializar();
        mostrarUtilizadores();
        atualizarMensagens();
    }//GEN-LAST:event_formWindowOpened

    private void close_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_bttnActionPerformed
        this.dispose();
    }//GEN-LAST:event_close_bttnActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        sala_actual.removeUtilizador(Main.atual);
        Main.bd.Serializar();
    }//GEN-LAST:event_formWindowClosed

    private void refresh_buttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh_buttnActionPerformed
        roomName.setText(sala_actual.getNome());
        roomMessage.setText(sala_actual.getDescricao_sala());
        atualizarMensagens();
        Main.bd.Serializar();
        mostrarUtilizadores();
    }//GEN-LAST:event_refresh_buttnActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton advanced_bttn;
    private javax.swing.JButton close_bttn;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField mensagem;
    private javax.swing.JButton post_bttn;
    private javax.swing.JButton refresh_buttn;
    private javax.swing.JTextField roomMessage;
    private javax.swing.JTextField roomName;
    private javax.swing.JPanel table;
    // End of variables declaration//GEN-END:variables

    private void mostrarUtilizadores() {
        jList1.removeAll();

        DefaultListModel dl = new DefaultListModel();
        ArrayList util = sala_actual.getLista_utilizadores();
        ArrayList u = util;
        for (int i = 0; i < util.size(); i++) {
            dl.addElement(util.get(i));
        }

        jList1.setModel(dl);
    }

    public void msgSala(MensagemSala msg) {
        this.mensagem_actual = msg;
    }

    private void atualizarMensagens() {
        table.removeAll();

        ArrayList l = sala_actual.getMensagens_sala();
        table.setLayout(new GridBagLayout());
        GridBagConstraints cc = new GridBagConstraints();

        cc.insets = new Insets(5, 5, 5, 5);
        cc.gridx = 0;
        cc.gridy = 0;

        //DefaultListModel dl = new DefaultListModel();
        for (int i = 0; i < l.size(); i++) {
            MensagemSala ms = (MensagemSala) l.get(i);
            mensagens_panel mp = new mensagens_panel(ms);

            cc.anchor = GridBagConstraints.WEST;
            table.add(mp, cc);
            cc.gridy++;
            //dl.addElement(i+" - "+ms.getTexto_mensagem());

        }
        //jList2.setModel(dl);
        table.update(table.getGraphics());
        table.paint(table.getGraphics());
        table.revalidate();
    }
}
