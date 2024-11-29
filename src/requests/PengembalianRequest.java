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
public class PengembalianRequest {
    private final String tanggal_kembali;
    
    public PengembalianRequest(String tanggal_kembali){
        this.tanggal_kembali = tanggal_kembali;
    }
    public boolean validate(){
        return !(this.tanggal_kembali.isEmpty());
    }
    
    public String getTanggalKembali(){
        return this.tanggal_kembali;
    }
}
