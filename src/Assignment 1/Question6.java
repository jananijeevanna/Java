import java.util.Scanner;

public class Question6 {

    public static void main(String[] args) {
        int counter = 0;
        loginCheck(counter);

    }

    private static void loginCheck(int counter) {
        String userName = "test";
        String password = "password";


        Scanner input = new Scanner(System.in);
        System.out.print("Enter the username");
        String enteredUserName = input.next();
        System.out.println("Enter the password");
        String enteredPassword = input.next();

        if (counter == 3) {
            System.out.println("Contact Admin");
        } else {
            if (userName.equals(enteredUserName) && password.equals(enteredPassword)) {
                System.out.print("Welcome " + userName);
                counter = 0;
            } else {
                counter++;
                System.out.println("incorrect username and password");
                loginCheck(counter);
            }
        }
    }
}



