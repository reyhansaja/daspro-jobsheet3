import java.util.Scanner;
public class SwitchKafe24{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        String menu;
        char ukurancup;
        int jumlah;
        boolean keanggotaan;

        System.out.print("Masukkan Menu: ");
        menu = sc.nextLine();
        System.out.print("Masukkan ukuran cup: ");
        ukurancup = sc.next().charAt(0);
        System.out.print("Masukkan jumlah: ");
        jumlah = sc.nextInt();
        System.out.print("Masukkan keanggotaan (True/False): ");
        keanggotaan = sc.nextBoolean();

        double hargamenu = 0;
        switch (menu.toLowerCase()){
            case "kopi":
                hargamenu = 12000;
                break;
            case "teh":
                hargamenu = 7000;
                break;
            case "coklat":
                hargamenu = 20000;
                break;
        }
        double totalHarga = hargamenu * jumlah;

        switch (ukurancup) {
            case 'S':
                break;
            case 'M':
                totalHarga += 0.25 * totalHarga;
                break;
            case 'L':
                totalHarga += 0.4 * totalHarga;
                break;
        }
        double diskon = keanggotaan ? 0 : 0.1;
        double nominalBayar = totalHarga - (diskon*totalHarga);

        System.out.println("Item pembelian: " + jumlah + " " + menu + " dengan ukuran cup: " + ukurancup);
        System.out.println("Nominal bayar: " + nominalBayar);
    }
}