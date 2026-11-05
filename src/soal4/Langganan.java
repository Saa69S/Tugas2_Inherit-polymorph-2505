package soal4;

/**
Merepresentasikan layanan berlangganan, yaitu produk digital yang dihitung per bulan.
Langganan tidak memakai diskon digital, tetapi diskon langganan untuk durasi panjang.
*/
public class Langganan extends ProdukDigital {
    private static final double DISKON_LANGGANAN = 0.20;
    private static final int BATAS_BULAN_DISKON = 12;
    private int durasiBulan;

    /**
    Membuat langganan baru.
    @param kode        kode unik produk
    @param nama        nama langganan, tidak boleh kosong
    @param hargaDasar  harga dasar per bulan dalam rupiah, tidak boleh negatif
    @param ukuranMb    ukuran berkas layanan dalam megabyte
    @param durasiBulan lama langganan dalam bulan
    @throws IllegalArgumentException jika nama kosong atau harga dasar negatif
    */
    public Langganan(String kode, String nama, double hargaDasar, double ukuranMb, int durasiBulan) {
        super(kode, nama, hargaDasar, ukuranMb);
        this.durasiBulan = durasiBulan;
    }

    /**
    Menghitung harga akhir: harga dasar dikali durasi, lalu diskon langganan jika durasi mencapai batas minimal.
    Diskon digital tidak dipakai.
    @return harga akhir dalam rupiah
    */
    @Override
    public double hitungHargaAkhir() {
        double total = getHargaDasar() * durasiBulan;
        if (durasiBulan >= BATAS_BULAN_DISKON) {
            total = total - (total * DISKON_LANGGANAN);
        }
        return total;
    }

    /**
    Menghasilkan keterangan jenis beserta durasi langganan.
    @return keterangan langganan, misalnya "langganan 12 bulan"
    */
    @Override
    public String deskripsi() {
        return "langganan " + durasiBulan + " bulan";
    }
}