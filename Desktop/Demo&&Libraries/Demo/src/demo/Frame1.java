
package demo;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Frame1 extends javax.swing.JFrame {
    int xx,yy,MenuX=130,MenuY=120;
    Double result;
    String From_="USD",To_="THB",input_,t,c;
    boolean Trade=true,check=true;
    String[] Currency={"THB","USD","GBP","EUR","JPY","HKD","MYR","SGD","BND","PHP","IDR","INR","CHF","AUD","NZD","CAD","SEK","DKK","NOK","CNY"};
    Double[] BuyingRate={1.0,29.9441,38.4764,32.9398,0.2730,3.8074,7.0952,21.8317,21.6809,0.5806,1.9913,0.3685,29.9730,20.0385,18.9718,22.3879,3.0909,4.4073,3.2527,4.2065};
    Double[] SellingRate={1.0,30.3859,39.4819,33.0545,0.2818,3.9001,7.3558,22.4483,22.51953,0.6075,2.2731,0.4560,30.7352,20.8863,19.6426,23.0018,3.1768,4.5199,3.3452,4.3506};
    Frame_Option Option = new Frame_Option();
    Frame_HisatoryTrade HisatoryTrade = new Frame_HisatoryTrade();
    Frame_RateTable RateTable = new Frame_RateTable(Currency,BuyingRate,SellingRate);
    Frame_Error Error= new Frame_Error();
    
   
    public Frame1() throws IOException {
       initComponents();
       ScanPage();
       Table_();
       Calculate();
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
        MenuPanel = new javax.swing.JPanel();
        ListMenuPanel1 = new javax.swing.JPanel();
        MenuIconLabel1 = new javax.swing.JLabel();
        MenuTitleLabel1 = new javax.swing.JLabel();
        ListMenuPanel2 = new javax.swing.JPanel();
        MenuIconLabel2 = new javax.swing.JLabel();
        MenuTitleLabel2 = new javax.swing.JLabel();
        ListMenuPanel3 = new javax.swing.JPanel();
        MenuIconLabel3 = new javax.swing.JLabel();
        MenuTitleLabel3 = new javax.swing.JLabel();
        InputPanel = new javax.swing.JPanel();
        InputField = new javax.swing.JTextField();
        InputSeparator = new javax.swing.JSeparator();
        InputButtonPanel = new javax.swing.JPanel();
        InputButtonLabel = new javax.swing.JLabel();
        HowLabel = new javax.swing.JLabel();
        CurrencyComboBox = new javax.swing.JComboBox<>();
        FlagLabel = new javax.swing.JLabel();
        BuyingLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        SellingLabel = new javax.swing.JLabel();
        GetTitleLabel = new javax.swing.JLabel();
        ButtonSellingPanel = new javax.swing.JPanel();
        ButtonSellingLabel = new javax.swing.JLabel();
        ButtonBuyingPanel = new javax.swing.JPanel();
        ButtonBuyingLabel = new javax.swing.JLabel();
        SwitchLabel = new javax.swing.JLabel();
        PreviewLabel = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        GetTradeLabel = new javax.swing.JLabel();
        CurrencyFromLabel = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        HeaderPanel = new javax.swing.JPanel();
        HeaderCurrencyLabel = new javax.swing.JLabel();
        HeaderBuyingLabel = new javax.swing.JLabel();
        HeaderSellingLabel = new javax.swing.JLabel();
        PreviewInputLabel = new javax.swing.JLabel();
        OutputLabel = new javax.swing.JLabel();
        CurrencyToLabel = new javax.swing.JLabel();
        TapPanel2 = new javax.swing.JPanel();
        TitleTap2Label = new javax.swing.JLabel();
        MenuPanel2 = new javax.swing.JPanel();
        MenuLabel = new javax.swing.JLabel();
        LineTablePanel1 = new javax.swing.JPanel();
        CurrencyLineTableLabel1 = new javax.swing.JLabel();
        BuyingRateTableLabel1 = new javax.swing.JLabel();
        SellingRateTableLabel1 = new javax.swing.JLabel();
        FlagLineTableLabel1 = new javax.swing.JLabel();
        LineTablePanel2 = new javax.swing.JPanel();
        CurrencyLineTableLabel2 = new javax.swing.JLabel();
        BuyingRateTableLabel2 = new javax.swing.JLabel();
        SellingRateTableLabel2 = new javax.swing.JLabel();
        FlagLineTableLabel2 = new javax.swing.JLabel();
        LineTablePanel3 = new javax.swing.JPanel();
        CurrencyLineTableLabel3 = new javax.swing.JLabel();
        BuyingRateTableLabel3 = new javax.swing.JLabel();
        SellingRateTableLabel3 = new javax.swing.JLabel();
        FlagLineTableLabel3 = new javax.swing.JLabel();
        LineTablePanel4 = new javax.swing.JPanel();
        CurrencyLineTableLabel4 = new javax.swing.JLabel();
        BuyingRateTableLabel4 = new javax.swing.JLabel();
        SellingRateTableLabel4 = new javax.swing.JLabel();
        FlagLineTableLabel4 = new javax.swing.JLabel();
        LineTablePanel5 = new javax.swing.JPanel();
        CurrencyLineTableLabel5 = new javax.swing.JLabel();
        BuyingRateTableLabel5 = new javax.swing.JLabel();
        SellingRateTableLabel5 = new javax.swing.JLabel();
        FlagLineTableLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(380, 705));
        setUndecorated(true);

        BackgroundPanel.setBackground(new java.awt.Color(27, 27, 33));
        BackgroundPanel.setPreferredSize(new java.awt.Dimension(380, 600));

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
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

        MenuPanel.setBackground(new java.awt.Color(36, 36, 43));
        MenuPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuPanelMouseExited(evt);
            }
        });

        ListMenuPanel1.setBackground(new java.awt.Color(36, 36, 43));
        ListMenuPanel1.setPreferredSize(new java.awt.Dimension(130, 30));
        ListMenuPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListMenuPanel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ListMenuPanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ListMenuPanel1MouseExited(evt);
            }
        });

        MenuIconLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuIconLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo/icon/icons8_grid_20px_3.png"))); // NOI18N
        MenuIconLabel1.setPreferredSize(new java.awt.Dimension(34, 30));

        MenuTitleLabel1.setForeground(new java.awt.Color(204, 204, 204));
        MenuTitleLabel1.setText("Rate Table");

        javax.swing.GroupLayout ListMenuPanel1Layout = new javax.swing.GroupLayout(ListMenuPanel1);
        ListMenuPanel1.setLayout(ListMenuPanel1Layout);
        ListMenuPanel1Layout.setHorizontalGroup(
            ListMenuPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListMenuPanel1Layout.createSequentialGroup()
                .addComponent(MenuIconLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(MenuTitleLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ListMenuPanel1Layout.setVerticalGroup(
            ListMenuPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuIconLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(ListMenuPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(MenuTitleLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        ListMenuPanel2.setBackground(new java.awt.Color(36, 36, 43));
        ListMenuPanel2.setPreferredSize(new java.awt.Dimension(130, 30));
        ListMenuPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListMenuPanel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ListMenuPanel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ListMenuPanel2MouseExited(evt);
            }
        });

        MenuIconLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuIconLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo/icon/icons8_order_history_20px.png"))); // NOI18N
        MenuIconLabel2.setPreferredSize(new java.awt.Dimension(34, 30));

        MenuTitleLabel2.setForeground(new java.awt.Color(204, 204, 204));
        MenuTitleLabel2.setText("History Trade");

        javax.swing.GroupLayout ListMenuPanel2Layout = new javax.swing.GroupLayout(ListMenuPanel2);
        ListMenuPanel2.setLayout(ListMenuPanel2Layout);
        ListMenuPanel2Layout.setHorizontalGroup(
            ListMenuPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListMenuPanel2Layout.createSequentialGroup()
                .addComponent(MenuIconLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(MenuTitleLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ListMenuPanel2Layout.setVerticalGroup(
            ListMenuPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuIconLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(ListMenuPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(MenuTitleLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        ListMenuPanel3.setBackground(new java.awt.Color(36, 36, 43));
        ListMenuPanel3.setPreferredSize(new java.awt.Dimension(130, 30));
        ListMenuPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListMenuPanel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ListMenuPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ListMenuPanel3MouseExited(evt);
            }
        });

        MenuIconLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuIconLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo/icon/icons8_services_20px_1.png"))); // NOI18N
        MenuIconLabel3.setPreferredSize(new java.awt.Dimension(34, 30));

        MenuTitleLabel3.setForeground(new java.awt.Color(204, 204, 204));
        MenuTitleLabel3.setText("Option");

        javax.swing.GroupLayout ListMenuPanel3Layout = new javax.swing.GroupLayout(ListMenuPanel3);
        ListMenuPanel3.setLayout(ListMenuPanel3Layout);
        ListMenuPanel3Layout.setHorizontalGroup(
            ListMenuPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListMenuPanel3Layout.createSequentialGroup()
                .addComponent(MenuIconLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(MenuTitleLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ListMenuPanel3Layout.setVerticalGroup(
            ListMenuPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuIconLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(ListMenuPanel3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(MenuTitleLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout MenuPanelLayout = new javax.swing.GroupLayout(MenuPanel);
        MenuPanel.setLayout(MenuPanelLayout);
        MenuPanelLayout.setHorizontalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ListMenuPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
            .addComponent(ListMenuPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
            .addComponent(ListMenuPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ListMenuPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ListMenuPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ListMenuPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        InputPanel.setBackground(new java.awt.Color(36, 36, 43));

        InputField.setBackground(new java.awt.Color(36, 36, 43));
        InputField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        InputField.setForeground(new java.awt.Color(204, 204, 204));
        InputField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        InputField.setText("0.00");
        InputField.setBorder(null);
        InputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputFieldActionPerformed(evt);
            }
        });

        InputButtonPanel.setBackground(new java.awt.Color(0, 110, 81));
        InputButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InputButtonPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InputButtonPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                InputButtonPanelMouseExited(evt);
            }
        });

        InputButtonLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        InputButtonLabel.setForeground(new java.awt.Color(204, 204, 204));
        InputButtonLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InputButtonLabel.setText("Calcular");

        javax.swing.GroupLayout InputButtonPanelLayout = new javax.swing.GroupLayout(InputButtonPanel);
        InputButtonPanel.setLayout(InputButtonPanelLayout);
        InputButtonPanelLayout.setHorizontalGroup(
            InputButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InputButtonPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(InputButtonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        InputButtonPanelLayout.setVerticalGroup(
            InputButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InputButtonPanelLayout.createSequentialGroup()
                .addComponent(InputButtonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        HowLabel.setBackground(new java.awt.Color(255, 255, 255));
        HowLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        HowLabel.setForeground(new java.awt.Color(204, 204, 204));
        HowLabel.setText("How much would you like ?");

        CurrencyComboBox.setBackground(new java.awt.Color(102, 102, 102));
        CurrencyComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "GBP", "EUR", "JPY", "HKD", "MYR", "SGD", "BND", "PHP", "IDR", "INR", "CHF", "AUD", "NZD", "CAD", "SEK", "DKK", "NOK", "CNY" }));
        CurrencyComboBox.setFocusable(false);
        CurrencyComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CurrencyComboBoxActionPerformed(evt);
            }
        });

        FlagLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FlagLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo/flag/iconfinder_United-States_92407.png"))); // NOI18N

        BuyingLabel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        BuyingLabel.setForeground(new java.awt.Color(0, 110, 81));
        BuyingLabel.setText("Foreign Currencies to Thai Baht");

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));

        SellingLabel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        SellingLabel.setForeground(new java.awt.Color(0, 110, 81));
        SellingLabel.setText("Thai Baht to Foreign Currencies");

        GetTitleLabel.setBackground(new java.awt.Color(255, 255, 255));
        GetTitleLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        GetTitleLabel.setForeground(new java.awt.Color(204, 204, 204));
        GetTitleLabel.setText("Get Currency");

        ButtonSellingPanel.setBackground(new java.awt.Color(102, 102, 102));
        ButtonSellingPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        ButtonSellingPanel.setForeground(new java.awt.Color(51, 51, 51));
        ButtonSellingPanel.setToolTipText("Selling Rate");
        ButtonSellingPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonSellingPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonSellingPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonSellingPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonSellingPanelMouseExited(evt);
            }
        });

        ButtonSellingLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        ButtonSellingLabel.setForeground(new java.awt.Color(51, 51, 51));
        ButtonSellingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ButtonSellingLabel.setText("Selling Rate");

        javax.swing.GroupLayout ButtonSellingPanelLayout = new javax.swing.GroupLayout(ButtonSellingPanel);
        ButtonSellingPanel.setLayout(ButtonSellingPanelLayout);
        ButtonSellingPanelLayout.setHorizontalGroup(
            ButtonSellingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ButtonSellingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        ButtonSellingPanelLayout.setVerticalGroup(
            ButtonSellingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ButtonSellingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        ButtonBuyingPanel.setBackground(new java.awt.Color(0, 110, 81));
        ButtonBuyingPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        ButtonBuyingPanel.setToolTipText("Buying Rate");
        ButtonBuyingPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonBuyingPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonBuyingPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonBuyingPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonBuyingPanelMouseExited(evt);
            }
        });

        ButtonBuyingLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        ButtonBuyingLabel.setForeground(new java.awt.Color(255, 255, 255));
        ButtonBuyingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ButtonBuyingLabel.setText("Buying Rate");

        javax.swing.GroupLayout ButtonBuyingPanelLayout = new javax.swing.GroupLayout(ButtonBuyingPanel);
        ButtonBuyingPanel.setLayout(ButtonBuyingPanelLayout);
        ButtonBuyingPanelLayout.setHorizontalGroup(
            ButtonBuyingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ButtonBuyingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        ButtonBuyingPanelLayout.setVerticalGroup(
            ButtonBuyingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ButtonBuyingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        SwitchLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SwitchLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo/icon/icons8_currency_exchange_25px_2.png"))); // NOI18N
        SwitchLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SwitchLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SwitchLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SwitchLabelMouseExited(evt);
            }
        });

        PreviewLabel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        PreviewLabel.setForeground(new java.awt.Color(0, 110, 81));
        PreviewLabel.setText("1.00 USD amount 30.00 THB");

        jSeparator3.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator3.setForeground(new java.awt.Color(51, 51, 51));

        GetTradeLabel.setBackground(new java.awt.Color(255, 255, 255));
        GetTradeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        GetTradeLabel.setForeground(new java.awt.Color(204, 204, 204));
        GetTradeLabel.setText("Get Trade");

        CurrencyFromLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CurrencyFromLabel.setForeground(new java.awt.Color(204, 204, 204));
        CurrencyFromLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CurrencyFromLabel.setText("USD");

        jSeparator4.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator4.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout InputPanelLayout = new javax.swing.GroupLayout(InputPanel);
        InputPanel.setLayout(InputPanelLayout);
        InputPanelLayout.setHorizontalGroup(
            InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(InputPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(GetTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(InputPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(FlagLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(CurrencyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(InputPanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(PreviewLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(InputPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(GetTradeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(InputPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(ButtonBuyingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(SwitchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(ButtonSellingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(InputPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(BuyingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(SellingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(InputPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(InputPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(HowLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(InputPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InputField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(CurrencyFromLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(InputPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(InputButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        InputPanelLayout.setVerticalGroup(
            InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InputPanelLayout.createSequentialGroup()
                .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(GetTitleLabel)
                .addGap(10, 10, 10)
                .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FlagLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CurrencyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(PreviewLabel)
                .addGap(15, 15, 15)
                .addComponent(GetTradeLabel)
                .addGap(10, 10, 10)
                .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonBuyingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SwitchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonSellingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BuyingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SellingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(HowLabel)
                .addGap(10, 10, 10)
                .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InputPanelLayout.createSequentialGroup()
                        .addComponent(InputField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(InputSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InputPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(CurrencyFromLabel)))
                .addComponent(InputButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        HeaderPanel.setBackground(new java.awt.Color(0, 110, 81));
        HeaderPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        HeaderPanel.setPreferredSize(new java.awt.Dimension(380, 25));

        HeaderCurrencyLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HeaderCurrencyLabel.setForeground(new java.awt.Color(229, 229, 229));
        HeaderCurrencyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HeaderCurrencyLabel.setText("CURRENCY");

        HeaderBuyingLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HeaderBuyingLabel.setForeground(new java.awt.Color(229, 229, 229));
        HeaderBuyingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HeaderBuyingLabel.setText("BUYING");

        HeaderSellingLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HeaderSellingLabel.setForeground(new java.awt.Color(229, 229, 229));
        HeaderSellingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HeaderSellingLabel.setText("SELLING");

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HeaderCurrencyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HeaderBuyingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HeaderSellingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HeaderCurrencyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
            .addComponent(HeaderBuyingLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(HeaderSellingLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PreviewInputLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PreviewInputLabel.setForeground(new java.awt.Color(204, 204, 204));
        PreviewInputLabel.setText("0.00 USD AMOUNT");

        OutputLabel.setBackground(new java.awt.Color(36, 36, 43));
        OutputLabel.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        OutputLabel.setForeground(new java.awt.Color(204, 204, 204));
        OutputLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        OutputLabel.setText("0.00");
        OutputLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        CurrencyToLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CurrencyToLabel.setForeground(new java.awt.Color(204, 204, 204));
        CurrencyToLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CurrencyToLabel.setText("THB");

        TapPanel2.setBackground(new java.awt.Color(0, 103, 76));
        TapPanel2.setPreferredSize(new java.awt.Dimension(380, 25));

        TitleTap2Label.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        TitleTap2Label.setForeground(new java.awt.Color(229, 229, 229));
        TitleTap2Label.setText("CALCULAR EXCHANGE RATE");

        MenuPanel2.setBackground(new java.awt.Color(0, 103, 76));
        MenuPanel2.setForeground(new java.awt.Color(36, 36, 43));
        MenuPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuPanel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuPanel2MouseExited(evt);
            }
        });

        MenuLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo/icon/icons8_menu_20px_2.png"))); // NOI18N
        MenuLabel.setToolTipText("");
        MenuLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout MenuPanel2Layout = new javax.swing.GroupLayout(MenuPanel2);
        MenuPanel2.setLayout(MenuPanel2Layout);
        MenuPanel2Layout.setHorizontalGroup(
            MenuPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(MenuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        MenuPanel2Layout.setVerticalGroup(
            MenuPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(MenuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout TapPanel2Layout = new javax.swing.GroupLayout(TapPanel2);
        TapPanel2.setLayout(TapPanel2Layout);
        TapPanel2Layout.setHorizontalGroup(
            TapPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TapPanel2Layout.createSequentialGroup()
                .addComponent(MenuPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(TitleTap2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        TapPanel2Layout.setVerticalGroup(
            TapPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(TitleTap2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        LineTablePanel1.setBackground(new java.awt.Color(27, 27, 33));
        LineTablePanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        LineTablePanel1.setPreferredSize(new java.awt.Dimension(380, 25));

        CurrencyLineTableLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        CurrencyLineTableLabel1.setForeground(new java.awt.Color(204, 204, 204));
        CurrencyLineTableLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CurrencyLineTableLabel1.setText("USD");

        BuyingRateTableLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        BuyingRateTableLabel1.setForeground(new java.awt.Color(0, 103, 76));
        BuyingRateTableLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BuyingRateTableLabel1.setText("33.0");

        SellingRateTableLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        SellingRateTableLabel1.setForeground(new java.awt.Color(44, 157, 69));
        SellingRateTableLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SellingRateTableLabel1.setText("33.0");

        FlagLineTableLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo/flag/iconfinder_United-States_92407 (1).png"))); // NOI18N

        javax.swing.GroupLayout LineTablePanel1Layout = new javax.swing.GroupLayout(LineTablePanel1);
        LineTablePanel1.setLayout(LineTablePanel1Layout);
        LineTablePanel1Layout.setHorizontalGroup(
            LineTablePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LineTablePanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(FlagLineTableLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CurrencyLineTableLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(BuyingRateTableLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SellingRateTableLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        LineTablePanel1Layout.setVerticalGroup(
            LineTablePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SellingRateTableLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(FlagLineTableLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
            .addComponent(CurrencyLineTableLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BuyingRateTableLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        LineTablePanel2.setBackground(new java.awt.Color(36, 36, 43));
        LineTablePanel2.setPreferredSize(new java.awt.Dimension(380, 25));

        CurrencyLineTableLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        CurrencyLineTableLabel2.setForeground(new java.awt.Color(204, 204, 204));
        CurrencyLineTableLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CurrencyLineTableLabel2.setText("GBP");

        BuyingRateTableLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        BuyingRateTableLabel2.setForeground(new java.awt.Color(0, 103, 76));
        BuyingRateTableLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BuyingRateTableLabel2.setText("33.0");

        SellingRateTableLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        SellingRateTableLabel2.setForeground(new java.awt.Color(44, 157, 69));
        SellingRateTableLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SellingRateTableLabel2.setText("33.0");

        FlagLineTableLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo/flag/iconfinder_United-Kingdom_92403 (1).png"))); // NOI18N

        javax.swing.GroupLayout LineTablePanel2Layout = new javax.swing.GroupLayout(LineTablePanel2);
        LineTablePanel2.setLayout(LineTablePanel2Layout);
        LineTablePanel2Layout.setHorizontalGroup(
            LineTablePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LineTablePanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(FlagLineTableLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CurrencyLineTableLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(BuyingRateTableLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SellingRateTableLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        LineTablePanel2Layout.setVerticalGroup(
            LineTablePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SellingRateTableLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(FlagLineTableLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(CurrencyLineTableLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BuyingRateTableLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        LineTablePanel3.setBackground(new java.awt.Color(27, 27, 33));
        LineTablePanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        LineTablePanel3.setPreferredSize(new java.awt.Dimension(380, 25));

        CurrencyLineTableLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        CurrencyLineTableLabel3.setForeground(new java.awt.Color(204, 204, 204));
        CurrencyLineTableLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CurrencyLineTableLabel3.setText("EUR");

        BuyingRateTableLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        BuyingRateTableLabel3.setForeground(new java.awt.Color(0, 103, 76));
        BuyingRateTableLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BuyingRateTableLabel3.setText("33.0");

        SellingRateTableLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        SellingRateTableLabel3.setForeground(new java.awt.Color(44, 157, 69));
        SellingRateTableLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SellingRateTableLabel3.setText("33.0");

        FlagLineTableLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo/flag/iconfinder_European-Union_92077 (3).png"))); // NOI18N

        javax.swing.GroupLayout LineTablePanel3Layout = new javax.swing.GroupLayout(LineTablePanel3);
        LineTablePanel3.setLayout(LineTablePanel3Layout);
        LineTablePanel3Layout.setHorizontalGroup(
            LineTablePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LineTablePanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(FlagLineTableLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CurrencyLineTableLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(BuyingRateTableLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SellingRateTableLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        LineTablePanel3Layout.setVerticalGroup(
            LineTablePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SellingRateTableLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(FlagLineTableLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
            .addComponent(CurrencyLineTableLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BuyingRateTableLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        LineTablePanel4.setBackground(new java.awt.Color(36, 36, 43));
        LineTablePanel4.setForeground(new java.awt.Color(36, 36, 43));
        LineTablePanel4.setPreferredSize(new java.awt.Dimension(380, 25));

        CurrencyLineTableLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        CurrencyLineTableLabel4.setForeground(new java.awt.Color(204, 204, 204));
        CurrencyLineTableLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CurrencyLineTableLabel4.setText("JPY");

        BuyingRateTableLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        BuyingRateTableLabel4.setForeground(new java.awt.Color(0, 103, 76));
        BuyingRateTableLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BuyingRateTableLabel4.setText("33.0");

        SellingRateTableLabel4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        SellingRateTableLabel4.setForeground(new java.awt.Color(44, 157, 69));
        SellingRateTableLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SellingRateTableLabel4.setText("33.0");

        FlagLineTableLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo/flag/iconfinder_Japan_92149 (2).png"))); // NOI18N

        javax.swing.GroupLayout LineTablePanel4Layout = new javax.swing.GroupLayout(LineTablePanel4);
        LineTablePanel4.setLayout(LineTablePanel4Layout);
        LineTablePanel4Layout.setHorizontalGroup(
            LineTablePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LineTablePanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(FlagLineTableLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CurrencyLineTableLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(BuyingRateTableLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SellingRateTableLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        LineTablePanel4Layout.setVerticalGroup(
            LineTablePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SellingRateTableLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(FlagLineTableLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(CurrencyLineTableLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BuyingRateTableLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        LineTablePanel5.setBackground(new java.awt.Color(27, 27, 33));
        LineTablePanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        LineTablePanel5.setForeground(new java.awt.Color(27, 27, 33));
        LineTablePanel5.setPreferredSize(new java.awt.Dimension(380, 25));

        CurrencyLineTableLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        CurrencyLineTableLabel5.setForeground(new java.awt.Color(204, 204, 204));
        CurrencyLineTableLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CurrencyLineTableLabel5.setText("CNY");

        BuyingRateTableLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        BuyingRateTableLabel5.setForeground(new java.awt.Color(0, 103, 76));
        BuyingRateTableLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BuyingRateTableLabel5.setText("33.0");

        SellingRateTableLabel5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        SellingRateTableLabel5.setForeground(new java.awt.Color(44, 157, 69));
        SellingRateTableLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SellingRateTableLabel5.setText("33.0");

        FlagLineTableLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demo/flag/iconfinder_China_92023 (1).png"))); // NOI18N

        javax.swing.GroupLayout LineTablePanel5Layout = new javax.swing.GroupLayout(LineTablePanel5);
        LineTablePanel5.setLayout(LineTablePanel5Layout);
        LineTablePanel5Layout.setHorizontalGroup(
            LineTablePanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LineTablePanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(FlagLineTableLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CurrencyLineTableLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(BuyingRateTableLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SellingRateTableLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        LineTablePanel5Layout.setVerticalGroup(
            LineTablePanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SellingRateTableLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(FlagLineTableLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
            .addComponent(CurrencyLineTableLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BuyingRateTableLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BackgroundPanelLayout = new javax.swing.GroupLayout(BackgroundPanel);
        BackgroundPanel.setLayout(BackgroundPanelLayout);
        BackgroundPanelLayout.setHorizontalGroup(
            BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TapPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(LineTablePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(LineTablePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(LineTablePanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(LineTablePanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(LineTablePanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(TapPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(MenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(PreviewInputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addComponent(OutputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(CurrencyToLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(InputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        BackgroundPanelLayout.setVerticalGroup(
            BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addComponent(TapPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(LineTablePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(LineTablePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(LineTablePanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(LineTablePanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(LineTablePanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(TapPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(MenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(PreviewInputLabel)
                .addGap(3, 3, 3)
                .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OutputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BackgroundPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(CurrencyToLabel)))
                .addGap(10, 10, 10)
                .addComponent(InputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  
     public final void ScanPage() throws IOException{
        Document dc =Jsoup.connect("https://www.bot.or.th/thai/_layouts/application/exchangerate/exchangerate.aspx").get(); 
        Elements br= dc.select("td.tx-news:nth-of-type(4)");
        Elements sr= dc.select("td.tx-news:nth-of-type(6)");
              for(int i=1;i<=19;i++){
                  BuyingRate[i]=Double.valueOf(br.get(i-1).text());
                  SellingRate[i]=Double.valueOf(sr.get(i-1).text());
              }
    }
       
    public final void Table_(){
        BuyingRateTableLabel1.setText(String.format("%.4f", BuyingRate[1]));
        SellingRateTableLabel1.setText(String.format("%.4f", SellingRate[1]));
        BuyingRateTableLabel2.setText(String.format("%.4f", BuyingRate[2]));
        SellingRateTableLabel2.setText(String.format("%.4f", SellingRate[2]));
        BuyingRateTableLabel3.setText(String.format("%.4f", BuyingRate[3]));
        SellingRateTableLabel3.setText(String.format("%.4f", SellingRate[3]));
        BuyingRateTableLabel4.setText(String.format("%.4f", BuyingRate[4]));
        SellingRateTableLabel4.setText(String.format("%.4f", SellingRate[4]));
        BuyingRateTableLabel5.setText(String.format("%.4f", BuyingRate[19]));
        SellingRateTableLabel5.setText(String.format("%.4f", SellingRate[19]));
    }
   
    public void Calculate(){
    input_=InputField.getText();
    for(int i = 0 ; i <input_.length() ;i++){
           char char_ =input_.charAt(i);
           if(char_!='.' && !(Character.isDigit(char_))){
              check=false;   
           }
       }  
        
   if(check){
    result =Double.valueOf(InputField.getText());
   
        if(Trade){
            for(int x=0;x<Currency.length;x++){       
                if(From_.equals(Currency[x])){
                    result*=BuyingRate[x];                                          
                    PreviewLabel.setText(String.format("1.00 %s amount %.2f THB",From_,BuyingRate[x]));
                   
                    break;      
               }           
            }
        }else{
              for(int x=0;x<Currency.length;x++){           
                if(To_.equals(Currency[x])){
                    result/=SellingRate[x];                                          
                    PreviewLabel.setText(String.format("1.00 %s amount %.2f THB",To_,SellingRate[x]));
                    break;      
               }                 
            }
        }      
        CurrencyFromLabel.setText(From_);
        CurrencyToLabel.setText(To_);
        PreviewInputLabel.setText(String.format("%.2f %s AMOUNT ",Double.valueOf(InputField.getText()),From_)); 
        OutputLabel.setText(String.format("%.2f",result)); 
        if(result!=0) HisatoryTrade.setTable_(From_,To_,String.format("%.3f",Double.valueOf(InputField.getText())),String.format("%.3f",result));
       
    }else{
    Error.setVisible(true);
    InputField.setText("0.00");
    check=true;
    Calculate();
    }
    
    }
       
    private void InputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputFieldActionPerformed
        Calculate();
    }//GEN-LAST:event_InputFieldActionPerformed

    private void CurrencyComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CurrencyComboBoxActionPerformed

        switch(CurrencyComboBox.getSelectedItem().toString()){
            case("THB"):
                FlagLabel.setIcon(new ImageIcon(getClass().getResource("/demo/flag/iconfinder_Thailand_92379 (2).png")));
                c="THB";
                break;
            case("USD"):
                FlagLabel.setIcon(new ImageIcon(getClass().getResource("/demo/flag/iconfinder_United-States_92407.png")));
                c="USD";
                break;
            case("EUR"):
                FlagLabel.setIcon(new ImageIcon(getClass().getResource("/demo/flag/iconfinder_European-Union_92077.png")));
                c="EUR";
                break;
            case("GBP"):
                FlagLabel.setIcon(new ImageIcon(getClass().getResource("/demo/flag/iconfinder_United-Kingdom_92403.png")));
                c="GBP";
                break;
            case("JPY"):
                FlagLabel.setIcon(new ImageIcon(getClass().getResource("/demo/flag/iconfinder_Japan_92149.png")));
                c="JPY";
                break;
            case("HKD"):
                FlagLabel.setIcon(new ImageIcon(getClass().getResource("/demo/flag/iconfinder_Hong-Kong_92125.png")));
                c="HKD";
                break;
            case("MYR"):
                FlagLabel.setIcon(new ImageIcon(getClass().getResource("/demo/flag/iconfinder_Malaysia_92193.png")));
                c="MYR";
                break; 
            case("SGD"):
                FlagLabel.setIcon(new ImageIcon(getClass().getResource("/demo/flag/iconfinder_Singapore_92335.png")));
                c="SGD";
                break; 
            case("BND"):
                FlagLabel.setIcon(new ImageIcon(getClass().getResource("/demo/flag/iconfinder_Brunei_91999.png")));
                c="BND";
                break; 
            case("PHP"):
                FlagLabel.setIcon(new ImageIcon(getClass().getResource("/demo/flag/iconfinder_Philippines_92285.png")));
                c="PHP";
                break; 
            case("IDR"):
                FlagLabel.setIcon(new ImageIcon(getClass().getResource("/demo/flag/iconfinder_Indonesia_92133.png")));
                c="IDR";
                break; 
            case("INR"):
                FlagLabel.setIcon(new ImageIcon(getClass().getResource("/demo/flag/iconfinder_India_92131.png")));
                c="INR";
                break; 
            case("CHF"):
                FlagLabel.setIcon(new ImageIcon(getClass().getResource("/demo/flag/iconfinder_Switzerland_92369.png")));
                c="CHF";
                break; 
            case("AUD"):
                FlagLabel.setIcon(new ImageIcon(getClass().getResource("/demo/flag/iconfinder_Australia_flat_91960.png")));
                c="AUD";
                break; 
            case("NZD"):
                FlagLabel.setIcon(new ImageIcon(getClass().getResource("/demo/flag/iconfinder_New-Zealand_92247.png")));
                c="NZD";
                break; 
            case("CAD"):
                FlagLabel.setIcon(new ImageIcon(getClass().getResource("/demo/flag/iconfinder_Canada_92011.png")));
                break; 
            case("SEK"):
                FlagLabel.setIcon(new ImageIcon(getClass().getResource("/demo/flag/iconfinder_Sweden_92367.png")));
                c="SEK";
                break; 
            case("DKK"):
                FlagLabel.setIcon(new ImageIcon(getClass().getResource("/demo/flag/iconfinder_Denmark_92051.png")));
                c="DKK";
                break; 
            case("NOK"):
                FlagLabel.setIcon(new ImageIcon(getClass().getResource("/demo/flag/iconfinder_Norway_92265.png")));
                c="NOK";
                break; 
            case("CNY"):
                FlagLabel.setIcon(new ImageIcon(getClass().getResource("/demo/flag/iconfinder_China_92023.png")));
                c="CNY";
                break;
                

        }
        if(Trade){
         From_=c; 
        }else{
         To_=c;
        }
        Calculate();
    
    }//GEN-LAST:event_CurrencyComboBoxActionPerformed

    private void CancelLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelLabelMouseClicked
        System.exit(0);
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

    private void TapPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TapPanelMousePressed
         xx = evt.getX();
         yy = evt.getY();
    }//GEN-LAST:event_TapPanelMousePressed

    private void TapPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TapPanelMouseDragged
        int xxx=evt.getXOnScreen();
        int yyy=evt.getYOnScreen();
        this.setLocation(xxx-xx,yyy-yy);
    }//GEN-LAST:event_TapPanelMouseDragged

    private void InputButtonPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InputButtonPanelMouseClicked
        Calculate();      
    }//GEN-LAST:event_InputButtonPanelMouseClicked

    private void InputButtonPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InputButtonPanelMouseEntered
       InputButtonPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE,1));
       InputButtonPanel.setBackground(new Color(0,148,108));
       InputButtonLabel.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_InputButtonPanelMouseEntered

    private void InputButtonPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InputButtonPanelMouseExited
        
        InputButtonPanel.setBorder(null);
        InputButtonPanel.setBackground(new Color(0, 110, 81));
        InputButtonLabel.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_InputButtonPanelMouseExited

    private void ButtonSellingPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonSellingPanelMouseClicked
       if(Trade){
        ButtonBuyingPanel.setBorder(BorderFactory.createLineBorder(new Color(51,51,51),2));
        ButtonBuyingPanel.setBackground(new Color(102, 102, 102));
        ButtonBuyingLabel.setForeground(new Color(51,51,51));  
        t=From_;
        From_=To_;
        To_=t;
        }
        ButtonSellingPanel.setBackground(new Color(0,110,81));
        Trade=false;
        Calculate();
    }//GEN-LAST:event_ButtonSellingPanelMouseClicked

    private void ButtonSellingPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonSellingPanelMouseEntered
        ButtonSellingPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE,2));
        ButtonSellingPanel.setBackground(new Color(0,148,108));
        ButtonSellingLabel.setForeground(new Color(255,255,255));
        
    }//GEN-LAST:event_ButtonSellingPanelMouseEntered

    private void ButtonSellingPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonSellingPanelMouseExited
       if(Trade){
        ButtonSellingPanel.setBorder(BorderFactory.createLineBorder(new Color(51,51,51),2));
        ButtonSellingPanel.setBackground(new Color(102, 102, 102));
        ButtonSellingLabel.setForeground(new Color(51,51,51));
       }else{
        ButtonSellingPanel.setBackground(new Color(0,110,81));
       }
    }//GEN-LAST:event_ButtonSellingPanelMouseExited

    private void ButtonBuyingPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonBuyingPanelMouseClicked
        if(!Trade){
        ButtonSellingPanel.setBorder(BorderFactory.createLineBorder(new Color(51,51,51),2));
        ButtonSellingPanel.setBackground(new Color(102, 102, 102));
        ButtonSellingLabel.setForeground(new Color(51,51,51));
        t=From_;
        From_=To_;
        To_=t;
        }
        ButtonBuyingPanel.setBackground(new Color(0,110,81));
        Trade=true;
        Calculate();
        
    }//GEN-LAST:event_ButtonBuyingPanelMouseClicked

    private void ButtonBuyingPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonBuyingPanelMouseEntered
        ButtonBuyingPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE,2));
        ButtonBuyingPanel.setBackground(new Color(0,148,108));
        ButtonBuyingLabel.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_ButtonBuyingPanelMouseEntered

    private void ButtonBuyingPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonBuyingPanelMouseExited
        if(!Trade){
        ButtonBuyingPanel.setBorder(BorderFactory.createLineBorder(new Color(51,51,51),2));
        ButtonBuyingPanel.setBackground(new Color(102, 102, 102));
        ButtonBuyingLabel.setForeground(new Color(51,51,51));
        }else{
        ButtonBuyingPanel.setBackground(new Color(0,110,81));
        }
       
        
    }//GEN-LAST:event_ButtonBuyingPanelMouseExited

    private void SwitchLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SwitchLabelMouseClicked
       if(!Trade){
        ButtonSellingPanel.setBorder(BorderFactory.createLineBorder(new Color(51,51,51),2));
        ButtonSellingPanel.setBackground(new Color(102, 102, 102));
        ButtonSellingLabel.setForeground(new Color(51,51,51)); 
        ButtonBuyingPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE,2));
        ButtonBuyingPanel.setBackground(new Color(0,110,81));
        ButtonBuyingLabel.setForeground(new Color(255,255,255));
        Trade=true;
        }else{
        ButtonBuyingPanel.setBorder(BorderFactory.createLineBorder(new Color(51,51,51),2));
        ButtonBuyingPanel.setBackground(new Color(102, 102, 102));
        ButtonBuyingLabel.setForeground(new Color(51,51,51));  
        ButtonSellingPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE,2));
        ButtonSellingPanel.setBackground(new Color(0,110,81));
        ButtonSellingLabel.setForeground(new Color(255,255,255));
        Trade=false;
       } 
       
       t=From_;
       From_=To_;
       To_=t;
       Calculate();
        
    }//GEN-LAST:event_SwitchLabelMouseClicked

    private void SwitchLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SwitchLabelMouseEntered
            SwitchLabel.setIcon(new ImageIcon(getClass().getResource("/demo/icon/icons8_currency_exchange_25px.png")));
    }//GEN-LAST:event_SwitchLabelMouseEntered

    private void SwitchLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SwitchLabelMouseExited
            SwitchLabel.setIcon(new ImageIcon(getClass().getResource("/demo/icon/icons8_currency_exchange_25px_2.png")));
    }//GEN-LAST:event_SwitchLabelMouseExited

    private void ListMenuPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListMenuPanel1MouseClicked
            RateTable.setVisible(true);
    }//GEN-LAST:event_ListMenuPanel1MouseClicked

    private void ListMenuPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListMenuPanel1MouseEntered
            MenuPanel.setSize(MenuX,MenuY);
            MenuPanel2.setBackground(new Color(36, 36, 43));
            ListMenuPanel1.setBackground(new Color(46, 46, 51));
    }//GEN-LAST:event_ListMenuPanel1MouseEntered

    private void ListMenuPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListMenuPanel1MouseExited
            MenuPanel.setSize(0,0);
            MenuPanel2.setBackground(new Color(0, 103, 76));
            ListMenuPanel1.setBackground(new Color(36, 36, 43));
    }//GEN-LAST:event_ListMenuPanel1MouseExited

    private void ListMenuPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListMenuPanel2MouseClicked
            HisatoryTrade.setVisible(true);
    }//GEN-LAST:event_ListMenuPanel2MouseClicked

    private void ListMenuPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListMenuPanel2MouseEntered
            MenuPanel.setSize(MenuX,MenuY);
            MenuPanel2.setBackground(new Color(36, 36, 43));
            ListMenuPanel2.setBackground(new Color(46, 46, 51));
    }//GEN-LAST:event_ListMenuPanel2MouseEntered

    private void ListMenuPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListMenuPanel2MouseExited
            MenuPanel.setSize(0,0);
            MenuPanel2.setBackground(new Color(0, 103, 76));
            ListMenuPanel2.setBackground(new Color(36, 36, 43));
    }//GEN-LAST:event_ListMenuPanel2MouseExited

    private void ListMenuPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListMenuPanel3MouseClicked
            Option.setVisible(true);
    }//GEN-LAST:event_ListMenuPanel3MouseClicked

    private void ListMenuPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListMenuPanel3MouseEntered
            MenuPanel.setSize(MenuX,MenuY);
            MenuPanel2.setBackground(new Color(36, 36, 43));
            ListMenuPanel3.setBackground(new Color(46, 46, 51));
    }//GEN-LAST:event_ListMenuPanel3MouseEntered

    private void ListMenuPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListMenuPanel3MouseExited
            MenuPanel.setSize(0,0);
            MenuPanel2.setBackground(new Color(0, 103, 76));
            ListMenuPanel3.setBackground(new Color(36, 36, 43));
    }//GEN-LAST:event_ListMenuPanel3MouseExited

    private void MenuPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuPanelMouseEntered
            MenuPanel.setSize(MenuX,MenuY);
            MenuPanel2.setBackground(new Color(36, 36, 43));
    }//GEN-LAST:event_MenuPanelMouseEntered

    private void MenuPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuPanelMouseExited
            MenuPanel.setSize(0,0);
            MenuPanel2.setBackground(new Color(0, 103, 76));
    }//GEN-LAST:event_MenuPanelMouseExited

    private void MenuPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuPanel2MouseEntered
            MenuPanel.setSize(MenuX,MenuY);
            MenuPanel2.setBackground(new Color(36, 36, 43));
        
    }//GEN-LAST:event_MenuPanel2MouseEntered

    private void MenuPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuPanel2MouseExited
            MenuPanel.setSize(0,0);
    }//GEN-LAST:event_MenuPanel2MouseExited

    private void MenuLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuLabelMouseEntered
            MenuPanel.setSize(MenuX,MenuY);
            MenuPanel2.setBackground(new Color(36, 36, 43));
    }//GEN-LAST:event_MenuLabelMouseEntered

    private void MenuLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuLabelMouseExited
            MenuPanel.setSize(0,0);
            MenuPanel2.setBackground(new Color(0, 103, 76));
    }//GEN-LAST:event_MenuLabelMouseExited

    
  
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
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Frame1().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Frame1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JLabel ButtonBuyingLabel;
    private javax.swing.JPanel ButtonBuyingPanel;
    private javax.swing.JLabel ButtonSellingLabel;
    private javax.swing.JPanel ButtonSellingPanel;
    private javax.swing.JLabel BuyingLabel;
    private javax.swing.JLabel BuyingRateTableLabel1;
    private javax.swing.JLabel BuyingRateTableLabel2;
    private javax.swing.JLabel BuyingRateTableLabel3;
    private javax.swing.JLabel BuyingRateTableLabel4;
    private javax.swing.JLabel BuyingRateTableLabel5;
    private javax.swing.JLabel CancelLabel;
    private javax.swing.JComboBox<String> CurrencyComboBox;
    private javax.swing.JLabel CurrencyFromLabel;
    private javax.swing.JLabel CurrencyLineTableLabel1;
    private javax.swing.JLabel CurrencyLineTableLabel2;
    private javax.swing.JLabel CurrencyLineTableLabel3;
    private javax.swing.JLabel CurrencyLineTableLabel4;
    private javax.swing.JLabel CurrencyLineTableLabel5;
    private javax.swing.JLabel CurrencyToLabel;
    private javax.swing.JLabel FlagLabel;
    private javax.swing.JLabel FlagLineTableLabel1;
    private javax.swing.JLabel FlagLineTableLabel2;
    private javax.swing.JLabel FlagLineTableLabel3;
    private javax.swing.JLabel FlagLineTableLabel4;
    private javax.swing.JLabel FlagLineTableLabel5;
    private javax.swing.JLabel GetTitleLabel;
    private javax.swing.JLabel GetTradeLabel;
    private javax.swing.JLabel HeaderBuyingLabel;
    private javax.swing.JLabel HeaderCurrencyLabel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JLabel HeaderSellingLabel;
    private javax.swing.JLabel HideLabel;
    private javax.swing.JLabel HowLabel;
    private javax.swing.JLabel InputButtonLabel;
    private javax.swing.JPanel InputButtonPanel;
    private javax.swing.JTextField InputField;
    private javax.swing.JPanel InputPanel;
    private javax.swing.JSeparator InputSeparator;
    private javax.swing.JPanel LineTablePanel1;
    private javax.swing.JPanel LineTablePanel2;
    private javax.swing.JPanel LineTablePanel3;
    private javax.swing.JPanel LineTablePanel4;
    private javax.swing.JPanel LineTablePanel5;
    private javax.swing.JPanel ListMenuPanel1;
    private javax.swing.JPanel ListMenuPanel2;
    private javax.swing.JPanel ListMenuPanel3;
    private javax.swing.JLabel LogoLabel;
    private javax.swing.JLabel MenuIconLabel1;
    private javax.swing.JLabel MenuIconLabel2;
    private javax.swing.JLabel MenuIconLabel3;
    private javax.swing.JLabel MenuLabel;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JPanel MenuPanel2;
    private javax.swing.JLabel MenuTitleLabel1;
    private javax.swing.JLabel MenuTitleLabel2;
    private javax.swing.JLabel MenuTitleLabel3;
    private javax.swing.JLabel OutputLabel;
    private javax.swing.JLabel PreviewInputLabel;
    private javax.swing.JLabel PreviewLabel;
    private javax.swing.JLabel SellingLabel;
    private javax.swing.JLabel SellingRateTableLabel1;
    private javax.swing.JLabel SellingRateTableLabel2;
    private javax.swing.JLabel SellingRateTableLabel3;
    private javax.swing.JLabel SellingRateTableLabel4;
    private javax.swing.JLabel SellingRateTableLabel5;
    private javax.swing.JLabel SwitchLabel;
    private javax.swing.JPanel TapPanel;
    private javax.swing.JPanel TapPanel2;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel TitleTap2Label;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
