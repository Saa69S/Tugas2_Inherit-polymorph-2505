package soal4;

/**
Merepresentasikan satu produk yang dijual di toko digital.
Kelas ini menyimpan data dasar produk dan menjadi superclass untuk semua jenis produk.
*/
public class Produk {
    private static final String DESKRIPSI_UMUM = "produk umum";

    private String kode;
    private String nama;
    private double hargaDasar;

    /**
    Membuat produk baru.
    @param kode       kode unik produk
    @param nama       nama produk, tidak boleh kosong
    @param hargaDasar harga dasar produk dalam rupiah, tidak boleh negatif
    @throws IllegalArgumentException jika nama kosong atau harga dasar negatif
    */
    public Produk(String kode, String nama, double hargaDasar) {
        if (nama == null || nama.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama produk tidak boleh kosong");
        }
        if (hargaDasar < 0) {
            throw new IllegalArgumentException("Harga dasar tidak boleh negatif");
        }
        this.kode = kode;
        this.nama = nama.trim();
        this.hargaDasar = hargaDasar;
    }

    /**
    Mengambil kode produk.
    @return kode produk
    */
    public String getKode() {
        return kode;
    }

    /**
    Mengambil nama produk.
    @return nama produk
    */
    public String getNama() {
        return nama;
    }

    /**
    Mengambil harga dasar produk.
    @return harga dasar dalam rupiah
    */
    public double getHargaDasar() {
        return hargaDasar;
    }

    /**
    Menghitung harga akhir produk. Pada produk umum, harga akhir sama dengan harga dasar.
    @return harga akhir dalam rupiah
    */
    public double hitungHargaAkhir() {
        return hargaDasar;
    }

    /**
    Menghasilkan keterangan jenis produk.
    @return keterangan jenis produk
    */
    public String deskripsi() {
        return DESKRIPSI_UMUM;
    }
}