package pertemuan3;

class Main {
    public static void main(String[] args) {
        System.out.println("=== DATA KARYAWAN TECHMAJU ===");
        Karyawan stafBudi = new Karyawan("Budi Santoso", 4000000.0);
        stafBudi.tampilkanInfo();

        System.out.println(); // Baris kosong sebagai pemisah
        Manajer manajerSiti = new Manajer("Siti Aminah", 6000000.0, 2500000.0);
        manajerSiti.tampilkanInfo();
    }
}
