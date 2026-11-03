package soal1;

/**
Merepresentasikan laptop gaming sebagai jenis khusus dari laptop.
Kelas ini menambahkan kartu grafis dan garansi tambahan.
*/
public class LaptopGaming extends Laptop {
    private static final int GARANSI_TAMBAHAN = 6;
    private String kartuGrafis;

    /**
    Membuat laptop gaming baru dengan garansi ditambah enam bulan.
    @param merek           merek laptop, tidak boleh kosong
    @param harga           harga laptop dalam rupiah, tidak boleh negatif
    @param garansiBulan    garansi dasar dalam bulan, sebelum ditambah garansi tambahan
    @param ramGb           kapasitas RAM dalam gigabyte
    @param ukuranLayarInci ukuran layar dalam inci
    @param kartuGrafis     tipe kartu grafis
    @throws IllegalArgumentException jika merek kosong atau harga negatif
    */
    public LaptopGaming(String merek, double harga, int garansiBulan, int ramGb, double ukuranLayarInci, String kartuGrafis) {
        super(merek, harga, garansiBulan + GARANSI_TAMBAHAN, ramGb, ukuranLayarInci);
        this.kartuGrafis = kartuGrafis;
    }

    /**
    Menghasilkan ringkasan laptop gaming: data laptop ditambah kartu grafis.
    @return teks ringkasan laptop gaming
    */
    @Override
    public String infoSingkat() {
        return super.infoSingkat() + " | GPU " + kartuGrafis;
    }
}