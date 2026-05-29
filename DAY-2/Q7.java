/*Write a program to Find product of digits.  */

import java.util.Scanner;

public class Q7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int pro = 1;
        int n = sc.nextInt();

        while(n!=0){
            pro=pro*(n%10);
            n=n/10;
            ;
        }
        System.out.println(pro);
    }
    
}
