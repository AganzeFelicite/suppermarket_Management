/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
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
    
    public List<Product> retrieveAllProduct(){
        try{
            // create session
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Product> ProductList = ss.createQuery("select prodObj from Product prodObj").list();
            
            return ProductList;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public void deleteProduct(Product prodObj){
        try{
            // create session
            Session ss = HibernateUtil.getSessionFactory().openSession();
            // create transaction
            Transaction tr = ss.beginTransaction();
            // perform operation
            ss.delete(prodObj);
            // commit
            tr.commit();
            // close session
            ss.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public void updateProduct(Product prodObj){
       try{
            // create session
            Session ss = HibernateUtil.getSessionFactory().openSession();
            // create transaction
            Transaction tr = ss.beginTransaction();
            // perform operation
            ss.update(prodObj);
            // commit
            tr.commit();
            // close session
            ss.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
