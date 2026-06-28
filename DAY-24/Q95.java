import java.util.Scanner;

public class Q95 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String words[] = str.split(" ");

        String longest = words[0];

        for (int i = 1; i < words.length; i++) {

            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }

        System.out.println("Longest Word = " + longest);
    }
}