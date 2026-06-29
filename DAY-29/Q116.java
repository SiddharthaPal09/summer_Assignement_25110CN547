import java.util.Scanner;

public class Q116 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Product Name: ");
        String product = sc.nextLine();

        System.out.print("Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        double total = quantity * price;

        System.out.println("\n----- Inventory -----");
        System.out.println("Product : " + product);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price   : " + price);
        System.out.println("Total Value: " + total);
    }
}