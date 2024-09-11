import java.util.Scanner;

public class listrik {
    public static void main(String[] args) {
        int tarif = 1500;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah penggunaan listrik (kWh): ");
        double penggunaanKwh = input.nextDouble();

        double totalTagihan = penggunaanKwh * tarif;

        boolean melebihi500Kwh = penggunaanKwh > 500;  

        System.out.println("Total tagihan listrik Anda adalah: Rp " + String.format("%,.2f", totalTagihan));

        if (melebihi500Kwh) {  
            System.out.println("penggunaan kwh > 500 true");
        }

    }
}
