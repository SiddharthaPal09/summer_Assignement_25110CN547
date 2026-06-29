import java.util.Scanner;

public class Q119 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String names[] = new String[3];
        int salary[] = new int[3];

        for (int i = 0; i < 3; i++) {

            System.out.print("Employee Name: ");
            names[i] = sc.nextLine();

            System.out.print("Salary: ");
            salary[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("\nEmployee Details:");

        for (int i = 0; i < 3; i++) {

            System.out.println(names[i] + " : " + salary[i]);
        }
    }
}