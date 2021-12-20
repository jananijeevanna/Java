package Assignment4;

public class IllegalBanktransactionException extends Throwable {
    public IllegalBanktransactionException(String s) {
        System.out.println(s);
    }
}
