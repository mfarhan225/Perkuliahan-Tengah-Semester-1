/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perkuliahan6;

/**
 *
 * @author MUHAMMAD FARHAN
 */
public class Vehicle {
     String warna;
    int tahunProduksi;
    
    //konstruktor
    
    public Vehicle (String warna, int tahunProduksi) {
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
    }
    public void info() {
        System.out.println("warna " + warna);
        System.out.println("Tahun Produksi " + tahunProduksi);
    }
}
