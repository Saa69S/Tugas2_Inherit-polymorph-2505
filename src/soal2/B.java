package soal2;

/**
Subclass dari A yang punya atribut nilai dan meng-override init().
*/
class B extends A {
    private static final int NILAI_AWAL = 5;
    int nilai = NILAI_AWAL;

    /**
    Membuat objek B setelah constructor A selesai dijalankan.
    */
    B() {
        super();
        System.out.println("B dibuat, nilai=" + nilai);
    }

    /**
    Mencetak pesan inisialisasi milik B beserta nilai atributnya.
    */
    @Override
    void init() {
        System.out.println("init B, nilai=" + nilai);
    }
}