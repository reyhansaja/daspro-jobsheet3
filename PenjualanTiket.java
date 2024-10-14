import java.util.Scanner;

public class PenjualanTiket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int totalTiket = 0;
        double totalPenjualantiketHariini = 0;
        final int hargaTiket = 50000;
        
        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (atau 0 untuk keluar): ");
            int jumlahTiket = sc.nextInt();
            
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak boleh negatif. Silakan masukkan jumlah yang valid.");
                continue; 
            }

            if (jumlahTiket == 0) {
                break;
            }

            double totalHarga = jumlahTiket * hargaTiket;

            if (jumlahTiket > 10) {
                totalHarga *= 0.85;
            } else if (jumlahTiket > 4) {
                totalHarga *= 0.90;
            }

            totalPenjualantiketHariini += totalHarga;
            totalTiket += jumlahTiket;

            System.out.println("Total harga untuk " + jumlahTiket + " tiket: Rp " + totalHarga);
        }

        System.out.println("\nTotal tiket terjual hari ini: " + totalTiket);
        System.out.println("Total pendapatan hari ini: Rp " + totalPenjualantiketHariini);
    }
}
