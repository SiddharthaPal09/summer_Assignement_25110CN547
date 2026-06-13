import java.util.Scanner;

public class Q62 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxFreq = 0;
        int element = arr[0];

        for(int i = 0; i < n; i++) {

            int count = 0;

            for(int j = 0; j < n; j++) {

                if(arr[i] == arr[j]) {
                    count++;
                }
            }

            if(count > maxFreq) {
                maxFreq = count;
                element = arr[i];
            }
        }

        System.out.println("Element = " + element);
        System.out.println("Frequency = " + maxFreq);
    }
}