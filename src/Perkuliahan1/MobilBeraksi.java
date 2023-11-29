/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perkuliahan1;

/**
 *
 * @author MUHAMMAD FARHAN
 */
public class MobilBeraksi {
    public static void main(String[] args) {
        Mobil mobilku = new Mobil();
        
        // Memanggil atribut dan memberi nilai
        mobilku.warna = "Hijau";
        mobilku.tahunProduksi = 2023;
        mobilku.harga = "500 juta";
        
        // output
        System.out.println("Warna: " + mobilku.warna);
        System.out.println("Tahun Produksi " + mobilku.tahunProduksi);
        System.out.println("Harganya " + mobilku.harga);
        
        // menambahkan objek 
        Mobil mobilAdik = new Mobil();
        mobilAdik.warna = "Merah";
        mobilAdik.tahunProduksi = 2021;
        mobilAdik.harga = "250 juta";
        
        System.out.println("Warna: " + mobilAdik.warna);
        System.out.println("Tahun Produksi " + mobilAdik.tahunProduksi);
        System.out.println("Harganya " + mobilAdik.harga);
               
    }
    
}
