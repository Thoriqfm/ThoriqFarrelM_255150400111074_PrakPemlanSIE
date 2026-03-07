
public class Mobil {

    private String nopol;
    private String warna;
    private String merk;
    private int kecepatan;
    private int jumlahTempuh;

    public void setNopol(String n) {
        nopol = n;
    }

    public void setWarna(String s) {
        warna = s;
    }

    public void setMerk(String m) {
        merk = m;
    }

    public void setKecepatan(int k) {
        kecepatan = k;
    }

    public void setJumlahTempuh(int j) {
        jumlahTempuh = j;
    }

    public int hitungJarak(int waktu) {
        return kecepatan * waktu;
    }

    public void tampilKecepatanMeterPerSec() {
        double kecepatanMeterPerSec = (double) kecepatan / 3.6;
        System.out.println("Kecepatan mobil adalah " + kecepatanMeterPerSec + " m/s");
    }

    public void display() {
        System.out.println("Mobil bermerk " + merk);
        System.out.println("bernomor polisi " + nopol);
        System.out.println("serta memililki warna " + warna);
        System.out.println("bergerak dengan kecepatan " + kecepatan + " kpj");
        System.out.println("dan telah menempuh jarak " + jumlahTempuh + " km");
    }
}
