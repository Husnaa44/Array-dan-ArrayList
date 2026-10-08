import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> daftarCustomer;

    public Bank() {
        this.daftarCustomer = new ArrayList<>();
    }

    public void tambahCustomer(String namaDepan, String namaBelakang) {
        this.daftarCustomer.add(new Customer(namaDepan, namaBelakang));
    }

    public int getJumlahCustomer() {
        return this.daftarCustomer.size();
    }

    public Customer getCustomer(int nomor) {
        return this.daftarCustomer.get(nomor);
    }
}