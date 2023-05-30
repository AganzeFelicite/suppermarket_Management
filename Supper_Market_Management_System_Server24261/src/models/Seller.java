/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Aganze Felicite
 */
@Entity
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uid;
    private String firstName;
    private String lastName;
    private String Gender;
    private String passWord;

    public Seller() {
    }

    public Seller(int uid, String firstName, String lastName, String Gender, String passWord) {
        this.uid = uid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.Gender = Gender;
        this.passWord = passWord;
    }

    public int getUid() {
        return uid;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return Gender;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    
}
