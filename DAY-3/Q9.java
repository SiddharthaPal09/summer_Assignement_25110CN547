/*Write a program to Check whether a number is prime. */

import java.util.Scanner;

public class Q9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double n1 =Math.sqrt(n);
        boolean flag = true;

        if(n==2){
            flag= true;
        }
        
        for(int i=2;i<=n1;i++){
            if(n%i==0){
                flag=false;
            }
        }
        if(flag==true){
            System.out.println("prime");
        }
        else{
            System.out.println("not a prime");
        }

    
}
}