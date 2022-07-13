public class Overridding {
    public static void main(String[] args) {
        Jeruk jeruk = new Jeruk();
        Apel apel = new Apel();

        jeruk.info();
        apel.info();
    }
}

class Jeruk {
    public void info() {
        System.out.println("This is a vehicle");
    }
}

class Apel extends Jeruk {
    public void info() {
        System.out.println("This is a car");
    }
}