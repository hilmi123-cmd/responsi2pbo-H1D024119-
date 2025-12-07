package pertemuan6;

class Main {
    public static void main(String[] args) {
        System.out.println("=== UJI SISTEM KENDALI ARMADA GALAKSI ===");

        System.out.println("\n--- PESAWAT TEMPUR ---");
        PesawatTempur astraFury = new PesawatTempur("Astra-Fury", 2, 8); // Kapasitas 2, Rudal 8
        astraFury.aktifkanMesin();
        astraFury.jelajahGalaksi(10);
        astraFury.jelajahGalaksi(30);
        astraFury.tembakRudal(3);
        astraFury.tampilkanStatus();

        System.out.println("\n--- KAPAL EKSPLORASI ---");
        KapalEksplorasi voyagerX = new KapalEksplorasi("Voyager X", 10, 4); // Kapasitas 10, Scan Level 4
        voyagerX.aktifkanMesin();
        voyagerX.jelajahGalaksi(15);
        voyagerX.scanPlanet("Kepler-442b");
        voyagerX.tampilkanStatus();
    }
}
