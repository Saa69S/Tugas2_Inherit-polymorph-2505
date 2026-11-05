package soal3;

/**
Merepresentasikan garis lurus yang disusun dari dua objek Titik.
Hubungan Garis dengan Titik adalah composition (has-a).
*/
public class Garis {
    private Titik awal;
    private Titik akhir;

    /**
    Membuat garis dari dua titik yang sudah ada.
    @param awal  titik awal garis
    @param akhir titik akhir garis
    */
    public Garis(Titik awal, Titik akhir) {
        this.awal = awal;
        this.akhir = akhir;
    }

    /**
    Membuat garis dari koordinat dua titik, dengan memakai constructor utama.
    @param x1 koordinat x titik awal
    @param y1 koordinat y titik awal
    @param x2 koordinat x titik akhir
    @param y2 koordinat y titik akhir
    */
    public Garis(double x1, double y1, double x2, double y2) {
        this(new Titik(x1, y1), new Titik(x2, y2));
    }

    /**
    Mengambil titik awal garis.
    @return titik awal
    */
    public Titik getAwal() {
        return awal;
    }

    /**
    Mengubah titik awal garis.
    @param awal titik awal yang baru
    */
    public void setAwal(Titik awal) {
        this.awal = awal;
    }

    /**
    Mengambil titik akhir garis.
    @return titik akhir
    */
    public Titik getAkhir() {
        return akhir;
    }

    /**
    Mengubah titik akhir garis.
    @param akhir titik akhir yang baru
    */
    public void setAkhir(Titik akhir) {
        this.akhir = akhir;
    }

    /**
    Menghitung panjang garis dengan memakai jarakKe() milik Titik.
    @return panjang garis
    */
    public double getPanjang() {
        return awal.jarakKe(akhir);
    }

    /**
    Menghasilkan teks garis dengan format (x1, y1) - (x2, y2).
    @return teks garis
    */
    @Override
    public String toString() {
        return awal + " - " + akhir;
    }
}