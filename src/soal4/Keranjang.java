package soal4;

import java.util.ArrayList;

/**
Merepresentasikan keranjang belanja yang menyimpan banyak produk.
Hubungan Keranjang dengan Produk adalah composition (has-a).
*/
public class Keranjang {
    private ArrayList<Produk> daftarProduk = new ArrayList<Produk>();

    /**
    Menambahkan produk ke keranjang.
    @param produk produk yang akan ditambahkan
    @throws IllegalStateException jika kode produk sudah ada di keranjang
    */
    public void tambah(Produk produk) {
        for (int i = 0; i < daftarProduk.size(); i++) {
            Produk tersimpan = daftarProduk.get(i);
            if (tersimpan.getKode().equals(produk.getKode())) {
                throw new IllegalStateException("Kode produk sudah ada di keranjang: " + produk.getKode());
            }
        }
        daftarProduk.add(produk);
    }

    /**
    Menghitung total harga akhir seluruh produk di keranjang.
    Harga tiap produk ditentukan oleh method hitungHargaAkhir() miliknya (polimorfisme).
    @return total harga dalam rupiah
    */
    public double hitungTotal() {
        double total = 0;
        for (int i = 0; i < daftarProduk.size(); i++) {
            total += daftarProduk.get(i).hitungHargaAkhir();
        }
        return total;
    }

    /**
    Mencetak struk berisi satu baris per produk, lalu total belanja.
    Method ini tidak memakai instanceof karena polimorfisme sudah menentukan perilaku tiap produk.
    */
    public void cetakStruk() {
        for (int i = 0; i < daftarProduk.size(); i++) {
            Produk produk = daftarProduk.get(i);
            System.out.printf("%s | %s | %s | Rp%.0f%n", produk.getKode(), produk.getNama(),
                    produk.deskripsi(), produk.hitungHargaAkhir());
        }
        System.out.printf("TOTAL: Rp%.0f%n", hitungTotal());
    }

    /**
    Menghitung dan mencetak jumlah produk fisik, digital, dan langganan.
    Langganan dicek lebih dulu karena Langganan juga merupakan ProdukDigital, sehingga tidak ikut terhitung sebagai produk digital biasa.
    */
    public void hitungPerJenis() {
        int jumlahFisik = 0;
        int jumlahDigital = 0;
        int jumlahLangganan = 0;
        for (int i = 0; i < daftarProduk.size(); i++) {
            Produk produk = daftarProduk.get(i);
            if (produk instanceof Langganan) {
                jumlahLangganan++;
            } else if (produk instanceof ProdukDigital) {
                jumlahDigital++;
            } else if (produk instanceof ProdukFisik) {
                jumlahFisik++;
            }
        }
        System.out.println("Fisik: " + jumlahFisik + ", Digital: " + jumlahDigital
                + ", Langganan: " + jumlahLangganan);
    }
}