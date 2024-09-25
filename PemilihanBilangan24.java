import java.util.Scanner;
public class PemilihanBilangan24 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Sebuah Angka: ");
        int angka = sc.nextInt();
        
        String hasil = (angka % 2 == 0) ? "genap" : "ganjil";
        
        System.out.println("Angka " + angka + " Termasuk bilangan " + hasil);
    }
}
