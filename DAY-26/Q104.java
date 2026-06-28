import java.util.Scanner;

public class Q104 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.println("Q1. Capital of India?");
        System.out.println("1. Mumbai");
        System.out.println("2. Delhi");
        System.out.println("3. Chennai");
        System.out.println("4. Kolkata");

        int ans = sc.nextInt();

        if (ans == 2)
            score++;

        System.out.println();

        System.out.println("Q2. Java is?");
        System.out.println("1. Programming Language");
        System.out.println("2. Browser");
        System.out.println("3. Database");
        System.out.println("4. Operating System");

        ans = sc.nextInt();

        if (ans == 1)
            score++;

        System.out.println();

        System.out.println("Your Score = " + score + "/2");
    }
}