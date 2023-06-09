/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.CategoryDao;
import dao.ProductDao;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.crypto.AEADBadTagException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import models.Transaction;

/**
 *
 * @author Aganze Felicite
 */
public class SellerDashBoard extends javax.swing.JFrame {
    DefaultTableModel table1 = new DefaultTableModel();
    DefaultTableModel table2 = new DefaultTableModel();
    /**
     * Creates new form SellerDashBoard
     */
    private String Name;

    public void setName(String Name) {
        this.Name = Name;
        sellerName.setText(Name);
    }
    
   
    public SellerDashBoard() {
        initComponents();
        addTableColumnNames();
        addTableRows();
        addCategories();
        addTable2ColumnNames();
        addTable2Rows();
        System.out.println(Name);
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
        jPanel2 = new javax.swing.JPanel();
        logOut = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        sellerName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        productQuantity = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        productName = new javax.swing.JTextField();
        addToBill = new javax.swing.JButton();
        newBill = new javax.swing.JButton();
        category = new javax.swing.JComboBox<>();
        sort = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableData2 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableData1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        productId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pdf = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        billTxt = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));

        logOut.setBackground(new java.awt.Color(0, 204, 255));
        logOut.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        logOut.setForeground(new java.awt.Color(255, 255, 255));
        logOut.setText("Log Out");
        logOut.setBorder(null);
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("User Name");

        sellerName.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        sellerName.setForeground(new java.awt.Color(255, 255, 255));
        sellerName.setText("jLabel7");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(sellerName, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sellerName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("Billing Point");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Quantity:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("ProductID:");

        addToBill.setBackground(new java.awt.Color(0, 153, 0));
        addToBill.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addToBill.setForeground(new java.awt.Color(255, 255, 255));
        addToBill.setText("Add to Bill");
        addToBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToBillActionPerformed(evt);
            }
        });

        newBill.setBackground(new java.awt.Color(0, 102, 255));
        newBill.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        newBill.setForeground(new java.awt.Color(255, 255, 255));
        newBill.setText("New Bill");
        newBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBillActionPerformed(evt);
            }
        });

        category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beverages" }));

        sort.setBackground(new java.awt.Color(255, 153, 0));
        sort.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sort.setForeground(new java.awt.Color(255, 255, 255));
        sort.setText("Sort");
        sort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setText("Product list");

        tableData2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableData2);

        tableData1.setModel(new javax.swing.table.DefaultTableModel(
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
        tableData1.setGridColor(new java.awt.Color(0, 0, 0));
        tableData1.setRowSelectionAllowed(false);
        tableData1.setShowGrid(true);
        tableData1.setSurrendersFocusOnKeystroke(true);
        tableData1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableData1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableData1);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("ProductName:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(productId, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(sort, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(176, 176, 176))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(addToBill, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1))
                        .addGap(109, 109, 109))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(131, 131, 131))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(newBill, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(productId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sort))
                            .addGap(75, 75, 75))
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(productQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newBill, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addToBill, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setText("CUSTOMER BILL");

        pdf.setBackground(new java.awt.Color(51, 102, 255));
        pdf.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        pdf.setForeground(new java.awt.Color(255, 255, 255));
        pdf.setText("Print Bill");
        pdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdfActionPerformed(evt);
            }
        });

        billTxt.setColumns(20);
        billTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        billTxt.setRows(5);
        jScrollPane3.setViewportView(billTxt);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(pdf, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(pdf, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void addTableColumnNames(){
        table1.addColumn("Product ID");
        table1.addColumn("Product Name");
        table1.addColumn("Product Quantity");
        table1.addColumn("Product Price");
        table1.addColumn("Product Category");
        tableData1.setModel(table1);
       
      
    }
     private void addTable2ColumnNames(){
        table2.addColumn("Transaction ID");
        table2.addColumn("Product ID");
        table2.addColumn("Product Name");
        table2.addColumn("Product Quantity");
        table2.addColumn("Product Cost");
        table2.addColumn("SellerName");
        tableData2.setModel(table2);
      
    }
     private void addTableRows(){
        ProductDao obj = new ProductDao();
        try{
            ResultSet result = obj.retrieveTableRows();
        while(result.next()){
            table1.addRow(new Object[]{
                result.getInt(1),
        
                result.getString(2),
                result.getFloat(3),
                result.getFloat(4),
                result.getString(5),                             
            });
        }
        }catch(Exception e){
            e.printStackTrace();
        }
     
    
    }
      private void addTable2Rows(){
        ProductDao obj = new ProductDao();
        try{
            ResultSet result = obj.retrieveTable2Rows();
        while(result.next()){
            table2.addRow(new Object[]{
                result.getInt(1),
                result.getInt(2),
                result.getString(3),
                result.getFloat(4),
                result.getFloat(5),
                result.getString(6),                             
            });
        }
        }catch(Exception e){
            e.printStackTrace();
        }
     
    
    }
    
     private void addCategories(){
        CategoryDao Obj = new CategoryDao();
        try{
        ResultSet result = Obj.retrieveCategories();
       
         ArrayList<String> items = new ArrayList<>();
         while (result.next()) {
            items.add(result.getString(1));
         }
         DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(items.toArray(new String[0]));
         category.setModel(model);
         
        }catch(Exception e){
            e.printStackTrace();
        }
        
    
    }
    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        // TODO add your handling code here:
        Login form = new Login();
        this.dispose();
        form.setVisible(true);
    }//GEN-LAST:event_logOutActionPerformed

    float total = 0;
    
    private void addToBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToBillActionPerformed
        // TODO add your handling code here:
        //get the elements in the text field

       
       
         String bill;
        
        
            int row = tableData1.getSelectedRow();
            String productName1 = productName.getText();
            
            if(productQuantity.getText().trim().isEmpty() ){
            
                JOptionPane.showMessageDialog(this ,"enter the quantity/ should be greater than 0");
                return;
            }
            Float quantity =  Float.parseFloat(productQuantity.getText());
            if(quantity < 1){
            
                JOptionPane.showMessageDialog(this ,"The quantity should be greater than 0");
                return;
            }
            float price = Float.parseFloat(table1.getValueAt(row, 3).toString());
            float cost = price * quantity;
            total += cost;
            ProductDao Obj = new ProductDao();
            Transaction obj1 = new Transaction();
            obj1.setProductId(Integer.parseInt(productId.getText()));
            obj1.setProductName(productName.getText());
            obj1.setPrice(cost);
            obj1.setSellerName(sellerName.getText());
            obj1.setQuantity(quantity);
            ProductDao objDao = new ProductDao();
            objDao.updateQuantity(Float.parseFloat(productQuantity.getText()), Integer.parseInt(productId.getText()));
            Obj.createTransaction(obj1);
            
            
            int choice = JOptionPane.showConfirmDialog(this, "do u wish to add this to the bill");
            
            if(choice == JOptionPane.YES_OPTION){
                
                bill = "\n"+quantity+" of "+productName1+" cost "+cost+"rwf \ntotal is :"+total+"";
                billTxt.setText(billTxt.getText() +"\n"+ bill);
                billTxt.append("\n ===============================");
                table2.setRowCount(0);
                addTable2Rows();
               
            }else if(choice == JOptionPane.NO_OPTION){
             
           
            
        }
        //calculate the cost
        //print the on the bill
        //keep track of the sum
        
    }//GEN-LAST:event_addToBillActionPerformed

    private void tableData1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableData1MouseClicked
        // TODO add your handling code here:
        int row = tableData1.getSelectedRow();
        productId.setText(table1.getValueAt(row, 0).toString());
        productName.setText(table1.getValueAt(row, 1).toString());
        
    }//GEN-LAST:event_tableData1MouseClicked

    private void pdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdfActionPerformed
        // TODO add your handling code here:
        try {
            // Create a FileWriter object with the file path
            
            FileWriter writer = new FileWriter("bill.txt", true); // "true" to append text to the end of the file

            // Add text to the file
            writer.write(billTxt.getText());

            // Close the writer to save the changes
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_pdfActionPerformed

    private void newBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBillActionPerformed
        // TODO add your handling code here:
        billTxt.setText("\tTHIS IS YOUR BILL\n" +"===================================\n");
       
    }//GEN-LAST:event_newBillActionPerformed

    private void sortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortActionPerformed
        // TODO add your handling code here:
         table1.setRowCount(0);
           
         ProductDao obj = new ProductDao();
        try{
            ResultSet result = obj.sort((String)category.getSelectedItem());
        while(result.next()){
            table1.addRow(new Object[]{
                result.getInt(1),
        
                result.getString(2),
                result.getFloat(3),
                result.getFloat(4),
                result.getString(5),                             
            });  
        }
        }catch(Exception e){
            e.printStackTrace();
        }
     
        
        
    }//GEN-LAST:event_sortActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(SellerDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(SellerDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(SellerDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(SellerDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new SellerDashBoard().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToBill;
    private javax.swing.JTextArea billTxt;
    private javax.swing.JComboBox<String> category;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton logOut;
    private javax.swing.JButton newBill;
    private javax.swing.JButton pdf;
    private javax.swing.JTextField productId;
    private javax.swing.JTextField productName;
    private javax.swing.JTextField productQuantity;
    private javax.swing.JLabel sellerName;
    private javax.swing.JButton sort;
    private javax.swing.JTable tableData1;
    private javax.swing.JTable tableData2;
    // End of variables declaration//GEN-END:variables
}
