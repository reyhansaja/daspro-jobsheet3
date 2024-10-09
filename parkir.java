import java.util.Scanner;

public class parkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jeniskendaraan;
        int durasiparkir;
        double totalPembayaran = 0;

        System.out.println("Program Hitung Pembayaran Parkir");
        System.out.println("Masukkan 1 untuk Mobil, 2 untuk Motor, atau 0 untuk keluar");

        while (true) {
            System.out.print("Jenis kendaraan (1/2/0): ");
            jeniskendaraan = sc.nextInt();

            if (jeniskendaraan == 0) {
                break;
            }

            System.out.print("Durasi parkir (jam): ");
            durasiparkir = sc.nextInt();

            if (durasiparkir <= 0) {
                System.out.println("Durasi tidak valid. Harus lebih dari 0 jam.");
                continue;
            }

            double biaya;
            if (durasiparkir > 5) {
                biaya = 12500;
            } else {
                if (jeniskendaraan == 1) {
                    biaya = 3000 * durasiparkir; 
                } else if (jeniskendaraan == 2) {
                    biaya = 2000 * durasiparkir; 
                } else {
                    System.out.println("Jenis kendaraan tidak valid.");
                    continue;
                }
            }

            totalPembayaran += biaya;
            System.out.println("Biaya parkir: Rp " + biaya);
        }

        System.out.println("Total pembayaran parkir: Rp " + totalPembayaran);
    }
} 
