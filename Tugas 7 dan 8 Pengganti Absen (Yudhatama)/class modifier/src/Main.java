public class Main {
    public static void main(String[] args) {
        nameRecord   nama     = new nameRecord();
        statusRecord identity = new statusRecord();
        oldRecord    old      = new oldRecord();

        nama.name       = "Yudhatama Gusdi Rahmatullah";
        String status   = identity.getStatus();
        old.old         = 21;

        System.out.println("=========<  Data Mahasiswa  >=========");
        System.out.println("Name    = " + nama.name);
        System.out.println("Status  = " + status);
        System.out.println("Old     = " + old.old);
        System.out.println("======================================");
    }
}

class nameRecord {
    // Mendeklerasikan variable
    public String name;

    // Akses untuk mengambil name
    public String getName () {
        return name;
    }
}

class statusRecord {
    // Mendeklerasikan variable
    private String status;

    // Akses untuk nyeting variable status yang di private
    public String setStatus () {
        this.status = "Student";
        return status;
    }

    //Akses untuk mengambil setStatus
    public String getStatus () {
        return setStatus();
    }
}

class oldRecord {
    //akses pada variabel
    protected int old;

    //akses dasar terhadap metode
    protected int getOld() {
        return old;
    }
}
