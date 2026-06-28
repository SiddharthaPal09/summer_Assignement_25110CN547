import java.util.Scanner;

public class Q97 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int arr1[] = new int[n1];

        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int arr2[] = new int[n2];

        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int i = 0, j = 0;

        while (i < n1 && j < n2) {

            if (arr1[i] < arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
            } else {
                System.out.print(arr2[j] + " ");
                j++;
            }
        }

        while (i < n1) {
            System.out.print(arr1[i] + " ");
            i++;
        }

        while (j < n2) {
            System.out.print(arr2[j] + " ");
            j++;
        }
    }
}