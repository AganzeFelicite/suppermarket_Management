/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import models.Category;
import org.hibernate.*;

/**
 *
 * @author Aganze Felicite
 */
public class CategoryDao {
     public CategoryDao() {
    }
    
    public void registerCategory(Category catObj) {
        try{
            // create session
            Session ss = HibernateUtil.getSessionFactory().openSession();
            // create transaction
            Transaction tr = ss.beginTransaction();
            // perform operation
            ss.save(catObj);
            // commit
            tr.commit();
            // close session
            ss.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public List<Category> retrieveAllCategory(){
        try{
            // create session
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Category> categoryList = ss.createQuery("select catObj from Category catObj").list();
            
            return categoryList;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public void deleteCategory(Category catObj){
        try{
            // create session
            Session ss = HibernateUtil.getSessionFactory().openSession();
            // create transaction
            Transaction tr = ss.beginTransaction();
            // perform operation
            ss.delete(catObj);
            // commit
            tr.commit();
            // close session
            ss.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public void updateCategory(Category Obj){
       try{
            // create session
            Session ss = HibernateUtil.getSessionFactory().openSession();
            // create transaction
            Transaction tr = ss.beginTransaction();
            // perform operation
            ss.update(Obj);
            // commit
            tr.commit();
            // close session
            ss.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
