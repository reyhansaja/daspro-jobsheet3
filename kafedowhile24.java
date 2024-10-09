import java.util.Scanner;

public class kafedowhile24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int kopi, teh, roti, hargaKopi= 12000, hargaTeh= 7000, hargaRoti= 20000;
        String namaPelanggan;
        do{
            System.out.print("Masukkan nama pelanggan (Ketik Batal untuk membatalkan transaksi): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")){
                System.out.println("Transaksi dibatalkan");
                break;
            }
            System.out.print("Jumlah Kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah Teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah Roti: ");
            roti = sc.nextInt();
            int totalharga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti + hargaRoti);
            System.out.println("Total yang harus dibayar: Rp. " + totalharga);
            sc.nextLine();
        } while (true);
        System.out.println("Transaksi selesai");
    }
}
