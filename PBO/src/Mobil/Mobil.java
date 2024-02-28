/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mobil;

/**
 *
 * @author JARKOM 11
 */
public class Mobil {
    String merk;
    int harga, kecepatan;
    
    /**
     * Konstrutor
     * Method yang namanya = nama class
     * Tidak boleh menggunakan void 
     * Tidak boleh ada return value
     * diguanakan hanya 1x
     * digunakan untuk inisialisasi
     */
    Mobil(String merk, int harga, int kecepatan){
        this.merk = merk;
        this.harga = harga;
        this.kecepatan = kecepatan;
                
    }
    void setMerk(String brand) {
        this.harga = harga;
        this.kecepatan = kecepatan;
    
} 
    
    void setHargaKecepatan(int harga, int kecepatan) {
        this.harga = harga;
        this.kecepatan = kecepatan;
    
} 
    String getMerk(){
        return merk;
        
    }
    int getHarga() {
        return harga;
        
    }
    int getKecepatan() {
        return kecepatan;
        
    }
    
    void infoMobil() {
        System.out.println("Merk Mobil : " + getMerk());
        System.out.println("Harga : " + getHarga());
        System.out.println("Kecepatan : " + getKecepatan());
        System.out.println("______________________");
    }
}
