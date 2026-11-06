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
    Kedua titik disalin (defensive copy) supaya perubahan pada objek di luar garis tidak memengaruhi isi garis.
    @param awal  titik awal garis
    @param akhir titik akhir garis
    */
    public Garis(Titik awal, Titik akhir) {
        this.awal = salin(awal);
        this.akhir = salin(akhir);
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
    Mengambil salinan titik awal garis.
    @return salinan titik awal
    */
    public Titik getAwal() {
        return salin(awal);
    }

    /**
    Mengubah titik awal garis dengan menyimpan salinannya.
    @param awal titik awal yang baru
    */
    public void setAwal(Titik awal) {
        this.awal = salin(awal);
    }

    /**
    Mengambil salinan titik akhir garis.
    @return salinan titik akhir
    */
    public Titik getAkhir() {
        return salin(akhir);
    }

    /**
    Mengubah titik akhir garis dengan menyimpan salinannya.
    @param akhir titik akhir yang baru
    */
    public void setAkhir(Titik akhir) {
        this.akhir = salin(akhir);
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

    /**
    Membuat salinan baru dari sebuah titik.
    @param titik titik yang akan disalin
    @return objek Titik baru dengan koordinat yang sama
    */
    private Titik salin(Titik titik) {
        return new Titik(titik.getX(), titik.getY());
    }
}