/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icomcaremaster.model;

/**
 *
 * @author bankcom
 */
public class RegisterModel {
    
    private String Username;
    private String Password;
    private String name;
    private String addr;

    public RegisterModel() {
    }

    public RegisterModel(String Username, String Password, String name, String addr) {
        this.Username = Username;
        this.Password = Password;
        this.name = name;
        this.addr = addr;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "RegisterModel{" + "Username=" + Username + ", Password=" + Password + ", name=" + name + ", addr=" + addr + '}';
    }
    
    
    
    
}
