package pertemuan1;

class Main {
    public static void main(String[] args) {
        Pengguna p = new Pengguna(25, 60.0, 170.0);
        p.tampilInfo();
        System.out.println("\n--- Demonstrasi Konstanta Final ---");

        System.out.println("Nilai faktor aktivitas (FAKTOR_AKTIVITAS): " + Pengguna.FAKTOR_AKTIVITAS);
        System.out.println("Faktor aktivitas bersifat **final** (konstan)");
        System.out.println("Artinya nilai ini tidak bisa diubah setelah diinisialisasi");

        System.out.println("\nJika kita mencoba menulis:");
        System.out.println("Pengguna.FAKTOR_AKTIVITAS = 1.5;");

        System.out.println("\nMaka compiler akan menolak dengan error:");
        System.out.println("'cannot assign a value to final variable FAKTOR_AKTIVITAS'");
        System.out.println("Hal ini membuktikan bahwa faktor aktivitas adalah konstanta.");
    }
}