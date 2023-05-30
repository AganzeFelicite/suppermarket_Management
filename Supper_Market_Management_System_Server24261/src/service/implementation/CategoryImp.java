/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.implementation;

import dao.CategoryDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import models.Category;
import service.CategoryService;

/**
 *
 * @author Aganze Felicite
 */
public class CategoryImp   extends UnicastRemoteObject implements CategoryService{  
    public CategoryImp() throws RemoteException{
        
    }
    CategoryDao daoObj = new CategoryDao();
    @Override
    public String registerCategory(Category catObj) throws RemoteException {
        //To change body of generated methods, choose Tools | Templates.
        try{
            daoObj.registerCategory(catObj);
            return "Category Added into the DB";
        }catch(Exception e){
        e.printStackTrace();
        }
      return "Not saved into the DB";  
    }

    @Override
    public String updateCategory(Category catObj) throws RemoteException {
      //To change body of generated methods, choose Tools | Templates.
      try {
          daoObj.updateCategory(catObj);
          return "Successfully updated";
      }catch(Exception e){
      e.printStackTrace();
      }
      return "Data not updated";
    }
    

    @Override
    public String deleteCategory(Category catObj) throws RemoteException {
      //To change body of generated methods, choose Tools | Templates.
      try{
          daoObj.deleteCategory(catObj);
          return "Category Deleted";
      }catch(Exception e ){
          e.printStackTrace();
      }
      return "Category not deleted";
    }

    @Override
    public List<Category> retrieveAllCategory() throws RemoteException {
         //To change body of generated methods, choose Tools | Templates.
         try{
             List<Category> categoryList = daoObj.retrieveAllCategory();
             return categoryList;
         }
         catch(Exception e){
             e.printStackTrace();
         }
         return null;
    }
}
