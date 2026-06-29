import java.util.Scanner;

public class Q115 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        System.out.println("1. Length");
        System.out.println("2. Uppercase");
        System.out.println("3. Reverse");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Length = " + str.length());
                break;

            case 2:
                System.out.println(str.toUpperCase());
                break;

            case 3:
                for (int i = str.length() - 1; i >= 0; i--)
                    System.out.print(str.charAt(i));
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}