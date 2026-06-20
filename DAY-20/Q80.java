import java.util.Scanner;

public class Q80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int a[][] = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < cols; j++) {
            int sum = 0;

            for (int i = 0; i < rows; i++) {
                sum += a[i][j];
            }

            System.out.println("Sum of column " + (j + 1) + " = " + sum);
        }
    }
}