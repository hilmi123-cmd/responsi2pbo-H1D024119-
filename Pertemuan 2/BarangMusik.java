package pertemuan2;

class BarangMusik {
    private String kode;
    private String nama;
    private double hargaSatuan;
    private int jumlahStok;

    public BarangMusik(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
        this.hargaSatuan = 0.0;
        this.jumlahStok = 0;
    }

    public BarangMusik(String kode, String nama, double hargaSatuan) {
        this(kode, nama);
        this.hargaSatuan = hargaSatuan;
    }

    public BarangMusik(String kode, String nama, double hargaSatuan, int jumlahStok) {
        this(kode, nama, hargaSatuan);
        this.jumlahStok = jumlahStok;
    }

    public void ubahHarga(double hargaBaru) {
        if (hargaBaru >= 0) {
            this.hargaSatuan = hargaBaru;
        } else {
            System.out.println("Harga tidak valid. Harga harus positif.");
        }
    }

    public void tambahStok(int jumlahTambahan) {
        if (jumlahTambahan > 0) {
            this.jumlahStok += jumlahTambahan;
        } else {
            System.out.println("Jumlah tambahan stok harus lebih dari nol.");
        }
    }

    public void tampilkanInformasi() {
        System.out.println(
                "Alat musik " + this.nama +
                        " | Kode: " + this.kode +
                        " | Harga: Rp " + this.hargaSatuan +
                        " | Stok: " + this.jumlahStok + " unit"
        );
    }
}
