import java.util.Scanner;

public class Siakad24 {
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
    }
}
