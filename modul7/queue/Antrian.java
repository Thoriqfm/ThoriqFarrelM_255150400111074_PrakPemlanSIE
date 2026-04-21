package modul7.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Antrian {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Menu Antrian Pelanggan:");
            System.out.println("1. Tambah Pelanggan");
            System.out.println("2. Layani Pelanggan");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Antrian Terdepan");
            System.out.println("5. Keluar");
            System.out.print("Pilih (1-5): ");
            try {
                int choice = sc.nextInt();
                sc.nextLine(); // consume newline
                switch (choice) {
                    case 1:
                        System.out.print("Masukan Nama Pelanggan: ");
                        // Kode yang ditambahkan
                        String nama = sc.nextLine();

                        if (nama.equalsIgnoreCase("Budi")) {
                            LinkedList<String> temp = new LinkedList<>();
                            while (!queue.isEmpty()) {
                                temp.add(queue.poll()); // kosongkan queue ke temp
                            }
                            queue.add(nama); // masukkan budi ke pertama
                            while (!temp.isEmpty()) {
                                queue.add(temp.poll()); // masukkan kembali semua elemen
                            }
                        } else {
                            queue.add(nama);
                        }
                        
                        System.out.println(nama + " ditambahkan ke antrian.");
                        break;
                    case 2:
                        if (queue.isEmpty()) {
                            System.out.println("Antrian kosong."); 
                        }else {
                            // Kode yang ditambahkan
                            nama = queue.poll();
                            System.out.println("Melayani pelanggan : " + nama);
                        }
                        break;
                    case 3:
                        System.out.println("Antrian Saat Ini: " + queue);
                        break;
                    case 4:
                        String frontElement = queue.peek();
                        if (frontElement == null) {
                            System.out.println("Antrian kosong.");
                        } else {
                            System.out.println("Antrian terdepan: " + frontElement);
                        }
                        break;
                    case 5:
                        System.out.println("Keluar.");
                        sc.close();
                        return;
                    default:
                        throw new Exception("Invalid input.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input.");
                sc.next(); // consume newline
            }
        }
    }
}
