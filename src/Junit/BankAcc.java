package Junit;

import Assignment4.InsufficientBalanceException;

import java.util.Scanner;

public class BankAcc {

int balance = 10000;

    public void withdrawFunctionality( int withdraw ) throws InsufficientBalanceException {

        if (withdraw > balance) {
            throw new InsufficientBalanceException(" Insufficient Balance ");
        }
        else
        {
            System.out.println(" Amount withdrawn :"+withdraw);
        }

    }

    /*public static void main(String[] args) throws InsufficientBalanceException {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter id :");
        long id = sc.nextLong();

        System.out.println(" Enter balance :");
        double balance = sc.nextDouble();

        System.out.println(" Enter amount to withdraw :");
        double withdraw = sc.nextDouble();

    }*/
}