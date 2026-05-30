/*Write a program to Find LCM of two numbers.*/

import java.util.Scanner;

public class Q12 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd=1;
        int lcm=1;

        for(int i=1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        lcm=(a*b)/gcd;
        System.out.println("LCM of "+a+" & "+b+" is "+ lcm);
    }
    
}
