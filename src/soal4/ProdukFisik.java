package soal4;

/**
Merepresentasikan produk fisik yang dikenai ongkos kirim berdasarkan beratnya.
*/
public class ProdukFisik extends Produk {
    private static final double ONGKOS_KIRIM_PER_KG = 10000.0;

    private double beratKg;

    /**
    Membuat produk fisik baru.
    @param kode       kode unik produk
    @param nama       nama produk, tidak boleh kosong
    @param hargaDasar harga dasar dalam rupiah, tidak boleh negatif
    @param beratKg    berat produk dalam kilogram
    @throws IllegalArgumentException jika nama kosong atau harga dasar negatif
    */
    public ProdukFisik(String kode, String nama, double hargaDasar, double beratKg) {
        super(kode, nama, hargaDasar);
        this.beratKg = beratKg;
    }

    /**
    Menghitung harga akhir: harga dasar ditambah ongkos kirim sesuai berat.
    @return harga akhir dalam rupiah
    */
    @Override
    public double hitungHargaAkhir() {
        return getHargaDasar() + (beratKg * ONGKOS_KIRIM_PER_KG);
    }

    /**
    Menghasilkan keterangan jenis beserta berat produk.
    @return keterangan produk fisik, misalnya "fisik 1.5 kg"
    */
    @Override
    public String deskripsi() {
        return "fisik " + beratKg + " kg";
    }
}