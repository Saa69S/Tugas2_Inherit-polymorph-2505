package soal2;

/**
Kelas pengujian Soal 2 Bagian A: urutan constructor, overriding, upcasting, dan downcasting.
*/
public class TesSoal2 {

    /**
    Titik masuk program pengujian Soal 2 Bagian A.
    @param args argumen command line, tidak dipakai
    */
    public static void main(String[] args) {
        Hewan h = new Kucing("Tom");
        h.makan();
        h.suara();
        // h.panjat();
        Kucing k = (Kucing) h;
        k.panjat();

        Hewan h2 = new Hewan("Generik");
        Kucing k2 = (Kucing) h2;
        k2.panjat();
    }
}