import java.util.Scanner;

public class Q106 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Department: ");
        String dept = sc.nextLine();

        System.out.println("\n----- Employee Details -----");
        System.out.println("ID         : " + id);
        System.out.println("Name       : " + name);
        System.out.println("Department : " + dept);
    }
}