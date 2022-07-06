/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Yudhatama_Gusdi_Rahmatullah_422021611061;

/**
 *
 * @author CYBER ISLAM
 */
public class Lingkaran422021611061 extends BangunDatar422021611061{
    
    // Jari-jari lingkaran
    float r;
    
    @Override
    float luas(){
        float luas = (float) (Math.PI * r * r);
        System.out.println("\nHasil Rumus Lingkaran");
        System.out.println("Luas Lingkaran              : " + luas);
        return luas;
    }
    
    @Override
    float keliling(){
        float keliling = (float) (2 * Math.PI * r);
        System.out.println("Keliling Lingkaran          : " + keliling);
        return keliling;
    }
    
}
