/*Write a program to Check strong number. */

import java.util.Scanner;

public class Q18 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        int fact = 1;

        while (temp != 0) {
            fact = 1;
            for (int i = 1; i <= temp % 10; i++) {
                fact = fact * i;
            }
            sum += fact;
            temp = temp / 10;
        }
        if (sum == n) {
            System.out.println("it is a strong number");
        } else {
            System.out.println("it is not a strong number");
        }

    }

}
