import java.util.Scanner;

public class Question4 {

    int a,b,c=0;


    public static void main(String args[]) {
        Question4 question4 = new Question4();
        question4.getDisMarks();
        question4.displayResult();
    }

    public void displayResult() {
        if(a>60 && b> 60 && c>60)
        {
            System.out.println(" Passed");
        }
        else if(a>60 && b>60 && c<60 )
        {
            System.out.println(" Promoted");
        }
        else if(a<60 && b>60 && c>60 )
        {
            System.out.println(" Promoted");
        }
        else if(a>60 && b<60 && c>60 )
        {
            System.out.println(" Promoted");
        }
        else if(a>60 && b<60 && c<60 )
        {
            System.out.println(" Failed ");
        }
        else if(a<60 && b>60 && c<60 )
        {
            System.out.println(" Failed ");
        }
        else if(a<60 && b<60 && c>60 )
        {
            System.out.println(" Failed ");
        }
    }

    public void getDisMarks() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of subject A: ");
        a= sc.nextInt();
        System.out.print("Enter marks of subject B: ");
        b = sc.nextInt();
        System.out.print("Enter marks of subject C: ");
        c= sc.nextInt();



    }
}