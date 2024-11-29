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
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import requests.AnggotaRequest;

/**
 *
 * @author ACER
 */
public class Anggota extends Model{   
    public Anggota(){
        this.records = 0;
    }
    public void loadData(){
        try {
            int rows = this.dtm.getRowCount();
            String tahun = new SimpleDateFormat("yyyy").format((Date)Calendar.getInstance().getTime());
            String path = new File(".").getCanonicalPath()+"\\src\\uploads\\anggota\\";
            if(rows <= 0){
                ResultSet result = this.server().createStatement().executeQuery("select * from anggota order by urutan desc");
                while(result.next()){
                    JLabel img = new JLabel();
                    img.setIcon(new ImageIcon(new ImageIcon(path+result.getString("id_anggota")+".jpg").getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
                    this.dtm.insertRow(0, new Object[]{
                        Integer.parseUnsignedInt(result.getString("id_anggota")),
                        result.getString("nama"),
                        result.getString("nis"),
                        result.getString("tanggal_lahir"),
                        result.getString("jenis_kelamin"),
                        result.getString("alamat"),
                        result.getString("kode_pos"),
                        result.getString("no_telepon"),
                        img
                    });
                    this.records++;
                }   
            }
            if(rows > 0){
                ResultSet result = this.server().createStatement().executeQuery("select * from anggota order by urutan desc limit 1");
                while(result.next()){
                    JLabel img = new JLabel();
                    img.setIcon(new ImageIcon(new ImageIcon(path+result.getString("id_anggota")+".jpg").getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
                    this.dtm.insertRow(0, new Object[]{
                        Integer.parseUnsignedInt(result.getString("id_anggota")),
                        result.getString("nama"),
                        result.getString("nis"),
                        result.getString("tanggal_lahir"),
                        result.getString("jenis_kelamin"),
                        result.getString("alamat"),
                        result.getString("kode_pos"),
                        result.getString("no_telepon"),
                        img
                    });
                    this.records++;
                }   
            }
        } catch (IOException|SQLException ex) {
            Logger.getLogger(Buku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean insert(AnggotaRequest anggotaRequest){
        try {
            ResultSet result = this.server().createStatement().executeQuery(
                    String.format("select * from anggota where nis='%s'",
                            anggotaRequest.getNIS()));
            if(result.next()){
                return false;
            }
            PreparedStatement statement = this.server().prepareStatement(
                              "insert into "
                            + "anggota(id_anggota,nama,nis,tanggal_lahir,jenis_kelamin,alamat,kode_pos,no_telepon,created_at) "
                            + "values(?,?,?,?,?,?,?,?,CURRENT_TIMESTAMP)"
            );
            String id = anggotaRequest.getNIS()+(new SimpleDateFormat("yyyy").format(
                    (Date)Calendar.getInstance().getTime()));
            statement.setString(1, id);
            statement.setString(2, anggotaRequest.getNama());
            statement.setString(3, anggotaRequest.getNIS());
            statement.setString(4, anggotaRequest.getTL());
            statement.setString(5, anggotaRequest.getJenisKel());
            statement.setString(6, anggotaRequest.getAlamat());
            statement.setString(7, anggotaRequest.getKodePos());
            statement.setString(8, anggotaRequest.getNoTelp());
            statement.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Buku.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean update(Integer id, AnggotaRequest anggotaRequest){
        try {

            PreparedStatement statement = this.server().prepareStatement(
                              "update "
                            + "anggota set nama=?, nis=?, tanggal_lahir=?, jenis_kelamin=?, alamat=?, kode_pos=?, no_telepon=? "
                            + "where id_anggota=?"
            );
            statement.setString(1, anggotaRequest.getNama());
            statement.setString(2, anggotaRequest.getNIS());
            statement.setString(3, anggotaRequest.getTL());
            statement.setString(4, anggotaRequest.getJenisKel());
            statement.setString(5, anggotaRequest.getAlamat());
            statement.setString(6, anggotaRequest.getKodePos());
            statement.setString(7, anggotaRequest.getNoTelp());
            statement.setString(8, id.toString());
            statement.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Buku.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean delete(Object id){
        try {
            PreparedStatement statement = this.server().prepareStatement(
                              "delete "
                            + "from anggota "
                            + "where id_anggota=?"
            );
            statement.setString(1, id.toString());
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
                    String.format("select * from anggota %s order by urutan asc", arg)
            );
            int length = 0;
            while(result.next()){
                length++;
            }
            Object[][] data = new Object[length][6];
            result.beforeFirst();
            int i = 0;
            while(result.next()){
                data[i][0] = result.getString("nama");
                data[i][1] = result.getString("nis");
                data[i][2] = result.getString("jenis_kelamin");
                data[i][3] = result.getString("alamat");
                data[i][4] = result.getString("kode_pos");
                data[i][5] = result.getString("no_telepon");
                i++;
            }
            return data;
        } catch (SQLException ex) {
            Logger.getLogger(Buku.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new Object[][]{};
    }
    public String[][] find(String[] id, String kep, String nip){
        ResultSet result;
        int length = id.length;
        String[][] data = new String[length][10];
        try {
            for (int i = 0; i < length; i++) {
                result = this.server().createStatement().executeQuery(
                        String.format("select nama, nis, alamat, no_telepon, created_at from anggota where id_anggota = '%s'", id[i])
                );
                while(result.next()){
                    String year = result.getString("created_at").split("-")[0];
                    String month = result.getString("created_at").split("-")[1];
                    String day = (result.getString("created_at").split("-")[2]).split(" ")[0];
                    
                    String created = Integer.parseInt(year)+"-"+month+"-"+day;
                    String expired = (Integer.parseInt(year)+3)+"-"+month+"-"+day;
                    
                    data[i][0] = id[i];
                    data[i][1] = result.getString("nama");
                    data[i][2] = result.getString("nis");
                    data[i][3] = result.getString("alamat");
                    data[i][4] = result.getString("no_telepon");
                    data[i][5] = nip;
                    data[i][6] = created;
                    data[i][7] = expired;
                    data[i][8] = kep;
                    data[i][9] = String.format("%s%s", result.getString("nis"), (Integer.parseInt(year)+3));
                }
            }
            return data;
        } catch (SQLException ex) {
            Logger.getLogger(Anggota.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new String[][]{};
    }
    private Object SimpleDateFormat(String yyyy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
