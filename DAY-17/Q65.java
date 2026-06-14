import java.util.Scanner;

public class Q65 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int arr1[] = new int[n1];

        for(int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int arr2[] = new int[n2];

        for(int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int merge[] = new int[n1 + n2];

        for(int i = 0; i < n1; i++) {
            merge[i] = arr1[i];
        }

        for(int i = 0; i < n2; i++) {
            merge[n1 + i] = arr2[i];
        }

        for(int i = 0; i < merge.length; i++) {
            System.out.print(merge[i] + " ");
        }
    }
}