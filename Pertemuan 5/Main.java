package pertemuan5;

class Main {
    public static void main(String[] args) {
        defaultMesin[] inventaris = new defaultMesin[5];

        inventaris[0] = new mesinMotor("Honda Supra X", 125, "Bebek");
        inventaris[1] = new mesinTraktor("Kubota MX5200", 520, 5.0);
        inventaris[2] = new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70.0);
        inventaris[3] = new mesinMotor("Yamaha R25", 250, "Sport");
        inventaris[4] = new mesinTraktorListrik("Volta FarmX", 200, 3.5, 80.0);

        System.out.println("=== DATA MESIN MEGATECH ===");

        for (defaultMesin mesin : inventaris) {
            mesin.tampilInfo();
            System.out.println("Kategori: " + mesin.kategoriMesin());
            System.out.println("Performa: " + mesin.nilaiPerforma() + "\n");
        }

        System.out.println("=== TOP 3 MESIN TERBAIK (Manual Sort) ===");

        int n = inventaris.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (inventaris[j].nilaiPerforma() < inventaris[j + 1].nilaiPerforma()) {
                    defaultMesin temp = inventaris[j];
                    inventaris[j] = inventaris[j + 1];
                    inventaris[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < Math.min(3, inventaris.length); i++) {
            System.out.println((i + 1) + ". " + inventaris[i].getNamaMesin() + " → " + inventaris[i].nilaiPerforma());
        }
    }
}
