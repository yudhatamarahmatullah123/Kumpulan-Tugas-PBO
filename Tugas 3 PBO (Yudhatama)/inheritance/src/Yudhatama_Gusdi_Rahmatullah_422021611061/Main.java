/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Yudhatama_Gusdi_Rahmatullah_422021611061;

/**
 *
 * @author CYBER ISLAM
 */
public class Main {
    public static void main(String[] args) {
        // membuat objek bangun datar
        BangunDatar422021611061 bangunDatar = new BangunDatar422021611061();

        // membuat objek Lingkaran dan mengisi nilai properti
        Lingkaran422021611061 lingkaran = new Lingkaran422021611061();
        lingkaran.r = 22;
        
        // membuat objek Persegi Panjang dan mengisi nilai properti
        PersegiPanjang422021611061 persegiPanjang = new PersegiPanjang422021611061();
        persegiPanjang.panjang = 8;
        persegiPanjang.lebar = 4;
        
        // membuat objek Segitiga dan mengisi nilai properti
        Segitiga422021611061 segitiga = new Segitiga422021611061();
        segitiga.alas = 12;
        segitiga.tinggi = 8;
        
        // membuat objek Segitiga Sama Kaki dan mengisi nilai properti
        SegitigaSamaKaki422021611061 segitigaSamaKaki = new SegitigaSamaKaki422021611061();
        segitigaSamaKaki.sisiA = 12;
        segitigaSamaKaki.sisiB = 16;
        
        // membuat objek Segitiga Sama Sisi dan mengisi nilai properti
        SegitigaSamaSisi422021611061 segitigaSamaSisi = new SegitigaSamaSisi422021611061();
        segitigaSamaSisi.sisi = 12;
        
        // membuat objek Segitiga Siku Siku dan mengisi nilai properti
        SegitigaSikuSiku422021611061 segitigaSikuSiku = new SegitigaSikuSiku422021611061();
        segitigaSikuSiku.sisiA = 12;
        segitigaSikuSiku.sisiB = 16;
        segitigaSikuSiku.sisiC = 18;
        
        // memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();

        lingkaran.luas();
        lingkaran.keliling();
        
        persegiPanjang.luas();
        persegiPanjang.keliling();
        
        segitiga.luas();
        
        segitigaSamaKaki.keliling();
        
        segitigaSamaSisi.keliling();
        
        segitigaSikuSiku.keliling();
    }
}