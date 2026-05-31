/*Write a program to Print Armstrong numbers in a range. */

import java.util.Scanner;

public class Q16 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = 0;
        int count = 0;
        int sum = 0;
        int a = 0;

        for (int j = 1; j <= n; j++) {
            temp=j;
            a=0;
            count=0;
            sum=0;
            while (temp != 0) {
                temp = temp / 10;
                count++;
            }

            temp=j;
            for (int i = 0; i < count; i++) {
                a = temp % 10;
                temp=temp/10;
                sum += Math.pow(a, count);
            }

            if (j == sum) {
                System.out.println(j);
            } 
        }

    }

}
