/*Write a program to Print prime numbers in a range. */

import java.util.Scanner;

public class Q10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=0;
        
        for(int i=1;i<=n;i++){
            c=0;
            for(int j=2;j<i/2;j++){

                if(i%j==0){
                    c++;
                    break;
                }
            }
            if(c==0){
                System.out.println(i+" is a prime number ");
            }
        }
    }    
}
