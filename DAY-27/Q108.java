import java.util.Scanner;

public class Q108 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks of 5 Subjects:\n");

        int total = 0;

        for (int i = 1; i <= 5; i++) {
            total += sc.nextInt();
        }

        double percentage = total / 5.0;

        String grade;

        if (percentage >= 90)
            grade = "A+";
        else if (percentage >= 80)
            grade = "A";
        else if (percentage >= 70)
            grade = "B";
        else if (percentage >= 60)
            grade = "C";
        else if (percentage >= 50)
            grade = "D";
        else
            grade = "Fail";

        System.out.println("\n------ Marksheet ------");
        System.out.println("Name       : " + name);
        System.out.println("Total      : " + total);
        System.out.println("Percentage : " + percentage);
        System.out.println("Grade      : " + grade);
    }
}