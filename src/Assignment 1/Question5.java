
import java.util.Scanner;

public class Question5 {
    static void calculateIncomeTax(int n) {
        int taxRate =0;
        if(n>0 && n<=180000){
            System.out.println("No tax");
        }
        else if (n>180000 && n<=300000){
            taxRate = (n*10)/100;
        }
        else if (n>300000 && n<=500000){
            taxRate = (n*20)/100;
        }
        else if(n>500000 && n<=1000000) {
            taxRate = (n*30)/100;
        }
        System.out.println("tax for the CTC is: "+ taxRate);

    }

    public static void main(String args[]) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the CTC ");
        num = sc.nextInt();

        calculateIncomeTax(num);
//prints the armstrong number

    }
}  