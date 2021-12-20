package Assignment4;

import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the first number:");
        int i = sc.nextInt();

        System.out.println(" Enter the second number:");
        int j = sc.nextInt();

        try {
            int k = i / j;
            System.out.println("answer = " + k);
        } catch (ArithmeticException e) {
            throw new UnsupportedOperationException("Zero cannot divide any number");
        }
    }
    }

