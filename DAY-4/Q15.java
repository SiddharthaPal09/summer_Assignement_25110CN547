/*Write a program to Check Armstrong number.  */

import java.util.Scanner;

public class Q15 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        int sum = 0;
        int a = 0;

        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        temp=n;
        for (int i = 0; i < count; i++) {
            a = temp % 10;
            temp=temp/10;
            sum += Math.pow(a, count);
        }

        if (n == sum) {
            System.out.println("it is a Armstrong number");
        } else {
            System.out.println("it is not a Armstrong number");
        }

    }

}
