/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import models.Product;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Aganze Felicite
 */
public class ProductDao {
    public ProductDao() {
    }
    
    public void registerProduct(Product prodObj) {
        try{
            // create session
            Session ss = HibernateUtil.getSessionFactory().openSession();
            // create transaction
            Transaction tr = ss.beginTransaction();
            // perform operation
            ss.save(prodObj);
            // commit
            tr.commit();
            // close session
            ss.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
}
