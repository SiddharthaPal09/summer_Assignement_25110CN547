/*Write a program to Print character triangle. */

import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            char ch ='A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }

            System.out.println();
        }
    }
}
