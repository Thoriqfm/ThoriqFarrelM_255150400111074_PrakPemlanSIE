
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /// Mobil 1
        System.out.println("=== Data Mobil 1 ===");
        System.out.print("Masukkan merk mobil: ");
        String merk = scanner.nextLine();
        System.out.print("Masukkan nomor polisi mobil: ");
        String nopol = scanner.nextLine();
        System.out.print("Masukkan warna mobil: ");
        String warna = scanner.nextLine();
        System.out.print("Masukkan kecepatan mobil (kpj): ");
        int kecepatan = scanner.nextInt();
        System.out.print("Masukkan jumlah jarak yang telah ditempuh (km): ");
        int jumlahTempuh = scanner.nextInt();
        System.out.print("Masukkan waktu perjalanan (jam): ");
        int waktu = scanner.nextInt();
        scanner.nextLine();

        Mobil m1 = new Mobil();
        m1.setMerk(merk);
        m1.setNopol(nopol);
        m1.setWarna(warna);
        m1.setKecepatan(kecepatan);
        m1.setJumlahTempuh(jumlahTempuh);

        /// Mobil 2
        System.out.println("\n=== Data Mobil 2 ===");
        System.out.print("Masukkan merk mobil: ");
        String merk2 = scanner.nextLine();
        System.out.print("Masukkan nomor polisi mobil: ");
        String nopol2 = scanner.nextLine();
        System.out.print("Masukkan warna mobil: ");
        String warna2 = scanner.nextLine();
        System.out.print("Masukkan kecepatan mobil (kpj): ");
        int kecepatan2 = scanner.nextInt();
        System.out.print("Masukkan jumlah jarak yang telah ditempuh (km): ");
        int jumlahTempuh2 = scanner.nextInt();
        System.out.print("Masukkan waktu perjalanan (jam): ");
        int waktu2 = scanner.nextInt();

        Mobil m2 = new Mobil();
        m2.setMerk(merk2);
        m2.setNopol(nopol2);
        m2.setWarna(warna2);
        m2.setKecepatan(kecepatan2);
        m2.setJumlahTempuh(jumlahTempuh2);

        /// Hasil
        System.out.println("\n===== Hasil =====");

        System.out.println("\n-- Mobil 1 --");
        m1.display();
        System.out.println("Jarak tempuh dalam " + waktu + " jam: " + m1.hitungJarak(waktu) + " km");
        m1.tampilKecepatanMeterPerSec();

        System.out.println("\n-- Mobil 2 --");
        m2.display();
        System.out.println("Jarak tempuh dalam " + waktu2 + " jam: " + m2.hitungJarak(waktu2) + " km");
        m2.tampilKecepatanMeterPerSec();

        scanner.close();
    }
}
