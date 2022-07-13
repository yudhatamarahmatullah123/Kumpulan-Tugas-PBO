class Kendaraan {
    String merek;
    String warna;
    int tahun;

    Kendaraan(String paramMerek, String paramWarna, int paramTahun){
        merek = paramMerek;
        warna = paramWarna;
        tahun = paramTahun;
    }

    void dataApp(){
        System.out.println("Kendaraan merek : " + merek + " Warna " + warna + " Keluaran " + tahun);
    }

    void dataNew(String merek, String warna, int tahun){
        System.out.println("Kendaraan merek : " + merek + " Warna " + warna + " Keluaran " + tahun);
    }

}