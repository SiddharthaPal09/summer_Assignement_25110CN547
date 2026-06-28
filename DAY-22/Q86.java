import java.util.Scanner;

public class Q86 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int words = 1;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ' ') {
                words++;
            }
        }

        System.out.println("Words = " + words);
    }
}