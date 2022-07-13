public class Overloading {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil(70);
        Mobil mobil2 = new Mobil("fast");

        System.out.println("Kecepatan Mobil Ke-1 adalah " + mobil1.getSpeed() + " Km/H");
        System.out.println("Kecepatan Mobil Ke-2 adalah " + mobil2.getSpeed() + " Km/H");
    }
}

class Mobil {
    int speed = 0;

    public Mobil(int speed) {
        this.speed = speed;
    }

    public Mobil(String speed) {
        if(speed.equals("fast")) {
            this.speed = 100;
        } else {
            this.speed = 50;
        }
    }

    public int getSpeed() {
        return speed;
    }
}