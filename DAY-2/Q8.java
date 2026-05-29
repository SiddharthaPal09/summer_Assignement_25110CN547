/*Write a program to Check whether a number is palindrome. */

import java.util.Scanner;

public class Q8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rev = 0;
        int n = sc.nextInt();
        int temp=n;

        while(temp!=0){
            rev=rev*10+temp%10;
            temp=temp/10;
            ;
        }

        if(n==rev){
            System.out.println("it is a palindrome");
        }
        else{
            System.out.println("it is not a palindrome");
        }
    }
    
}
