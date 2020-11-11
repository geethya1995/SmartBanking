package base;
import java.util.Scanner;


public class SmartBankingApp{
    public static void main(String[] args) {
        //Auto-gen stub

        BankAcc customer1 = new BankAcc("Ms. Geethya Tennakoon", "001");
        customer1.showMenu();
    }
}


class BankAcc {
    int balance;
    int prevTransaction;
    String custName;
    String custId;

    BankAcc(String customerName, String customerId){
        custName = customerName;
        custId = customerId;
    }

    void deposit(int amt) {
        if (amt != 0) {
            balance = balance + amt;
            prevTransaction = amt;
        }
    }

    void withdraw(int amt) {
        balance = balance - amt;
        prevTransaction = -amt;
    }

    void getPrevTransaction() {
        if (prevTransaction > 0) {
            System.out.println("Deposited amount: " + prevTransaction);
        } else if (prevTransaction < 0) {
            System.out.println("Withdrawn amount: " + Math.abs(prevTransaction));
        } else {
            System.out.println("No transaction took place");
        }
    }

    void showMenu() {
        char userInput;
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome " + custName);
        System.out.println("Your Customer ID is " + custId);
        System.out.println("\n");
        System.out.println("A -> Check Balance");
        System.out.println("B -> Deposit");
        System.out.println("C -> Withdraw");
        System.out.println("D -> Check Previous Transaction");
        System.out.println("E -> Exit");

        do{
            System.out.println("*******************************************************************");
            System.out.println("Please enter an option");
            System.out.println("*******************************************************************");
            userInput = sc.next().charAt(0);
            System.out.println("\n");

            switch(userInput){

                case 'A' :
                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("Balance = " + balance);
                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("\n");
                    break;

                case 'B' :
                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("Enter an amount to Deposit");
                    System.out.println("---------------------------------------------------------------------");
                    int depositAmt = sc.nextInt();
                    deposit(depositAmt);
                    System.out.println("\n");
                    break;

                case 'C' :
                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("Enter an amount to Withdraw");
                    System.out.println("---------------------------------------------------------------------");
                    int withdrawAmt = sc.nextInt();
                    withdraw(withdrawAmt);
                    System.out.println("\n");
                    break;

                case 'D' :
                    System.out.println("---------------------------------------------------------------------");
                    getPrevTransaction();
                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("\n");
                    break;

                case 'E' :
                    System.out.println("Thank you for using our services!");
                    break;

                default:
                    System.out.println("You input option is invalid. Please try again!");
                    break;

            }
        } while(userInput != 'E');
    }

}
