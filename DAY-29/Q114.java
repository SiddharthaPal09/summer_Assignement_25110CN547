import java.util.Scanner;

public class Q114 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        System.out.println("Enter 5 elements:");

        for (int i = 0; i < 5; i++)
            arr[i] = sc.nextInt();

        System.out.println("1. Display");
        System.out.println("2. Sum");
        System.out.println("3. Largest");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                for (int i = 0; i < 5; i++)
                    System.out.print(arr[i] + " ");
                break;

            case 2:
                int sum = 0;
                for (int i = 0; i < 5; i++)
                    sum += arr[i];
                System.out.println("Sum = " + sum);
                break;

            case 3:
                int max = arr[0];
                for (int i = 1; i < 5; i++)
                    if (arr[i] > max)
                        max = arr[i];
                System.out.println("Largest = " + max);
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}