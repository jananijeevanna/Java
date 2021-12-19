
import java.util.Scanner;

public class Question3 {
    public static void main(String args[]) {

        Scanner sc  = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter the rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter the time: ");
        double time = sc.nextDouble();

        double si = (principal * time * rate) / 100;

        System.out.print("Enter number of times interest is compounded: ");
        int number = sc.nextInt();

        double ci = principal * (Math.pow((1 + rate/100), (time * number))) - principal;

        System.out.println("Simple Interest: " + si);
        System.out.println("Compound Interest: " + ci);

        sc.close();

    }
}  