/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author ytcraft
 */
public class Mavenproject2 {
    double panjang;
    double lebar;
    
    void input(){
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan ukuran panjang = ");
        panjang = keyboard.nextDouble();
        
        System.out.print("Masukkan ukuran lebar   = ");
        lebar   = keyboard.nextDouble();
    }
    
    void luas(){
        double L = panjang * lebar;
        System.out.println("Hasil Luas Persegi Panjang adalah     " + panjang + " x " + lebar + "       = " + L);
    }
    
    void keliling(){
        double K = 2 * panjang + 2 * lebar;
        System.out.println("Hasil Keliling Persegi Panjang adalah 2 x (" + panjang + " + " + lebar + ") = " + K);
    }
}
