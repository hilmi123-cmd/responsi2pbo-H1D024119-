package pertemuan5;

class mesinMotor extends defaultMesin {
    private String tipeMotor;

    public mesinMotor(String namaMesin, int tenagaHP, String tipeMotor) {
        // Panggil konstruktor parent
        super(namaMesin, tenagaHP);
        this.tipeMotor = tipeMotor;
    }

    @Override
    public void tampilInfo() {
        System.out.println("Mesin Motor " + super.getNamaMesin() +
                " | Tipe: " + tipeMotor +
                " | Tenaga: " + super.getTenagaHP() + " HP");
    }

    @Override
    public double nilaiPerforma() {
        return super.getTenagaHP() * 1.2;
    }

    @Override
    public String kategoriMesin() {
        return "Mesin Motor";
    }

    public void suaraMesin() {
        System.out.println("Brummm! Mesin motor menyala!");
    }
}