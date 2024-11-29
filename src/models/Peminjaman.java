/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import requests.PeminjamanRequest;
import requests.PengembalianRequest;

/**
 *
 * @author ACER
 */
public class Peminjaman extends Model{
    private String status;
    
    public Peminjaman(){
        this.records = 0;
    }
    public void loadData(){
        try {
            int rows = this.dtm.getRowCount();
            if(rows <= 0){
                ResultSet result = this.server().createStatement().executeQuery(
                                  "select * "
                                + "from peminjaman "
                                + "inner join anggota "
                                + "on peminjaman.id_anggota = anggota.id_anggota "
                                + "inner join buku "
                                + "on peminjaman.no_buku = buku.no_buku "
                                + "left join pengembalian "
                                + "on peminjaman.id_peminjaman = pengembalian.id_peminjaman "
                                + "order by peminjaman.id_peminjaman desc");
                while(result.next()){
                    this.dtm.addRow(new Object[]{
                        Integer.parseUnsignedInt(result.getString("peminjaman.id_peminjaman")),
                        result.getString("anggota.nama"),
                        result.getString("anggota.nis"),
                        result.getString("peminjaman.kelas"),
                        result.getString("buku.no_buku"),
                        result.getString("buku.judul_buku"),
                        result.getString("buku.penerbit"),
                        result.getString("peminjaman.lama"),
                        result.getString("peminjaman.tanggal_pinjam"),
                        result.getString("pengembalian.tanggal_kembali")==null?"masih dipinjam":result.getString("tanggal_kembali")
                    });
                    this.records++;
                }   
            }
            if(rows > 0){
                ResultSet result = this.server().createStatement().executeQuery(
                                "select * "
                                + "from peminjaman "
                                + "inner join anggota "
                                + "on peminjaman.id_anggota = anggota.id_anggota "
                                + "inner join buku "
                                + "on peminjaman.no_buku = buku.no_buku "
                                + "left join pengembalian "
                                + "on peminjaman.id_peminjaman = pengembalian.id_peminjaman "
                                + "order by peminjaman.id_peminjaman desc "
                                + "limit 1");
                while(result.next()){
                    this.dtm.insertRow(0, new Object[]{
                        Integer.parseUnsignedInt(result.getString("peminjaman.id_peminjaman")),
                        result.getString("anggota.nama"),
                        result.getString("anggota.nis"),
                        result.getString("peminjaman.kelas"),
                        result.getString("buku.no_buku"),
                        result.getString("buku.judul_buku"),
                        result.getString("buku.penerbit"),
                        result.getString("peminjaman.lama"),
                        result.getString("peminjaman.tanggal_pinjam"),
                        result.getString("pengembalian.tanggal_kembali")==null?"masih dipinjam":result.getString("tanggal_kembali")
                    });
                    this.records++;
                }   
            }
        } catch (SQLException ex) {
            Logger.getLogger(Buku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public boolean insert(PeminjamanRequest peminjamanRequest){
        try {
            PreparedStatement statement = this.server().prepareStatement(
                                        "insert into "
                                        + "peminjaman( "
                                        + "id_anggota, "
                                        + "no_buku, "
                                        + "kelas, "
                                        + "lama,"
                                        + "tanggal_pinjam) "
                                        + "values(?,?,?,?,?)"
            );
            statement.setString(1, peminjamanRequest.getIDAnggota());
            statement.setString(2, peminjamanRequest.getNoBuku());
            statement.setString(3, peminjamanRequest.getKelas());
            statement.setString(4, peminjamanRequest.getLamaPeminjaman());
            statement.setString(5, peminjamanRequest.getTanggalPinjam());
            statement.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Buku.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean insert(Integer id, PengembalianRequest pengembalianRequest){
        try {

            PreparedStatement statement = this.server().prepareStatement(
                                        "insert into "
                                        + "pengembalian ( "
                                        + "id_peminjaman, "
                                        + "tanggal_kembali ) "
                                        + "values(?, ?)"
            );
            statement.setString(1, id.toString());
            statement.setString(2, pengembalianRequest.getTanggalKembali());
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
                                      + "from peminjaman "
                                      + "where id_peminjaman = ?"
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
                    String.format("select * from anggota "
                                + "left join peminjaman "
                                + "on anggota.id_anggota = peminjaman.id_anggota "
                                + "left join buku "
                                + "on peminjaman.no_buku = buku.no_buku "
                                + "left join pengembalian "
                                + "on peminjaman.id_peminjaman = pengembalian.id_peminjaman "
                                + "%s order by anggota.nis asc", arg)
            );
            int length = 0;
            while(result.next()){
                length++;
            }
            if(length == 0){
                
            }
            Object[][] data = new Object[length][7];
            result.beforeFirst();
            int i = 0;
            while(result.next()){
                data[i][0] = result.getString("anggota.nama");
                data[i][1] = result.getString("anggota.nis");
                data[i][2] = result.getString("peminjaman.kelas")==null?"":result.getString("peminjaman.kelas");
                data[i][3] = result.getString("buku.no_buku")==null?"":result.getString("buku.no_buku");
                data[i][4] = result.getString("buku.judul_buku")==null?"":result.getString("buku.judul_buku");
                data[i][5] = result.getString("buku.penerbit")==null?"":result.getString("buku.penerbit");
                data[i][6] = result.getString("pengembalian.tanggal_kembali")==null?"":result.getString("pengembalian.tanggal_kembali").split(" ")[0];
                System.out.println(data[i][0]);
                i++;
            }
            return data;
        } catch (SQLException ex) {
            Logger.getLogger(Buku.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new Object[][]{};
    }
    public boolean passCheckDurasiPeminjaman(String tanggal_pinjam, String lama_pinjam){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        boolean statusPass = true;
        try {
            Date d1 = sdf.parse(tanggal_pinjam);
            Date d2 = Calendar.getInstance().getTime();
            long millis = d2.getTime() - d1.getTime();
            
            long secs = millis/1000;
            millis%=1000;
            long mins = secs/60;
            secs%=60;
            long hours = mins/60;
            mins%=60;
            long days = hours/24;
            hours%=24;
            
            long lama_angka = Integer.parseInt(lama_pinjam.split(" ")[0]);
            
            if((days - lama_angka) > 0){
                setStatus(String.format("Siswa terlambat mengembalikan buku %s hari dan %s jam.", (days - lama_angka), hours));
                statusPass = false;
            }
            
        } catch (ParseException ex) {
            System.out.println(ex.toString());
        }
        return statusPass;
    }
    private void setStatus(String status){
        this.status = status;
    }
    public String getStatus(){
        return this.status;
    }
}
