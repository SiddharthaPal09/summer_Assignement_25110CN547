/*Write a program to Print multiplication table of a given number. */

import java.util.Scanner;

public class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + a + " = " + i * a);

        }
    }
}
