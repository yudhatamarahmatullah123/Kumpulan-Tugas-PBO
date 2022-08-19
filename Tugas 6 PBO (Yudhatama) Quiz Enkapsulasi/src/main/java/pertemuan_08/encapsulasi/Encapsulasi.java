/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package pertemuan_08.encapsulasi;

/**
 *
 * @author anonymous
 */

class trapesium {
    
    public int barisAtas, barisBawah, tinggi;
    
    public trapesium() {
        this.barisAtas  = 14;
        this.barisBawah = 30;
        this.tinggi     = 7 ;
    }
    
    public int luasTrapesium() {
        return ((barisAtas + barisBawah) * tinggi) / 2;
    }
    
}

class lingkaran {
    
    private int diameter;
    
    lingkaran() {
        this.diameter = 14;
    }
    
    public int getJari2() {
        return this.diameter/2;
    }
    
    public double getLuas() {
        return 3.14 * getJari2() * getJari2();
    }
}

class setengahLingkaran {
    
    lingkaran LuasLingkaran = new lingkaran();
    
    public double luasLingkaran = LuasLingkaran.getLuas();       
    public int LuasSetengahLingkaran = (int) Math.round(luasLingkaran) / 2;
    
    public int luasSetengahLingkaran() {
        return LuasSetengahLingkaran;
    }
    
}

class luasYangDiarsir {
        
    trapesium luasTrapesium = new trapesium();
    setengahLingkaran luasSetengahLingkaran = new setengahLingkaran();
    
    public int luasYangDiarsir;
            
    public luasYangDiarsir() {
        this.luasYangDiarsir = (int) (luasTrapesium.luasTrapesium() - luasSetengahLingkaran.luasSetengahLingkaran());
    }
    
}

public class Encapsulasi {
    public static void main(String[] args) {
               
        trapesium luasTrapesium                 = new trapesium();
        setengahLingkaran luasSetengahLingkaran = new setengahLingkaran();
        luasYangDiarsir luasYangDiarsir         = new luasYangDiarsir();
        
        System.out.println(">>>>>>>>>>>>>>>>>  HASIL  <<<<<<<<<<<<<<<<<");
        System.out.println("Hasil dari luas trapesium          = " + luasTrapesium.luasTrapesium());
        System.out.println("Hasil dari luas setengah lingkaran = " + luasSetengahLingkaran.luasSetengahLingkaran());
        System.out.println("========================================= -");
        System.out.println("Hasil dari luas yang di arsir      = " + luasYangDiarsir.luasYangDiarsir);
    }
}
