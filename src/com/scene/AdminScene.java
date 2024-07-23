package com.scene;

import com.script.ImageResize;
import javax.swing.ImageIcon;
import com.component.Dashboard;
import com.component.Patient;
import com.component.Appointment;
import com.component.Treatment;
import com.component.Invoice;
import com.component.Inventory;
import com.component.Supplier;

import java.awt.CardLayout;

/**
 *
 * @author mayank
 */
public class AdminScene extends javax.swing.JFrame {

    private CardLayout cardLayout;
    public AdminScene() {
        this.setUndecorated(true);
        this.setSize(909, 500);
        this.setResizable(true);
        initComponents();
        initIcons();
        this.setLocationRelativeTo(null);
        PanelSwitching();
    }

     private void initIcons() {
        //formBg
       // ImageIcon icon1 = ImageResize.resizeIcon(exitBtn.getIcon(), exitBtn.getWidth(), exitBtn.getHeight());
        //exitBtn.setIcon(icon1);

        //formIcon
        //ImageIcon icon2 = ImageResize.resizeIcon(dashboardBtn.getIcon(), dashboardBtn.getWidth(), dashboardBtn.getHeight());
        //dashboardBtn.setIcon(icon2);

        //formExit
        ImageIcon icon3 = ImageResize.resizeIcon(exitBtn.getIcon(), exitBtn.getWidth(), exitBtn.getHeight());
        exitBtn.setIcon(icon3);
    }
     
    private void PanelSwitching(){
    Dashboard dashboardPanel = new Dashboard();
    Patient patientPanel = new Patient(dashboardPanel);
    Appointment appointmentPanel = new Appointment();
    Treatment treatmentPanel = new Treatment();
    Invoice invoicePanel = new Invoice();
    Inventory inventoryPanel = new Inventory();
    Supplier supplierPanel = new Supplier();
    
    cardLayout = new CardLayout();
    mainPanel.setLayout(cardLayout);
    
    mainPanel.add(dashboardPanel, "Dashboard");
    mainPanel.add(patientPanel, "Patient");
    mainPanel.add(appointmentPanel,"Appointment");
    mainPanel.add(treatmentPanel,"Treatment");
    mainPanel.add(invoicePanel,"Invoice");
    mainPanel.add(inventoryPanel, "Inventory");
    mainPanel.add(supplierPanel,"Supplier");
    
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        menu1 = new com.pannel.Menu();
        jLabel1 = new javax.swing.JLabel();
        dashboardBtn = new javax.swing.JButton();
        patientBtn = new javax.swing.JButton();
        appointmentBtn = new javax.swing.JButton();
        treatmentBtn = new javax.swing.JButton();
        invoiceBtn = new javax.swing.JButton();
        inventoryBtn = new javax.swing.JButton();
        supplierBtn = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        mainPanel = new javax.swing.JPanel();
        exitBtn = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Dental Care");

        dashboardBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dashboardBtn.setForeground(new java.awt.Color(255, 255, 255));
        dashboardBtn.setText("DashBoard");
        dashboardBtn.setContentAreaFilled(false);
        dashboardBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dashboardBtn.setVerifyInputWhenFocusTarget(false);
        dashboardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardBtnActionPerformed(evt);
            }
        });

        patientBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        patientBtn.setForeground(new java.awt.Color(255, 255, 255));
        patientBtn.setText("Patient");
        patientBtn.setContentAreaFilled(false);
        patientBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        patientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientBtnActionPerformed(evt);
            }
        });

        appointmentBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        appointmentBtn.setForeground(new java.awt.Color(255, 255, 255));
        appointmentBtn.setText("Appointment");
        appointmentBtn.setContentAreaFilled(false);
        appointmentBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        appointmentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentBtnActionPerformed(evt);
            }
        });

        treatmentBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        treatmentBtn.setForeground(new java.awt.Color(255, 255, 255));
        treatmentBtn.setText("Treatment");
        treatmentBtn.setContentAreaFilled(false);
        treatmentBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        treatmentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                treatmentBtnActionPerformed(evt);
            }
        });

        invoiceBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        invoiceBtn.setForeground(new java.awt.Color(255, 255, 255));
        invoiceBtn.setText("Invoice");
        invoiceBtn.setContentAreaFilled(false);
        invoiceBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        invoiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceBtnActionPerformed(evt);
            }
        });

        inventoryBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inventoryBtn.setForeground(new java.awt.Color(255, 255, 255));
        inventoryBtn.setText("Inventory");
        inventoryBtn.setContentAreaFilled(false);
        inventoryBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        inventoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventoryBtnActionPerformed(evt);
            }
        });

        supplierBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        supplierBtn.setForeground(new java.awt.Color(255, 255, 255));
        supplierBtn.setText("Supplier");
        supplierBtn.setContentAreaFilled(false);
        supplierBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        supplierBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierBtnActionPerformed(evt);
            }
        });

        logOutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/asset/32LogOut.png"))); // NOI18N
        logOutButton.setBorderPainted(false);
        logOutButton.setContentAreaFilled(false);
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menu1Layout = new javax.swing.GroupLayout(menu1);
        menu1.setLayout(menu1Layout);
        menu1Layout.setHorizontalGroup(
            menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu1Layout.createSequentialGroup()
                .addGroup(menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menu1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(appointmentBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(patientBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dashboardBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(treatmentBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(invoiceBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(inventoryBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(supplierBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(menu1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logOutButton)))
                .addGap(23, 23, 23))
        );
        menu1Layout.setVerticalGroup(
            menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(dashboardBtn)
                .addGap(10, 10, 10)
                .addComponent(patientBtn)
                .addGap(10, 10, 10)
                .addComponent(appointmentBtn)
                .addGap(10, 10, 10)
                .addComponent(treatmentBtn)
                .addGap(10, 10, 10)
                .addComponent(invoiceBtn)
                .addGap(10, 10, 10)
                .addComponent(inventoryBtn)
                .addGap(10, 10, 10)
                .addComponent(supplierBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logOutButton)
                .addGap(15, 15, 15))
        );

        mainPanel.setBackground(new java.awt.Color(51, 51, 51));
        mainPanel.setPreferredSize(new java.awt.Dimension(494, 500));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 747, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/asset/cross_square.png"))); // NOI18N
        exitBtn.setBorder(null);
        exitBtn.setBorderPainted(false);
        exitBtn.setContentAreaFilled(false);
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
            .addComponent(menu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(484, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardBtnActionPerformed
        // TODO add your handling code here:
         cardLayout.show(mainPanel, "Dashboard");
    }//GEN-LAST:event_dashboardBtnActionPerformed

    private void patientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientBtnActionPerformed
        // TODO add your handling code here:
        cardLayout.show(mainPanel,"Patient");
    }//GEN-LAST:event_patientBtnActionPerformed

    private void appointmentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentBtnActionPerformed
        cardLayout.show(mainPanel,"Appointment");
    }//GEN-LAST:event_appointmentBtnActionPerformed

    private void treatmentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_treatmentBtnActionPerformed
        cardLayout.show(mainPanel,"Treatment");
    }//GEN-LAST:event_treatmentBtnActionPerformed

    private void invoiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceBtnActionPerformed
        cardLayout.show(mainPanel,"Invoice");
    }//GEN-LAST:event_invoiceBtnActionPerformed

    private void inventoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventoryBtnActionPerformed
        cardLayout.show(mainPanel,"Inventory");
    }//GEN-LAST:event_inventoryBtnActionPerformed

    private void supplierBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierBtnActionPerformed
        cardLayout.show(mainPanel,"Supplier");
    }//GEN-LAST:event_supplierBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
       dispose();
       LoginForm login = new LoginForm();
       login.setVisible(true);
    }//GEN-LAST:event_logOutButtonActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminScene().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton appointmentBtn;
    private javax.swing.JButton dashboardBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton inventoryBtn;
    private javax.swing.JButton invoiceBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton logOutButton;
    private javax.swing.JPanel mainPanel;
    private com.pannel.Menu menu1;
    private javax.swing.JButton patientBtn;
    private javax.swing.JButton supplierBtn;
    private javax.swing.JButton treatmentBtn;
    // End of variables declaration//GEN-END:variables
}
