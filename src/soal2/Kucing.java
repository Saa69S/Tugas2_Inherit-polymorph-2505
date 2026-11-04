package soal2;

/**
Merepresentasikan kucing sebagai jenis khusus dari hewan.
Kelas ini mengganti suara hewan dan menambah kemampuan memanjat.
*/
class Kucing extends Hewan {
    
    /**
    Membuat kucing baru dan mencetak pesan pembuatan.
    @param nama nama kucing
    */
    Kucing(String nama) {
        super(nama);
        System.out.println("Kucing dibuat");
    }

    /**
    Mengganti suara hewan menjadi suara kucing.
    */
    @Override
    void suara() {
        System.out.println("meong");
    }

    /**
    Mencetak kegiatan memanjat, yang hanya dimiliki kucing.
    */
    void panjat() {
        System.out.println(nama + " memanjat");
    }
}