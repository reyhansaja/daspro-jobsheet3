import java.util.Scanner;

public class Kafe24{
    public static void main (String args[]){
        //Panggil Scanner
        Scanner input = new Scanner (System.in);
        //Identifikasi Variabel
        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti =  20000.0, totalHarga, nominalBayar;
        float diskon = 10 / 100;
        //input jumlah
        System.out.print("Masukkan Keanggotaan (True/false): ");
        keanggotaan = input.nextBoolean();
        System.out.print("Masukkan Jumlah pembelian Kopi: ");
        jmlKopi = input.nextInt();
        System.out.print("Masukkan Jumlah pembelian Teh: ");
        jmlTeh = input.nextInt();
        System.out.print("Masukkan jumlah pembelian Roti: ");
        jmlRoti = input.nextInt();
        //hitung total harga
        totalHarga = (jmlKopi * hargaKopi) + (jmlRoti * hargaRoti) + (jmlTeh * hargaTeh);
        //hitung nominal bayar
        nominalBayar = totalHarga - (diskon * totalHarga);
        //tampilkan semua
        System.out.println("Keanggotaan Pelanggan: " + keanggotaan);
        System.out.println("Item pembelian :" + jmlKopi + " Kopi " + jmlTeh + " Teh " + jmlRoti + " roti");
        System.out.println("Nominal bayar Rp. " + nominalBayar);
    }
}