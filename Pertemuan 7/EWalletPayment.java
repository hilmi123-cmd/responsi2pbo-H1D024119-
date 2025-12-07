package pertemuan7;

class EWalletPayment implements PaymentMethod {
    private String namaLayanan;
    private double nominalPembayaran;
    private double saldoPengguna;

    private static final double FEE = 2000.0;

    public EWalletPayment(String namaLayanan, double nominalPembayaran, double saldoPengguna) {
        this.namaLayanan = namaLayanan;
        this.nominalPembayaran = nominalPembayaran;
        this.saldoPengguna = saldoPengguna;
    }

    @Override
    public String processPayment() {
        double totalBiaya = nominalPembayaran + FEE;
        if (saldoPengguna >= totalBiaya) {
            saldoPengguna -= totalBiaya;
            return "Pembayaran berhasil!";
        } else {
            return "Pembayaran gagal! Saldo tidak cukup.";
        }
    }

    @Override
    public String getPaymentDetails() {
        return "Detail Transaksi: Pembayaran sebesar " + nominalPembayaran +
                " dilakukan melalui " + namaLayanan;
    }

    @Override
    public double getTransactionFee() {
        return FEE;
    }

    @Override
    public double getBalance() {
        return saldoPengguna;
    }

    public double getNominalPembayaran() {
        return nominalPembayaran;
    }
}
