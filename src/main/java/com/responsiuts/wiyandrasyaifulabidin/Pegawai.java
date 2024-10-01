package com.responsiuts.wiyandrasyaifulabidin;

public class Pegawai {
    private String namaPegawai;
    private int gaji;
    
    public Pegawai(String namaPegawai, int gaji) {
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;
    }
    public String getNamaPegawai() {
        return namaPegawai;
    }
    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }
    public int getGaji() {
        return gaji;
    }
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    public void tampilkanInfo() {
        System.out.println("Nama Pegawai : " + namaPegawai 
                + "\nGaji : " + gaji);
    }
}
