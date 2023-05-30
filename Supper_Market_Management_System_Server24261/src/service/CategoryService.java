/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.sun.org.apache.xml.internal.resolver.Catalog;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Aganze Felicite
 */
public interface CategoryService {
    String registerCategory(CategoryService catObj) throws RemoteException;
    String updateCategory(CategoryService catObj) throws RemoteException;
    String deleteCategory(CategoryService catObj) throws RemoteException;
    List<CategoryService> retrieveAllCategory() throws RemoteException;
}
