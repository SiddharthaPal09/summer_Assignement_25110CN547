import java.util.Scanner;

public class Q109 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book Name: ");
        String book = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();

        System.out.println("\n----- Library Record -----");
        System.out.println("Book ID : " + id);
        System.out.println("Book    : " + book);
        System.out.println("Author  : " + author);
    }
}