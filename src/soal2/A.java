package soal2;

/**
Kelas dasar untuk Soal 2 Bagian B yang memanggil method init() dari constructor-nya.
*/
class A {

    /**
    Membuat objek A, mencetak pesan, lalu memanggil init().
    */
    A() {
        System.out.println("A dibuat");
        init();
    }

    /**
    Mencetak pesan inisialisasi milik A.
    */
    void init() {
        System.out.println("init A");
    }
}