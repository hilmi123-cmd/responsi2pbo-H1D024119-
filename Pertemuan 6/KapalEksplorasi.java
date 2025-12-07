package pertemuan6;

class KapalEksplorasi extends KendaraanGalaksi {
    private int levelScan;
    private static final double KONSUMSI_ENERGI_PER_KM = 2.0; // 2% per km

    public KapalEksplorasi(String nama, int kapasitasPenumpang, int levelScan) {
        super(nama, kapasitasPenumpang);
        this.levelScan = levelScan;
    }

    @Override
    public void aktifkanMesin() {
        if (energi < 15) {
            System.out.println("Gagal! Energi di bawah 15%. Kapal eksplorasi tidak dapat berangkat.");
        } else {
            System.out.println("Kapal eksplorasi siap berangkat!");
        }
    }

    @Override
    public void jelajahGalaksi(int jarakKm) {
        double energiDibutuhkan = jarakKm * KONSUMSI_ENERGI_PER_KM;

        if (energi - energiDibutuhkan >= 0) {
            energi -= energiDibutuhkan;
            System.out.println("Kapal eksplorasi menjelajah sejauh " + jarakKm + " km.");
        } else {
            System.out.println("Energi tidak mencukupi untuk menjelajah sejauh " + jarakKm + " km.");
        }
    }

    @Override
    public void isiEnergi() {
        this.energi = 100;
        System.out.println(nama + " sedang mengisi energi. Energi penuh: 100%.");
    }

    public void scanPlanet(String namaPlanet) {
        System.out.println("Melakukan scan pada planet " + namaPlanet + " dengan modul level " + levelScan + ".");
    }
}
