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
public class Nilai {
    public int nilai;
    public double totalNilai;
    
    Scanner scan = new Scanner(System.in);
    
    public double hitungNilai(int parNilai, int parJmlMhs){
        for(int i=1;i<=parJmlMhs;i++){
            System.out.print("Nilai mahasiswa ke-"+i+" : ");
            parNilai = scan.nextInt();
            totalNilai += parNilai;
        }
        return totalNilai;
    }
    
    public double hitungRataRata(double totalNilai,int jmlMhs){
        return totalNilai/jmlMhs;
    }
}
