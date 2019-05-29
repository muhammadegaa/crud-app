/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hubsdb;

/**
 *
 * @author OWNER
 */
public class category {
    
    private int jumlah;
    private String kodeBarang;
    private String namaBarang;
    private String satuan;
    private String kodeJenis;
    private String namaJenis;
    private String keterangan;
    
    public category(int Jumlah,String KodeBarang, String NamaBarang, String Satuan, String KodeJenis, String NamaJenis, String Keterangan)
    {
        this.jumlah = Jumlah;
        this.kodeBarang = KodeBarang;
        this.namaBarang = NamaBarang;
        this.satuan = Satuan;
        this.kodeJenis = KodeJenis;
        this.namaJenis = NamaJenis;
        this.keterangan = Keterangan;
    }
    
    public int getJumlah()
    {
        return jumlah;
    }
    
    public String getKodeBarang()
    {
        return kodeBarang;
    }
    
    public String getNamaBarang()
    {
        return namaBarang;
    }
    
    public String getSatuan()
    {
        return satuan;
    }
    
    public String getKodeJenis()
    {
        return kodeJenis;
    }
    
    public String getNamaJenis()
    {
        return namaJenis;
    }
    
    public String getKeterangan()
    {
        return keterangan;
    }

}