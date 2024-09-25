import java.util.Scanner;

public class siakadd24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, nim, kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiUjianAkhir, nilaiAkhir;
        
        System.out.print("Masukkan nama: ");
        nama = input.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = input.nextLine();
        System.out.print("Masukkan Kelas: ");
        kelas = input.nextLine();
        System.out.print("Masukkan no absen: ");
        absen = input.nextByte();
        input.nextLine(); 

        System.out.print("Masukkan Nilai Kuis: ");
        nilaiKuis = input.nextDouble();
        System.out.print("Masukkan Nilai Tugas: ");
        nilaiTugas = input.nextDouble();
        System.out.print("Masukkan Nilai Ujian: ");
        nilaiUjian = input.nextDouble();
        System.out.print("Masukkan Nilai Ujian Akhir: ");
        nilaiUjianAkhir = input.nextDouble();
        
        // Menghitung nilai akhir berdasarkan bobot
        nilaiAkhir = (nilaiKuis * 0.20) + (nilaiTugas * 0.15) + (nilaiUjian * 0.30) + (nilaiUjianAkhir * 0.35);

        System.out.println("Nama: " + nama + " NIM: " + nim);
        System.out.println("Kelas: " + kelas + " Absen: " + absen);
        System.out.println("Nilai akhir: " + nilaiAkhir);
        if(nilaiAkhir > 80 && nilaiAkhir <= 100 )
        {
            System.out.println("Nilai akhir huruf: A");
            System.out.println("Kualifikasi: Sangat Baik");
        }
        else if(nilaiAkhir > 73 && nilaiAkhir <= 80 )
        {
            System.out.println("Nilai akhir huruf: B+");
            System.out.println("Kualifikasi: Lebih dari baik");
        }
        else if(nilaiAkhir > 65 && nilaiAkhir <= 73 )
        {
            System.out.println("Nilai akhir huruf: B");
            System.out.println("Kualifikasi: Baik");
        }
        else if(nilaiAkhir > 60 && nilaiAkhir <= 65 )
        {
            System.out.println("Nilai akhir huruf: C+");
            System.out.println("Kualifikasi: Lebih dari cukup");
        }
        else if(nilaiAkhir > 50 && nilaiAkhir <= 60 )
        {
            System.out.println("Nilai akhir huruf: C");
            System.out.println("Kualifikasi: Cukup");
        }
        else if(nilaiAkhir > 39 && nilaiAkhir <= 50 )
        {
            System.out.println("Nilai akhir huruf: D");
            System.out.println("Kualifikasi: Kurang");
        }
        else if(nilaiAkhir >=0 && nilaiAkhir <= 39 )
        {
            System.out.println("Nilai akhir huruf: E");
            System.out.println("Kualifikasi: Gagal");
        }
        else 
        {
            System.out.println("Invalid nilai akhir");
        }
    }
}
