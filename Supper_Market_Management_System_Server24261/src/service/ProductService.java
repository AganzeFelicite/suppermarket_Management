/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import models.Product;

/**
 *
 * @author Aganze Felicite
 */
public interface ProductService extends Remote{
    String registerProduct(Product prodObj) throws RemoteException;
    String updateProduct(Product prodObj) throws RemoteException;
    String deleteProduct(Product prodObj) throws RemoteException;
    List<Product> retrieveAllProduct() throws RemoteException;
}
