package pertemuan5;

class mesinTraktor extends defaultMesin {
    protected double kapasitasTarik; // Menggunakan protected agar bisa diakses oleh MesinTraktorListrik

    public mesinTraktor(String namaMesin, int tenagaHP, double kapasitasTarik) {
        super(namaMesin, tenagaHP);
        this.kapasitasTarik = kapasitasTarik;
    }

    @Override
    public void tampilInfo() {
        System.out.println("Mesin Traktor " + super.getNamaMesin() +
                " | Tarik: " + kapasitasTarik + " ton" +
                " | Tenaga: " + super.getTenagaHP() + " HP");
    }

    @Override
    public double nilaiPerforma() {
        return (super.getTenagaHP() * 0.9) + (kapasitasTarik * 10);
    }

    @Override
    public String kategoriMesin() {
        return "Mesin Traktor";
    }

    public void suaraMesin() {
        System.out.println("GGGRRRR! Hidup mesinnn!");
    }
}
