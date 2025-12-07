package pertemuan3;

class Manajer extends Karyawan {
    private double tunjangan;

    public Manajer(String nama, double gajiPokok, double tunjangan) {
        // Memanggil constructor dari Superclass (Karyawan) menggunakan keyword super
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }

    @Override
    public void tampilkanInfo() {
        double totalGaji = getGajiPokok() + tunjangan;

        System.out.println("Status: Manajer");
        System.out.println("Nama: " + getNama() +
                " | Gaji Pokok: Rp " + getGajiPokok() +
                " | Tunjangan: Rp " + tunjangan);

        System.out.println("Total Pendapatan: Rp " + totalGaji);
    }
}

