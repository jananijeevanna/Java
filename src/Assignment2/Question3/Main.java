package Assignment2.Question3;


public class Main {

    public static void main(String[] args)
    {

        Bank obj1 = new SavingsAcc();

        Bank obj2 = new CurrentAcc();
        System.out.print("Total cash = " );
        System.out.println(obj2.calculateAmount() + obj1.calculateAmount() );
    }
}
