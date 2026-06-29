import java.util.Scanner;

public class Q117 {

    static void display(String names[], int marks[], int n) {
        System.out.println("\nStudent Records:");

        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + " : " + marks[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number of Students: ");
        int n = sc.nextInt();
        sc.nextLine();

        String names[] = new String[n];
        int marks[] = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Name: ");
            names[i] = sc.nextLine();

            System.out.print("Marks: ");
            marks[i] = sc.nextInt();
            sc.nextLine();
        }

        display(names, marks, n);
    }
}