package com.responsiuts.wiyandrasyaifulabidin;

public class PegawaiKontrak extends Pegawai {
    private int lamaKontrak;
    
    public PegawaiKontrak(String namaProduk, int harga, int lamaKontrak) {
        super(namaProduk, harga);
        this.lamaKontrak = lamaKontrak;
    }
    public int getLamaKontrak() {
        return lamaKontrak;
    }
    public void setLamaKontrak(int lamaKontrak) {
        this.lamaKontrak = lamaKontrak;
    }
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Kontrak Pegawai : " + lamaKontrak + " Bulan \n");
    }
}
