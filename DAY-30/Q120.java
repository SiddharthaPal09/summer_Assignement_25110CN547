import java.util.Scanner;

public class Q120 {

    static double percentage(int total) {
        return total / 5.0;
    }

    static String grade(double per) {

        if (per >= 90)
            return "A+";
        else if (per >= 80)
            return "A";
        else if (per >= 70)
            return "B";
        else if (per >= 60)
            return "C";
        else if (per >= 50)
            return "D";
        else
            return "Fail";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Student Name: ");
        String name = sc.nextLine();

        int total = 0;

        System.out.println("Enter Marks of 5 Subjects:");

        for (int i = 1; i <= 5; i++) {
            total += sc.nextInt();
        }

        double per = percentage(total);

        System.out.println("\n----- Result -----");
        System.out.println("Name : " + name);
        System.out.println("Total : " + total);
        System.out.println("Percentage : " + per);
        System.out.println("Grade : " + grade(per));
    }
}