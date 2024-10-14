import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan merek sepatu (Converse/Sketcher/Nike): ");
        String merek = input.nextLine().toLowerCase();

        System.out.print("Masukkan kategori sepatu (Slip On/High Top/Woman/Man/Kids/Adult): ");
        String kategori = input.nextLine().toLowerCase();

        System.out.print("Masukkan ukuran sepatu: ");
        int ukuran = input.nextInt();

        double harga = 0;

        if (merek.equals("converse")) {
            if (kategori.equals("slip on")) {
                if (ukuran >= 36 && ukuran <= 40) {
                    harga = 800000;
                }
            } else if (kategori.equals("high top")) {
                if (ukuran >= 40 && ukuran <= 44) {
                    harga = 1200000;
                }
            }
        }

        if (merek.equals("sketcher")) {
            if (kategori.equals("woman")) {
                if (ukuran >= 36 && ukuran <= 41) {
                    harga = 1000000;
                }
            } else if (kategori.equals("man")) {
                if (ukuran >= 41 && ukuran <= 44) {
                    harga = 1800000;
                }
            }
        }

        if (merek.equals("nike")) {
            if (kategori.equals("kids")) {
                if (ukuran >= 36 && ukuran <= 40) {
                    harga = 750000;
                }
            } else if (kategori.equals("adult")) {
                if (ukuran >= 40 && ukuran <= 44) {
                    harga = 1500000;
                }
            }
        }

        if (harga != 0) {
            System.out.println("Harga sepatu: Rp " + harga);
        } else {
            System.out.println("Data sepatu tidak valid.");
        }

        input.close();
    }
}
