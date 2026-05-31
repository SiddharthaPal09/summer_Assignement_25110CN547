/*Write a program to Generate Fibonacci series.  */

import java.util.Scanner;

public class Q13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0, y = 1, z;

        System.out.print(x + " ");
        for (int i = 1; i < n; i++) {
            z = x + y;
            System.out.print(y + " ");
            x = y;
            y = z;
        }
    }
}
