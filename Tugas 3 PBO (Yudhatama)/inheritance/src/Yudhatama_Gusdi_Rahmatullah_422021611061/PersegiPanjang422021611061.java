/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Yudhatama_Gusdi_Rahmatullah_422021611061;

/**
 *
 * @author CYBER ISLAM
 */
public class PersegiPanjang422021611061 extends BangunDatar422021611061{
    
    float panjang;
    float lebar;
    
    @Override
    float luas(){
        float luas = panjang * lebar;
        System.out.println("\nHasil Rumus Persegi Panjang");
        System.out.println("Luas Persegi Panjang        : " + luas);
        return luas;
    }
    
    @Override
    float keliling(){
        float keliling = 2 * panjang + 2 * lebar;
        System.out.println("Keliling Persegi Panjang    : " + keliling);
        return keliling;
    }
    
}
