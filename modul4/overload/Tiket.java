package modul4.overload;

public class Tiket {
    protected String namaPengunjung = "Anonim";
    protected String tujuan = "Jakarta";
    protected int jarakTempuh = 750;
    protected double hargaTiket = 250000;

    public void pesan() {}

    public void pesan(String n, String t) {
        this.namaPengunjung = n;
        this.tujuan = t;
        this.jarakTempuh = 90;
        this.hargaTiket = 55000;
    }

    public void pesan(String n, String t, int j, double h) {
        this.namaPengunjung = n;
        this.tujuan = t;
        this.jarakTempuh = j;
        this.hargaTiket = h;
    }

    // nama dan jarak tempuh
    public void pesan(String n, int j) {
        this.namaPengunjung = n;
        this.jarakTempuh = j;
        this.tujuan = "Jakarta";
        this.hargaTiket = 250000;
    }

    // tujuan dan nama
    // public void pesan(String t, String n) {
    //     this.namaPengunjung = n;
    //     this.tujuan = t;
    //     this.jarakTempuh = 90;
    //     this.hargaTiket = 55000;
    // }

    public void tampil() {
        System.out.println("Nama Penumpang: " + this.namaPengunjung);
        System.out.println("Tujuan: " + this.tujuan);
        System.out.println("Jarak Tempuh: " + this.jarakTempuh);
        System.out.println("Harga Tiket: " + this.hargaTiket);
        System.out.println("-------------------");
    }
}
