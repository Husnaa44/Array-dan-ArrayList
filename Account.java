public class Account {
    private double saldo;

    public Account(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public boolean setor(double jumlah) {
        if (jumlah > 0) {
            this.saldo = this.saldo + jumlah;
            return true;
        } else {
            return false;
        }
    }

    public boolean tarik(double jumlah) {
        if (this.saldo >= jumlah) {
            this.saldo = this.saldo - jumlah;
            return true;
        } else {
            return false;
        }
    }
}