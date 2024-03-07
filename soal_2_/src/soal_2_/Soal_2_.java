/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal_2_;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author zidan
 */
public class Soal_2_ {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> matrix1 = new ArrayList<>();
        ArrayList<ArrayList<Integer>> matrix2 = new ArrayList<>();
        ArrayList<ArrayList<Integer>> hasilKali = new ArrayList<>();
        int n, isi;

        System.out.print("n: ");
        n = scanner.nextInt();

        
        for (int i = 0; i < n; i++) {
            matrix1.add(new ArrayList<>());
            matrix2.add(new ArrayList<>());
            hasilKali.add(new ArrayList<>());
            for (int j = 0; j < n; j++) {
                hasilKali.get(i).add(0); 
            }
        }

        
        System.out.println("Isi matriks 1:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                isi = scanner.nextInt();
                matrix1.get(i).add(isi);
            }
        }

        
        System.out.println("Isi matriks 2:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                isi = scanner.nextInt();
                matrix2.get(i).add(isi);
            }
        }

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    hasilKali.get(i).set(j, hasilKali.get(i).get(j) + matrix1.get(i).get(k) * matrix2.get(k).get(j));
                }
            }
        }

        // Menampilkan hasil perkalian
        System.out.println("Hasil perkalian matriks:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(hasilKali.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
