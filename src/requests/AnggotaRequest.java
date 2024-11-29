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
public class AnggotaRequest {
    private final String nama, nis, tanggal_lahir, jenis_kelamin, alamat, kode_pos, no_telp;
    public AnggotaRequest(
            String nama, 
            String nis, 
            String tanggal_lahir, 
            String jenis_kelamin,
            String alamat,
            String kode_pos,
            String no_telp)
    {
        this.nama = nama;
        this.nis = nis;
        this.tanggal_lahir = tanggal_lahir;
        this.jenis_kelamin = jenis_kelamin;
        this.alamat = alamat;
        this.kode_pos = kode_pos;
        this.no_telp = no_telp;
    }

    public boolean validate(){
        return !(
                    this.nama.isEmpty()||
                    this.nis.isEmpty()||
                    this.tanggal_lahir.isEmpty()||
                    this.jenis_kelamin.isEmpty()||
                    this.alamat.isEmpty()||
                    this.kode_pos.isEmpty()||
                    this.no_telp.isEmpty()
                );
    }
    
    public String getNama(){
        return this.nama;
    }
    public String getNIS(){
        return this.nis;
    }
    public String getTL(){
        return this.tanggal_lahir;
    }
    public String getJenisKel(){
        return this.jenis_kelamin;
    }
    public String getAlamat(){
        return this.alamat;
    }
    public String getKodePos(){
        return this.kode_pos;
    }
    public String getNoTelp(){
        return this.no_telp;
    }
}
