package soal3;

/**
Merepresentasikan satu titik pada bidang dua dimensi dengan koordinat x dan y.
*/
public class Titik {

    private static final double KOORDINAT_AWAL = 0.0;
    private double x;
    private double y;

    /**
    Membuat titik di posisi awal (0, 0).
    */
    public Titik() {
        this(KOORDINAT_AWAL, KOORDINAT_AWAL);
    }

    /**
    Membuat titik di posisi tertentu.
    @param x koordinat horizontal
    @param y koordinat vertikal
    */
    public Titik(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
    Mengambil koordinat x.
    @return koordinat x
    */
    public double getX() {
        return x;
    }

    /**
    Mengubah koordinat x.
    @param x koordinat x yang baru
    */
    public void setX(double x) {
        this.x = x;
    }

    /**
    Mengambil koordinat y.
    @return koordinat y
    */
    public double getY() {
        return y;
    }

    /**
    Mengubah koordinat y.
    @param y koordinat y yang baru
    */
    public void setY(double y) {
        this.y = y;
    }

    /**
    Menghitung jarak lurus dari titik ini ke titik lain.
    @param lain titik tujuan
    @return jarak antara kedua titik
    */
    public double jarakKe(Titik lain) {
        double selisihX = lain.x - x;
        double selisihY = lain.y - y;
        return Math.sqrt(selisihX * selisihX + selisihY * selisihY);
    }

    /**
    Menghasilkan teks koordinat dengan format (x, y).
    @return teks koordinat titik
    */
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}