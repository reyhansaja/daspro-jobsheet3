import java.util.Scanner;
public class testing{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int umur;
        String kualifikasi;
        umur = sc.nextInt();
        if(umur >= 15 && umur <=20){
            kualifikasi = "Kamu remaja";
        }
        else{
            kualifikasi = "Kamu tua";
        }
        System.out.println(kualifikasi);
    }
}