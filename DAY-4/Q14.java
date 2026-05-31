/*Write a program to Find nth Fibonacci term.  */

import java.util.Scanner;

public class Q14 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0, y = 1, z;
        int arr[]=new int[n];

        arr[0]=x;
        for (int i = 1; i < n; i++) {
            z = x + y;
            arr[i]=y;
            x = y;
            y = z;
        }
        System.out.println(arr[n-1]);
    }
    
}
