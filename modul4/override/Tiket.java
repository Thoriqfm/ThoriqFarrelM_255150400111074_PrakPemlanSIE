package modul4.override;

public class Tiket {

    protected String namaPengunjung = "Anonim";
    protected String tujuan = "Jakarta";
    protected int jarakTempuh = 750;
    protected double hargaTiket = 250000;

    public void pesan() {
    }

    public void pesan(String n, String t) {
        this.namaPengunjung = n;
        this.tujuan = t;
        this.jarakTempuh = 90;
        this.hargaTiket = 55000;
    }

    // dari Class Tiket
    public void pesan(String n, String t, int j, double h) {
        this.namaPengunjung = n;
        this.tujuan = t;
        this.jarakTempuh = j;
        this.hargaTiket = h;
    }

    public void tampil() {
        System.out.println("Nama Penumpang: " + this.namaPengunjung);
        System.out.println("Tujuan: " + this.tujuan);
        System.out.println("Jarak Tempuh: " + this.jarakTempuh);
        System.out.println("Harga Tiket: " + this.hargaTiket);
        System.out.println("-------------------");
    }
}
