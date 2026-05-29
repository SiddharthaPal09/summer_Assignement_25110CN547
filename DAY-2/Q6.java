/*Write a program to Reverse a number */

import java.util.Scanner;

public class Q6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rev = 0;
        int n = sc.nextInt();

        while(n!=0){
            rev=rev*10+n%10;
            n=n/10;
            ;
        }
        System.out.println(rev);
    }
    
}
