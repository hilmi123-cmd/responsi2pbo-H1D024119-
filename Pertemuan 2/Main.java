package pertemuan2;

class Main {
    public static void main(String[] args) {
        System.out.println("=== INVENTARIS TOKO NADAKITA ===");
        BarangMusik gitarAkustik = new BarangMusik("GTR-001", "Gitar Akustik Yamaha");
        gitarAkustik.ubahHarga(1500000.0);
        gitarAkustik.tambahStok(5);
        gitarAkustik.tampilkanInformasi();
        BarangMusik drumSet = new BarangMusik("DRM-001", "Drum Set Pearl", 8500000.0, 3);
        drumSet.tampilkanInformasi();
    }
}