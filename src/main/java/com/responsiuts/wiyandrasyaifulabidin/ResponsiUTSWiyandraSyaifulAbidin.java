/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.responsiuts.wiyandrasyaifulabidin;

/**
 *
 * @author Wiyandra
 */
public class ResponsiUTSWiyandraSyaifulAbidin {

    public static void main(String[] args) {
        Produk produk1 = new Elektronik("Kulkas Polytron", 5000000, 5);
        Produk produk2 = new Makanan("Chitatos", 15000, "2024-12-29");
        
        Pegawai pegawai1 = new PegawaiTetap("Wiyandra Syaiful Abidin", 3500000, 500000);
        Pegawai pegawai2 = new PegawaiKontrak("Wiyandra Syaiful", 1500000, 30);
        
        produk1.tampilkanInfo();
        produk2.tampilkanInfo();
        pegawai1.tampilkanInfo();
        pegawai2.tampilkanInfo();
        
        
    }
}
