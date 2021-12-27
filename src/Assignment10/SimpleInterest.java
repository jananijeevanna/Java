package Assignment10;

@FunctionalInterface
interface Interest{
    double calculate(int p, double r, int n);
}
public class SimpleInterest {

    public static void main(String[] args) {

        Interest interest = (var p, var n, var r)-> (p*n*r/100);
        System.out.println(" Simple interest :" +interest.calculate(3000,4,3));

    }
}
