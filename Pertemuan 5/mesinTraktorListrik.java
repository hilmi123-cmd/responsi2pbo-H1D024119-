package pertemuan5;

class mesinTraktorListrik extends mesinTraktor {
    private double kapasitasBaterai;

    public mesinTraktorListrik(String namaMesin, int tenagaHP, double kapasitasTarik, double kapasitasBaterai) {
        // Panggil konstruktor parent mesinTraktor
        super(namaMesin, tenagaHP, kapasitasTarik);
        this.kapasitasBaterai = kapasitasBaterai;
    }

    // Override tampilInfo()
    @Override
    public void tampilInfo() {
        System.out.println("Mesin Traktor Listrik " + super.getNamaMesin() +
                " | Tarik: " + super.kapasitasTarik + " ton" + // Mengakses dari protected field parent
                " | Baterai: " + kapasitasBaterai + " kWh" +
                " | Tenaga: " + super.getTenagaHP() + " HP");
    }

    // Override nilaiPerforma(): performa = (tenagaHP x 1.1) + (kapasitasBaterai x 5)
    @Override
    public double nilaiPerforma() {
        return (super.getTenagaHP() * 1.1) + (kapasitasBaterai * 5);
    }

    // Override kategoriMesin()
    @Override
    public String kategoriMesin() {
        return "Mesin Traktor Listrik";
    }

    // Method unik: suaraMesin()
    @Override
    public void suaraMesin() {
        System.out.println("Bzzzzz! Mesin traktor listrik aktif!");
    }
}
