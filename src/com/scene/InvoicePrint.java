package com.scene;


import com.script.ImageResize;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.ImageIcon;

/**
 *
 * @author mayank
 */
public class InvoicePrint extends javax.swing.JFrame {

    public InvoicePrint() {
        this.setUndecorated(true);
        initComponents();
         
        ImageIcon icon = ImageResize.resizeIcon(iconLabel.getIcon(), iconLabel.getWidth(), iconLabel.getHeight());
        iconLabel.setIcon(icon);
    }
    public void getInvoiceDetail(String invoiceID, String appointmentID, String paymentDate, String amount){
        InvoiceIDLabel.setText(invoiceID);
        appointmentIDLabel.setText(appointmentID);
        paymentDateLabel.setText(paymentDate);
        amountLabel.setText(amount);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel2 = new javax.swing.JPanel();
        printBtn = new javax.swing.JButton();
        exitLbl = new javax.swing.JLabel();
        minimizeLbl = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        iconLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        InvoiceIDLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        amountLabel = new javax.swing.JLabel();
        paymentDateLabel = new javax.swing.JLabel();
        appointmentIDLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel2.setBackground(new java.awt.Color(255, 255, 255));

        printBtn.setBackground(new java.awt.Color(102, 51, 153));
        printBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        printBtn.setForeground(new java.awt.Color(255, 255, 255));
        printBtn.setText("Print");
        printBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBtnActionPerformed(evt);
            }
        });

        exitLbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        exitLbl.setForeground(new java.awt.Color(204, 0, 0));
        exitLbl.setText("X");
        exitLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLblMouseClicked(evt);
            }
        });

        minimizeLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        minimizeLbl.setForeground(new java.awt.Color(102, 102, 255));
        minimizeLbl.setText("-");
        minimizeLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeLblMouseClicked(evt);
            }
        });

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setForeground(new java.awt.Color(204, 204, 204));

        iconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/asset/DentalCare.jpg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 51, 153));
        jLabel1.setText("Invoice Details");

        InvoiceIDLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        InvoiceIDLabel.setText("\"\"");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Invoice ID :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Appointment ID");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Payment Date:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Amount :");

        amountLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        amountLabel.setText("\"\"");

        paymentDateLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        paymentDateLabel.setText("\"\"");

        appointmentIDLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        appointmentIDLabel.setText("\"\"");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(iconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(146, 146, 146))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(appointmentIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InvoiceIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paymentDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(iconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(InvoiceIDLabel))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(appointmentIDLabel))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(paymentDateLabel))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(amountLabel))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(minimizeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitLbl)
                .addContainerGap())
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(45, 45, 45))
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(printBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minimizeLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(printBtn)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void printBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBtnActionPerformed

     PrinterJob job = PrinterJob.getPrinterJob();
    job.setJobName("Print Data");

    job.setPrintable(new Printable() {
        public int print(Graphics pg, PageFormat pf, int pageNum) {
            if (pageNum > 0) {
                return Printable.NO_SUCH_PAGE;
            }

            Graphics2D g2 = (Graphics2D) pg;
            g2.translate(pf.getImageableX(), pf.getImageableY());

            // Calculate the scaling factor
            double scaleX = pf.getImageableWidth() / panel1.getWidth();
            double scaleY = pf.getImageableHeight() / panel1.getHeight();
            double scale = Math.min(scaleX, scaleY);

            // Apply scaling factor
            g2.scale(scale, scale);

            // Print the panel
            panel1.print(g2);

            return Printable.PAGE_EXISTS;
        }
    });

    boolean ok = job.printDialog();
    if (ok) {
        try {
            job.print();
        } catch (PrinterException ex) {
            ex.printStackTrace();
        }
    }
    }//GEN-LAST:event_printBtnActionPerformed

    private void exitLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLblMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitLblMouseClicked

    private void minimizeLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeLblMouseClicked

    }//GEN-LAST:event_minimizeLblMouseClicked

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
            java.util.logging.Logger.getLogger(InvoicePrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvoicePrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvoicePrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvoicePrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvoicePrint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel InvoiceIDLabel;
    private javax.swing.JLabel amountLabel;
    private javax.swing.JLabel appointmentIDLabel;
    private javax.swing.JLabel exitLbl;
    private javax.swing.JLabel iconLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel minimizeLbl;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JLabel paymentDateLabel;
    private javax.swing.JButton printBtn;
    // End of variables declaration//GEN-END:variables
}
