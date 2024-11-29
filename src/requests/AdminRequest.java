/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package requests;

/**
 *
 * @author ACER
 */
public class AdminRequest {

    private final String name;
    private final String username;
    private final String password;

    public AdminRequest(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }
    
    public boolean validate(){
        return !(this.name.equals("Nama...")||this.username.equals("Username...")|| this.password.isEmpty());
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getUsername(){
        return this.username;
    }
    
    public String getPassword(){
        return this.password;
    }
}
