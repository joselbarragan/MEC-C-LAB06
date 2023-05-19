
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class TragaM extends javax.swing.JFrame {

    /**
     * Creates new form TragaM
     */
    public TragaM() {
        initComponents();
        a = new animacion(figura1.getSize());        
        figura1.add(a);
        figura1.repaint();   
        b = new animacion(figura2.getSize());        
        figura2.add(b);
        figura2.repaint(); 
        c = new animacion(figura3.getSize());        
        figura3.add(c);
        figura3.repaint();   
        d = new animacion(figura4.getSize());        
        figura4.add(d);
        figura4.repaint(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bmenu = new javax.swing.JButton();
        figura4 = new javax.swing.JLabel();
        figura3 = new javax.swing.JLabel();
        figura2 = new javax.swing.JLabel();
        figura1 = new javax.swing.JLabel();
        Activador = new javax.swing.JButton();
        premio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Bmenu.setText("MENU");
        Bmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BmenuActionPerformed(evt);
            }
        });

        figura4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/figuras/figura8.png"))); // NOI18N

        figura3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/figuras/figura3.png"))); // NOI18N

        figura2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/figuras/figura2.png"))); // NOI18N

        figura1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/figuras/figura1.png"))); // NOI18N

        Activador.setText("TIRAR");
        Activador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActivadorActionPerformed(evt);
            }
        });

        premio.setEditable(false);
        premio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                premioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Bmenu)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(figura1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(figura2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(figura3, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(figura4, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(premio, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addComponent(Activador, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(figura1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(figura2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(figura3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(figura4, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(premio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(Activador, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(Bmenu)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BmenuActionPerformed
        Menu abrir = new Menu();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BmenuActionPerformed

    private void ActivadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActivadorActionPerformed
        if (Activador.getText().equals("TIRAR")){
            Activador.setText("PARAR");
            a.startAnimation(); d.startAnimation(); b.startAnimation(); c.startAnimation();
            premio.setText("");
               
            
        }
        else
        {
            a.stopAnimation(); b.stopAnimation(); c.stopAnimation(); d.stopAnimation();
            
            if (a.getIm() == b.getIm() && b.getIm() == c.getIm() && c.getIm() == d.getIm()){
                JOptionPane.showMessageDialog(null, "Ganador");
            }else{
                JOptionPane.showMessageDialog(null, "Perdedor");
            }
           
            
            
            Activador.setText("TIRAR");
        }
    }//GEN-LAST:event_ActivadorActionPerformed

    private void premioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_premioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_premioActionPerformed

    /**
     * @param args the command line arguments
     */
    animacion a ; 
    animacion b ;
    animacion c ; 
    animacion d ;
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
            java.util.logging.Logger.getLogger(TragaM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TragaM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TragaM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TragaM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TragaM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Activador;
    private javax.swing.JButton Bmenu;
    private javax.swing.JLabel figura1;
    private javax.swing.JLabel figura2;
    private javax.swing.JLabel figura3;
    private javax.swing.JLabel figura4;
    private javax.swing.JTextField premio;
    // End of variables declaration//GEN-END:variables
}
