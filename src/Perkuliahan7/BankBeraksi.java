/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perkuliahan7;

/**
 *
 * @author MUHAMMAD FARHAN
 */
public class BankBeraksi {
    public static void main(String[] args) {
        Bank uangku = new Bank(100000);
        
        uangku.getSaldo(100000);
        uangku.simpanUang(100000, 500000);
        uangku.ambilUang(600000, 150000 );
        
    }
}
