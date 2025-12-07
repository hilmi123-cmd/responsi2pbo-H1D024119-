package pertemuan4;

class Member extends Customer {
    private int poinReward;
    private String levelKeanggotaan;

    public Member(String namaLengkap, String nomorIdentitasCustomer, int totalBelanja,
                  int poinReward, String levelKeanggotaan) {

        super(namaLengkap, nomorIdentitasCustomer, totalBelanja);

        this.poinReward = poinReward;
        this.levelKeanggotaan = levelKeanggotaan;
    }

    @Override
    public void tampilkanInformasi() {
        System.out.println("Status: Member");

        System.out.print("Nama: " + super.getNama() +
                " | ID: " + super.getNomorIdentitasCustomer() +
                " | Total Belanja: Rp " + super.getTotalBelanja());

        System.out.println("\nPoin Reward: " + poinReward +
                " | Level: " + levelKeanggotaan);
    }
}
