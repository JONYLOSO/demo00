
package demo;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class Frame_Error extends javax.swing.JFrame {

    public Frame_Error() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundPanel = new javax.swing.JPanel();
        TapPanel = new javax.swing.JPanel();
        CancelLabel = new javax.swing.JLabel();
        LogoLabel = new javax.swing.JLabel();
        TitleLabel = new javax.swing.JLabel();
        Button1 = new javax.swing.JButton();
        ErrorIconLabel = new javax.swing.JLabel();
        ErrorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        BackgroundPanel.setBackground(new java.awt.Color(27, 27, 33));

        TapPanel.setBackground(new java.awt.Color(18, 18, 18));
        TapPanel.setForeground(new java.awt.Color(18, 18, 18));
        TapPanel.setPreferredSize(new java.awt.Dimension(380, 30));
        TapPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                TapPanelMouseDragged(evt);
            }
        });
        TapPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TapPanelMousePressed(evt);
            }
        });

        CancelLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CancelLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo/icon/icons8_delete_20px_1.png"))); // NOI18N
        CancelLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CancelLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CancelLabelMouseExited(evt);
            }
        });

        LogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo/icon/icons8_error_20px_1.png"))); // NOI18N

        TitleLabel.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        TitleLabel.setForeground(new java.awt.Color(204, 204, 204));
        TitleLabel.setText("Input Error");

        javax.swing.GroupLayout TapPanelLayout = new javax.swing.GroupLayout(TapPanel);
        TapPanel.setLayout(TapPanelLayout);
        TapPanelLayout.setHorizontalGroup(
            TapPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TapPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LogoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CancelLabel)
                .addContainerGap())
        );
        TapPanelLayout.setVerticalGroup(
            TapPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CancelLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(TitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LogoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Button1.setBackground(new java.awt.Color(153, 153, 153));
        Button1.setText("OK");
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        ErrorIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo/icon/icons8_error_50px_2.png"))); // NOI18N

        ErrorLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        ErrorLabel.setForeground(new java.awt.Color(204, 204, 204));
        ErrorLabel.setText("Invalid Input  ,Try again");

        javax.swing.GroupLayout BackgroundPanelLayout = new javax.swing.GroupLayout(BackgroundPanel);
        BackgroundPanel.setLayout(BackgroundPanelLayout);
        BackgroundPanelLayout.setHorizontalGroup(
            BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TapPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(ErrorIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BackgroundPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        BackgroundPanelLayout.setVerticalGroup(
            BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addComponent(TapPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ErrorIconLabel)
                    .addComponent(ErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CancelLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelLabelMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_CancelLabelMouseClicked

    private void CancelLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelLabelMouseEntered
     CancelLabel.setIcon(new ImageIcon(getClass().getResource("/demo/icon/icons8_delete_20px_2.png")));
    }//GEN-LAST:event_CancelLabelMouseEntered

    private void CancelLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelLabelMouseExited
     CancelLabel.setIcon(new ImageIcon(getClass().getResource("/demo/icon/icons8_delete_20px_1.png")));
    }//GEN-LAST:event_CancelLabelMouseExited

    private void TapPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TapPanelMouseDragged
   
    }//GEN-LAST:event_TapPanelMouseDragged

    private void TapPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TapPanelMousePressed
    
    }//GEN-LAST:event_TapPanelMousePressed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_Button1ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame_Error.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_Error.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_Error.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_Error.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             new Frame_Error().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JButton Button1;
    private javax.swing.JLabel CancelLabel;
    private javax.swing.JLabel ErrorIconLabel;
    private javax.swing.JLabel ErrorLabel;
    private javax.swing.JLabel LogoLabel;
    private javax.swing.JPanel TapPanel;
    private javax.swing.JLabel TitleLabel;
    // End of variables declaration//GEN-END:variables
}
