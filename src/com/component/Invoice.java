package com.component;

import com.script.TableDAO;
import com.scene.InvoicePrint;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author mayank
 */
public class Invoice extends javax.swing.JPanel {

    private TableDAO tableDAO;
    public InvoicePrint invoicePrint;
    public int row;
    public String col;
    
    public Invoice() {
        initComponents();
        tableDAO = new TableDAO();  
        invoicePrint = new InvoicePrint(); 
        displayInvoices();
        printMouseListenerClicked();
        
        
    }
   
    private void addInvoice(){
    try {
        int appointmentID = Integer.parseInt(appointmentIDTextField.getText().trim());
        double totalAmount = Double.parseDouble(totalAmountTextField.getText().trim());
        String paymentStatus = paymentStatusTextField.getText().trim();
        java.util.Date paymentDate = paymentDateChooser.getDate();
        java.sql.Date sqlPaymentDate = new java.sql.Date(paymentDate.getTime());

        tableDAO.addData("INSERT INTO Invoices (AppointmentID, TotalAmount, PaymentStatus, PaymentDate) VALUES (?, ?, ?, ?)",
                appointmentID, totalAmount, paymentStatus, sqlPaymentDate);

        JOptionPane.showMessageDialog(this, "Invoice added successfully!");
        clearFields(); 
        displayInvoices();
    } catch (Exception ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error adding invoice: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }
    private void updateInvoice(){
     try {
        int invoiceID = Integer.parseInt(invoiceIDTextField.getText().trim());
        String paymentStatus = updatePaymentStatusTextField.getText().trim();
        java.util.Date paymentDate = updatePaymentDateChooser.getDate();
        java.sql.Date sqlPaymentDate = new java.sql.Date(paymentDate.getTime());

        tableDAO.updateData("UPDATE Invoices SET PaymentStatus = ?, PaymentDate = ? WHERE InvoiceID = ?",
                paymentStatus, sqlPaymentDate, invoiceID);

        JOptionPane.showMessageDialog(this, "Invoice updated successfully!");
        clearFields();
        displayInvoices(); 
    } catch (Exception ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error updating invoice: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }
    private void searchInvoice() {

String search = searchInvoiceTextField.getText();
    DefaultTableModel invoiceTbl = (DefaultTableModel) invoiceTable.getModel();
    TableRowSorter<DefaultTableModel> tableRow = new TableRowSorter<>(invoiceTbl);
    invoiceTable.setRowSorter(tableRow);

    int appointmentIdColumnIndex = 1;

    RowFilter<DefaultTableModel, Object> appointmentIdFilter = new RowFilter<DefaultTableModel, Object>() {
        @Override
        public boolean include(Entry<? extends DefaultTableModel, ? extends Object> entry) {
            String appointmentId = entry.getStringValue(appointmentIdColumnIndex);
            return appointmentId.equals(search); 
        }
    };

    tableRow.setRowFilter(appointmentIdFilter);
}
    
   private void displayInvoices(){
   DefaultTableModel model = tableDAO.fetchData("SELECT * FROM Invoices");
    invoiceTable.setModel(model);
   }
   private void clearFields() {
    appointmentIDTextField.setText("");
    totalAmountTextField.setText("");
    paymentStatusTextField.setText("");
    paymentDateChooser.setDate(null);
    invoiceIDTextField.setText("");
    updatePaymentStatusTextField.setText("");
    updatePaymentDateChooser.setDate(null);
    searchInvoiceTextField.setText("");
}

    private void printTableMouseClicked(java.awt.event.MouseEvent evt) {                                        
        
        JTable source = (JTable) evt.getSource();
    int row = source.rowAtPoint(evt.getPoint());

    if (row >= 0) {
       
        String invoiceID = invoiceTable.getModel().getValueAt(row, 0).toString();
        String appointmentID = invoiceTable.getModel().getValueAt(row, 1).toString();
        String paymentDate = invoiceTable.getModel().getValueAt(row, 2).toString(); 
        String amount = invoiceTable.getModel().getValueAt(row, 3).toString(); 
        invoicePrint.getInvoiceDetail(invoiceID, appointmentID, paymentDate, amount);

    }

    } 
    
    public void printMouseListenerClicked(){
        invoiceTable.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
         printTableMouseClicked(evt); 
        }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        appointmentIDTextField = new javax.swing.JTextField();
        totalAmountTextField = new javax.swing.JTextField();
        paymentStatusTextField = new javax.swing.JTextField();
        paymentDateChooser = new com.toedter.calendar.JDateChooser();
        addInvoiceButton = new com.k33ptoo.components.KButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        invoiceIDTextField = new javax.swing.JTextField();
        updatePaymentStatusTextField = new javax.swing.JTextField();
        updatePaymentDateChooser = new com.toedter.calendar.JDateChooser();
        updateInvoiceButton = new com.k33ptoo.components.KButton();
        jPanel4 = new javax.swing.JPanel();
        contentPane = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        invoiceTable = new javax.swing.JTable();
        printInvoiceButton = new com.k33ptoo.components.KButton();
        searchInvoiceTextField = new javax.swing.JTextField();
        searchInvoiceButton = new javax.swing.JButton();
        refreshInvoiceButton = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Invoice");

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Create Invoice");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Appointment ID");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Amount");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Payment Status");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Payment Date");

        paymentDateChooser.setDateFormatString("dd-MM-yyyy");

        addInvoiceButton.setText("Add");
        addInvoiceButton.setkBackGroundColor(new java.awt.Color(0, 153, 153));
        addInvoiceButton.setkEndColor(new java.awt.Color(150, 31, 233));
        addInvoiceButton.setkHoverColor(new java.awt.Color(0, 142, 155));
        addInvoiceButton.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        addInvoiceButton.setkHoverStartColor(new java.awt.Color(0, 153, 153));
        addInvoiceButton.setkSelectedColor(new java.awt.Color(0, 102, 102));
        addInvoiceButton.setkStartColor(new java.awt.Color(81, 0, 213));
        addInvoiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addInvoiceButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(addInvoiceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(appointmentIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(paymentDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(totalAmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(paymentStatusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(13, 13, 13))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(appointmentIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(totalAmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(paymentStatusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(paymentDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addInvoiceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Update Invoice");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Invoice ID");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Payment Status");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Payment Date");

        updatePaymentDateChooser.setDateFormatString("dd-MM-yyyy");

        updateInvoiceButton.setText("Update");
        updateInvoiceButton.setkBackGroundColor(new java.awt.Color(0, 153, 153));
        updateInvoiceButton.setkEndColor(new java.awt.Color(150, 31, 233));
        updateInvoiceButton.setkHoverColor(new java.awt.Color(0, 142, 155));
        updateInvoiceButton.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        updateInvoiceButton.setkHoverStartColor(new java.awt.Color(0, 153, 153));
        updateInvoiceButton.setkSelectedColor(new java.awt.Color(0, 102, 102));
        updateInvoiceButton.setkStartColor(new java.awt.Color(81, 0, 213));
        updateInvoiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateInvoiceButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(updateInvoiceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updatePaymentDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(invoiceIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updatePaymentStatusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(15, 15, 15))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(invoiceIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(updatePaymentStatusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(updatePaymentDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateInvoiceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 301, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 82, Short.MAX_VALUE)
        );

        contentPane.setBackground(new java.awt.Color(102, 102, 102));

        invoiceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(invoiceTable);

        printInvoiceButton.setText("Print");
        printInvoiceButton.setkBackGroundColor(new java.awt.Color(0, 153, 153));
        printInvoiceButton.setkEndColor(new java.awt.Color(150, 31, 233));
        printInvoiceButton.setkHoverColor(new java.awt.Color(0, 142, 155));
        printInvoiceButton.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        printInvoiceButton.setkHoverStartColor(new java.awt.Color(0, 153, 153));
        printInvoiceButton.setkSelectedColor(new java.awt.Color(0, 102, 102));
        printInvoiceButton.setkStartColor(new java.awt.Color(81, 0, 213));
        printInvoiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printInvoiceButtonActionPerformed(evt);
            }
        });

        searchInvoiceButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/asset/Search.png"))); // NOI18N
        searchInvoiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchInvoiceButtonActionPerformed(evt);
            }
        });

        refreshInvoiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshInvoiceButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentPaneLayout = new javax.swing.GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPaneLayout.createSequentialGroup()
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE))
                    .addGroup(contentPaneLayout.createSequentialGroup()
                        .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(printInvoiceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(searchInvoiceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchInvoiceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(refreshInvoiceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchInvoiceTextField)
                    .addComponent(searchInvoiceButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createSequentialGroup()
                        .addComponent(refreshInvoiceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(printInvoiceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(contentPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(contentPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addInvoiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addInvoiceButtonActionPerformed
        addInvoice();
    }//GEN-LAST:event_addInvoiceButtonActionPerformed

    private void updateInvoiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateInvoiceButtonActionPerformed
        updateInvoice();
    }//GEN-LAST:event_updateInvoiceButtonActionPerformed

    private void searchInvoiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchInvoiceButtonActionPerformed
        searchInvoice();
    }//GEN-LAST:event_searchInvoiceButtonActionPerformed

    private void refreshInvoiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshInvoiceButtonActionPerformed
        displayInvoices();
    }//GEN-LAST:event_refreshInvoiceButtonActionPerformed

    private void printInvoiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printInvoiceButtonActionPerformed
        //JOptionPane.showMessageDialog(null, "Selected value: " + col);
        
        
        invoicePrint.setVisible(true);
        
    }//GEN-LAST:event_printInvoiceButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton addInvoiceButton;
    private javax.swing.JTextField appointmentIDTextField;
    private javax.swing.JPanel contentPane;
    private javax.swing.JTextField invoiceIDTextField;
    private javax.swing.JTable invoiceTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser paymentDateChooser;
    private javax.swing.JTextField paymentStatusTextField;
    private com.k33ptoo.components.KButton printInvoiceButton;
    private javax.swing.JButton refreshInvoiceButton;
    private javax.swing.JButton searchInvoiceButton;
    private javax.swing.JTextField searchInvoiceTextField;
    private javax.swing.JTextField totalAmountTextField;
    private com.k33ptoo.components.KButton updateInvoiceButton;
    private com.toedter.calendar.JDateChooser updatePaymentDateChooser;
    private javax.swing.JTextField updatePaymentStatusTextField;
    // End of variables declaration//GEN-END:variables
}
