/*Write a program to Find largest prime factor.  */

import java.util.Scanner;

public class Q20 {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int lpf = 1;for(
    int i = 2;i<=n;i++)
    {
        if (n % i == 0) {
            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                lpf = i;
            }
        }
    }System.out.println("Largest Prime Factor = "+lpf);
}
