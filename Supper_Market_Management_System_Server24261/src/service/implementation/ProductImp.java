/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.implementation;

import dao.ProductDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import models.Product;
import service.ProductService;

/**
 *
 * @author Aganze Felicite
 */
public class ProductImp extends UnicastRemoteObject  implements ProductService {
    public ProductImp() throws RemoteException{
        
    }
    ProductDao daoObj = new ProductDao();
    @Override
    public String registerProduct(Product prodObj) throws RemoteException {
        //To change body of generated methods, choose Tools | Templates.
        try{
            daoObj.registerProduct(prodObj);
            return "Product Created Successfully";
        }
        catch(Exception e){
             e.printStackTrace();
        }
        return "Not saved in the Data Base";
    }

    @Override
    public String updateProduct(Product prodObj) throws RemoteException {
        //To change body of generated methods, choose Tools | Templates.
        try{
        daoObj.updateProduct(prodObj);
        return "Updated in the DB";
        }catch(Exception e){
        e.printStackTrace();
        }
        return "Data not saved";
    }

    @Override
    public String deleteProduct(Product prodObj) throws RemoteException {
        //To change body of generated methods, choose Tools | Templates.
        try{
            daoObj.deleteProduct(prodObj);
            return "Product cleared from Database";
        
        }
        catch(Exception e){
        e.printStackTrace();
        }
        return "Data no saved";
    }

    @Override
    public List<Product> retrieveAllProduct() throws RemoteException {
        //To change body of generated methods, choose Tools | Templates.
       
         try{
            List<Product> prodList = daoObj.retrieveAllProduct();
            return prodList;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
      
    }
    
}
