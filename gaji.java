import java.util.Scanner;

public class gaji{
    public static void main (String args[]){

        int jumlahJam, upahperJam;
        float persenbonus = (float)0.1, persenpajak = 0.05f;

        Scanner input = new Scanner (System.in);

        System.out.print("Jumlah jam: ");
        jumlahJam = input.nextInt();
        System.out.print("Upah per jam: ");
        upahperJam = input.nextInt();

        int totalGaji = jumlahJam * upahperJam;
        float bonus = persenbonus * totalGaji;
        int totalbonusplusgaji = totalGaji + (int) bonus;
        float pajak = persenpajak * totalbonusplusgaji;
        int gajibersih = totalbonusplusgaji - (int)pajak;

        System.out.println("Total gaji: " + totalGaji);
        System.out.println("Total bonus: " + bonus);
        System.out.println("Total bonus plus gaji: " + totalbonusplusgaji);
        System.out.println("Pajak: " + pajak);
        System.out.println("Total gaji bersih: " + gajibersih);
    }
}