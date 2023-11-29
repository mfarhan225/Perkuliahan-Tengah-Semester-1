/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perkuliahan7;

/**
 *
 * @author MUHAMMAD FARHAN
 */
public class Bank {
    int saldo;
    int cek;
    
    public Bank (int saldo) {
        this.saldo = saldo;
        this.cek = cek;
    }
    public void getSaldo(int saldo) {
        System.out.println("Selamat Datang di Bank ABC ");
        System.out.println("saldo saat ini " + saldo);
    }
    public void simpanUang(int saldo, int cek) {
        System.out.println("Simpan Uang " + cek);
        System.out.println("Jumlah uang saat ini " + (saldo + cek));
    }
    public void ambilUang(int saldo, int cek) {
        System.out.println("Ambil Uang " + cek);
        System.out.println("Jumlah uang saat ini " + (saldo-cek));
    }
}
