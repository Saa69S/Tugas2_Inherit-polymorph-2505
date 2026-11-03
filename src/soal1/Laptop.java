package soal1;

/**
Merepresentasikan laptop sebagai jenis khusus dari perangkat.
Kelas ini menambahkan data RAM dan ukuran layar serta perhitungan harga promo.
*/
public class Laptop extends Perangkat{
    private static final double PERSEN_PENUH = 100.0;
    private int ramGb;
    private double ukuranLayarInci;

    /**
    Membuat laptop baru.
    @param merek           merek laptop, tidak boleh kosong
    @param harga           harga laptop dalam rupiah, tidak boleh negatif
    @param garansiBulan    lama garansi dalam bulan
    @param ramGb           kapasitas RAM dalam gigabyte
    @param ukuranLayarInci ukuran layar dalam inci
    @throws IllegalArgumentException jika merek kosong atau harga negatif
    */
    public Laptop(String merek, double harga, int garansiBulan, int ramGb, double ukuranLayarInci) {
        super(merek, harga, garansiBulan);
        this.ramGb = ramGb;
        this.ukuranLayarInci = ukuranLayarInci;
    }

    /**
    Menghitung harga laptop setelah dikurangi diskon.
    Harga dibaca langsung dari atribut protected milik superclass.
    @param diskonPersen besar diskon dalam persen, misalnya 10 untuk 10 persen
    @return harga setelah diskon dalam rupiah
    */
    public double hitungHargaPromo(double diskonPersen) {
        return harga - (harga * diskonPersen / PERSEN_PENUH);
    }

    /**
    Menghasilkan ringkasan laptop: data perangkat ditambah RAM dan ukuran layar.
    @return teks ringkasan laptop
    */
    @Override
    public String infoSingkat() {
        return super.infoSingkat() + " | RAM " + ramGb + " GB | layar " + ukuranLayarInci + " inci";
    }
}