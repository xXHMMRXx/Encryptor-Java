
package mx.hammer.gui;


import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import javax.swing.JOptionPane;
import mx.hammer.entities.Entidades;
import mx.hammer.text.EBase64;
import mx.hammer.text.EHammer;


public class Text extends javax.swing.JFrame {

    private int z = 0;
    
    public Text() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(515,330);
        jComboBox1.addItem(" Selecciona una opción");
        jComboBox1.addItem(" Hammer");
        jComboBox1.addItem(" Base64");
        jComboBox1.setSelectedIndex(0);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Encryptor");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(101, 101, 101));
        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(144, 144, 144));
        jLabel2.setText("Mensaje:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 80, 30));

        jLabel3.setBackground(new java.awt.Color(101, 101, 101));
        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(144, 144, 144));
        jLabel3.setText("Mensaje Final:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 110, 30));

        jLabel4.setBackground(new java.awt.Color(101, 101, 101));
        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(144, 144, 144));
        jLabel4.setText("Tipo:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 60, 30));

        jComboBox1.setBackground(new java.awt.Color(1, 1, 1));
        jComboBox1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(173, 173, 173));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 300, -1));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(3, 3, 3));
        jTextField1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(144, 144, 144));
        jTextField1.setSelectedTextColor(new java.awt.Color(3, 3, 3));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 300, 30));

        jTextField2.setBackground(new java.awt.Color(3, 3, 3));
        jTextField2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(144, 144, 144));
        jTextField2.setSelectedTextColor(new java.awt.Color(3, 3, 3));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 300, 30));

        jButton1.setBackground(new java.awt.Color(1, 1, 1));
        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(144, 144, 144));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 110, -1));

        jButton2.setBackground(new java.awt.Color(1, 1, 1));
        jButton2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(144, 144, 144));
        jButton2.setText("Copiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 110, -1));

        jButton3.setBackground(new java.awt.Color(1, 1, 1));
        jButton3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(144, 144, 144));
        jButton3.setText("Aceptar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 110, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/fondo.jpeg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

      

        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        dispose();
        Menu m = new Menu();
        m.setVisible(true);
       

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            
        try {
            
            StringSelection ss = new StringSelection(jTextField1.getText());
            Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
            cb.setContents(ss, null);
            JOptionPane.showMessageDialog(null, "*** Mensaje copiado ***");
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        Entidades ent = new Entidades();

        if(z == 1){
        
            if(jComboBox1.getSelectedItem().equals(" Selecciona una opción")){

                JOptionPane.showMessageDialog(null, "*** Por favor seleccione un tipo ***");

            }else{

                if(jComboBox1.getSelectedItem().equals(" Hammer")){

                    if(jTextField2.getText().isEmpty()){

                        JOptionPane.showMessageDialog(null, "*** Por favor ingrese el mensaje ***");

                    }else{

                        String men = jTextField2.getText();
                        String mensaje = men.toUpperCase();
                        ent.setcMensaje(mensaje);
                        EHammer hmmr = new EHammer();
                        hmmr.cHammer(ent);
                        jTextField1.setText(ent.getcMensaje());
                        jTextField2.setText("");

                    }

                }

                if(jComboBox1.getSelectedItem().equals(" Base64")){

                    if(jTextField2.getText().isEmpty()){

                        JOptionPane.showMessageDialog(null, "*** Por favor ingrese el mensaje ***");

                    }else{

                        ent.setcMensaje(jTextField2.getText());
                        EBase64 base = new EBase64();
                        base.cBase64(ent);
                        jTextField1.setText(ent.getcMensaje());
                        jTextField2.setText("");

                    }

                }

            }
            
        }
        
        if(z == 2){
        
            if(jComboBox1.getSelectedItem().equals(" Selecciona una opción")){

                JOptionPane.showMessageDialog(null, "*** Por favor seleccione un tipo ***");

            }else{

                if(jComboBox1.getSelectedItem().equals(" Hammer")){

                    if(jTextField2.getText().isEmpty()){

                        JOptionPane.showMessageDialog(null, "*** Por favor ingrese el mensaje ***");

                    }else{

                        ent.setdMensaje(jTextField2.getText());
                        EHammer hmmr = new EHammer();
                        hmmr.dHammer(ent);
                        jTextField1.setText(ent.getdMensaje());
                        jTextField2.setText("");

                    }

                }

                if(jComboBox1.getSelectedItem().equals(" Base64")){

                    if(jTextField2.getText().isEmpty()){

                        JOptionPane.showMessageDialog(null, "*** Por favor ingrese el mensaje ***");

                    }else{

                        ent.setdMensaje(jTextField2.getText());
                        EBase64 base = new EBase64();
                        base.dBase64(ent);
                        jTextField1.setText(ent.getdMensaje());
                        jTextField2.setText("");

                    }

                }

            }
            
        }
        
          
//        dispose();
//        Menu m = new Menu();
//        m.setVisible(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

   
    public void v(int v){
        
        this.z = v;
        
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Text.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Text.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Text.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Text.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Text().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}