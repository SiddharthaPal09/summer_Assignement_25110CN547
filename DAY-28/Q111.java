import java.util.Scanner;

public class Q111 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Passenger Name: ");
        String name = sc.nextLine();

        System.out.print("Destination: ");
        String destination = sc.nextLine();

        System.out.print("Number of Tickets: ");
        int tickets = sc.nextInt();

        int price = 500;

        System.out.println("\n----- Ticket -----");
        System.out.println("Passenger : " + name);
        System.out.println("Destination : " + destination);
        System.out.println("Tickets : " + tickets);
        System.out.println("Total Fare : " + (tickets * price));
    }
}