package pertemuan4;

class Main {
    public static void main(String[] args) {
        System.out.println("=== DATA CUSTOMER BELANJAKU ===");

        Customer cstBudi = new Customer("Budi Santoso", "CST-001", 500000);
        cstBudi.tampilkanInformasi();

        System.out.println(); // Pemisah

        Member mbrSiti = new Member("Siti Aminah", "MBR-110", 1250000, 240, "Gold");
        mbrSiti.tampilkanInformasi();
    }
}
