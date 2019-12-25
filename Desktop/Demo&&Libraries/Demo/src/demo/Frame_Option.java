
package demo;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class Frame_Option extends javax.swing.JFrame {
     int xx;
     int xy;
     Desktop desktop =Desktop.getDesktop();
  
    public Frame_Option() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundPanel = new javax.swing.JPanel();
        TapPanel = new javax.swing.JPanel();
        CancelLabel = new javax.swing.JLabel();
        HideLabel = new javax.swing.JLabel();
        LogoLabel = new javax.swing.JLabel();
        TitleLabel = new javax.swing.JLabel();
        VesionLabel = new javax.swing.JLabel();
        TitlePanel = new javax.swing.JPanel();
        TitleLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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

        HideLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo/icon/icons8_subtract_20px.png"))); // NOI18N
        HideLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        HideLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HideLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HideLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HideLabelMouseExited(evt);
            }
        });

        LogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo/icon/icons8_currency_exchange_20px_3.png"))); // NOI18N

        TitleLabel.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        TitleLabel.setForeground(new java.awt.Color(204, 204, 204));
        TitleLabel.setText("EXCHANG CURRENCY");

        javax.swing.GroupLayout TapPanelLayout = new javax.swing.GroupLayout(TapPanel);
        TapPanel.setLayout(TapPanelLayout);
        TapPanelLayout.setHorizontalGroup(
            TapPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TapPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LogoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addComponent(HideLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CancelLabel)
                .addContainerGap())
        );
        TapPanelLayout.setVerticalGroup(
            TapPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TapPanelLayout.createSequentialGroup()
                .addGroup(TapPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CancelLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TapPanelLayout.createSequentialGroup()
                        .addComponent(HideLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(LogoLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        VesionLabel.setForeground(new java.awt.Color(204, 204, 204));
        VesionLabel.setText("Vesion 0.0.0");

        TitlePanel.setBackground(new java.awt.Color(0, 110, 81));
        TitlePanel.setPreferredSize(new java.awt.Dimension(247, 30));

        TitleLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TitleLabel2.setForeground(new java.awt.Color(18, 18, 18));
        TitleLabel2.setText("Option");

        javax.swing.GroupLayout TitlePanelLayout = new javax.swing.GroupLayout(TitlePanel);
        TitlePanel.setLayout(TitlePanelLayout);
        TitlePanelLayout.setHorizontalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TitlePanelLayout.setVerticalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TitleLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText(" Credit Exchange Rate ");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BackgroundPanelLayout = new javax.swing.GroupLayout(BackgroundPanel);
        BackgroundPanel.setLayout(BackgroundPanelLayout);
        BackgroundPanelLayout.setHorizontalGroup(
            BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(VesionLabel)
                .addContainerGap())
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(TitlePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                    .addComponent(TapPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackgroundPanelLayout.setVerticalGroup(
            BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addComponent(TapPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addComponent(VesionLabel)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TapPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TapPanelMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_TapPanelMousePressed

    private void TapPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TapPanelMouseDragged
        int xxx=evt.getXOnScreen();
        int yyy=evt.getYOnScreen();
        this.setLocation(xxx-xx,yyy-xy);
    }//GEN-LAST:event_TapPanelMouseDragged

    private void HideLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HideLabelMouseExited
        HideLabel.setIcon(new ImageIcon(getClass().getResource("/demo/icon/icons8_subtract_20px_1.png")));
    }//GEN-LAST:event_HideLabelMouseExited

    private void HideLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HideLabelMouseEntered
        HideLabel.setIcon(new ImageIcon(getClass().getResource("/demo/icon/icons8_subtract_20px.png")));
    }//GEN-LAST:event_HideLabelMouseEntered

    private void HideLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HideLabelMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_HideLabelMouseClicked

    private void CancelLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelLabelMouseExited
        CancelLabel.setIcon(new ImageIcon(getClass().getResource("/demo/icon/icons8_delete_20px_2.png")));
    }//GEN-LAST:event_CancelLabelMouseExited

    private void CancelLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelLabelMouseEntered
        CancelLabel.setIcon(new ImageIcon(getClass().getResource("/demo/icon/icons8_delete_20px_1.png")));
    }//GEN-LAST:event_CancelLabelMouseEntered

    private void CancelLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelLabelMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_CancelLabelMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
      
             
         try {
             desktop.browse(new URI("https://www.bot.or.th/thai/_layouts/application/exchangerate/exchangerate.aspx"));
         } catch (URISyntaxException ex) {
             Logger.getLogger(Frame_Option.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException ex) {
             Logger.getLogger(Frame_Option.class.getName()).log(Level.SEVERE, null, ex);
         }
            
         
    }//GEN-LAST:event_jLabel1MouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Frame_Option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_Option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_Option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_Option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            //    new Frame_Option().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JLabel CancelLabel;
    private javax.swing.JLabel HideLabel;
    private javax.swing.JLabel LogoLabel;
    private javax.swing.JPanel TapPanel;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel TitleLabel2;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JLabel VesionLabel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
