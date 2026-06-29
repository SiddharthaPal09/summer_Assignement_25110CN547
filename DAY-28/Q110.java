import java.util.Scanner;

public class Q110 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Account Holder: ");
        String name = sc.nextLine();

        System.out.print("Initial Balance: ");
        double balance = sc.nextDouble();

        System.out.print("Deposit Amount: ");
        double deposit = sc.nextDouble();

        balance += deposit;

        System.out.print("Withdraw Amount: ");
        double withdraw = sc.nextDouble();

        if (withdraw <= balance) {
            balance -= withdraw;
        } else {
            System.out.println("Insufficient Balance");
        }

        System.out.println("\nAccount Holder : " + name);
        System.out.println("Final Balance  : " + balance);
    }
}