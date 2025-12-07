package pertemuan5;

class defaultMesin {
    private String namaMesin;
    private int tenagaHP;

    public defaultMesin(String namaMesin, int tenagaHP) {
        this.namaMesin = namaMesin;
        this.tenagaHP = tenagaHP;
    }

    public String getNamaMesin() {
        return namaMesin;
    }

    public int getTenagaHP() {
        return tenagaHP;
    }

    public void tampilInfo() {
        System.out.println("Mesin " + namaMesin + " | Tenaga: " + tenagaHP + " HP");
    }

    public double nilaiPerforma() {
        return tenagaHP * 1.0;
    }

    public String kategoriMesin() {
        return "Mesin Umum";
    }

    public void suaraMesin() {
    }
}
