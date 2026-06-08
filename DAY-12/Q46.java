/*Write a program to Write function for Armstrong. */
import java.util.Scanner;

public class Q46 {

    static boolean isArmstrong(int n) {

        int temp = n;
        int count = 0;

        while (temp != 0) {
            count++;
            temp /= 10;
        }

        temp = n;
        int sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            temp /= 10;
        }

        return sum == n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isArmstrong(n))
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}