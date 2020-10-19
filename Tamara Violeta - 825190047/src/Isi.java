import java.util.Scanner;
public class Isi {
    int saldo;
    int noMember;
    String nama;
    String Alamat;
    String harga;
    int total_harga = 0;



    // constructor
    public Isi(int noMember, String nama, String Alamat) {
        this.noMember = noMember;
        this.nama = nama;
        this.Alamat = Alamat;
    }

    //Methods
    public int pesan(int quantity, int price) {
        total_harga = (price * quantity);
        return total_harga;
    }

    // getter
    public int getSaldo() {
        return saldo;
    }

    public int getNoMember() {
        return noMember;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public int getTotal_harga() {
        return total_harga;
    }

    // setter
    public void setHarga(String harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return String.valueOf(getTotal_harga());
    }
}

