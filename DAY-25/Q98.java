import java.util.Scanner;

public class Q98 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        for (int i = 0; i < str1.length(); i++) {

            char ch = str1.charAt(i);

            if (str2.indexOf(ch) != -1) {

                boolean printed = false;

                for (int k = 0; k < i; k++) {
                    if (str1.charAt(k) == ch) {
                        printed = true;
                        break;
                    }
                }

                if (!printed)
                    System.out.print(ch + " ");
            }
        }
    }
}