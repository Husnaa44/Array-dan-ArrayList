public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.tambahCustomer("Jude", "Belingham");
        bank.tambahCustomer("Budi", "Santoso");

        Customer jude = bank.getCustomer(0);
        Customer budi = bank.getCustomer(1);

        jude.setRekening(new Account(500000));
        jude.setRekening(new Account(250000));
        budi.setRekening(new Account(100000));

        Account rekeningJude1 = jude.getRekening(0);
        Account rekeningJude2 = jude.getRekening(1);
        Account rekeningBudi = budi.getRekening(0);

        // ===== DATA AWAL =====
        System.out.println("===== DATA AWAL =====");
        System.out.println("Jumlah customer: " + bank.getJumlahCustomer());

        System.out.println();
        System.out.println("Customer 1: " + jude.getNamaDepan() + " " + jude.getNamaBelakang());
        System.out.println("Jumlah rekening: " + jude.getJumlahRekening());
        System.out.println("Saldo rekening 1: " + rekeningJude1.getSaldo());
        System.out.println("Saldo rekening 2: " + rekeningJude2.getSaldo());

        System.out.println();
        System.out.println("Customer 2: " + budi.getNamaDepan() + " " + budi.getNamaBelakang());
        System.out.println("Jumlah rekening: " + budi.getJumlahRekening());
        System.out.println("Saldo rekening 1: " + rekeningBudi.getSaldo());

        // TRANSAKSI JUDE 
        System.out.println();
        System.out.println("====== TRANSAKSI JUDE ======");

        // 1. setor
        System.out.print("1. Setor 200000 ke rekening 1: ");
        if (rekeningJude1.setor(200000)) {
            System.out.println("Berhasil");
        } else {
            System.out.println("Gagal");
        }
        System.out.println("   Saldo rekening 1: " + rekeningJude1.getSaldo());

        // 2. tarik
        System.out.print("2. Tarik 150000 dari rekening 1: ");
        if (rekeningJude1.tarik(150000)) {
            System.out.println("Berhasil");
        } else {
            System.out.println("Gagal");
        }
        System.out.println("   Saldo rekening 1: " + rekeningJude1.getSaldo());

        // 3. transfer dari rekening 1 ke rekening 2
        System.out.println("3. Transfer 100000 dari rekening 1 ke rekening 2");
        if (rekeningJude1.tarik(100000)) {
            System.out.println("   Tarik dari rekening 1: Berhasil");
            rekeningJude2.setor(100000);
            System.out.println("   Setor ke rekening 2: Berhasil");
        } else {
            System.out.println("   Transfer gagal, saldo rekening 1 tidak cukup");
        }
        System.out.println("   Saldo rekening 1: " + rekeningJude1.getSaldo());
        System.out.println("   Saldo rekening 2: " + rekeningJude2.getSaldo());

        // 4. tarik melebihi saldo
        System.out.print("4. Tarik 9000000 dari rekening 2: ");
        if (rekeningJude2.tarik(9000000)) {
            System.out.println("Berhasil");
        } else {
            System.out.println("Gagal (saldo tidak cukup)");
        }
        System.out.println("   Saldo rekening 2: " + rekeningJude2.getSaldo());

        // 5. setor dengan jumlah minus
        System.out.print("5. Setor -50000 ke rekening 1: ");
        if (rekeningJude1.setor(-50000)) {
            System.out.println("Berhasil");
        } else {
            System.out.println("Gagal (jumlah harus lebih dari 0)");
        }
        System.out.println("   Saldo rekening 1: " + rekeningJude1.getSaldo());

        // ===== SALDO AKHIR =====
        System.out.println();
        System.out.println("====== SALDO AKHIR ======");
        System.out.println("Jude rekening 1: " + rekeningJude1.getSaldo());
        System.out.println("Jude rekening 2: " + rekeningJude2.getSaldo());
        double total = rekeningJude1.getSaldo() + rekeningJude2.getSaldo();
        System.out.println("Total saldo Jude: " + total);
        System.out.println("Budi rekening 1: " + rekeningBudi.getSaldo());
    }
}