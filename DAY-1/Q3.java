/*Write a program to Find factorial of a number.  */

import java.util.Scanner;

public class Q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int fact = 1;

        for (int i = 1; i <= a; i++) {
            fact=fact*i;
        }
        System.out.println(fact);
    }
    
}
