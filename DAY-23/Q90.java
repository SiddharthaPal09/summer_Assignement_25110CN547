import java.util.Scanner;

public class Q90 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    System.out.println("First Repeating Character = " + str.charAt(i));
                    return;
                }
            }
        }

        System.out.println("No Repeating Character");
    }
}