package ATM;

import java.util.Scanner;

public class TestATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Account Number : ");
        int accountno = sc.nextInt();

        System.out.print("Enter the Account Holder Name : ");
        String accountHolder = sc.next();

        System.out.print("Enter the Initial balance : ");
        double balance = sc.nextDouble();

        System.out.print("Create a PIN (ONLY 4 DIGITS): ");
        int PIN = sc.nextInt();

        Account account = new Account(accountno, accountHolder, balance, PIN);
        ATM atm = new ATM(account);

        System.out.print("Enter the PIN (4 DIGITS) : ");
        int enteredPin = sc.nextInt();

        if (atm.login(enteredPin)) {
            System.out.println("Succesfully Logged in ");
            int choice;
            do {
                System.out.println("=======ANNA ATM=======");
                System.out.println("1. CheckBalance \n 2. Deposit \n 3. Withdraw \n 4. Exit");
                System.out.println();
                System.out.println("Enter Your Choice : ");
                choice = sc.nextInt();

                if (choice == 1) {
                    atm.displayBalance();
                } else if (choice == 2) {
                    System.out.print("Enter the amount to Desposit : ");
                    int amount = sc.nextInt();
                    atm.depositMoney(amount);
                } else if (choice == 3) {
                    System.out.print("Enter the amount to Withdraw : ");
                    int amount = sc.nextInt();
                    atm.withdrawMoney(amount);
                } else if (choice == 4) {
                    System.out.println("Thank you for using the Anna ATM!");

                } else {
                    System.out.println("Invalid Choice!");
                }
            } while (choice != 4);

        } else {
            System.out.println("Invalid PIN");
        }
        sc.close();
    }
}
