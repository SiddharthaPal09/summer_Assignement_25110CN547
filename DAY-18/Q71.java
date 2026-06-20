import java.util.Scanner;

public class Q71 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int key = sc.nextInt();

        int low = 0;
        int high = n - 1;

        while(low <= high) {

            int mid = (low + high) / 2;

            if(arr[mid] == key) {
                System.out.println("Found at index " + mid);
                return;
            }

            else if(arr[mid] < key) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        System.out.println("Not Found");
    }
}