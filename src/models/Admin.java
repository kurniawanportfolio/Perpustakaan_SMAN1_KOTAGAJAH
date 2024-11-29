/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import requests.AdminRequest;

/**
 *
 * @author ACER
 */
public class Admin extends Model{
    private String id, nama, username, password, created_at, updated_at;
    private boolean auth;
    public Admin(){
        this.auth = false;
    }
    public boolean attempt(String username){
        try {
            ResultSet result = this.server().createStatement().executeQuery(
                    String.format("select * from admin where username='%s'", username));
            if(result.next()){
                if(!username.equals(result.getString("username"))){
                    return false;
                }
                this.id = result.getString("id");
                this.nama = result.getString("nama");
                this.username = result.getString("username");
                this.password = result.getString("password");
                this.created_at = result.getString("created_at");
                this.updated_at = result.getString("updated_at");
                this.auth = true;
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public void update(){
        
    }
    public boolean insert(AdminRequest adminRequest){
        try {
            ResultSet result = this.server().createStatement().executeQuery(
                    String.format("select * from admin where username='?'",
                            adminRequest.getUsername()));
            if(result.next()){
                return false;
            }
            PreparedStatement statement = this.server().prepareStatement(
                    "insert into "
                    + "admin(nama,username,password, created_at) "
                    + "values(?,?,?, CURRENT_TIMESTAMP)"
            );
            statement.setString(1, adminRequest.getName());
            statement.setString(2, adminRequest.getUsername());
            statement.setString(3, adminRequest.getPassword());
            statement.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean isAuth(){
        return this.auth;
    }
    public String getId(){
        return this.id;
    }
    public String getNama(){
        return this.nama;
    }
    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
    public String getCreatedAt(){
        return this.created_at;
    }
    public String getUpdatedAt(){
        return this.updated_at;
    }
}
