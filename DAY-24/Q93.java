import java.util.Scanner;

public class Q93 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        if (str1.length() != str2.length()) {
            System.out.println("Not Rotation");
            return;
        }

        String temp = str1 + str1;

        if (temp.contains(str2))
            System.out.println("Rotation");
        else
            System.out.println("Not Rotation");
    }
}