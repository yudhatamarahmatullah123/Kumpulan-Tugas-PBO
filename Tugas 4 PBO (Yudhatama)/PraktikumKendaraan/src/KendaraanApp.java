public class KendaraanApp {
    public static void main(String[] args) {
        Kendaraan avanza = new Kendaraan("Astrea", "Merah", 2018);
        Kendaraan honda = new Kendaraan("CBR", "Hijau",2021);

        avanza.dataApp();
        honda.dataApp();

        avanza.dataNew("Honda", "Hitam", 2020);
    }
}