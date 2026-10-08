public class Customer {
    private String namaDepan;
    private String namaBelakang;
    private Account[] daftarRekening = new Account[2];
    private int jumlahRekening = 0;

    public Customer(String namaDepan, String namaBelakang) {
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
    }

    public String getNamaDepan() {
        return this.namaDepan;
    }

    public String getNamaBelakang() {
        return this.namaBelakang;
    }

    public void setRekening(Account rekening) {
        if (this.jumlahRekening < this.daftarRekening.length) {
            this.daftarRekening[this.jumlahRekening] = rekening;
            this.jumlahRekening++;
        }
    }

    public Account getRekening(int nomor) {
        return this.daftarRekening[nomor];
    }

    public int getJumlahRekening() {
        return this.jumlahRekening;
    }
}