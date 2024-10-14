import java.util.Scanner;

public class Pemilihan2Percobaan224 {
    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);
        String member;
        double diskon, harga, totalbayar;
        int menu;

        System.out.println("------------------------");
        System.out.println("==== Menu Kafe JTI =====");
        System.out.println("------------------------");
        System.out.println("1. Rice Bowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Rice Bowl + Ice Tea)");
        System.out.println("---------------------------------------");
        System.out.print("Masukkan angka dari menu yang dipesan: ");
        menu = input24.nextInt();
        input24.nextLine();
        System.out.print("Apakah punya member? ");
        member = input24.nextLine();
        System.out.println("---------------------------------------");
        if(member.equalsIgnoreCase("y")){
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if(menu==1){
                harga = 14000;
                System.out.println("Harga Rice Bowl adalah " + harga);
            }
            else if(menu==2){
                harga = 3000;
                System.out.println("Harga Ice Tea adalah " + harga);
            }
            else if(menu==3){
                harga = 15000;
                System.out.println("Harga Bundling adalah " + harga);
            }
            else{
                System.out.println("Masukkan pilihan menu yang benar!");
                return;
            }
            totalbayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + totalbayar);
        }
        else if(member.equalsIgnoreCase("n")){
            if(menu==1){
                harga = 14000;
                System.out.println("Harga Rice Bowl adalah " + harga);
            }
            else if(menu==2){
                harga = 3000;
                System.out.println("Harga Ice Tea adalah " + harga);
            }
            else if(menu==3){
                harga = 15000;
                System.out.println("Harga Bundling adalah " + harga);
            }
            else{
                System.out.println("Masukkan pilihan menu yang benar!");
                return;
            }
            System.out.println("Total bayar = " + harga);
        }
        else{
            System.out.println("member tidak valid");
        }
        System.out.println("=======================================");
    }
}
