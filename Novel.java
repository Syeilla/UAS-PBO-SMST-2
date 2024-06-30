/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gsyei
 */
public class Novel extends Buku {
    private String judulBuku;
    private String pengarang;
    private String penerbit;
    private int tahunCetak;
    private String kategori;
    
    // Konstruktor
    public Novel (String judulBuku, String pengarang, String penerbit, int tahunCetak, String kategori){
        super(judulBuku,pengarang, penerbit, tahunCetak,kategori);
        this.judulBuku = judulBuku;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahunCetak = tahunCetak;
        this.kategori = kategori;
    }

    public String getJudulBuku(){
        return judulBuku;
    }
    public void setJudulBuku(String judulBuku){
        this.judulBuku = judulBuku;
    }
    public String getPengarang(){
        return pengarang;
    }
    public void setPengarang(String pengarang){
        this.pengarang = pengarang;
    }
    public String getPenerbit(){
        return penerbit;
    }
    public void setPenerbit(String penerbit){
        this.penerbit = penerbit;
    }
    public int getTahunCetak(){
        return tahunCetak;
    }
    public void setTahunCetak(int tahunCetak){
        this.tahunCetak = tahunCetak;
    }
    public String getKategori(){
        return kategori;
    }
    public void setKategori(String kategori){
        this.kategori = kategori;
    }
}
