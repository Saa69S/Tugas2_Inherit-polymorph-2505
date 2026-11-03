package soal1;

/**
Merepresentasikan ponsel sebagai jenis khusus dari perangkat.
Kelas ini menambahkan data kapasitas penyimpanan dan jumlah kamera.
*/
public class Ponsel extends Perangkat {
    private int kapasitasGb;
    private int jumlahKamera;

    /**
    Membuat ponsel baru.
    @param merek        merek ponsel, tidak boleh kosong
    @param harga        harga ponsel dalam rupiah, tidak boleh negatif
    @param garansiBulan lama garansi dalam bulan
    @param kapasitasGb  kapasitas penyimpanan dalam gigabyte
    @param jumlahKamera jumlah kamera pada ponsel
    @throws IllegalArgumentException jika merek kosong atau harga negatif
    */
    public Ponsel(String merek, double harga, int garansiBulan, int kapasitasGb, int jumlahKamera) {
        super(merek, harga, garansiBulan);
        this.kapasitasGb = kapasitasGb;
        this.jumlahKamera = jumlahKamera;
    }

    /**
    Menghasilkan ringkasan ponsel: data perangkat ditambah kapasitas dan jumlah kamera.
    @return teks ringkasan ponsel
    */
    @Override
    public String infoSingkat() {
        return super.infoSingkat() + " | " + kapasitasGb + " GB | " + jumlahKamera + " kamera";
    }
}