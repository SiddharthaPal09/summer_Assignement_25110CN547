/*Write a program to Print hollow square pattern. */

import java.util.Scanner;

public class Q36 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i==1 || j==1 || i==n || j==n){
                System.out.print("*");
                }
                else{
                    System.out.println(" ");
                }
            }

            System.out.println();
        }
    }
}
