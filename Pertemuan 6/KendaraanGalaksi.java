package pertemuan6;

abstract class KendaraanGalaksi {
    protected String nama;
    protected int energi;             // Dalam persentase (0-100)
    protected int kapasitasPenumpang;

    public KendaraanGalaksi(String nama, int kapasitasPenumpang) {
        this.nama = nama;
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.energi = 100; // Semua kendaraan dimulai dengan energi penuh
    }

    public void tampilkanStatus() {
        System.out.println(nama + " | Energi: " + energi + "% | Kapasitas: " + kapasitasPenumpang + " orang");
    }

    public abstract void aktifkanMesin();
    public abstract void jelajahGalaksi(int jarakKm);
    public abstract void isiEnergi();
}
