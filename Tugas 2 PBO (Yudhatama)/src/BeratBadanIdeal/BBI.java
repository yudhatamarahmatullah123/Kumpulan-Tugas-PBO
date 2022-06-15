/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BeratBadanIdeal;

/**
 *
 * @author CYBER ISLAM
 */
public class BBI {
    String nama, info;
    int umur;
    double tinggiBadan;
    double beratBadan;
    double beratBadanIdeal;

    public double getBeratBadanIdeal() {
        return beratBadanIdeal = this.beratBadan / (this.tinggiBadan * this.tinggiBadan);
    }
    
    public void setNama(String nm) {
        this.nama = nm;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setTinggiBadan(double tinggiBadan) {
        this.tinggiBadan = tinggiBadan / 100;
    }

    public void setBeratBadan(double beratBadan) {
        this.beratBadan = beratBadan;
    }
    
    public String getInfo() {
        return info;
    }
    
    void hasilInfo(){
        if (getBeratBadanIdeal() < 18.5){
            this.info = "Nama anda " + this.nama + " umur anda " + this.umur + " badan ideal anda KURUS";
        } else if (getBeratBadanIdeal() < 24.9){
            this.info = "Nama anda " + this.nama + " umur anda " + this.umur + " badan ideal anda IDEAL";
        } else if (getBeratBadanIdeal() < 29.9){
            this.info = "Nama anda " + this.nama + " umur anda " + this.umur + " badan ideal anda OVERWEIGHT";
        } else if (getBeratBadanIdeal() > 30.0){
            this.info = "Nama anda " + this.nama + " umur anda " + this.umur + " badan ideal anda OBESITAS";
        }
    }
    
//    public BBI(){
//        this.nama        = "";
//        this.umur        = 0;
//        this.tinggiBadan = 0;
//        this.beratBadan  = 0;
//    }
//    
//    public BBI(String Nama, int Umur, double tb, double bb){
//        this.nama           = Nama;
//        this.umur           = Umur;
//        this.tinggiBadan    = tb;
//        this.beratBadan     = bb;
//    }
//
//    BBI(String text) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//    
//    public String getNama(){
//        return this.nama;
//    }
//    
//    public int getUmur(){
//        return this.umur;
//    }
//    
//    public double getTB(){
//        return this.tinggiBadan;
//    }
//    
//    public double getBB(){
//        return this.beratBadan;
//    }
    
}
