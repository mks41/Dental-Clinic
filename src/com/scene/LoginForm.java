package com.scene;

import com.script.ImageResize;
import com.connection.GenerateConnection;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author mayank
 */
public class LoginForm extends javax.swing.JFrame {

    public LoginForm() {
        setUndecorated(true);
        initComponents();
        loginBtn.setContentAreaFilled(false);
        loginBtn.setBorderPainted(true);
        initIcons();
        setLocationRelativeTo(null);
    }

    private void initIcons() {
        //formBg
        ImageIcon icon1 = ImageResize.resizeIcon(formBg.getIcon(), formBg.getWidth(), formBg.getHeight());
        formBg.setIcon(icon1);

        //formIcon
        ImageIcon icon2 = ImageResize.resizeIcon(formIcon.getIcon(), formIcon.getWidth(), formIcon.getHeight());
        formIcon.setIcon(icon2);

        //formExit
        ImageIcon icon3 = ImageResize.resizeIcon(exitBtn.getIcon(), exitBtn.getWidth(), exitBtn.getHeight());
        exitBtn.setIcon(icon3);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kButton1 = new com.k33ptoo.components.KButton();
        formPanel1 = new com.pannel.FormPanel();
        formBg = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        formIcon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        userField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        exitBtn = new javax.swing.JButton();

        kButton1.setText("kButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        formBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/asset/dentists-holding.png"))); // NOI18N
        formBg.setText("jLabel1");

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Dental Care");

        formIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/asset/ToothChar2.png"))); // NOI18N
        formIcon.setText("jLabel1");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("UserName");

        userField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userFieldActionPerformed(evt);
            }
        });

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        loginBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");

        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/asset/close-cross-.png"))); // NOI18N
        exitBtn.setBorderPainted(false);
        exitBtn.setContentAreaFilled(false);
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formPanel1Layout = new javax.swing.GroupLayout(formPanel1);
        formPanel1.setLayout(formPanel1Layout);
        formPanel1Layout.setHorizontalGroup(
            formPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(formBg, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(formPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formPanel1Layout.createSequentialGroup()
                        .addGroup(formPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(formPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(formPanel1Layout.createSequentialGroup()
                                        .addComponent(formIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, formPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(formPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(formPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel3))
                            .addGroup(formPanel1Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(loginBtn)))
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        formPanel1Layout.setVerticalGroup(
            formPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(formBg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(formPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(formPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(formIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(formPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(formPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(loginBtn)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(formPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(formPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userFieldActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
       String username = userField.getText();
       String password = passwordField.getText();
       Connection CONNECTION = GenerateConnection.getConnection();
       try{
       PreparedStatement pstmt = CONNECTION.prepareStatement("SELECT * FROM Users WHERE Username=? AND Password=?");
       pstmt.setString(1,username);
       pstmt.setString(2,password);
       ResultSet rs = pstmt.executeQuery();
       
       if(rs.next()){
       dispose();
       
       new AdminScene().setVisible(true);
       
       }
       else{
       JFrame f = new JFrame();
       JOptionPane.showMessageDialog(f,"Wrong Credential");
       }
       /*while (rs.next()){
            f_name = rs.getString("FirstName");            
       }*/
       
       }catch (SQLException sqlException){
           System.out.print(sqlException);
       }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel formBg;
    private javax.swing.JLabel formIcon;
    private com.pannel.FormPanel formPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private com.k33ptoo.components.KButton kButton1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField userField;
    // End of variables declaration//GEN-END:variables
}
