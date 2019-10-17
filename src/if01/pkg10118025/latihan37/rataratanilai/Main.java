/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118025.latihan37.rataratanilai;

import java.util.Scanner;

/**
 * Nama     : Rizki Restu Illahi
 * NIM      : 10118025
 * Kelas    : IF-01
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nilai nilai = new Nilai();
        Scanner scan = new Scanner(System.in);
        
        int jmlMhs;
        System.out.print("Masukkan Banyaknya Mahasiwa : ");
        jmlMhs = scan.nextInt();
        
        nilai.hitungNilai(nilai.nilai, jmlMhs);
        nilai.hitungRataRata(nilai.totalNilai, jmlMhs);
        
        System.out.printf("%nMaka, Rata-rata nilainya adalah : %.1f",nilai.hitungRataRata(nilai.totalNilai, jmlMhs));
        System.out.println();
        System.out.println("Developed by : Rizki Restu Illahi");
    }
    
}
