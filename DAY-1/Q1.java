/*Write a program to Calculate sum of first N natural numbers. */

import java.util.Scanner;

public class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= a; i++) {
            if (a <= 0) {
                System.out.println(a+" is not a natural number");
                break;
            }

            sum += i;
        }
        System.out.println(sum);

    }
}
