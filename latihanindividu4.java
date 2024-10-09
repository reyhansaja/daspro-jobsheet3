import java.util.Scanner;

public class latihanindividu4{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();
        if (umur < 0) {
                System.out.println("Error: umur tidak boleh negatif.");
        } else if (umur <= 12) {
                System.out.println("Anda masuk dalam kategori: Anak");
        } else if (umur <= 19) {
                System.out.println("Anda masuk dalam kategori: Remaja");
        } else if (umur <= 64) {
                System.out.println("Anda masuk dalam kategori: Dewasa");
        } else {
                System.out.println("Anda masuk dalam kategori: Lansia");
        }
        }
    }
