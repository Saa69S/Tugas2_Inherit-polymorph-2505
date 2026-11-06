package soal2;

/**
Kelas pengujian Soal 2: urutan constructor, overriding, upcasting, downcasting aman, dan relasi is-a pada Bagian A, B, dan C.
*/
public class TesSoal2 {

    /**
    Titik masuk program yang menjalankan Bagian A, B, dan C secara berurutan.
    @param args argumen command line, tidak dipakai
    */
    public static void main(String[] args) {
        jalankanBagianA();
        jalankanBagianB();
        jalankanBagianC();
    }

    /**
    Menjalankan Bagian A dengan downcasting yang sudah diamankan memakai instanceof.
    */
    private static void jalankanBagianA() {
        System.out.println("=== Bagian A ===");
        Hewan h = new Kucing("Tom");
        h.makan();
        h.suara();
        // h.panjat();
        Kucing k = (Kucing) h;
        k.panjat();

        Hewan h2 = new Hewan("Generik");
        if (h2 instanceof Kucing) {
            Kucing k2 = (Kucing) h2;
            k2.panjat();
        } else {
            System.out.println("h2 bukan Kucing, downcast dibatalkan");
        }
    }

    /**
    Menjalankan Bagian B untuk melihat urutan inisialisasi saat constructor memanggil method override.
    */
    private static void jalankanBagianB() {
        System.out.println();
        System.out.println("=== Bagian B ===");
        new B();
    }

    /**
    Menjalankan Bagian C untuk melihat perilaku polimorfisme pada Lingkaran dan Titik.
    */
    private static void jalankanBagianC() {
        System.out.println();
        System.out.println("=== Bagian C ===");
        Lingkaran l1 = new Lingkaran(5);
        Titik l2 = new Titik();
        Lingkaran l3 = new Titik();
        System.out.println(l1.luas());
        System.out.println(l2.luas());
        System.out.println(l3.luas());
    }
}