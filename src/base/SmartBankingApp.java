package base;
import java.util.Scanner;


public class SmartBankingApp{
    public static void main(String[] args) {
        //Auto-gen stub
    }
}


class BankAcc {
    int balance;
    int prevTransaction;
    String custName;
    String custId;

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

    }

}
