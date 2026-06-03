/* Write a program to Recursive reverse number.  */

import java.util.Scanner;

public class Q28 {
    static void reverse(int n) {

        if (n == 0)
            return;

        System.out.print(n % 10);

        reverse(n / 10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        reverse(n);
    }
}
