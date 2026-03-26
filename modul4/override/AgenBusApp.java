package modul4.override;

public class AgenBusApp {

    public static void main(String[] args) {
        Tiket t1 = new Tiket();
        t1.pesan();
        t1.tampil();

        TiketBus t2 = new TiketBus();
        t2.pesan();
        t2.tampil();

        TiketBus t3 = new TiketBus();
        t3.pesan("Kasino", "Bandung", 650, 450000);
        t3.tampil();

        TiketBus t4 = new TiketBus();
        t4.pesan();
        t4.pesan("Budi");
        t4.tampil();

        TiketBus t5 = new TiketBus() {
            @Override
            public void tampil() {
                System.out.println("══════════════════════════════════");
                System.out.println("        TIKET BUS NUSANTARA      ");
                System.out.println("══════════════════════════════════");
                System.out.printf("  Penumpang : %-20s%n", namaPengunjung);
                System.out.printf("  Tujuan    : %-20s%n", tujuan);
                System.out.printf("  Harga     : Rp%-18.0f%n", hargaTiket);
                System.out.println("══════════════════════════════════");
            }
        };

        t5.pesan("Siti", "Bandung", 150, 175000);
        t5.tampil();

        t1.pesan("Indro", "Makassar");
        t1.tampil();
        t2.pesan("Dono", "Makassar");
        t2.tampil();
    }
}
