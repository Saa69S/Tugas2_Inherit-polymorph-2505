package soal2;

/**
Merepresentasikan hewan secara umum yang punya nama, suara, dan kebiasaan makan.
Kelas ini menjadi superclass untuk jenis hewan yang lebih spesifik.
*/
class Hewan {
    protected String nama;

    /**
    Membuat hewan baru dan mencetak pesan pembuatan.
    @param nama nama hewan
    */
    Hewan(String nama) {
        this.nama = nama;
        System.out.println("Hewan dibuat: " + nama);
    }

    /**
    Mencetak suara hewan secara umum.
    */
    void suara() {
        System.out.println("...");
    }

    /**
    Mencetak kegiatan makan, lalu memanggil suara hewan.
    */
    void makan() {
        System.out.println(nama + " makan");
        suara();
    }
}