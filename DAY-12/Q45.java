/*Write a program to Write function for palindrome. */
import java.util.Scanner;

public class Q45 {

    static boolean isPalindrome(int n) {

        int temp = n;
        int rev = 0;

        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

        return n == rev;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isPalindrome(n))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}