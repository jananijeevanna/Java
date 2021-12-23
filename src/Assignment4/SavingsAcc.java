package Assignment4;

import java.util.Scanner;

public class SavingsAcc {

    long id ;
    double balance;
    double withdraw;

    public SavingsAcc (long id, double balance,double  withdraw) throws InsufficientBalanceException, IllegalBanktransactionException {
        this.id=id;
        this.balance=balance;
        this.withdraw=withdraw;

        withdrawFunctionality();
    }

    private void withdrawFunctionality() throws InsufficientBalanceException, IllegalBanktransactionException{

        if (balance == 0 || withdraw>balance) {
            throw new InsufficientBalanceException(" Insufficient Balance ");
        }

        else if(withdraw<0)

        {
            throw new IllegalBanktransactionException("Witdrawal amount cannot be negative");
        }
    }

    public static void main(String[] args) throws InsufficientBalanceException, IllegalBanktransactionException {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter id :");
        long id = sc.nextLong();

        System.out.println(" Enter balance :");
        double balance= sc.nextDouble();

        System.out.println(" Enter amount to withdraw :");
        double withdraw= sc.nextDouble();

    }
}