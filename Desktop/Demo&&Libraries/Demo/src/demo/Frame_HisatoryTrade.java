
package demo;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;


public class Frame_HisatoryTrade extends javax.swing.JFrame {
    int xx,xy;
    DefaultTableModel model;
    public Frame_HisatoryTrade() {
    initComponents();
    
    
    HistoryTable.getTableHeader().setFont(new Font("Segoe UI",Font.PLAIN,13));
    HistoryTable.getTableHeader().setForeground(new Color(52,52,52));
 
    
    String[] col={"Currency From","Currency To","Value From","Value To"};
    model= new DefaultTableModel(col,0);
    HistoryTable.setModel(model);
        
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
        jScrollPane2 = new javax.swing.JScrollPane();
        HistoryTable = new javax.swing.JTable();
        TitlePanel = new javax.swing.JPanel();
        TitleLabel2 = new javax.swing.JLabel();

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 251, Short.MAX_VALUE)
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

        HistoryTable.setBackground(new java.awt.Color(27, 27, 33));
        HistoryTable.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        HistoryTable.setForeground(new java.awt.Color(204, 204, 204));
        HistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(HistoryTable);

        TitlePanel.setBackground(new java.awt.Color(0, 110, 81));
        TitlePanel.setPreferredSize(new java.awt.Dimension(247, 30));

        TitleLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TitleLabel2.setForeground(new java.awt.Color(18, 18, 18));
        TitleLabel2.setText(" Hisatory Trade");

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

        javax.swing.GroupLayout BackgroundPanelLayout = new javax.swing.GroupLayout(BackgroundPanel);
        BackgroundPanel.setLayout(BackgroundPanelLayout);
        BackgroundPanelLayout.setHorizontalGroup(
            BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TapPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(TitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
        );
        BackgroundPanelLayout.setVerticalGroup(
            BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addComponent(TapPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void setTable_(String cf, String ct,String vf,String vt){
    String[] date={cf,ct,vf,vt};
    model.addRow(date);
    
    }
    
    
    private void CancelLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelLabelMouseClicked
       this.setVisible(false);
    }//GEN-LAST:event_CancelLabelMouseClicked

    private void CancelLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelLabelMouseEntered
        CancelLabel.setIcon(new ImageIcon(getClass().getResource("/demo/icon/icons8_delete_20px_2.png")));
    }//GEN-LAST:event_CancelLabelMouseEntered

    private void CancelLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelLabelMouseExited
        CancelLabel.setIcon(new ImageIcon(getClass().getResource("/demo/icon/icons8_delete_20px_1.png")));
    }//GEN-LAST:event_CancelLabelMouseExited

    private void HideLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HideLabelMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_HideLabelMouseClicked

    private void HideLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HideLabelMouseEntered
        HideLabel.setIcon(new ImageIcon(getClass().getResource("/demo/icon/icons8_subtract_20px_1.png")));
    }//GEN-LAST:event_HideLabelMouseEntered

    private void HideLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HideLabelMouseExited
        HideLabel.setIcon(new ImageIcon(getClass().getResource("/demo/icon/icons8_subtract_20px.png")));
    }//GEN-LAST:event_HideLabelMouseExited

    private void TapPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TapPanelMouseDragged
        int xxx=evt.getXOnScreen();
        int yyy=evt.getYOnScreen();
        this.setLocation(xxx-xx,yyy-xy);
    }//GEN-LAST:event_TapPanelMouseDragged

    private void TapPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TapPanelMousePressed
        xx = evt.getX();
        xy = evt.getY();
      
    }//GEN-LAST:event_TapPanelMousePressed

  
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame_HisatoryTrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_HisatoryTrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_HisatoryTrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_HisatoryTrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
           //     new Frame_HisatoryTrade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JLabel CancelLabel;
    private javax.swing.JLabel HideLabel;
    private javax.swing.JTable HistoryTable;
    private javax.swing.JLabel LogoLabel;
    private javax.swing.JPanel TapPanel;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel TitleLabel2;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
