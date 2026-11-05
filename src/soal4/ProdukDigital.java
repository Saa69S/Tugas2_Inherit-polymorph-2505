package soal4;

/**
Merepresentasikan produk digital yang mendapat diskon digital.
*/
public class ProdukDigital extends Produk {
    private static final double DISKON_DIGITAL = 0.10;
    private double ukuranMb;

    /**
    Membuat produk digital baru.
    @param kode       kode unik produk
    @param nama       nama produk, tidak boleh kosong
    @param hargaDasar harga dasar dalam rupiah, tidak boleh negatif
    @param ukuranMb   ukuran berkas produk dalam megabyte
    @throws IllegalArgumentException jika nama kosong atau harga dasar negatif
    */
    public ProdukDigital(String kode, String nama, double hargaDasar, double ukuranMb) {
        super(kode, nama, hargaDasar);
        this.ukuranMb = ukuranMb;
    }

    /**
    Menghitung harga akhir: harga dasar dikurangi diskon digital.
    @return harga akhir dalam rupiah
    */
    @Override
    public double hitungHargaAkhir() {
        return getHargaDasar() - (getHargaDasar() * DISKON_DIGITAL);
    }

    /**
    Menghasilkan keterangan jenis beserta ukuran produk.
    @return keterangan produk digital, misalnya "digital 20.0 MB"
    */
    @Override
    public String deskripsi() {
        return "digital " + ukuranMb + " MB";
    }
}