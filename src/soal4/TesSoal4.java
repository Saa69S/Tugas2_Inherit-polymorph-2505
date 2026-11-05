package soal4;

/**
Kelas pengujian Soal 4 untuk keranjang toko digital dengan berbagai jenis produk.
*/
public class TesSoal4 {

    /**
    Titik masuk program pengujian Soal 4.
    @param args argumen command line, tidak dipakai
    */
    public static void main(String[] args) {
        Keranjang keranjang = new Keranjang();
        keranjang.tambah(new ProdukFisik("F01", "Keyboard Mekanik", 500000, 1.5));
        keranjang.tambah(new ProdukDigital("D01", "Ebook Java", 100000, 20));
        keranjang.tambah(new Langganan("L01", "Kelas Online", 150000, 20, 12));
        keranjang.cetakStruk();
        keranjang.hitungPerJenis();

        try {
            keranjang.tambah(new ProdukFisik("F01", "Mouse", 100000, 0.2));
        } catch (IllegalStateException e) {
            System.out.println("Gagal: " + e.getMessage());
        }
    }
}