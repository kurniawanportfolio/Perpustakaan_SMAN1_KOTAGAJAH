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
public class BukuRequest {
    private final String no_buku, judul_buku, no_isbn, pengarang, penerbit;
    public BukuRequest(
            String no_buku, 
            String judul_buku, 
            String no_isbn, 
            String pengarang,
            String penerbit)
    {
        this.no_buku = no_buku;
        this.judul_buku = judul_buku;
        this.no_isbn = no_isbn;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
    }

    public boolean validate(){
        return !(
                    this.no_buku.isEmpty()||
                    this.judul_buku.isEmpty()||
                    this.no_isbn.isEmpty()||
                    this.pengarang.isEmpty()||
                    this.penerbit.isEmpty()
                );
    }
    
    public String getNoBuku(){
        return this.no_buku;
    }
    public String getJudulBuku(){
        return this.judul_buku;
    }
    public String getNoISBN(){
        return this.no_isbn;
    }
    public String getPengarang(){
        return this.pengarang;
    }
    public String getPenerbit(){
        return this.penerbit;
    }
}
