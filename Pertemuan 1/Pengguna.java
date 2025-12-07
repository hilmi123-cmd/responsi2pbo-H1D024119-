package pertemuan1;

class Pengguna {

    private int umur;
    private double berat;
    private double tinggi;

    public static final double FAKTOR_AKTIVITAS = 1.2;

    public Pengguna(int umur, double berat, double tinggi) {
        this.umur = umur;
        this.berat = berat;
        this.tinggi = tinggi;
    }

    public double hitungBMI() {
        double tinggiMeter = tinggi / 100.0;
        if (tinggiMeter == 0) {
            return 0.0;
        }
        double bmi = berat / (tinggiMeter * tinggiMeter);
        return Math.round(bmi * 100.0) / 100.0;
    }

    public void tampilKategori() {
        double bmi = hitungBMI();

        System.out.print("Kategori: ");
        if (bmi < 18.5) {
            System.out.println("Kurus");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else { // bmi >= 25
            System.out.println("Obesitas");
        }
    }

    public double hitungKalori() {
        double kalori = berat * FAKTOR_AKTIVITAS * 10;
        return Math.round(kalori);
    }

    public void tampilInfo() {
        System.out.println("\n=== Informasi Kesehatan Pengguna ===");
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Berat: " + berat + " kg");
        System.out.println("Tinggi: " + tinggi + " cm");

        double bmi = hitungBMI();
        System.out.println("BMI: " + bmi);

        tampilKategori();

        double kalori = hitungKalori();
        System.out.println("Kebutuhan Kalori: " + kalori + " kal/hari");
        System.out.println("====================================");
    }
}
