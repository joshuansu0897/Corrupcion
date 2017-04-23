package proyectop;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class NewJFrame1 extends javax.swing.JFrame {

    public NewJFrame1() {

        initComponents();

    }

    public class progreso implements ActionListener {

        public void actionPerformed(ActionEvent evt) {
            int n = jProgressBar1.getValue();
            jProgressBar1.setMaximum(10);
            int mac = jProgressBar1.getMaximum();
            if (n < mac) {
                n++;
                jProgressBar1.setValue(n);
                if (n > (mac / 2)) {
                    jProgressBar1.setForeground(Color.ORANGE);
                }
                if (n > ((mac/3.5) * 3)) {
                    jProgressBar1.setForeground(Color.decode("#3ab83a"));
                }
            } else {
                timer.stop();
                new NewJFrame2().setVisible(true);
                dispose();
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jProgressBar1.setForeground(new java.awt.Color(255, 0, 51));
        jProgressBar1.setToolTipText("");
        jProgressBar1.setValue(0);
        jProgressBar1.setEnabled(false);
        jProgressBar1.setName("Cargando"); // NOI18N
        jProgressBar1.setString("¡Click aquí!");
        jProgressBar1.setStringPainted(true);
        jProgressBar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jProgressBar1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        timer = new Timer(500, new progreso());

    }//GEN-LAST:event_formWindowOpened

    private void jProgressBar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jProgressBar1MouseClicked
        timer.start();
        jProgressBar1.setString("Cargando...");
    }//GEN-LAST:event_jProgressBar1MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame1().setVisible(true);
            }
        });
    }

    private Timer timer;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
