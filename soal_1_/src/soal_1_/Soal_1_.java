/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal_1_;
import java.util.Scanner;
/**
 *
 * @author zidan
 */
public class Soal_1_ {

    static void fibonacci(int n) {
        int a = 1;
        int b = 1;
        int c;

        if (n == 1) {
            System.out.print(a + " ");
        } else if (n == 2) {
            System.out.print(a + " " + b + " ");
        } else {
            System.out.print(a + " ");
            System.out.print(b + " ");

            for (int i = 3; i <= n; i++) {
                c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
        }
    }

    static int inputAngka() {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while (n < 1) {
            System.out.print("Masukan n : ");
            n = scanner.nextInt();
        }
        return n;
    }

    public static void main(String[] args) {
        int n = inputAngka();
        fibonacci(n);
    }
    
}
