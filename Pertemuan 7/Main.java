package pertemuan7;

class Main {
    public static void main(String[] args) {
        String namaLayanan = "OVO";
        double saldoAwal = 150000.0;
        double nominalBayar = 50000.0;

        EWalletPayment eWallet = new EWalletPayment(namaLayanan, nominalBayar, saldoAwal);

        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===");
        System.out.println("Saldo awal: " + saldoAwal);
        System.out.println("Biaya Transaksi (Fee): " + eWallet.getTransactionFee());
        System.out.println("Memproses pembayaran sebesar " + eWallet.getNominalPembayaran() + "...");

        String statusTransaksi = eWallet.processPayment();
        System.out.println(statusTransaksi);

        System.out.println("Sisa saldo: " + eWallet.getBalance());
        System.out.println(eWallet.getPaymentDetails());

        System.out.println("==============================================");
        System.out.println("\n--- Uji Kasus Gagal (Saldo Tidak Cukup) ---");
        EWalletPayment ujiGagal = new EWalletPayment("GOPAY", 150000.0, 100000.0);
        System.out.println("Saldo awal: " + ujiGagal.getBalance());
        System.out.println("Nominal pembayaran: " + ujiGagal.getNominalPembayaran());

        System.out.println(ujiGagal.processPayment());
        System.out.println("Sisa saldo (tetap): " + ujiGagal.getBalance());
    }
}
