package pertemuan3;

class Karyawan {
    private String nama;
    private double gajiPokok;

    public Karyawan(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    public String getNama() {
        return nama;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void tampilkanInfo() {
        System.out.println("Status: Karyawan Biasa");
        System.out.println("Nama: " + nama + " | Gaji Pokok: Rp " + gajiPokok);
    }
}