/*Write a program to Convert decimal to binary */

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] binary = new int[32];
        int index = 0;

        while (n > 0) {
            binary[index] = n % 2;
            n = n / 2;
            index++;
        }

        System.out.print("Binary = ");

        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }
}

