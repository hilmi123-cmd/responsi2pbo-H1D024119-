package pertemuan6;

class PesawatTempur extends KendaraanGalaksi {
    private int jumlahRudal;
    private static final double KONSUMSI_ENERGI_PER_KM = 3.0; // 3% per km

    public PesawatTempur(String nama, int kapasitasPenumpang, int jumlahRudalAwal) {
        super(nama, kapasitasPenumpang);
        this.jumlahRudal = jumlahRudalAwal;
    }

    @Override
    public void aktifkanMesin() {
        if (energi < 20) {
            System.out.println("Gagal! Energi di bawah 20%. Tidak bisa menyalakan mesin " + nama + ".");
        } else {
            System.out.println("Mesin pesawat tempur diaktifkan.");
        }
    }

    @Override
    public void jelajahGalaksi(int jarakKm) {
        double energiDibutuhkan = jarakKm * KONSUMSI_ENERGI_PER_KM;

        if (energi - energiDibutuhkan >= 0) {
            energi -= energiDibutuhkan;
            System.out.println("Pesawat tempur menjelajah sejauh " + jarakKm + " km.");
        } else {
            System.out.println("Energi tidak mencukupi untuk menjelajah sejauh " + jarakKm + " km.");
        }
    }

    @Override
    public void isiEnergi() {
        this.energi = 100;
        System.out.println(nama + " sedang mengisi energi. Energi penuh: 100%.");
    }

    public void tembakRudal(int jumlah) {
        if (jumlah > 0 && jumlah <= jumlahRudal) {
            jumlahRudal -= jumlah;
            System.out.println("Menembakkan " + jumlah + " rudal!");
        } else if (jumlahRudal == 0) {
            System.out.println("Gagal menembak. Jumlah rudal habis!");
        } else {
            System.out.println("Gagal menembak. Jumlah rudal tidak mencukupi atau tidak valid.");
        }
    }
}
