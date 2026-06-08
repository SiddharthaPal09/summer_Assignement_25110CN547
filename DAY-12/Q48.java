/*Write a program to Write function for perfect number. */
import java.util.Scanner;

public class Q48 {

    static boolean isPerfect(int n) {

        int sum = 0;

        for (int i = 1; i < n; i++) {

            if (n % i == 0)
                sum += i;
        }

        return sum == n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isPerfect(n))
            System.out.println("Perfect Number");
        else
            System.out.println("Not Perfect Number");
    }
}