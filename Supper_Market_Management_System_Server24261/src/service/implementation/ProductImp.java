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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String deleteProduct(Product prodObj) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Product> retrieveAllCustomer() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
