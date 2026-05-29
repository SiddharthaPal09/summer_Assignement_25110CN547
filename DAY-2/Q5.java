/* Write a program to Find sum of digits of a number. */

import java.util.Scanner;

public class Q5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();

        while(n!=0){
            sum+=n%10;
            n=n/10;
            ;
        }
        System.out.println(sum);
    }
    
}
