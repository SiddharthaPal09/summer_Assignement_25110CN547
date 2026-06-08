/*Write a program to Write function to find maximum. */
import java.util.Scanner;

public class Q42 {

    static int maximum(int a, int b) {

        if (a > b)
            return a;

        return b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Maximum = " + maximum(a, b));
    }
}