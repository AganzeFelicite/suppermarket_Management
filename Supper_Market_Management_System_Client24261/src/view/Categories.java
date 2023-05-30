/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;


import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import models.Product;
import service.ProductService;

/**
 *
 * @author Aganze Felicite
 */
public class Categories extends javax.swing.JFrame {
    DefaultTableModel table1 = new DefaultTableModel();
        
    /**
     * Creates new form AdminDashBoard
     */
    public Categories() {
        initComponents();
        addTableColumnNames();
        addTableRows();
        addCategories();
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
        createSeller = new javax.swing.JButton();
        AdminDashBoard = new javax.swing.JButton();
        logOut = new javax.swing.JButton();
        Categories = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        categoryId = new javax.swing.JTextField();
        categoryName = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        add = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        createSeller.setBackground(new java.awt.Color(255, 255, 255));
        createSeller.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        createSeller.setForeground(new java.awt.Color(0, 204, 255));
        createSeller.setText("Create A seller");
        createSeller.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        createSeller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createSellerActionPerformed(evt);
            }
        });

        AdminDashBoard.setBackground(new java.awt.Color(255, 255, 255));
        AdminDashBoard.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        AdminDashBoard.setForeground(new java.awt.Color(51, 204, 255));
        AdminDashBoard.setText("Admin DashBoard");
        AdminDashBoard.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        AdminDashBoard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminDashBoardActionPerformed(evt);
            }
        });

        logOut.setBackground(new java.awt.Color(255, 255, 255));
        logOut.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        logOut.setForeground(new java.awt.Color(0, 204, 204));
        logOut.setText("Log Out");
        logOut.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });

        Categories.setBackground(new java.awt.Color(255, 255, 255));
        Categories.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Categories.setForeground(new java.awt.Color(0, 204, 255));
        Categories.setText("Categories");
        Categories.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Categories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(createSeller, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Categories, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AdminDashBoard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(AdminDashBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(Categories, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(createSeller, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setText("Manage Catgories");

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 255));
        jLabel2.setText("Category ID");

        categoryId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryIdActionPerformed(evt);
            }
        });

        categoryName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryNameActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(255, 255, 255));
        update.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        update.setForeground(new java.awt.Color(51, 204, 255));
        update.setText("Update");
        update.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        add.setBackground(new java.awt.Color(255, 255, 255));
        add.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        add.setForeground(new java.awt.Color(51, 204, 255));
        add.setText("Add");
        add.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(255, 255, 255));
        delete.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        delete.setForeground(new java.awt.Color(0, 204, 255));
        delete.setText("Delete");
        delete.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        tableData.setFont(new java.awt.Font("MS PGothic", 0, 18)); // NOI18N
        tableData.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableData);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel7.setText("List of Products in the supermarket");

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 255));
        jLabel3.setText("Category Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(categoryId, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(categoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(201, 201, 201)))
                                .addGap(135, 135, 135))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 981, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(251, 251, 251)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 75, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(categoryId, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(categoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 115, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void addCategories(){
        
        
    
    }
    private void addTableColumnNames(){
        table1.addColumn("Product ID");
        table1.addColumn("Product Name");
        table1.addColumn("Product Price");
        table1.addColumn("Product Quantity");
        table1.addColumn("Product Category");
        tableData.setModel(table1);
      
    }
    private void addTableRows(){
       
          
        try{
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 6000);
            ProductService service = (ProductService)registry.lookup("product");
            List<Product> ProductList = service.retrieveAllProduct();
          
        
        for(Product a : ProductList){
            table1.addRow(new Object[]{
                a.getProductId(),
                a.getProductName(),
                a.getPrice(),
                a.getQuantity(),
                a.getCategory()
            });
        }
        }catch(Exception e){
            e.printStackTrace();
        }
     
    
    }
    private void categoryIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryIdActionPerformed

    private void categoryNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryNameActionPerformed

    private void CategoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriesActionPerformed
            Categories Form = new Categories();
            this.dispose();
            Form.setVisible(true);
    }//GEN-LAST:event_CategoriesActionPerformed

    private void createSellerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createSellerActionPerformed
 
    }//GEN-LAST:event_createSellerActionPerformed

    private void AdminDashBoardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminDashBoardActionPerformed
        // TODO add your handling code here:
        Categories form = new Categories();
        this.dispose();
        form.setVisible(true);
    }//GEN-LAST:event_AdminDashBoardActionPerformed

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        // TODO add your handling code here:
        Login form = new Login();
        this.dispose();
        form.setVisible(true);
    }//GEN-LAST:event_logOutActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        
        if(categoryId.getText().trim().length() < 1 || categoryName.getText().trim().length() < 1 || price.getText().trim().length() < 1){
            JOptionPane.showMessageDialog(this, "please all filled are required");
        
        }
        
        Product obj = new Product();
        obj.setProductName(categoryId.getText()); 
        obj.setPrice(Float.parseFloat(price.getText()));
        obj.setQuantity(Float.parseFloat(categoryName.getText()));
        obj.setCategory((String)category.getSelectedItem());
        try {
            
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 6000);
            ProductService service = (ProductService)registry.lookup("product");
            String feedback = service.registerProduct(obj);
            JOptionPane.showMessageDialog(this, feedback);
           
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        
    }//GEN-LAST:event_addActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        Product obj = new Product();
        obj.setProductId(Integer.parseInt(productId.getText()));
         try {
            
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 6000);
            ProductService service = (ProductService)registry.lookup("product");
            String feedback = service.deleteProduct(obj);
            JOptionPane.showMessageDialog(this, feedback);
            table1.setRowCount(0);
            addTableRows();
           
        }catch(Exception e){
            e.printStackTrace();
        }
     
        
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        Product obj = new Product();
        obj.setProductId(Integer.parseInt(productId.getText()));
        obj.setProductName(categoryId.getText()); 
        obj.setPrice(Float.parseFloat(price.getText()));
        obj.setQuantity(Float.parseFloat(categoryName.getText()));
        obj.setCategory((String)category.getSelectedItem());
        try {
            
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 6000);
            ProductService service = (ProductService)registry.lookup("product");
            String feedback = service.updateProduct(obj);
            JOptionPane.showMessageDialog(this, feedback);
            table1.setRowCount(0);
            addTableRows();
           
        }catch(Exception e){
            e.printStackTrace();
        }
     
        
    }//GEN-LAST:event_updateActionPerformed

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
            java.util.logging.Logger.getLogger(Categories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Categories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Categories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Categories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Categories().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminDashBoard;
    private javax.swing.JButton Categories;
    private javax.swing.JButton add;
    private javax.swing.JTextField categoryId;
    private javax.swing.JTextField categoryName;
    private javax.swing.JButton createSeller;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logOut;
    private javax.swing.JTable tableData;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
