

import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 * @author dosse
 */
public class GUI extends javax.swing.JFrame {
 
    //this class is used to test the microphone. it manages the volume meter
   /* private class MicTester extends Thread{
        private TargetDataLine mic = null;
        public MicTester() {
            
        }
        @Override
        public void run() {
                
                try {
                    AudioFormat af = SoundPacket.defaultFormat;
                    DataLine.Info info = new DataLine.Info(TargetDataLine.class, null);
                    mic = (TargetDataLine) (AudioSystem.getLine(info));
                    mic.open(af);
                    mic.start();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane,"Microphone not detected.\nPress OK to close this program", "Error",JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                }
                for (;;) {
                    Utils.sleep(10);
                    if(mic.available()>0){
                        byte[] buff=new byte[SoundPacket.defaultDataLenght];
                        mic.read(buff,0,buff.length);
                        long tot=0;
                        for(int i=0;i<buff.length;i++) tot+=MicThread.amplification*Math.abs(buff[i]);
                        tot*=2.5;
                        tot/=buff.length;
                
                    }
                }
            }
        private void close(){
            if(mic!=null) mic.close();
            stop();
        }
    }
    */
    /**
     * Creates new form GUI
     */
    public GUI() {
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

        b_call = new javax.swing.JButton();
        port = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        micVol = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        b_end = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        b_call.setBackground(new java.awt.Color(51, 255, 0));
        b_call.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b_call.setForeground(new java.awt.Color(255, 255, 255));
        b_call.setText("Call");
        b_call.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_callActionPerformed(evt);
            }
        });

        port.setText("2223");

        jLabel1.setText("Port");

        jLabel4.setText("Mic volume");

        micVol.setForeground(new java.awt.Color(51, 51, 255));
        micVol.setMaximum(300);
        micVol.setMinimum(50);
        micVol.setValue(100);
        micVol.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                micVolStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Air Millhouse  Italic", 1, 24)); // NOI18N
        jLabel2.setText("CALL");

        b_end.setBackground(new java.awt.Color(255, 0, 0));
        b_end.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b_end.setForeground(new java.awt.Color(255, 255, 255));
        b_end.setText("End");
        b_end.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_endMouseClicked(evt);
            }
        });
        b_end.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_endActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(b_call)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b_end))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(micVol, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(port, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(port, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(micVol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_call)
                    .addComponent(b_end))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_callActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_callActionPerformed
        try {
            new Client("103.1.237.137", Integer.parseInt(port.getText())).start(); //connect to specified server at specified port
        } catch (Exception ex) { //connection failed
            JOptionPane.showMessageDialog(rootPane, ex,"Error: ",JOptionPane.ERROR_MESSAGE);
            return;
        }
        //connected, disable buttons

       
        port.setEnabled(false);
        b_call.setEnabled(false);

        jLabel1.setEnabled(false);

       // micVol.setVisible(false);
        //jLabel4.setVisible(false);

       //setSize(getWidth(),getHeight()-75);
    }//GEN-LAST:event_b_callActionPerformed

    private void micVolStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_micVolStateChanged
        MicThread.amplification=((double)(micVol.getValue()))/100.0;
    }//GEN-LAST:event_micVolStateChanged

    private void b_endActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_endActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_endActionPerformed

    private void b_endMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_endMouseClicked
        System.exit(0);
    }//GEN-LAST:event_b_endMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_call;
    private javax.swing.JButton b_end;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSlider micVol;
    private javax.swing.JTextField port;
    // End of variables declaration//GEN-END:variables
}
