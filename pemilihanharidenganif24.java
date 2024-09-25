import java.util.Scanner;
public class pemilihanharidenganif24{
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        if(angka >=1 && angka <=5)
        {
            System.out.println(angka + " ini Weekday");
        }
        else if (angka >=6 && angka <=7 )
        {
            System.out.println(angka + " ini weekend");
        }
        else
        {
            System.out.println("invalid");
        }
    }
}