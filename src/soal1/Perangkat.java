package soal1;

/**
Merepresentasikan satu perangkat elektronik yang dijual di toko.
Kelas ini menyimpan data dasar perangkat dan memastikan setiap nilai yang disimpan lolos validasi.
*/
public class Perangkat {
    private static final double TARIF_PAJAK = 0.10;
    private String merek;
    protected double harga;
    private int garansiBulan;

    /**
    Membuat perangkat baru dengan data dasar.
    @param merek        merek perangkat, tidak boleh kosong
    @param harga        harga perangkat dalam rupiah, tidak boleh negatif
    @param garansiBulan lama garansi dalam bulan
    @throws IllegalArgumentException jika merek kosong atau harga negatif
    */
    public Perangkat(String merek, double harga, int garansiBulan) {
        if (merek == null || merek.trim().isEmpty()) {
            throw new IllegalArgumentException("Merek tidak boleh kosong");
        }
        if (harga < 0) {
            throw new IllegalArgumentException("Harga tidak boleh negatif");
        }
        this.merek = merek.trim();
        this.harga = harga;
        this.garansiBulan = garansiBulan;
    }

    /**
    Mengambil merek perangkat.
    @return merek perangkat
    */
    public String getMerek() {
        return merek;
    }

    /**
    Mengambil lama garansi perangkat.
    @return lama garansi dalam bulan
    */
    public int getGaransiBulan() {
        return garansiBulan;
    }

    /**
    Menghitung pajak perangkat berdasarkan tarif pajak yang berlaku.
    @return besar pajak dalam rupiah
    */
    public double hitungPajak() {
        return harga * TARIF_PAJAK;
    }

    /**
    Menghasilkan ringkasan singkat berisi merek dan garansi perangkat.
    @return teks ringkasan perangkat
    */
    public String infoSingkat() {
        return merek + " | garansi " + garansiBulan + " bulan";
    }
}