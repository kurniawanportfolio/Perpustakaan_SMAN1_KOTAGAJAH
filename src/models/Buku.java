/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import requests.BukuRequest;

/**
 *
 * @author ACER
 */
public class Buku extends Model{
    
    public Buku(){
        this.records = 0;
    }
    public void loadData(){
        try {
            int rows = this.dtm.getRowCount();
            String path = new File(".").getCanonicalPath()+"\\src\\uploads\\buku\\";
            if(rows <= 0){
                ResultSet result = this.server().createStatement().executeQuery("select * from buku order by urutan desc");
                while(result.next()){
                    JLabel img = new JLabel();
                    img.setIcon(new ImageIcon(new ImageIcon(path+result.getString("no_buku")+".jpg").getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
                    this.dtm.insertRow(0, new Object[]{
                        result.getString("no_buku"),
                        result.getString("judul_buku"),
                        result.getString("no_isbn"),
                        result.getString("pengarang"),
                        result.getString("penerbit"),
                        img
                    });
                    this.records++;
                }   
            }
            if(rows > 0){
                ResultSet result = this.server().createStatement().executeQuery("select * from buku order by urutan desc limit 1");
                while(result.next()){
                    JLabel img = new JLabel();
                    img.setIcon(new ImageIcon(new ImageIcon(path+result.getString("no_buku")+".jpg").getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
                    this.dtm.insertRow(0, new Object[]{
                        result.getString("no_buku"),
                        result.getString("judul_buku"),
                        result.getString("no_isbn"),
                        result.getString("pengarang"),
                        result.getString("penerbit"),
                        img
                    });
                    this.records++;
                }   
            }
        } catch (IOException|SQLException ex) {
            Logger.getLogger(Buku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean insert(BukuRequest bukuRequest){
        try {
            PreparedStatement statement = this.server().prepareStatement(
                              "insert into "
                            + "buku(no_buku,judul_buku,no_isbn,pengarang,penerbit,created_at) "
                            + "values(?,?,?,?,?,CURRENT_TIMESTAMP)"
            );
            statement.setString(1, bukuRequest.getNoBuku());
            statement.setString(2, bukuRequest.getJudulBuku());
            statement.setString(3, bukuRequest.getNoISBN());
            statement.setString(4, bukuRequest.getPengarang());
            statement.setString(5, bukuRequest.getPenerbit());
            statement.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Buku.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean update(BukuRequest bukuRequest){
        try {
            PreparedStatement statement = this.server().prepareStatement(
                              "update "
                            + "buku set judul_buku=?,no_isbn=?,pengarang=?,penerbit=? "
                            + "where no_buku=?"
            );
            statement.setString(5, bukuRequest.getNoBuku());
            statement.setString(1, bukuRequest.getJudulBuku());
            statement.setString(2, bukuRequest.getNoISBN());
            statement.setString(3, bukuRequest.getPengarang());
            statement.setString(4, bukuRequest.getPenerbit());
            statement.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Buku.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean delete(String no_buku){
        try {
            PreparedStatement statement = this.server().prepareStatement(
                              "delete "
                            + "from buku "
                            + "where no_buku=?"
            );
            statement.setString(1, no_buku);
            statement.execute();
            this.records--;
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Buku.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public Object[][] find(String arg){
        ResultSet result;
        try {
            result = this.server().createStatement().executeQuery(
                    String.format("select * from buku %s order by urutan asc", arg)
            );
            int length = 0;
            while(result.next()){
                length++;
            }
            Object[][] data = new Object[length][6];
            result.beforeFirst();
            int i = 0;
            while(result.next()){
                data[i][0] = result.getString("no_buku");
                data[i][1] = result.getString("judul_buku");
                data[i][2] = result.getString("no_isbn");
                data[i][3] = result.getString("pengarang");
                data[i][4] = result.getString("penerbit");
                i++;
            }
            return data;
        } catch (SQLException ex) {
            Logger.getLogger(Buku.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new Object[][]{};
    }
    
}
