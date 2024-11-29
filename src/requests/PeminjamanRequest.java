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
public class PeminjamanRequest {
    private final String 
            id_anggota, 
            kelas, 
            no_buku, 
            lama_peminjaman, 
            tanggal_pinjam;
    public PeminjamanRequest(
            String id_anggota,
            String kelas,
            String no_buku,
            String lama_peminjaman,
            String tanggal_pinjam
    ){
        this.id_anggota = id_anggota;
        this.kelas = kelas;
        this.no_buku = no_buku;
        this.lama_peminjaman = lama_peminjaman;
        this.tanggal_pinjam = tanggal_pinjam;
    }
    public boolean validate(){
        return !(
                this.kelas.isEmpty()||
                this.lama_peminjaman.isEmpty()||
                this.no_buku.isEmpty()||
                this.tanggal_pinjam.isEmpty()||
                this.id_anggota.isEmpty()
                );
    }
    public String getIDAnggota(){
        return this.id_anggota;
    }
    public String getKelas(){
        return this.kelas;
    }
    public String getNoBuku(){
        return this.no_buku;
    }
    public String getLamaPeminjaman(){
        return this.lama_peminjaman;
    }
    public String getTanggalPinjam(){
        return this.tanggal_pinjam;
    }
}
