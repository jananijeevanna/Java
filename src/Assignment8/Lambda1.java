package Assignment8;

@FunctionalInterface
interface Function{

    int performMathematicalOperation(int a, int b);

}

public class Lambda1 {

    public static void main(String[] args) {

        Function addNumber = (a,b) -> (a+b) ;
        Function subNumber = (a,b) -> (a-b);
        Function multiplyNumber = (a,b) -> (a*b);
        Function divideNumber = (a,b) -> (a/b);
        System.out.println(addNumber.performMathematicalOperation(100,200));
        System.out.println(subNumber.performMathematicalOperation(100,200));
        System.out.println( multiplyNumber.performMathematicalOperation(100,200));
        System.out.println(divideNumber.performMathematicalOperation(100,200));

    }
}
