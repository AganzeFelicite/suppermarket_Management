/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import service.implementation.ProductImp;

/**
 *
 * @author Aganze Felicite
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    private ProductImp productImpl;
    public Server() throws RemoteException{
    this.productImpl = new ProductImp();
    }
    public static void main(String[] args) throws RemoteException {
      try{
        System.setProperty("java.rmi.server.useCodebaseOnly", "false");

        System.setProperty("java.rmi.server.hostname","127.0.0.1");
        //create registry "registry rmi registry port number
        Registry regestry = LocateRegistry.createRegistry(6000);
        regestry.rebind("product",new Server().productImpl);
     
        System.out.println("Server is running 6000");
        
        
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    
}
}
    

