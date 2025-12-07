package pertemuan4;

class Customer {
    private String namaLengkap;
    private String nomorIdentitasCustomer;
    private int totalBelanja;

    public Customer(String namaLengkap, String nomorIdentitasCustomer, int totalBelanja) {
        this.namaLengkap = namaLengkap;
        this.nomorIdentitasCustomer = nomorIdentitasCustomer;
        this.totalBelanja = totalBelanja;
    }

    public String getNama() { return namaLengkap; }
    public String getNomorIdentitasCustomer() { return nomorIdentitasCustomer; }
    public int getTotalBelanja() { return totalBelanja; }

    public void tampilkanInformasi() {
        System.out.println("Status: Customer Biasa");
        System.out.println("Nama: " + namaLengkap +
                " | ID: " + nomorIdentitasCustomer +
                " | Total Belanja: Rp " + totalBelanja);
    }
}