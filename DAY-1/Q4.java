/*Write a program to Count digits in a number.  */

import java.util.Scanner;

public class Q4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();

        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}
