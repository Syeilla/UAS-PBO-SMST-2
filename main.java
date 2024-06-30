
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gsyei
 */
public class main{ 
    public static Scanner input = new Scanner(System.in);
    private static Buku[] daftarBuku;
    
    public static void main(String[] args){
        
        System.out.print("Masukkan Jumlah data yang hendak di input : ");
        int jumlahData = input.nextInt();
        input.nextLine(); // Membersihkan newline
        Buku[] daftarBuku = new Buku[jumlahData]; // Deklarasi dan inisialisasi array daftarBuku

        for (int i = 0; i < jumlahData; i++) {
            System.out.println("\nData Buku Ke-" + (i + 1));
            System.out.println("--------------------------------");

            System.out.print("Masukkan Judul Buku: ");
            String judulBuku = input.nextLine();

            System.out.print("Masukkan Pengarang Buku: ");
            String pengarang = input.nextLine();

            System.out.print("Masukkan Penerbit Buku: ");
            String penerbit = input.nextLine();

            System.out.print("Masukkan Tahun Cetak Buku: ");
            int tahunCetak = input.nextInt();
            input.nextLine(); // Membersihkan newline
            

            System.out.print("Masukkan Kategori Buku (su/r/d/a): ");
            String kategori = input.nextLine();

            switch (kategori) {
                case "su":
                    kategori = "Semua Umur";
                    break;
                case "r":
                    kategori = "Remaja";
                    break;
                case "d":
                    kategori = "Dewasa";
                    break;
                case "a":
                    kategori = "Anak-anak";
                    break;
                default:
                    kategori = "Tidak Diketahui";
                    break;
            }

            daftarBuku[i] = new Buku(judulBuku, pengarang, penerbit, tahunCetak, kategori);
        }
        
        lihatBuku(daftarBuku);
    }

    private static void lihatBuku(Buku[] daftarBuku) {
        System.out.println("---------------------------\n\n");
        System.out.println("SELAMAT DATANG DI TOKO BUKU KAMI!");
        System.out.println("\n\nDaftar Buku:");
        System.out.println("---------------------------\n");

        for (int i = 0; i < daftarBuku.length; i++) {
            System.out.println("\nData Buku Ke-" + (i + 1));
            System.out.println("-----------------------");
            System.out.println("Judul Buku: " + daftarBuku[i].getJudulBuku());
            System.out.println("Pengarang: " + daftarBuku[i].getPengarang());
            System.out.println("Penerbit: " + daftarBuku[i].getPenerbit());
            System.out.println("Tahun Cetak Buku: " + daftarBuku[i].getTahunCetak());
            System.out.println("Kategori: " + daftarBuku[i].getKategori());
        }
    }
}
