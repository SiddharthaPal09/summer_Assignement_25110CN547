import java.util.Scanner;

public class Q118 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String books[] = {
                "Java",
                "Python",
                "C Programming",
                "DBMS",
                "Operating System"
        };

        System.out.print("Enter Book Name: ");
        String search = sc.nextLine();

        boolean found = false;

        for (String book : books) {

            if (book.equalsIgnoreCase(search)) {

                System.out.println("Book Available");
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("Book Not Available");
    }
}